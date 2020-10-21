import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { HerosService } from './heros.service';

@Injectable({
  providedIn: 'root'
})
export class HeroFacadeService {

  constructor(private heroService:HerosService) { }

  private heroDetails = new BehaviorSubject<string>("");
  heroDetails$ = this.heroDetails.asObservable();


  changeHeroDetails(details){
    this.heroDetails.next(details)
  }

  changeHero(hero){
    this.heroService.getDetailsById(hero.id).subscribe(res=>{
     this.changeHeroDetails(res);
    })
  }
}
