import {Component, Inject, OnInit} from '@angular/core';
import {Division} from "../../models/division";
import {EducationDegree} from "../../models/education-Degree";
import {EmployeeService} from "../../../../service/employee/employee.service";
import {Router} from "@angular/router";
import {MAT_DIALOG_DATA} from "@angular/material/dialog";

@Component({
  selector: 'app-employee-delete',
  templateUrl: './employee-delete.component.html',
  styleUrls: ['./employee-delete.component.css']
})
export class EmployeeDeleteComponent implements OnInit {
  id: number;

  constructor(private employeeService: EmployeeService,
              private router: Router,
              @Inject(MAT_DIALOG_DATA) public data: any) {
    this.id = data.id;

  }

  ngOnInit(): void {
  }

  onSubmit(id: number) {
    console.log(id);
    this.employeeService.deleteEmployee(id).subscribe(
      (data) => {
        this.router.navigate(['list-employee']);
      }, error => console.log(error)

    );
  }
}
