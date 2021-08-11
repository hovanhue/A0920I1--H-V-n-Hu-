export class AttachService {
  id: number;
  name: string;
  price: number;
  unit: string;
  status: string;

  constructor(id: number, name: string, price: number, unit: string, status: string) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.unit = unit;
    this.status = status;
  }
}
