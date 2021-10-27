package com.example.SpringbootAsyncApiCall.EmployeeApi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class EmployeeRepository {
    public List<EmployeeBean> getAllEmployeeRecord(){
        return fetchAllEmployeeRecord();
    }

    private List<EmployeeBean> fetchAllEmployeeRecord() {

        EmployeeBean employeeBean1=new EmployeeBean("emp-1","Employee-1","employee-1@email.id");
        EmployeeBean employeeBean2=new EmployeeBean("emp-2","Employee-2","employee-2@email.id");
        EmployeeBean employeeBean3=new EmployeeBean("emp-3","Employee-3","employee-3@email.id");
        EmployeeBean employeeBean4=new EmployeeBean("emp-4","Employee-4","employee-4@email.id");
        EmployeeBean employeeBean5=new EmployeeBean("emp-5","Employee-5","employee-5@email.id");

        List<EmployeeBean>employeeBeanList=new ArrayList<>();
        employeeBeanList.add(employeeBean1);
        employeeBeanList.add(employeeBean2);
        employeeBeanList.add(employeeBean3);
        employeeBeanList.add(employeeBean4);
        employeeBeanList.add(employeeBean5);

        return employeeBeanList;
    }
}
