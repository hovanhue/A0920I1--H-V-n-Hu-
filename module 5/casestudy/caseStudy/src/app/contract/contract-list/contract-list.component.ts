import { Component, OnInit } from '@angular/core';
import {ContractService} from "../../../../service/contract/contract.service";
import {MatDialog} from "@angular/material/dialog";
import {Contract} from "../../models/contract";
import {ContractDeleteComponent} from "../contract-delete/contract-delete.component";
import {ContractDetailsComponent} from "../contract-details/contract-details.component";

@Component({
  selector: 'app-contract-list',
  templateUrl: './contract-list.component.html',
  styleUrls: ['./contract-list.component.css']
})
export class ContractListComponent implements OnInit {
  contractList: Contract[];

  constructor(private contractService: ContractService,
              private dialog: MatDialog) { }

  ngOnInit(): void {
    this.contractService.getContract().subscribe((data) => {
      this.contractList = data;
    });
  }

  openDialogDelete(id: number) {
    const dialogRef = this.dialog.open(ContractDeleteComponent,
      {
        data: {
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

    openDialogDetails(id: number) {
      const dialogRef = this.dialog.open(ContractDetailsComponent,
        {
          width: '600px'
        }
      );
      dialogRef.afterClosed().subscribe(result => {
        console.log(`Dialog result: ${result}`);
        this.ngOnInit();
      });

  }


}
