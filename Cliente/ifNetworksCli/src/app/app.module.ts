import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CargoComponent } from './components/cargo/cargo.component';
import { ContratoComponent } from './components/contrato/contrato.component';

import { PersonaService } from './services/persona.service';
import { AddComponent } from './components/persona/add/add.component';
import { ListComponent } from './components/persona/list/list.component';


@NgModule({
  declarations: [
    AppComponent,
    CargoComponent,
    ContratoComponent,
    AddComponent,
    ListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
    AppComponent
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
