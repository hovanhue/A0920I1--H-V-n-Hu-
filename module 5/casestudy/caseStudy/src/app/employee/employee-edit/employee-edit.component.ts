import { Component, OnInit } from '@angular/core';
import {Position} from "../../models/position";
import {Division} from "../../models/division";
import {EducationDegree} from "../../models/education-Degree";
import {EmployeeService} from "../../../../service/employee/employee.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {
  id: number;
  positionList: Position[] = [];
  divisionList: Division[] = [];
  educationDegreeList: EducationDegree[] = [];
  public maxDate = new Date();
  public minDate = new Date(1900, 1, 1);

  constructor(private employeeService: EmployeeService,
              private router: Router,
              private activatedRote: ActivatedRoute,
              private form: FormBuilder) { }

  updateEmployee = this.form.group({
    id: ['', [Validators.required]],
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

    this.activatedRote.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = Number(paramMap.get('id'));
      this.employeeService.findEmployeeById(this.id).subscribe((data) => {
        this.updateEmployee.setValue(data);
      });
      console.log('update  employee: '+ this.updateEmployee);
    });
  }

  onSubmit(updateEmployee: FormGroup){
    this.employeeService.updateEmployee(updateEmployee.value).subscribe(
      (data) => {
        alert('update success!');
        this.router.navigate(['list-employee']);
      }, error => alert('error!')
    );
  }

}
