import { TestBed } from '@angular/core/testing';

import { TipoMacroService } from './tipo-macro.service';

describe('TipoMacroService', () => {
  let service: TipoMacroService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TipoMacroService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
