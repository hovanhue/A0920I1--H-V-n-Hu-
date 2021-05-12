package model;

public class ContractDetail {
    private int ContractDetailId;
    private int contractId;
    private int attachServiceId;
    private int quantity;

    public ContractDetail() {
    }

    public ContractDetail(int contractDetailId, int contractId, int attachServiceId, int quantity) {
        ContractDetailId = contractDetailId;
        this.contractId = contractId;
        this.attachServiceId = attachServiceId;
        this.quantity = quantity;
    }

    public int getContractDetailId() {
        return ContractDetailId;
    }

    public void setContractDetailId(int contractDetailId) {
        ContractDetailId = contractDetailId;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(int attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
