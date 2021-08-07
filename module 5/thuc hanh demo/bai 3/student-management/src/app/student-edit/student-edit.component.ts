import { Component, OnInit } from '@angular/core';
import {StudentService} from '../student-service.service';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-student-edit',
  templateUrl: './student-edit.component.html',
  styleUrls: ['./student-edit.component.css']
})
export class StudentEditComponent implements OnInit {

  constructor(private studentService: StudentService, private activatedRoute: ActivatedRoute) { }
editStudent;
  ngOnInit(): void {
  }

}
