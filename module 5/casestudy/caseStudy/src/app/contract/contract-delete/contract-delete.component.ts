import {Component, Inject, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {MAT_DIALOG_DATA} from "@angular/material/dialog";
import {ContractService} from "../../../../service/contract/contract.service";

@Component({
  selector: 'app-contract-delete',
  templateUrl: './contract-delete.component.html',
  styleUrls: ['./contract-delete.component.css']
})
export class ContractDeleteComponent implements OnInit {
  id: number;

  constructor(private contractService: ContractService, private router: Router,
              @Inject(MAT_DIALOG_DATA) public data: any) {
    this.id = data.id;
  }

  ngOnInit(): void {
  }

  onSubmit(id: number) {
    console.log(id);
    this.contractService.deleteContract(id).subscribe(
      (data) => {
        this.router.navigate(['list-contract']);
      }, error => console.log(error)

    );
  }
}
