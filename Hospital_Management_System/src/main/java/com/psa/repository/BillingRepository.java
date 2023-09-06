package com.psa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psa.entity.Billing;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Long> {
}

