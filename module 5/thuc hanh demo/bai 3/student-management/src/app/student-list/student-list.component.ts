import {Component, Input, OnInit} from '@angular/core';
import {Istudent} from '../models/Istudent';
import {StudentService} from '../student-service.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  students: Istudent[];

  studentDetails: Istudent;
  // để hứng dữ liệu từ component cha truyền sang
  constructor(private studentService: StudentService) { }

  ngOnInit(): void {
    this.studentService.getAllStudent().subscribe(
      (data) => this.students = data
    );
  }

  catchMark($event) {
    this.studentDetails.mark = $event;
    console.log('nhận giá trị từ component cha; ' + $event);
  }

  // getFormCreate() {
  //
  // }
}
