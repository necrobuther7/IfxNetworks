import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Persona } from '../models/Persona';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  //API_URL = 'http://localhost:3000/api'
  API_URL = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  getPersonas(): Observable<any>{
    return this.http.get<Persona>(`${this.API_URL}/personas`);
  }

  getPersona(id: string){
    return this.http.get(`${this.API_URL}/persona/${id}`);
  }

  savePersona(persona: Persona){
    return this.http.post<Persona>(`${this.API_URL}/persona`, persona);
  }

  updatePersona(id: string, persona: Persona) {
    return this.http.put(`${this.API_URL}/persona/${id}`, persona);
  }

  deletePersona(id: string){
    return this.http.delete(`${this.API_URL}/persona/${id}`);
  }

}
