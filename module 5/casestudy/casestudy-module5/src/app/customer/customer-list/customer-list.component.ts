import { Component, OnInit } from '@angular/core';
import {ICustomers} from '../../models/ICustomers';
import {ICustomerType} from '../../models/ICustomerType';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
customerList: ICustomers[] = [
  {
    idCustomer: 1,
    idCustomerType: 1,
    name: 'ho van hue',
    dateOfBirth: '31/03/2001',
    phoneNumber: '1213',
    email: 'hovanhue@gamil.com',
    address: 'quang nam'
  },
  {
    idCustomer: 1,
    idCustomerType: 1,
    name: 'ho van hue',
    dateOfBirth: '31/03/2001',
    phoneNumber: '1213',
    email: 'hovanhue@gamil.com',
    address: 'quang nam'
  },
  {
    idCustomer: 1,
    idCustomerType: 1,
    name: 'ho van hue',
    dateOfBirth: '31/03/2001',
    phoneNumber: '1213',
    email: 'hovanhue@gamil.com',
    address: 'quang nam'
  },
  {
    idCustomer: 1,
    idCustomerType: 1,
    name: 'ho van hue',
    dateOfBirth: '31/03/2001',
    phoneNumber: '1213',
    email: 'hovanhue@gamil.com',
    address: 'quang nam'
  },
  {
    idCustomer: 1,
    idCustomerType: 1,
    name: 'ho van hue',
    dateOfBirth: '31/03/2001',
    phoneNumber: '1213',
    email: 'hovanhue@gamil.com',
    address: 'quang nam'
  }
];
  constructor() { }

  ngOnInit(): void {
  }

}
