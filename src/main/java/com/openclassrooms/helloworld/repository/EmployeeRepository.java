package com.openclassrooms.helloworld.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassrooms.helloworld.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>  {
}
