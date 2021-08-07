import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {StudentService} from '../student-service.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
  studentCreate: FormGroup;

  constructor(private studentService: StudentService, private activatedRoute: ActivatedRoute, private router: Router) { }
  ngOnInit(): void {
    this.studentCreate = new FormGroup({
      id: new FormControl(''),
      name: new FormControl(''),
      age: new FormControl('0'),
      mark: new FormControl('0'),
      avatar: new FormControl('')
    });
  }

  onSubmit() {
    console.log(this.studentCreate.value);
    this.studentService.addNewStudent(this.studentCreate.value).subscribe((data) => {
      this.router.navigate(['']);
    });
  }
}
