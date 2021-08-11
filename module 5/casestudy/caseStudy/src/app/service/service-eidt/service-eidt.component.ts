import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {ServiceType} from "../../models/service-type";
import {ServiceService} from "../../../../service/service/service.service";

@Component({
  selector: 'app-service-eidt',
  templateUrl: './service-eidt.component.html',
  styleUrls: ['./service-eidt.component.css']
})
export class ServiceEidtComponent implements OnInit {

  id: number;
  serviceTypeList: ServiceType[];

  constructor(private serviceService: ServiceService,
              private form: FormBuilder,
              private activatedRoute: ActivatedRoute,
              private router: Router)  { }

  updateService = this.form.group({
    id: ['', [Validators.required]],
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
    });
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = Number(paramMap.get('id'));
      this.serviceService.findServiceById(this.id).subscribe((data) => {
        this.updateService.setValue(data);
      });
      console.log('update' + this.updateService);
    });
  }

  onSubmit(updateService: FormGroup) {
    this.serviceService.updateService(updateService.value).subscribe(
      (data) => {
        this.router.navigate(['list-customer']);
      }, error => console.log(error)
    );
  }
}
