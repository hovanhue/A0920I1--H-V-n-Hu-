import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Customer} from "../../models/Customer";
import {Employee} from "../../models/employee";
import {Service} from "../../models/service";
import {ContractService} from "../../../../service/contract/contract.service";
import {CustomerService} from "../../../../service/customer/CustomerService";
import {ServiceService} from "../../../../service/service/service.service";
import {EmployeeService} from "../../../../service/employee/employee.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";

@Component({
  selector: 'app-contract-edit',
  templateUrl: './contract-edit.component.html',
  styleUrls: ['./contract-edit.component.css']
})
export class ContractEditComponent implements OnInit {
  customerList: Customer[];
  employeeList: Employee[];
  serviceList: Service[];
  id: number;
  public minDate = new Date();
  constructor(private contractService: ContractService,
              private customerService: CustomerService,
              private serviceService: ServiceService,
              private employeeService: EmployeeService,
              private router: Router, private form: FormBuilder,
              private activatedRoute: ActivatedRoute,) { }

  updateContract = this.form.group({
    id: ['', [Validators.required]],
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

    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = Number(paramMap.get('id'));
      this.contractService.findContractById(this.id).subscribe((data) => {
        this.updateContract.setValue(data);
      });
      console.log('update' + this.updateContract);
    });
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

  onSubmit(updateContract: FormGroup) {
    this.contractService.updateContract(updateContract.value).subscribe(
      (data) => {
        this.router.navigate(['list-contract']);
      }, error => console.log(error)
    );
  }

}
