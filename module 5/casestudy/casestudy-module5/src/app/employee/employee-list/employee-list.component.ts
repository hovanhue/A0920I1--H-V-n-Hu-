import { Component, OnInit } from '@angular/core';
import {IEmployees} from '../../models/IEmployees';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
employeeList: IEmployees[] = [
  {
    idEmployees: 1,
    name: 'ho van hue',
    idPosition: 1,
    idEducationDegree: 1,
    idDivision: 1,
    dateOfBirth: '31/3/2001',
    idCard: '313134',
    salary: 300.0,
    phoneNumber: '0313913',
    email: 'hovanhue@gmail.com',
    address: 'quang nam'
  },
  {
    idEmployees: 1,
    name: 'ho van hue',
    idPosition: 1,
    idEducationDegree: 1,
    idDivision: 1,
    dateOfBirth: '31/3/2001',
    idCard: '313134',
    salary: 300.0,
    phoneNumber: '0313913',
    email: 'hovanhue@gmail.com',
    address: 'quang nam',
  },
  {
    idEmployees: 1,
    name: 'ho van hue',
    idPosition: 1,
    idEducationDegree: 1,
    idDivision: 1,
    dateOfBirth: '31/3/2001',
    idCard: '313134',
    salary: 300.0,
    phoneNumber: '0313913',
    email: 'hovanhue@gmail.com',
    address: 'quang nam',
  },
  {
    idEmployees: 1,
    name: 'ho van hue',
    idPosition: 1,
    idEducationDegree: 1,
    idDivision: 1,
    dateOfBirth: '31/3/2001',
    idCard: '313134',
    salary: 300.0,
    phoneNumber: '0313913',
    email: 'hovanhue@gmail.com',
    address: 'quang nam',
  }
];
  constructor() { }

  ngOnInit(): void {
  }

}
