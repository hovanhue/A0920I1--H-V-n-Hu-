import {Component, Inject, OnInit} from '@angular/core';
import {CustomerService} from "../../../../service/customer/CustomerService";
import {Router} from "@angular/router";
import {MAT_DIALOG_DATA} from "@angular/material/dialog";

@Component({
  selector: 'app-customer-delete',
  templateUrl: './customer-delete.component.html',
  styleUrls: ['./customer-delete.component.css']
})
export class CustomerDeleteComponent implements OnInit {
  id: number;

  constructor(
    private customerService: CustomerService, private router: Router,
    @Inject(MAT_DIALOG_DATA) public data: any) {
    this.id = data.id;
  }

  ngOnInit(): void {
  }

  onSubmit(id: number) {
    console.log(id);
    this.customerService.deleteCustomer(id).subscribe(
      (data) => {
        this.router.navigate(['list-customer']);
      }, error => console.log(error)

    );
  }
}
