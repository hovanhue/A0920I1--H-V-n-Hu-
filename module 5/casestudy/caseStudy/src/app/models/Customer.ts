import {CustomerType} from "./CustomerType";

export class Customer {
  id: number;
  customerType: CustomerType;
  name: string;
  birthDate: string;
  idCard: string;
  gender: string;
  phone: string;
  email: string;
  address: string;

  constructor(id: number, typeCustomer: CustomerType, name: string, birthDate: string,
              idCard: string, gender: string,phone: string, email: string, address: string) {
    this.id = id;
    this.customerType = typeCustomer;
    this.birthDate = birthDate;
    this.idCard = idCard;
    this.gender = gender;
    this.phone = phone;
    this.email = email;
    this.address = address;
  }
}
