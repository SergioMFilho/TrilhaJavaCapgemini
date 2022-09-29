import { TestBed } from '@angular/core/testing';

import { AltGuard } from './alt.guard';

describe('AltGuard', () => {
  let guard: AltGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(AltGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
