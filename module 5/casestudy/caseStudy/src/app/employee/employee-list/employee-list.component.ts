import { Component, OnInit } from '@angular/core';
import {MatDialog} from "@angular/material/dialog";
import {Employee} from "../../models/employee";
import {EmployeeService} from "../../../../service/employee/employee.service";
import {EmployeeDeleteComponent} from "../employee-delete/employee-delete.component";

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employeeList: Employee[] = [];
  constructor(
    private employeeService: EmployeeService,
    public dialog: MatDialog) {
  }

  ngOnInit(): void {
    this.employeeService.getEmployee().subscribe(
      (data) => {
        console.log(data);
        this.employeeList = data;
      }, error => console.log(error)
    );
  }

  openDialogDelete(id: number) {
    const dialogRef = this.dialog.open(EmployeeDeleteComponent,
      {data: {
          id
        },
        width: '400px'
      }
    );
    dialogRef.afterClosed().subscribe(result => {
      console.log(`Dialog result: ${result}`);
      this.ngOnInit();
    });
  }

}
