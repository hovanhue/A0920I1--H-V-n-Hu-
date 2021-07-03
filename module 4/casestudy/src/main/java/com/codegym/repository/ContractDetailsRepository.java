package com.codegym.repository;

import com.codegym.model.ContractDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractDetailsRepository extends JpaRepository<ContractDetails, Integer> {

}
