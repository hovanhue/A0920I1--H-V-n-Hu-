import {ICustomerType} from './ICustomerType';

export interface ICustomers{
  idCustomer: number;
  idCustomerType: ICustomerType;
  // idCustomerType: number;
  name: string;
  dateOfBirth: string;
  gender: string;
  idCard: number;
  phoneNumber: string;
  email: string;
  address: string;
}
