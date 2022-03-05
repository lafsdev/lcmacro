import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TipoMacroUpdateComponent } from './tipo-macro-update.component';

describe('TipoMacroUpdateComponent', () => {
  let component: TipoMacroUpdateComponent;
  let fixture: ComponentFixture<TipoMacroUpdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TipoMacroUpdateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TipoMacroUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
