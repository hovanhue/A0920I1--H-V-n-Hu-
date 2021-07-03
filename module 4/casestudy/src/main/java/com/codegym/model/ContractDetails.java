package com.codegym.model;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class ContractDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contract_details_id;

    @ManyToOne
    @JoinColumn(name = "contract_id" )
    private Contract contract_id;


    @ManyToOne
    @JoinColumn(name = "attach_service_id")
    private AttachService attachService;

    @NumberFormat
    @NotEmpty
    private int quality;

    public ContractDetails() {
    }

    public ContractDetails(int contract_details_id, Contract contract, AttachService attachService, @NotEmpty int quality) {
        this.contract_details_id = contract_details_id;
        this.contract_id = contract;
        this.attachService = attachService;
        this.quality = quality;
    }

    public int getContract_details_id() {
        return contract_details_id;
    }

    public void setContract_details_id(int contract_details_id) {
        this.contract_details_id = contract_details_id;
    }

    public Contract getContract() {
        return contract_id;
    }

    public void setContract(Contract contract) {
        this.contract_id = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
