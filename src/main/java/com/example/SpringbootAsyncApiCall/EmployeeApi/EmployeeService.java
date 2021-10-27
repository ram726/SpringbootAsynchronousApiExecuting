package com.example.SpringbootAsyncApiCall.EmployeeApi;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService
{
    private EmployeeRepository employeeRepository;

    public List<EmployeeBean> findAllEmployee(){
        return employeeRepository.getAllEmployeeRecord();
    }
}
