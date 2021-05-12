package dao.serviceImp;

import dao.ServiceImpl;
import model.RentType;
import model.Service;
import model.ServiceType;
import ultils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceDAO implements ServiceImpl {
    private static final String INSERT_SERVICE_SQL = "insert into service() values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";   //10 value
    private static final String SELECT_SERVICE_BY_ID = "Select * from service where service_id = ?";
    private static final String SELECT_ALL_SERVICE = "Select * from service";
    private static final String DELETE_SERVICE_BY_ID = "Delete from service where service_id = ?";
    private static final String UPDATE_SERVICE = "Update service set service_name=? , service_area = ?, service_cost = ?, " +
            "service_max_people = ?, rent_type_id = ?, service_type_id = ?,standard_room = ?, description_other= ?," +
            "pool_area=? ,number_of_floors=? where service_id = ?"; //11

    // service type
    private static final String SELECT_SERVICE_TYPE = "Select * from SERVICE_TYPE where service_type_id=?";
    // rent type
    private static final String SELECT_RENT_TYPE = "Select * from RENT_TYPE where rent_type_id =?";

    @Override
    public void insertService(Service service) {
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(INSERT_SERVICE_SQL);
            statement.setInt(1, service.getIdService());
            statement.setString(2, service.getNameService());
            statement.setDouble(3, service.getServiceArea());
            statement.setDouble(4, service.getServiceCost());
            statement.setInt(5, service.getMaxPeople());
            statement.setInt(6, service.getIdTypeRent());
            statement.setInt(7, service.getIdTypeService());
            statement.setString(8, service.getStandardRoom());
            statement.setString(9, service.getDescriptionOther());
            statement.setDouble(10, service.getPoolArea());
            statement.setInt(11, service.getFloors());
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Service getServiceById(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        Service service = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(SELECT_SERVICE_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String service_name = resultSet.getString("serviceName");
                int service_area = resultSet.getInt("serviceArea");
                double service_cost = resultSet.getDouble("serviceCost");
                int service_max_people = resultSet.getInt("maxPeople");
                int rent_type_id = resultSet.getInt("rentTypeId");
                int service_type_id = resultSet.getInt("serviceTypeId");
                String standard_room = resultSet.getString("standardRoom");
                String description_orther_convenience = resultSet.getString("descriptionOrther");
                double pool_area = resultSet.getDouble("poolArea");
                int number_of_floors = resultSet.getInt("floors");
                service = new Service(id,service_name,service_area,service_cost,service_max_people,rent_type_id,service_type_id,standard_room,
                        description_orther_convenience,pool_area,number_of_floors);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return service;
    }

    @Override
    public List<Service> getAllService() {
        List<Service> serviceList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;Service service = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_SERVICE);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int service_id = resultSet.getInt("serviceId");
                String service_name = resultSet.getString("serviceName");
                int service_area = resultSet.getInt("serviceArea");
                double service_cost = resultSet.getDouble("serviceCost");
                int service_max_people = resultSet.getInt("maxPeople");
                int rent_type_id = resultSet.getInt("rentTypeId");
                int service_type_id = resultSet.getInt("serviceTypeId");
                String standard_room = resultSet.getString("standardRoom");
                String description_orther_convenience = resultSet.getString("descriptionOrther");
                double pool_area = resultSet.getDouble("poolArea");
                int number_of_floors = resultSet.getInt("floors");

                serviceList.add(new Service(service_id,service_name,service_area,
                        service_cost,service_max_people,rent_type_id,service_type_id,
                        standard_room,description_orther_convenience,pool_area,number_of_floors));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return serviceList;
    }

    @Override
    public void updateService(Service service) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(UPDATE_SERVICE);
            statement.setString(1, service.getNameService());
            statement.setDouble(2, service.getServiceArea());
            statement.setDouble(3, service.getServiceCost());
            statement.setInt(4, service.getMaxPeople());
            statement.setInt(5, service.getIdTypeRent());
            statement.setInt(6, service.getIdTypeService());
            statement.setString(7, service.getStandardRoom());
            statement.setString(8, service.getDescriptionOther());
            statement.setDouble(9, service.getPoolArea());
            statement.setInt(10, service.getFloors());
            statement.setInt(11,service.getIdService());
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteService(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(DELETE_SERVICE_BY_ID);
            statement.setInt(1, id);
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public ServiceType getServiceTypeId(int id) {
        ServiceType serviceType = null;
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(SELECT_SERVICE_TYPE);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String serviceTypeName = resultSet.getString("serviceTypename");
                serviceType = new ServiceType(id, serviceTypeName);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return serviceType;
    }

    @Override
    public RentType getRentTypeId(int id) {
        RentType rentType = null;
        Connection connection;
        PreparedStatement statement = null;
        try{
            connection=ConnectionDB.getConnection();
            statement =connection.prepareStatement(SELECT_RENT_TYPE);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String rentTypename = resultSet.getString("rentTypename");
                double rentTypeCost = resultSet.getDouble("rentTypeCost");
                rentType = new RentType(id,rentTypename, rentTypeCost);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return rentType;
    }
}
