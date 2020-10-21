import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SearchProfilesComponent } from './star-heros/search-profiles/search-profiles.component';
import { DisplayHeroComponent } from './star-heros/display-hero/display-hero.component';


const routes: Routes = [
  { path: '', component: SearchProfilesComponent },
  { path: 'view-hero', component: DisplayHeroComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
