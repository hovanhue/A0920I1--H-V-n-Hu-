import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ContractCreateComponent} from "./contract-create/contract-create.component";
import {ContractListComponent} from "./contract-list/contract-list.component";
import {ContractEditComponent} from "./contract-edit/contract-edit.component";
import {ContractDetailsComponent} from "./contract-details/contract-details.component";

const routes: Routes = [
 {path: 'create-contract', component: ContractCreateComponent},
  {path: 'list-contract', component: ContractListComponent},
  {path: 'update-contract/:id', component: ContractEditComponent},
  {path: 'details-contract/:id', component: ContractDetailsComponent}

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ContractRoutingModule { }
