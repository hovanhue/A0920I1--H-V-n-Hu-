import { Component, OnInit } from '@angular/core';
import {Istudent} from '../models/Istudent';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  students: Istudent[] = [
    {
      id: 1,
      name: 'hue',
      age: 1,
      mark: 1,
      avatar: 'https://i.pinimg.com/474x/90/57/0a/90570addee2645866a597530721f37fd.jpg'
    },
    {
      id: 2,
      name: 'hue',
      age: 1,
      mark: 7,
      avatar: 'https://i.pinimg.com/474x/90/57/0a/90570addee2645866a597530721f37fd.jpg'
    },
    {
      id: 3,
      name: 'hue',
      age: 1,
      mark: 1,
      avatar: 'https://i.pinimg.com/474x/90/57/0a/90570addee2645866a597530721f37fd.jpg'
    }
];
  constructor() { }

  ngOnInit(): void {
  }

  displayFormDetails(id: number) {

  }
}
