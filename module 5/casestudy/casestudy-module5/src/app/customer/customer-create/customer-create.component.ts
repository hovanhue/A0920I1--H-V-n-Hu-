import { Component, OnInit } from '@angular/core';
import {ICustomers} from '../../models/ICustomers';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
customers: ICustomers[];
  constructor() { }

  ngOnInit(): void {
  }

}
