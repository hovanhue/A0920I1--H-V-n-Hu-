import { Component, OnInit } from '@angular/core';
import {ICustomers} from '../../models/ICustomers';
import {CustomerServiceService} from '../../../../service/customer/CustomerService.service';
import {Router} from '@angular/router';
import {FormBuilder, Validators} from '@angular/forms';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {

  constructor(private customerService: CustomerServiceService, private router: Router, private form: FormBuilder) { }

  public maxDate = new Date();
  public minDate = new Date(1900, 1, 1);

  customerTypeList: any;
  createCustomer = this.form.group({
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
    }, error => console.log(error));
  }

  onSubmit(){
    console.log(this.createCustomer.value);
    this.customerService.addNewCustomer(this.createCustomer.value).subscribe((data) => {
      alert('Create Customer successfully!!');
      this.router.navigate(['customer/list']);
    });
  }
}
