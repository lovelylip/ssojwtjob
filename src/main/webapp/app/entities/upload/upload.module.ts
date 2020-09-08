import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { JwtjobSharedModule } from 'app/shared/shared.module';
import { UploadComponent } from './upload.component';
import { UploadDetailComponent } from './upload-detail.component';
import { UploadUpdateComponent } from './upload-update.component';
import { UploadDeleteDialogComponent } from './upload-delete-dialog.component';
import { uploadRoute } from './upload.route';

@NgModule({
  imports: [JwtjobSharedModule, RouterModule.forChild(uploadRoute)],
  declarations: [UploadComponent, UploadDetailComponent, UploadUpdateComponent, UploadDeleteDialogComponent],
  entryComponents: [UploadDeleteDialogComponent],
})
export class JwtjobUploadModule {}
