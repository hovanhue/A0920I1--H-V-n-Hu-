import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-like',
  templateUrl: './like.component.html',
  styleUrls: ['./like.component.css']
})
export class LikeComponent implements OnInit {
  likes = 0;
  likeThis() {
    this.likes++;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
