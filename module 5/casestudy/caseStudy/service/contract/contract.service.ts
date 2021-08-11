import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Contract} from "../../src/app/models/contract";
import {ContractDetails} from "../../src/app/models/contract-details";

@Injectable({
  providedIn: 'root'
})
export class ContractService {
  private readonly API_CONTRACT_URL = 'http://localhost:3000/contract';
  private readonly API_CONTRACTDETAILS_URL = 'http://localhost:3000/contractDetails';

  constructor(private httpClient: HttpClient) {
  }

  public getContract(): Observable<Contract[]> {
    return this.httpClient.get<Contract[]>(this.API_CONTRACT_URL);
  }

  public getContractDetails(): Observable<ContractDetails[]> {
    return this.httpClient.get<ContractDetails[]>(this.API_CONTRACTDETAILS_URL);
  }

  public getContractDetailsById(id: number): Observable<ContractDetails> {
    return this.httpClient.get<ContractDetails>(this.API_CONTRACTDETAILS_URL + '/' + (id));
  }

  public addContract(contract: Contract): Observable<void> {
    return this.httpClient.post<void>(this.API_CONTRACT_URL, contract);
  }

  public findContractById(id: number): Observable<Contract> {
    return this.httpClient.get<Contract>(this.API_CONTRACT_URL + '/' + (id));
  }

  public updateContract(updateContract: Contract): Observable<void> {
    return this.httpClient.put<void>(this.API_CONTRACT_URL + '/' + updateContract.id, updateContract);
  }

  public deleteContract(id) {
    console.log(id);
    console.log(this.API_CONTRACT_URL + '/' + id);
    return this.httpClient.delete(this.API_CONTRACT_URL + '/' + id);
  }

}
