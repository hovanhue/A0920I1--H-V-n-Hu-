import {Contract} from "./contract";
import {AttachService} from "./attach-service";

export class ContractDetails {
  id: number;
  contract: Contract;
  attachService: AttachService;
  quantity: number;

  constructor(id: number, contract: Contract, attachService: AttachService, quantity: number) {
    this.id = id;
    this.contract = contract;
    this.attachService = attachService;
    this.quantity = quantity;
  }
}
