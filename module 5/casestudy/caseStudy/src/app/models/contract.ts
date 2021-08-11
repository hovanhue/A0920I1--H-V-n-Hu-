import {Employee} from "./employee";
import {Customer} from "./Customer";
import {Service} from "./service";

export class Contract {
  id: number;
  employee: Employee;
  customer: Customer;
  service: Service;
  dateStart: string;
  dateEnd: string;
  deposit: number;
  totalMoney: number;

  constructor(id: number, employee: Employee, customer: Customer, service: Service,
  dateStart: string, dateEnd: string, deposit: number, totalMoney: number) {
    this.id = id;
    this.employee = employee;
    this.customer = customer;
    this.service = service;
    this.dateStart = dateStart;
    this.dateEnd = dateEnd;
    this.deposit = deposit;
    this.totalMoney = totalMoney;
  }
}
