import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Employee} from "../../src/app/models/employee";
import {Division} from "../../src/app/models/division";
import {Position} from "../../src/app/models/position";
import {EducationDegree} from "../../src/app/models/education-Degree";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private readonly API_EMPLOYEE_URL = 'http://localhost:3000/employees';
  private readonly API_DIVISION_URL = 'http://localhost:3000/division';
  private readonly API_POSITION_URL = 'http://localhost:3000/position';
  private readonly API_EDUCATION_DEGREE_URL = 'http://localhost:3000/educationDegree';

  constructor(private httpClient: HttpClient) {
  }

  public getEmployee(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(this.API_EMPLOYEE_URL);
  }

  public getDivision(): Observable<Division[]> {
    return this.httpClient.get<Division[]>(this.API_DIVISION_URL);
  }

  public getPosition(): Observable<Position[]> {
    return this.httpClient.get<Position[]>(this.API_POSITION_URL);
  }

  public getEducationDegree(): Observable<EducationDegree[]> {
    return this.httpClient.get<EducationDegree[]>(this.API_EDUCATION_DEGREE_URL);
  }

  public addEmployee(employee: Employee): Observable<void> {
    return this.httpClient.post<void>(this.API_EMPLOYEE_URL, employee);
  }

  public findEmployeeById(id: number): Observable<Employee> {
    return this.httpClient.get<Employee>(this.API_EMPLOYEE_URL + '/' + (id));
  }

  public updateEmployee(updateEmployee: Employee): Observable<void> {
    return this.httpClient.put<void>(this.API_EMPLOYEE_URL + '/' + updateEmployee.id, updateEmployee);
  }

  public deleteEmployee(id) {
    console.log(id);
    console.log(this.API_EMPLOYEE_URL + '/' + id);
    return this.httpClient.delete(this.API_EMPLOYEE_URL + '/' + id);
  }
}
