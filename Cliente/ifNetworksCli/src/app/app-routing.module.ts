import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ListComponent } from './components/persona/list/list.component';
import { AddComponent } from './components/persona/add/add.component';
import { AppComponent } from './app.component';


const routes: Routes = [
  { path:'list', component:ListComponent },
  { path:'add', component:AddComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
