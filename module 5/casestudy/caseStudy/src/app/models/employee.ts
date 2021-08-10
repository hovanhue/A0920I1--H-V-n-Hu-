import {EducationDegree} from "./education-Degree";
import {Division} from "./division";
import {Position} from "./position";

export class Employee {
  id: number;
  name: string;
  position: Position;
  educationDegree: EducationDegree;
  division: Division;
  dateOfBirth: string;
  idCard: string;
  salary: number;
  phoneNumber: string;
  email: string;
  address: string;

  constructor(id: number, name: string, position: Position, educationDegree: EducationDegree, division: Division,
              dateOfBirth: string, idCard: string, salary: number, phoneNumber: string, email: string, address: string) {
    this.id = id;
    this.name = name;
    this.position = position;
    this.educationDegree = educationDegree;
    this.division = division;
    this.dateOfBirth = dateOfBirth;
    this.idCard = idCard;
    this.salary = salary
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.address = address;
  }
}
