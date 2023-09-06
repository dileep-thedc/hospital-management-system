package com.psa.service;

import java.util.List;

import com.psa.entity.Test;

public interface TestService {
    List<Test> getAllTests();
    Test getTestById(Long id);
    Test createTest(Test test);
    Test updateTest(Long id, Test test);
    void deleteTest(Long id);
}
