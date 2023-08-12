import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';
import { TestComponent } from './test.component';
import { AppComponent } from './app.component';

const routes: Routes = [
  { path: 'test', component: TestComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules }) ], // , enableTracing: true
  exports: [ RouterModule ]
})
export class AppRoutingModule {
}
