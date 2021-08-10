import { Component, OnInit } from '@angular/core';
import {Customer} from "../../models/Customer";
import {CustomerService} from "../../../../service/customer/CustomerService";
import {MatDialog} from '@angular/material/dialog';
import {CustomerDeleteComponent} from "../customer-delete/customer-delete.component";
import {CustomerEditComponent} from "../customer-edit/customer-edit.component";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

  customerList: Customer[] = [];
  constructor(
    private customerService: CustomerService,
    public dialog: MatDialog

  ) { }

  ngOnInit(): void {
    this.customerService.getCustomer().subscribe(
      (data) => {
        console.log(data);
        this.customerList = data;
      }, error => console.log(error)
    );
  }

  openDialogDelete(id: number) {
    const dialogRef = this.dialog.open(CustomerDeleteComponent,
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
