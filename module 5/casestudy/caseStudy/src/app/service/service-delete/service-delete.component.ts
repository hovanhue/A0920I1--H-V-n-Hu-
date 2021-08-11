import {Component, Inject, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {MAT_DIALOG_DATA} from "@angular/material/dialog";
import {ServiceService} from "../../../../service/service/service.service";

@Component({
  selector: 'app-service-delete',
  templateUrl: './service-delete.component.html',
  styleUrls: ['./service-delete.component.css']
})
export class ServiceDeleteComponent implements OnInit {
  id: number;
  constructor(private serviceService: ServiceService, private router: Router,
              @Inject(MAT_DIALOG_DATA) public data: any) {
    this.id = data.id;  }

  ngOnInit(): void {
  }

  onSubmit(id: number) {
    console.log(id);
    this.serviceService.deleteService(id).subscribe(
      (data) => {
        this.router.navigate(['list-customer']);
      }, error => console.log(error)

    );
  }
}
