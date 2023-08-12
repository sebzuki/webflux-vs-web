import { Component, NgZone, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Student } from './Student';
import { Observable } from 'rxjs';

@Component({
  selector: 'test-root',
  templateUrl: './test.component.html'
})
export class TestComponent implements OnInit {
  title = 'test';
  students: Student[] = [];
  students$: Observable<Student[]>;

  constructor(private _httpClient: HttpClient, private zone: NgZone) {
  }

  ngOnInit() {
  }
}
