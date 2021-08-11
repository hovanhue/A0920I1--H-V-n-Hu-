import { Component, OnInit } from '@angular/core';
import {ContractService} from "../../../../service/contract/contract.service";
import {ContractDetails} from "../../models/contract-details";
import {ActivatedRoute, ParamMap} from "@angular/router";
import {FormBuilder, Validators} from "@angular/forms";

@Component({
  selector: 'app-contract-details',
  templateUrl: './contract-details.component.html',
  styleUrls: ['./contract-details.component.css']
})
export class ContractDetailsComponent implements OnInit {
  contractDetails: ContractDetails;
  id: number;

  constructor(private contractService: ContractService,
              private form: FormBuilder,
              private activatedRoute: ActivatedRoute
  ) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramPap: ParamMap) => {
      // tslint:disable-next-line:radix
      this.id = parseInt(paramPap.get('id'));
      console.log(this.id);
      this.contractService.getContractDetailsById(this.id).subscribe((data) => {
        this.contractDetails = data;
        console.log(this.contractDetails);
      });
    });

  }

}
