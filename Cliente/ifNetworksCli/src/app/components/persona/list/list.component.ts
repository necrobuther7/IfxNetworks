import { Component, OnInit } from '@angular/core';
import { PersonaService } from '../../../services/persona.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  persona: any =[];
  constructor(private personaService: PersonaService) { }

  ngOnInit() {
    this.personaService.getPersonas().subscribe(
      res =>  {
        this.persona = res;
      },
      err => console.log(err)
    );
  }

}
