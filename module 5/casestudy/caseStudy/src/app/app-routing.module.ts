import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {PageNotFoundComponent} from "./page-not-found/page-not-found.component";
import {CustomerRoutingModule} from "./customer/customer-routing.module";
import {EmployeeService} from "../../service/employee/employee.service";
import {EmployeeRoutingModule} from "./employee/employee-routing.module";
import {ServiceRoutingModule} from "./service/service-routing.module";
import {ContractRoutingModule} from "./contract/contract-routing.module";
import {HomeComponent} from "./home/home.component";


const routes: Routes = [

  {path: '', component: HomeComponent},
 {path: '**', component: PageNotFoundComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes), CustomerRoutingModule, EmployeeRoutingModule, ServiceRoutingModule, ContractRoutingModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }
