import { Component, inject, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { JsonPipe } from '@angular/common';
import { toSignal } from '@angular/core/rxjs-interop';
import { environment } from '../environments/environment';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, JsonPipe],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class App {
  private http = inject(HttpClient);
  public apiUrl = environment.apiUrl;

  constructor() {
    console.log('ENV:', environment);
  }

  test = this.http.get<string>(`${this.apiUrl}/users`);
  counter = toSignal(this.test);

  protected readonly title = signal('front');
}
