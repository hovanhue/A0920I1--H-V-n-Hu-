package dao;

import model.RentType;
import model.Service;
import model.ServiceType;

import java.util.List;

public interface ServiceImpl {
    void insertService(Service service);
    Service getServiceById(int id);
    List<Service> getAllService();
    void updateService(Service service);
    void deleteService(int id);

    ServiceType getServiceTypeId(int id);
    RentType getRentTypeId(int id);
}
