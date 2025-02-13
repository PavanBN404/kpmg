import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { json } from 'stream/consumers';

@Component({
  imports: [FormsModule,RouterOutlet],
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'first';
  name = 'Pavan';
  phnno = 9900251069;
  url = 'https://www.w3schools.com/angular/default.asp';
  name1 = 'kpmg';
  employee={
    id : 100,
    name : "Drona",
    email: "pavanbn23@gmail.com"


  };
  greeting(){
    console.log("Done Bro!!!!");
  }
  log(){
    console.log(JSON.stringify(this.employee));
  }
}

