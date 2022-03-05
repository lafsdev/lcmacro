import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TipoMacroListComponent } from './tipo-macro-list.component';

describe('TipoMacroListComponent', () => {
  let component: TipoMacroListComponent;
  let fixture: ComponentFixture<TipoMacroListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TipoMacroListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TipoMacroListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
