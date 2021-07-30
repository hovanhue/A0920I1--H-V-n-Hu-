import {ICustomerType} from './ICustomerType';

export interface ICustomers{
  idCustomer: number;
  // idCustomerType: ICustomerType;
  idCustomerType: number;
  name: string;
  dateOfBirth: string;
  phoneNumber: string;
  email: string;
  address: string;
}
