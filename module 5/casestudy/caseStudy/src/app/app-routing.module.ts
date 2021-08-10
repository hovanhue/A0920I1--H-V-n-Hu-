import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {PageNotFoundComponent} from "./page-not-found/page-not-found.component";
import {CustomerRoutingModule} from "./customer/customer-routing.module";
import {EmployeeService} from "../../service/employee/employee.service";
import {EmployeeRoutingModule} from "./employee/employee-routing.module";


const routes: Routes = [
 {path: '**', component: PageNotFoundComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes), CustomerRoutingModule, EmployeeRoutingModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }
