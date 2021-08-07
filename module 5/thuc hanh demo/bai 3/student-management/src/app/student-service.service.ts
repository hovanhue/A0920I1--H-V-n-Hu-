import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Istudent} from './models/Istudent';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  private readonly API_URL = 'http://localhost:3000/students';
  constructor(private httpClient: HttpClient) { }

  getAllStudent(): Observable<Istudent[]>{
    return this.httpClient.get<Istudent[]>(this.API_URL);
  }
  addNewStudent(student: Istudent): Observable<void>{
    return this.httpClient.post<void>(this.API_URL, student);
  }
  getStudentId(id: number): Observable<Istudent>{
    return this.httpClient.get<Istudent>(this.API_URL + '/' + id);
  }
  changeInformationStudent(student: Istudent): Observable<Istudent>{
    return this.httpClient.put<Istudent>(this.API_URL, student);
  }
  deleteStudent(id: number): Observable<Istudent>{
    return this.httpClient.delete<Istudent>(this.API_URL + '/' + id);
  }
}
