import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CustomerComponent} from './customer/customer.component';
import {CustomerCreateComponent} from './customer/customer-create/customer-create.component';
import {CustomerListComponent} from './customer/customer-list/customer-list.component';
import {CustomerEditComponent} from './customer/customer-edit/customer-edit.component';
import {CustomerDeleteComponent} from './customer/customer-delete/customer-delete.component';
import {EmployeeCreateComponent} from './employee/employee-create/employee-create.component';
import {EmployeeListComponent} from './employee/employee-list/employee-list.component';
import {EmployeeDeleteComponent} from './employee/employee-delete/employee-delete.component';
import {EmployeeEditComponent} from './employee/employee-edit/employee-edit.component';
import {ContractCreateComponent} from './contract/contract-create/contract-create.component';
import {ContractListComponent} from './contract/contract-list/contract-list.component';
import {ContractEditComponent} from './contract/contract-edit/contract-edit.component';
import {ContractDeleteComponent} from './contract/contract-delete/contract-delete.component';
import {ServiceCreateComponent} from './service/service-create/service-create.component';
import {ServiceListComponent} from './service/service-list/service-list.component';
import {ServiceEditComponent} from './service/service-edit/service-edit.component';
import {ServiceDeleteComponent} from './service/service-delete/service-delete.component';
import {EmployeeComponent} from './employee/employee.component';
import {ServiceComponent} from './service/service.component';
import {ContractComponent} from './contract/contract.component';
import {PageNotFoundComponent} from './page-not-found/page-not-found.component';
import {NavbarComponent} from './navbar/navbar.component';

const routes: Routes = [
      {path: 'create-customer', component: CustomerCreateComponent},
      {path: 'list-customer', component: CustomerListComponent},
      {path: 'edit-customer/:id', component: CustomerEditComponent},
      {path: 'delete-customer/:id', component: CustomerDeleteComponent},
      {path: 'create-employee', component: EmployeeCreateComponent},
      {path: 'list-employee', component: EmployeeListComponent},
      {path: 'edit-employee/:id', component: EmployeeEditComponent},
      {path: 'delete-employee/:id', component: EmployeeDeleteComponent},
      {path: 'create-service', component: ServiceCreateComponent},
      {path: 'list-service', component: ServiceListComponent},
      {path: 'edit-service/:id', component: ServiceEditComponent},
      {path: 'delete-service/:id', component: ServiceDeleteComponent},
      {path: 'create-contract', component: ContractCreateComponent},
      {path: 'list-contract', component: ContractListComponent},
      {path: 'edit-contract/:id', component: ContractEditComponent},
      {path: 'delete-contract/:id', component: ContractDeleteComponent},
      {path: '**', component: PageNotFoundComponent}

];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
