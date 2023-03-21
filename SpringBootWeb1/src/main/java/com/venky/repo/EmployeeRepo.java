package com.venky.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.venky.model.Employee;
@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
