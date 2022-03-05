import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

export interface TipoMacro {
  id: number;
  nomemacro: string;
  numeromacro: string;
}

const urlBase = 'http://localhost:8080/api';

@Injectable({
  providedIn: 'root',
})
export class TipoMacroService {
  constructor(private http: HttpClient) {}

  listTipoMacro() {
    return this.http.get<TipoMacro[]>(`${urlBase}/tipomacro`);
  }

  retrieveTipoMacro(id: number){
    return this.http.get<TipoMacro>(`${urlBase}/tipomacro/${id}`);
  }

  createTipoMacro(tipoMacro: TipoMacro){
    return this.http.post<TipoMacro>(`${urlBase}/tipomacro`,tipoMacro );
  }
  updateTipoMacro(tipoMacro: TipoMacro){
    return this.http.put<TipoMacro>(`${urlBase}/tipomacro/${tipoMacro.id}`,tipoMacro );
  }

  deleteTipoMacro(id: number){
    return this.http.delete(`${urlBase}/tipomacro/${id}`);
  }

}
