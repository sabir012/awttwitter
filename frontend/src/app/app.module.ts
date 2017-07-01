import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SocialpostsComponent } from './socialposts/socialposts.component';
import { ChartsModule } from 'ng2-charts';
import { LoginComponent } from './login/login.component';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';

const appRoutes: Routes = [
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: '',
    redirectTo : 'home',
    pathMatch : 'full'
  }
];


@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    NavbarComponent,
    SocialpostsComponent,
    LoginComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    ChartsModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing : true }
    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})



export class AppModule { }
