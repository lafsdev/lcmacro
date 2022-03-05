import { Component, OnInit } from '@angular/core';
import { TipoMacro, TipoMacroService } from 'src/app/tipo-macro.service';

@Component({
  selector: 'app-tipo-macro-list',
  templateUrl: './tipo-macro-list.component.html',
  styleUrls: ['./tipo-macro-list.component.css'],
})
export class TipoMacroListComponent implements OnInit {
  tipoMacros: TipoMacro[] = [];
  constructor(private tipoMacroService: TipoMacroService) {}

  ngOnInit(): void {
    this.tipoMacroService.listTipoMacro().subscribe((tipoMacros) => {
      this.tipoMacros = tipoMacros;
      console.log(tipoMacros);
    });
  }

  deleteTipoMacro(tipoMacro: TipoMacro) {
    this.tipoMacroService.deleteTipoMacro(tipoMacro.id).subscribe(() => {
      const index = this.tipoMacros.indexOf(tipoMacro);
      this.tipoMacros.splice(index, 1);
    });
  }
}
