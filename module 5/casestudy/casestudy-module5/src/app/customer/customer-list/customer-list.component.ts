import { Component, OnInit } from '@angular/core';
import {ICustomers} from '../../models/ICustomers';
import {ICustomerType} from '../../models/ICustomerType';
import {CustomerServiceService} from '../../../../service/customer/CustomerService.service';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
customerList: ICustomers [];
customerType: ICustomerType[];

  constructor(private service: CustomerServiceService) { }

  ngOnInit(): void {
    this.service.getAllCustomerType().subscribe((data) => {
      console.log(data);
      this.customerType = data;
    }, error => console.log(error)
    );
    this.service.getAllCustomer().subscribe((data) => {
      this.customerList = data;
    }, error => console.log(error)
    );
  }

}
