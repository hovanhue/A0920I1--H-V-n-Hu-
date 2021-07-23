import { Component, OnInit } from '@angular/core';
import {Istudent} from '../models/Istudent';

@Component({
  selector: 'app-student-information',
  templateUrl: './student-information.component.html',
  styleUrls: ['./student-information.component.css']
})
export class StudentInformationComponent implements OnInit {
  student: Istudent = {
    id: 1,
    name: 'hue',
    age: 1,
    mark: 1,
    avatar: 'https://i.pinimg.com/474x/90/57/0a/90570addee2645866a597530721f37fd.jpg'
  };

  constructor() { }

  ngOnInit(): void {
  }

  changeMark(mark: number) {
    this.student.mark = mark;
  }
}
