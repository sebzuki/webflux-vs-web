import { Component, NgZone, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Student } from './Student';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: [ './app.component.css' ]
})
export class AppComponent implements OnInit {
  title = 'test';
  students: Student[] = [];


  constructor(private _httpClient: HttpClient, private zone: NgZone) {
  }

  ngOnInit() {
    this.loadFlux();
  }

  loadFlux(): void {
    const eventSource = new EventSource('http://localhost:8081/load-flux');

    eventSource.addEventListener('message', message => {
      this.students.push(JSON.parse(message.data));
    });

    eventSource.addEventListener('error', event => {
      console.error(event);
    });
  }
}
