package com.jpalearning.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpalearning.sb.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
