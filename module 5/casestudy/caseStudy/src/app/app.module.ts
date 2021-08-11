import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import {MatSliderModule} from "@angular/material/slider";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {MatDialogModule} from "@angular/material/dialog";
import {MatButtonModule} from "@angular/material/button";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatDatepickerModule} from "@angular/material/datepicker";
import {MatRadioModule} from "@angular/material/radio";
import {MatInputModule} from "@angular/material/input";
import {MatNativeDateModule} from "@angular/material/core";
import {CustomerModule} from "./customer/customer.module";
import {EmployeeRoutingModule} from "./employee/employee-routing.module";
import {CustomerService} from "../../service/customer/CustomerService";
import {EmployeeService} from "../../service/employee/employee.service";
import {EmployeeModule} from "./employee/employee.module";
import {ServiceService} from "../../service/service/service.service";
import {ContractService} from "../../service/contract/contract.service";
import {ServiceModule} from "./service/service.module";
import {ContractModule} from "./contract/contract.module";
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    PageNotFoundComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
    MatSliderModule,
    MatDialogModule,
    MatButtonModule,
    MatFormFieldModule,
    MatDatepickerModule,
    MatRadioModule,
    MatInputModule,
    MatNativeDateModule,
    CustomerModule,
    EmployeeModule,
    ServiceModule,
    ContractModule

  ],
  providers: [CustomerService, EmployeeService, ServiceService, ContractService],
  bootstrap: [AppComponent]
})
export class AppModule { }
