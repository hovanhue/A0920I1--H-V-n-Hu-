import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Istudent} from '../models/Istudent';

@Component({
  selector: 'app-student-information',
  templateUrl: './student-information.component.html',
  styleUrls: ['./student-information.component.css']
})
export class StudentInformationComponent implements OnInit {

  @Input()
  studentDetail: Istudent;

  @Output()
  // khai báo 1 sự kiện
  throwCurrentMark = new EventEmitter();
  constructor() {

  }

  ngOnInit(): void {
  }

  changerMark(mark: number){
    this.studentDetail.mark = mark;
    this.throwCurrentMark.emit(mark);
  }
}
