import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';

import { RouterModule } from '@angular/router';
import './vendor';
import { JwtjobSharedModule } from 'app/shared/shared.module';
import { JwtjobCoreModule } from 'app/core/core.module';
import { JwtjobAppRoutingModule } from './app-routing.module';
import { JwtjobHomeModule } from './home/home.module';
import { JwtjobEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { MainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ActiveMenuDirective } from './layouts/navbar/active-menu.directive';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    JwtjobSharedModule,
    JwtjobCoreModule,
    JwtjobHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    JwtjobEntityModule,
    JwtjobAppRoutingModule,
    BrowserModule,
    BrowserAnimationsModule,
    NoopAnimationsModule,
    RouterModule,
  ],
  declarations: [MainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, ActiveMenuDirective, FooterComponent],
  bootstrap: [MainComponent],
})
export class JwtjobAppModule {}
