import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Service} from "../../src/app/models/service";
import {ServiceType} from "../../src/app/models/service-type";

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  private readonly API_SERVICE_URL = 'http://localhost:3000/service';
  private readonly API_SERVICETYPE_URL = 'http://localhost:3000/serviceType';

  constructor(private httpClient: HttpClient) {
  }

  public getService(): Observable<Service[]> {
    return this.httpClient.get<Service[]>(this.API_SERVICE_URL);
  }

  public getServiceType(): Observable<ServiceType[]> {
    return this.httpClient.get<ServiceType[]>(this.API_SERVICETYPE_URL);
  }

  public addService(service: Service): Observable<void> {
    return this.httpClient.post<void>(this.API_SERVICE_URL, service);
  }

  public findServiceById(id: number): Observable<Service> {
    return this.httpClient.get<Service>(this.API_SERVICE_URL + '/' + (id));
  }

  public updateService(updateService: Service): Observable<void> {
    return this.httpClient.put<void>(this.API_SERVICE_URL + '/' + updateService.id, updateService);
  }

  public deleteService(id) {
    console.log(id);
    console.log(this.API_SERVICE_URL + '/' + id);
    return this.httpClient.delete(this.API_SERVICE_URL + '/' + id);
  }
}
