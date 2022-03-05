import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { TipoMacroService } from 'src/app/tipo-macro.service';

@Component({
  selector: 'app-tipo-macro-create',
  templateUrl: './tipo-macro-create.component.html',
  styleUrls: ['./tipo-macro-create.component.css'],
})
export class TipoMacroCreateComponent {
  tipoMacroForm = new FormGroup({
    nomemacro: new FormControl('', Validators.required),
    numeromacro: new FormControl('', Validators.required)
  });

  constructor(
    private tipoMacroService: TipoMacroService,
    private router: Router
  ) {}

  createTipoMacro(): void {
    this.tipoMacroService.createTipoMacro(this.tipoMacroForm.value).subscribe(tipoMacro => {

      this.router.navigate(['/tipomacro']);
    })
  }
}
