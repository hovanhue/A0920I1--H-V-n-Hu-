import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Istudent} from '../models/Istudent';
import {StudentService} from '../student-service.service';
import {ActivatedRoute, ParamMap} from '@angular/router';

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
  constructor(private studentService: StudentService, private activatedRoute: ActivatedRoute) {

  }
idStudent;
  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramPap: ParamMap) => {
      // tslint:disable-next-line:radix
      this.idStudent = parseInt(paramPap.get('id'));
      this.studentService.getStudentId(this.idStudent).subscribe((data) => {
        this.studentDetail = data;
      });
    });
  }

  changerMark(mark: number){
    this.studentDetail.mark = mark;
    this.throwCurrentMark.emit(mark);
  }
}
