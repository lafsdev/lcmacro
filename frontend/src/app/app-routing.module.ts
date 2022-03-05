import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TipoMacroCreateComponent } from './components/tipo-macro-create/tipo-macro-create.component';
import { TipoMacroListComponent } from './components/tipo-macro-list/tipo-macro-list.component';
import { TipoMacroUpdateComponent } from './components/tipo-macro-update/tipo-macro-update.component';

const routes: Routes = [
  { path: 'tipomacro', component: TipoMacroListComponent },
  { path: 'tipomacro/create', component: TipoMacroCreateComponent },
  { path: 'tipomacro/:id', component: TipoMacroUpdateComponent },
  { path: '', redirectTo: 'tipomacro', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
