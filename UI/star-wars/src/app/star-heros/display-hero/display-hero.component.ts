import { Component, OnInit, OnDestroy } from '@angular/core';
import { HerosService } from 'src/app/services/heros.service';
import { Subscription, Observable } from 'rxjs';
import { HeroFacadeService } from 'src/app/services/hero-facade.service';

@Component({
  selector: 'app-display-hero',
  templateUrl: './display-hero.component.html',
  styleUrls: ['./display-hero.component.scss']
})
export class DisplayHeroComponent implements OnInit, OnDestroy{
  heroInfo$ :Observable<any>;

  constructor(private heroFacadeService:HeroFacadeService) { }
  ngOnDestroy(): void {
   this.heroFacadeService.changeHeroDetails(null);
  }

  ngOnInit(): void {
    this.heroInfo$ = this.heroFacadeService.heroDetails$;
  }

}
