import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TimelineComponent} from "./timeline/timeline.component";


const routes: Routes = [
  {
  path: 'timelines',
  component: TimelineComponent

}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
