import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TipoMacroCreateComponent } from './tipo-macro-create.component';

describe('TipoMacroCreateComponent', () => {
  let component: TipoMacroCreateComponent;
  let fixture: ComponentFixture<TipoMacroCreateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TipoMacroCreateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TipoMacroCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
