import { Component, NgZone, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Student } from './Student';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: [ './app.component.css' ]
})
export class AppComponent implements OnInit {
  title = 'test';
  students: Student[] = [];
  students$: Observable<Student[]>;

  constructor(private _httpClient: HttpClient, private zone: NgZone) {
  }

  ngOnInit() {
    this.loadMonoHttp();
  }

  loadFluxHttp(): void {
    this._httpClient.get<Student[]>('http://localhost:8081/load-flux')
      .subscribe(value => this.students.push(...value));
  }

  loadMonoHttp(): void {
    this._httpClient.get<Student[]>('http://localhost:8080/load')
      .subscribe(value => this.students.push(...value));
  }

  // loadFlux(): void {
  //
  //   // The mimetype for SSE is text/event-stream (HTML5)
  //   // WebSockets vs. Server-Sent events/EventSource
  //   // Warning: When not used over HTTP/2, SSE suffers from a limitation to the maximum number of open connections,
  //   this.students$ = new Observable<Student[]>((observer) => {
  //     const studentsBuffer: Student[] = [];
  //     const eventSource = new EventSource('http://localhost:8081/load-flux');
  //
  //     eventSource.addEventListener('message', message => {
  //       studentsBuffer.push(JSON.parse(message.data))
  //       observer.next(studentsBuffer);
  //     });
  //
  //     eventSource.addEventListener('error', error => {
  //       if (eventSource.readyState === 0) {
  //         eventSource.close(); // The stream has been closed by the server
  //         observer.complete();
  //       } else {
  //         observer.error('EventSource error: ' + error);
  //       }
  //     });
  //
  //     return () => eventSource.close();
  //   });
  // }
}
