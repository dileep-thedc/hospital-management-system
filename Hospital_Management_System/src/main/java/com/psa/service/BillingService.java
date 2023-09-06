package com.psa.service;

import java.util.List;

import com.psa.entity.Billing;

public interface BillingService {
    List<Billing> getAllBillings();
    Billing getBillingById(Long id);
    Billing createBilling(Billing billing);
    Billing updateBilling(Long id, Billing billing);
    void deleteBilling(Long id);
}
