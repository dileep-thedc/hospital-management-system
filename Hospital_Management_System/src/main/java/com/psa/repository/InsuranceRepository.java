package com.psa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psa.entity.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}

