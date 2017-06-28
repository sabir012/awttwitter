import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-socialposts',
  templateUrl: './socialposts.component.html',
  styleUrls: ['./socialposts.component.css']
})
export class SocialpostsComponent implements OnInit {
  name = 'Aldo Myrtaj';
  comment = 'Bootstrap is great';
  time = '3 minutes ago'
  constructor() { }

  ngOnInit() {
  }

}
