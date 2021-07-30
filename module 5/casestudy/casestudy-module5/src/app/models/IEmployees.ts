import {IPosition} from './IPosition';
import {IEducationDegree} from './IEducationDegree';
import {IDivision} from './IDivision';

export interface IEmployees{
  idEmployees: number;
  name: string;
  idPosition: number;
  idEducationDegree: number;
  idDivision: number;
  // idPosition: IPosition;
  // idEducationDegree: IEducationDegree;
  // idDivision: IDivision;
  dateOfBirth: string;
  idCard: string;
  salary: number;
  phoneNumber: string;
  email: string;
  address: string;
}
