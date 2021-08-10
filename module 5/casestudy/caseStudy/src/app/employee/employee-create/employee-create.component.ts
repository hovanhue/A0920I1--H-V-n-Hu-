import { Component, OnInit } from '@angular/core';
import {Division} from "../../models/division";
import {EducationDegree} from "../../models/education-Degree";
import {Router} from "@angular/router";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {EmployeeService} from "../../../../service/employee/employee.service";
import {Position} from "../../models/position";


@Component({
  selector: 'app-employee-create',
  templateUrl: './employee-create.component.html',
  styleUrls: ['./employee-create.component.css']
})
export class EmployeeCreateComponent implements OnInit {
  positionList: Position[] = [];
  divisionList: Division[] = [];
  educationDegreeList: EducationDegree[] = [];

  public maxDate = new Date();
  public minDate = new Date(1900, 1, 1);

  constructor(private employeeService: EmployeeService,
              private router: Router, private form: FormBuilder) { }

  createEmployee = this.form.group({
    name: ['', [Validators.required]],
    position: ['', [Validators.required]],
    educationDegree: ['', [Validators.required]],
    division: ['', [Validators.required]],
    dateOfBirth: ['', [Validators.required]],
    idCard: ['', [Validators.required]],
    salary: ['', [Validators.required]],
    phoneNumber: ['', [Validators.required]],
    email: ['', [Validators.required], [Validators.email]],
    address: ['', [Validators.required]],
  });
  ngOnInit(): void {
    this.employeeService.getDivision().subscribe((data) => {
      this.divisionList = data;
    });

    this.employeeService.getPosition().subscribe((data) => {
      this.positionList = data;
    });

    this.employeeService.getEducationDegree().subscribe((data) => {
      this.educationDegreeList = data;
    });
  }

  onSubmit(createFormEmployee: FormGroup){
    this.employeeService.addEmployee(createFormEmployee.value).subscribe((data) => {
      alert('add employee successfully!');
      this.router.navigate(['list-employee']);
    })
  }
}
