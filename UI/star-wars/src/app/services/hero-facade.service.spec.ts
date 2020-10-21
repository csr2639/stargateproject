import { TestBed } from '@angular/core/testing';

import { HeroFacadeService } from './hero-facade.service';

describe('HeroFacadeService', () => {
  let service: HeroFacadeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HeroFacadeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
