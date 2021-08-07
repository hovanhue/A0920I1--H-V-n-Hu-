import { Component, OnInit } from '@angular/core';
import {CustomerServiceService} from '../../../../service/customer/CustomerService.service';
import {FormBuilder, Validators} from '@angular/forms';
import {Router } from '@angular/router';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {

  constructor(private customerService: CustomerServiceService, private form: FormBuilder,
              private router: Router){ }

  customerTypeList: any;
  editCustomer = this.form.group({
    customerType: ['', [Validators.required]],
    name: ['', [Validators.required]],
    dateOfBirth: ['', [Validators.required]],
    gender: ['', [Validators.required]],
    idCard: ['', [Validators.required]],
    phoneNumber: ['', [Validators.required]],
    email: ['', [Validators.required], [Validators.email]],
    address: ['', [Validators.required]],
  });
  ngOnInit(): void {
    this.customerService.getAllCustomerType().subscribe((data) => {
      this.customerTypeList = data;
    });
    this.customerService.getCustomerById(this.router.snapshot.params.id).subscribe((data) => {
      this.editCustomer.setValue(data);
    };
  }

}
