import {Component, Input, OnInit} from '@angular/core';
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

  studentDetails: Istudent;
  // để hứng dữ liệu từ component cha truyền sang
  constructor() { }

  ngOnInit(): void {
  }

  displayFormDetails(value) {
    this.studentDetails = value;
  }

  catchMark($event) {
    this.studentDetails.mark = $event;
    console.log('nhận giá trị từ component cha; ' + $event);
  }
}
