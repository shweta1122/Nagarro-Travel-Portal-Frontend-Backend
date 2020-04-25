import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'employee-travel-management-frontend';
  hotels = []

  constructor() {
    //baad me axios use krrnaok
    fetch("http://localhost:8080").then(x => x.json()).then(data => this.hotels = data)
  }
}
