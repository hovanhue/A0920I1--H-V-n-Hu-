import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CustomerEditComponent} from "./customer-edit/customer-edit.component";
import {CustomerListComponent} from "./customer-list/customer-list.component";
import {CustomerCreateComponent} from "./customer-create/customer-create.component";

const routes: Routes = [
 {path: 'create-customer', component: CustomerCreateComponent},
  {path: 'list-customer', component: CustomerListComponent},
  {path: 'update-customer/:id', component: CustomerEditComponent}

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CustomerRoutingModule { }
