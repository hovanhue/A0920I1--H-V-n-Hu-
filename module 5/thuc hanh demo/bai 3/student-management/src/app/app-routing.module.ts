import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {StudentListComponent} from './student-list/student-list.component';
import {ReactiveFormComponent} from './reactive-form/reactive-form.component';
import {StudentInformationComponent} from './student-information/student-information.component';
import {StudentEditComponent} from './student-edit/student-edit.component';


const routes: Routes = [
  {
    path: '', component: StudentListComponent
  },
  {
    path: 'create', component: ReactiveFormComponent
  },
  {
    path: 'details/:id', component: StudentInformationComponent
  },
  {
    path: 'edit', component: StudentEditComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
