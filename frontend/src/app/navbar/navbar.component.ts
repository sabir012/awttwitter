import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  positive_value = 0.9; // positive sentinent
  negative_value = 0.1; // negative sentinent
  public doughnutChartLabels:string[] = ['Positive', 'Negative'];
  public doughnutChartData:number[] = [this.positive_value, this.negative_value];
  public doughnutChartType:string = 'doughnut';
  texttype = ['Arts', 'Business', 'Computers', 'Games', 'Health', 'Home', 'Recreation', 'Science', 'Society', 'Sports'];
  fullpathspam; fullpathgender;
  //TODO if function that checks what text type is and responds with image path and name please use constructor
  fullpathtype = '/assets/icons/art_icon.png';


  // we will get this from the server side
  spamboolean = true;
  spam_text;
  genderboolean = true;
  gender_text;




  // events not needed for our code
  public chartClicked(e:any):void {
    console.log(e);
  }
  public chartHovered(e:any):void {
    console.log(e);
  }
  constructor() {
    if(this.spamboolean){
      this.fullpathspam = '/assets/icons/spam_icon.png';
      this.spam_text = 'Spam Detected';
    } else {
      this.fullpathspam = '/assets/icons/no_spam_icon.png';
      this.spam_text = 'No Spam Detected';
    }
    if(this.genderboolean){
      this.fullpathgender = '/assets/icons/male_icon.png';
      this.gender_text = 'Post written from Male';
    } else {
      this.fullpathgender = '/assets/icons/no_spam_icon.png';
      this.gender_text = 'Post written from Female';
    }
  }

  ngOnInit() {
  }

}
