package dao.serviceImp;

import dao.ContractImpl;
import model.AttachService;
import model.Contract;
import model.ContractDetail;
import ultils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDAO implements ContractImpl {
    private static final String INSERT_CONTRACT_SQL = "Insert into contract() values (?, ?, ?, ?, ?, ?, ?, ?)";   //8
    private static final String SELECT_CONTRACT_BY_ID = "Select * from contract where contract_id = ?";
    private static final String SELECT_ALL_CONTRACT = "Select * from contract";
    private static final String DELETE_CONTRACT_BY_ID = "Delete from contract where contract_id = ?";
    private static final String UPDATE_CONTRACT = "Update contract set contract_start_day=? , contract_end_day = ?, contract_deposit = ?, " +
            "contract_total_money = ?, employee_id = ?, customer_id = ?,service_id = ? where contract_id = ?"; //8 value
    private static final String DELETE_CONTRACT_BY_CUSTOMER_ID ="Delete from contract where customer_id =?";
    private static final String SELECT_CONTRACT_BY_CUSTOMER_ID = "Select * from contract where customer_id=?";
    //contract details
    private static final String INSERT_CONTRACT_DETAILS_SQL = "Insert into contract_detail() values (?,?,?,?)";
    private static final String SELECT_CONTRACT_DETAILS_SQL = "Select * from contract_detail where contract_id=?";
    private static final String DELETE_CONTRACT_DETAILS_BY_CONTRACT_ID_SQL = "Delete from contract_detail where contract_id=?";
    //attach service
    private static final String SELECT_ATTACH_SERVICE ="Select * from attach_service where attach_service_id=?";


    @Override
    public void insertContract(Contract contract) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(INSERT_CONTRACT_SQL);
            statement.setInt(1, contract.getContractId());
            statement.setString(2, contract.getContractStartDate());
            statement.setString(3, contract.getContractEndDate());
            statement.setDouble(4, contract.getContractDeposit());
            statement.setDouble(5, contract.getContractTotalMoney());
            statement.setInt(6, contract.getEmployeeId());
            statement.setInt(7, contract.getCustomerId());
            statement.setInt(8, contract.getServiceId());
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (statement != null){
                    statement.close();
                }
                if (connection != null){
                    connection.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public Contract getContractById(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        Contract contract = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(SELECT_CONTRACT_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int contract_id = resultSet.getInt("contract_Id");
                String contract_start_date = resultSet.getString("contract_Start_Date");
                String contract_end_date = resultSet.getString("contract_End_Date");
                double contract_deposit = resultSet.getDouble("contract_Deposit");
                double contract_total_money = resultSet.getDouble("contract_Total_Money");
                int employee_id = resultSet.getInt("employee_Id");
                int customer_id = resultSet.getInt("customer_Id");
                int service_id = resultSet.getInt("service_Id");
                contract = new Contract(contract_id,contract_start_date,contract_end_date,contract_deposit,
                        contract_total_money,employee_id,customer_id,service_id);
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
        return contract;
    }

    @Override
    public List<Contract> getAllContract() {
        Connection connection = null;
        PreparedStatement statement = null;
        List<Contract> contractList = new ArrayList<>();
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_CONTRACT);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int contract_id = resultSet.getInt("contract_Id");
                String contract_start_date = resultSet.getString("contract_Start_Date");
                String contract_end_date = resultSet.getString("contract_End_Date");
                double contract_deposit = resultSet.getDouble("contract_Deposit");
                double contract_total_money = resultSet.getDouble("contract_Total_Money");
                int employee_id = resultSet.getInt("employee_Id");
                int customer_id = resultSet.getInt("customer_Id");
                int service_id = resultSet.getInt("service_Id");
                Contract contract = new Contract(contract_id,contract_start_date,contract_end_date,contract_deposit,
                        contract_total_money,employee_id,customer_id,service_id);
                contractList.add(contract);
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
        return contractList;
    }

    @Override
    public void updateContract(Contract contract) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(UPDATE_CONTRACT);

            statement.setString(1, contract.getContractStartDate());
            statement.setString(2, contract.getContractEndDate());
            statement.setDouble(3, contract.getContractDeposit());
            statement.setDouble(4, contract.getContractTotalMoney());
            statement.setInt(5, contract.getEmployeeId());
            statement.setInt(6, contract.getCustomerId());
            statement.setInt(7, contract.getServiceId());
            statement.setInt(8, contract.getContractId());
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
    }

    @Override
    public void deleteContract(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(DELETE_CONTRACT_BY_ID);
            statement.setInt(1, id);
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void deleteContractByCustomerId(int idCustomer) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(DELETE_CONTRACT_BY_CUSTOMER_ID);
            statement.setInt(1, idCustomer);
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void insertContractDetail(ContractDetail contractDetail) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(INSERT_CONTRACT_DETAILS_SQL);
            statement.setInt(1, contractDetail.getContractDetailId());
            statement.setInt(2, contractDetail.getContractId());
            statement.setInt(3, contractDetail.getAttachServiceId());
            statement.setInt(4, contractDetail.getQuantity());
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
    }

    @Override
    public ContractDetail getContractDetail(int contractId) {
        Connection connection = null;
        PreparedStatement statement = null;
        ContractDetail contractDetail = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(SELECT_CONTRACT_DETAILS_SQL);
            statement.setInt(1, contractId);

            ResultSet resultSet =  statement.executeQuery();
            while (resultSet.next()){
                int contractID = resultSet.getInt("contractId");
                int contract_details_id = resultSet.getInt("contractDetailsId");
                int attach_service_id = resultSet.getInt("attachServiceId");
                int quality = resultSet.getInt("quality");
                contractDetail = new ContractDetail(contractID, contract_details_id,attach_service_id,quality);
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

        return contractDetail;
    }

    @Override
    public void deleteContractDetailsBy(int contractId) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(DELETE_CONTRACT_DETAILS_BY_CONTRACT_ID_SQL);
            statement.setInt(1, contractId);
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
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
    }

    @Override
    public AttachService getAttachService(int attachServiceId) {
        Connection connection = null;
        PreparedStatement statement = null;
        AttachService attachService = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(SELECT_ATTACH_SERVICE);
            statement.setInt(1,attachServiceId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String attach_service_name = resultSet.getString("attach_service_name");
                double attach_service_cost = resultSet.getDouble("attach_service_cost");
                int attach_service_unit = resultSet.getInt("attach_service_unit");
                String attach_service_status = resultSet.getString("attach_service_status");

                attachService = new AttachService(attachServiceId,attach_service_name,attach_service_cost,
                        attach_service_unit,attach_service_status);
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
        return attachService;
    }

}
