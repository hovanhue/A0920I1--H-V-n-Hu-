import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {ServiceType} from "../../models/service-type";
import {ServiceService} from "../../../../service/service/service.service";

@Component({
  selector: 'app-service-create',
  templateUrl: './service-create.component.html',
  styleUrls: ['./service-create.component.css']
})
export class ServiceCreateComponent implements OnInit {
  serviceTypeList: ServiceType[];

  constructor(private serviceService: ServiceService,
              private router: Router, private form: FormBuilder) { }

  createService = this.form.group({
    nameService: ['', [Validators.required]],
    area: ['', [Validators.required]],
    floor: ['', [Validators.required]],
    maxPerson: ['', [Validators.required]],
    total: ['', [Validators.required]],
    serviceType: ['', [Validators.required]],
    status: ['', [Validators.required]]
  });

  ngOnInit(): void {
    this.serviceService.getServiceType().subscribe((data) => {
      this.serviceTypeList = data;
    }, error => console.log(error));
  }

  onSubmit(createService: FormGroup) {
    console.log(createService.value);
    this.serviceService.addService(createService.value).subscribe(
      (data) => {
        alert('add service successfully!!');
        this.router.navigate(['list-service']);
      }, error => console.log(error)
    );
  }
}
