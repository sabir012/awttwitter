import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-filter',
  templateUrl: './filter.component.html',
  styleUrls: ['./filter.component.css']
})
export class FilterComponent implements OnInit {

  public genders : string[] = ['Male', 'Female', 'None'];

  public languages : string[] = ['English', 'German', 'French'];

  public sentiments : string[] = ['Negative', 'Positive', 'Neutral'];

  public topics : string[] = ['Arts', 'Business', 'Computers', 'Games', 'Health', 'Home', 'Recreation', 'Science', 'Society', 'Sports'];

  constructor() { }

  ngOnInit() {
  }

}
