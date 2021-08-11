import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../../../../service/customer/CustomerService";
import {ServiceService} from "../../../../service/service/service.service";
import {EmployeeService} from "../../../../service/employee/employee.service";
import {Customer} from "../../models/Customer";
import {Employee} from "../../models/employee";
import {Service} from "../../models/service";
import {Router} from "@angular/router";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ContractService} from "../../../../service/contract/contract.service";

@Component({
  selector: 'app-contract-create',
  templateUrl: './contract-create.component.html',
  styleUrls: ['./contract-create.component.css']
})
export class ContractCreateComponent implements OnInit {
  customerList: Customer[];
  employeeList: Employee[];
  serviceList: Service[];
  public minDate = new Date();

  constructor(private contractService: ContractService,
    private customerService: CustomerService,
    private serviceService: ServiceService,
    private employeeService: EmployeeService,
    private router: Router, private form: FormBuilder) { }

  createContract = this.form.group({
    employee: ['', [Validators.required]],
    customer: ['', [Validators.required]],
    service: ['', [Validators.required]],
    dateStart: ['', [Validators.required]],
    dateEnd: ['', [Validators.required]],
    deposit: ['', [Validators.required]],
    totalMoney: ['', [Validators.required]]
  });

  ngOnInit(): void {
    this.getCustomerList();
    this.getEmployeeList();
    this.getServiceList();
  }

  getCustomerList(){
    this.customerService.getCustomer().subscribe(
      (data) => {
        this.customerList = data;
      }, error => console.log(error)
    );
  }

  getEmployeeList(){
    this.employeeService.getEmployee().subscribe((data) => {
      this.employeeList = data;
    });
  }

  getServiceList(){
    this.serviceService.getService().subscribe((data) => {
      this.serviceList = data;
    });
  }

  onSubmit(createContract: FormGroup) {
    console.log(createContract.value);
    this.contractService.addContract(createContract.value).subscribe(
      (data) => {
        alert('add Contract successfully!!');
        this.router.navigate(['list-contract']);
      }, error => console.log(error)
    );
  }
}
