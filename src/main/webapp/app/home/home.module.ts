import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { JwtjobSharedModule } from 'app/shared/shared.module';
import { HOME_ROUTE } from './home.route';
import { HomeComponent } from './home.component';

@NgModule({
  imports: [JwtjobSharedModule, RouterModule.forChild([HOME_ROUTE])],
  declarations: [HomeComponent],
})
export class JwtjobHomeModule {}
