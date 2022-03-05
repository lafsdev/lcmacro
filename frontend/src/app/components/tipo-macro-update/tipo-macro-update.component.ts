import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { TipoMacro, TipoMacroService } from 'src/app/tipo-macro.service';

@Component({
  selector: 'app-tipo-macro-update',
  templateUrl: './tipo-macro-update.component.html',
  styleUrls: ['./tipo-macro-update.component.css'],
})
export class TipoMacroUpdateComponent implements OnInit {
  tipoMacroForm = new FormGroup({
    nomemacro: new FormControl('', Validators.required),
    numeromacro: new FormControl('', Validators.required),
  });

  id: number | undefined;

  constructor(
    private tipoMacroService: TipoMacroService,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.route.paramMap.subscribe((paramMap) => {
      this.id = parseInt(paramMap.get('id') || '{}');
    });

    this.tipoMacroService
      .retrieveTipoMacro(this.id || 0)
      .subscribe((tipoMacro) => {
        this.tipoMacroForm.reset(tipoMacro);
      });
  }

  updateTipoMacro() {
    this.tipoMacroService
      .updateTipoMacro({ id: this.id, ...this.tipoMacroForm.value })
      .subscribe((tipoMacro) => {
        this.tipoMacroForm.reset(tipoMacro);
      });
  }
}
