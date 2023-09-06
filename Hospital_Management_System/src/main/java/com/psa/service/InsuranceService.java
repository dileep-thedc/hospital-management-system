package com.psa.service;

import java.util.List;

import com.psa.entity.Insurance;

public interface InsuranceService {
    List<Insurance> getAllInsurances();
    Insurance getInsuranceById(Long id);
    Insurance createInsurance(Insurance insurance);
    Insurance updateInsurance(Long id, Insurance insurance);
    void deleteInsurance(Long id);
}