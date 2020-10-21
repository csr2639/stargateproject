import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HerosService {

  constructor(private http : HttpClient) { }
  getHerosList(){
    return this.http.get("https://swapi.dev/api/people/");
  }

  getDetailsById(id){
    return this.http.get("http://localhost:8080/getDetails?id="+id);
  }
}
