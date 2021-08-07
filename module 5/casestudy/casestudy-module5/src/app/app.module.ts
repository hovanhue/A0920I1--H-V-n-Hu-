import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { EmployeeComponent } from './employee/employee.component';
import { ServiceComponent } from './service/service.component';
import { ContractComponent } from './contract/contract.component';
import { CustomerListComponent } from './customer/customer-list/customer-list.component';
import { CustomerEditComponent } from './customer/customer-edit/customer-edit.component';
import { CustomerCreateComponent } from './customer/customer-create/customer-create.component';
import { CustomerDeleteComponent } from './customer/customer-delete/customer-delete.component';
import { EmployeeListComponent } from './employee/employee-list/employee-list.component';
import { EmployeeCreateComponent } from './employee/employee-create/employee-create.component';
import { EmployeeDeleteComponent } from './employee/employee-delete/employee-delete.component';
import { EmployeeEditComponent } from './employee/employee-edit/employee-edit.component';
import {Router, RouterModule} from '@angular/router';
import {HttpClientModule} from '@angular/common/http';
import {AppRoutingModule} from './app-routing-module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { ContractListComponent } from './contract/contract-list/contract-list.component';
import { ContractCreateComponent } from './contract/contract-create/contract-create.component';
import { ContractEditComponent } from './contract/contract-edit/contract-edit.component';
import { ContractDeleteComponent } from './contract/contract-delete/contract-delete.component';
import { ServiceListComponent } from './service/service-list/service-list.component';
import { ServiceCreateComponent } from './service/service-create/service-create.component';
import { ServiceEditComponent } from './service/service-edit/service-edit.component';
import { ServiceDeleteComponent } from './service/service-delete/service-delete.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { MatSliderModule } from '@angular/material/slider';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatNativeDateModule} from '@angular/material/core';
import {MatRadioModule} from '@angular/material/radio';

@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    EmployeeComponent,
    ServiceComponent,
    ContractComponent,
    CustomerListComponent,
    CustomerEditComponent,
    CustomerCreateComponent,
    CustomerDeleteComponent,
    EmployeeListComponent,
    EmployeeCreateComponent,
    EmployeeDeleteComponent,
    EmployeeEditComponent,
    NavbarComponent,
    FooterComponent,
    ContractListComponent,
    ContractCreateComponent,
    ContractEditComponent,
    ContractDeleteComponent,
    ServiceListComponent,
    ServiceCreateComponent,
    ServiceEditComponent,
    ServiceDeleteComponent,
    PageNotFoundComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    MatSliderModule,
    MatDatepickerModule,
    MatFormFieldModule,
    MatInputModule,
    MatNativeDateModule,
    MatRadioModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
