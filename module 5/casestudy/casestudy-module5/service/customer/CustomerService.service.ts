import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {ICustomers} from '../../src/app/models/ICustomers';
import {ICustomerType} from '../../src/app/models/ICustomerType';

@Injectable({
  providedIn: 'root'
})
export class CustomerServiceService {

  API_URL_CUSTOMER = 'http://localhost:3000/customers';
  API_URL_CUSTOMERTYPE = 'http://localhost:3000/customerType';
  constructor(private httpClient: HttpClient) { }
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  getAllCustomer(){
    console.log('customer' + this.httpClient.get(this.API_URL_CUSTOMER));
    return this.httpClient.get(this.API_URL_CUSTOMER);
  }

  getAllCustomerType(){
    console.log('customerType' + this.httpClient.get(this.API_URL_CUSTOMERTYPE));
    return this.httpClient.get(this.API_URL_CUSTOMERTYPE);
  }

  addNewCustomer(customer: ICustomers){
    return this.httpClient.post<ICustomers>(this.API_URL_CUSTOMER, customer, this.httpOptions);
  }

  getCustomerById(id: number): Observable<ICustomers>{
    return this.httpClient.get<ICustomers>(this.API_URL_CUSTOMERTYPE + '/' + id);
  }

  deleteCustomerById(id: number): Observable<ICustomers>{
    return this.httpClient.delete<ICustomers>(this.API_URL_CUSTOMERTYPE + '/' + id);
  }

  updateCustomer(customer: ICustomers): Observable<ICustomers>{
    return this.httpClient.put<ICustomers>(this.API_URL_CUSTOMER, customer, this.httpOptions);
  }
}
