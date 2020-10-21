import { Component, OnInit } from '@angular/core';
import { HerosService } from 'src/app/services/heros.service';
import { Router } from '@angular/router';
import { HeroFacadeService } from 'src/app/services/hero-facade.service';

@Component({
  selector: 'app-search-profiles',
  templateUrl: './search-profiles.component.html',
  styleUrls: ['./search-profiles.component.scss']
})
export class SearchProfilesComponent implements OnInit {

  heroList:any=[{id:1,name:"Luke Skywalker"},{id:2,name:"C-P30"},{id:21,name:"Yoda"},{id:4,name:"Darth Vader"},{id:5,name:"Leia Organa"},{id:6,name:"Owen Lars"},{id:7,name:"Beru Whitesun lars"}];
  filteredList:any;
  searchTerm:string="";
  constructor(private heroSevice : HerosService,private router: Router, private heroFacadeService: HeroFacadeService) { }

  ngOnInit(): void {

this.filteredList = this.heroList;

    this.heroSevice.getDetailsById(1).subscribe(res=>{
      console.log(res);
    })
  }


  filterHeros(){
    this.filteredList = this.heroList.filter(hero => hero.name.toLowerCase().includes(this.searchTerm.toLowerCase()));
  }

  loadProfileData(hero:any){
    this.heroFacadeService.changeHero(hero);
    this.router.navigate(["/view-hero"]);
  }
}
