import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ServiceCreateComponent} from "./service-create/service-create.component";
import {ServiceListComponent} from "./service-list/service-list.component";
import {ServiceEidtComponent} from "./service-eidt/service-eidt.component";
const routes: Routes = [
 {path: 'create-service', component: ServiceCreateComponent},
  {path: 'list-service', component: ServiceListComponent},
  {path: 'update-service/:id', component: ServiceEidtComponent}

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ServiceRoutingModule { }
