package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Employee;

public interface LoginDao extends CrudRepository<Employee, Integer> {

}
