package com.example.springreact;

import com.example.springreact.model.Employee;
import com.example.springreact.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringReactApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringReactApplication.class, args);
    }


    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public void run(String... args) throws Exception {
        //Employee employee = new Employee();
       // employee.setFirstName("Silvestre");
        //employee.setLastName("Tivir");
        //employee.setEmailId("silvestremaduro@gmail.com");
        //employeeRepository.save(employee);

       // Employee employee1 = new Employee();
       // employee1.setFirstName("Silvestre1");
       // employee1.setLastName("Tiivir");
        //employee1.setEmailId("ssilvestremaduro@gmail.com");
       // employeeRepository.save(employee1);



    }
}
