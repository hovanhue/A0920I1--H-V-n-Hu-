import { Component, OnInit } from '@angular/core';
import {MatDialog} from "@angular/material/dialog";
import {Service} from "../../models/service";
import {ServiceService} from "../../../../service/service/service.service";
import {ServiceDeleteComponent} from "../service-delete/service-delete.component";
@Component({
  selector: 'app-service-list',
  templateUrl: './service-list.component.html',
  styleUrls: ['./service-list.component.css']
})
export class ServiceListComponent implements OnInit {

  serviceList: Service[] = [];
  constructor(
    private serviceService: ServiceService,
    public dialog: MatDialog

  ) { }

  ngOnInit(): void {
    this.serviceService.getService().subscribe(
      (data) => {
        console.log(data);
        this.serviceList = data;
      }, error => console.log(error)
    );
  }

  openDialogDelete(id: number) {
    const dialogRef = this.dialog.open(ServiceDeleteComponent,
      {data: {
          id
        },
        width: '400px'
      }
    );
    dialogRef.afterClosed().subscribe(result => {
      console.log(`Dialog result: ${result}`);
      this.ngOnInit();
    });
  }
}
