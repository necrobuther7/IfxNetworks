import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PersonaService } from '../../../services/persona.service';
import { Persona } from '../../../models/Persona'

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private router:Router, private personaService: PersonaService) { }

  ngOnInit(): void {
  }

  Guardar(){
    
  }

  /*Guardar(persona: Persona){
    this.personaService.savePersona(persona).subscribe(
      data=>{
        alert("Se agrego con Exito");
        this.router.navigate(["list"])
      })
  }*/

}
