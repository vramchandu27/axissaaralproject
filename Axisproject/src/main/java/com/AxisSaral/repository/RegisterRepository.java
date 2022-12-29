package com.AxisSaral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AxisSaral.model.Register;

@Repository
public interface RegisterRepository extends JpaRepository <Register, Long>{

}
