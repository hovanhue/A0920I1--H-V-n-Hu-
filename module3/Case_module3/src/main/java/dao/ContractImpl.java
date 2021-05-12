package dao;

import model.AttachService;
import model.Contract;
import model.ContractDetail;

import java.util.List;

public interface ContractImpl {
    void insertContract(Contract contract);
    Contract getContractById(int id);
    List<Contract> getAllContract();
    void updateContract(Contract contract);
    void deleteContract(int id);
    void deleteContractByCustomerId(int idCustomer);

    void insertContractDetail(ContractDetail contractDetail);
    ContractDetail getContractDetail(int contractId);
    void deleteContractDetailsBy(int contractId);

    AttachService getAttachService(int attachServiceId);


}
