import {ServiceType} from "./service-type";

export class Service {
  id: number;
  nameService: string;
  area: number;
  floor: number;
  maxPerson: number;
  total: number;
  serviceType: ServiceType;
  status: string;

  constructor(id: number, nameService: string, are: number, floor: number,
  maxPerson: number, total: number, serviceType: ServiceType, status: string) {
    this.id = id;
    this.nameService = nameService;
    this.area = are;
    this.floor = floor;
    this.maxPerson = maxPerson;
    this.total = total;
    this.serviceType = serviceType;
    this.status = status;
  }
}
