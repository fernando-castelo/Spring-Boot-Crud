package com.example.SpringBootCrud.repository;

import com.example.SpringBootCrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Event.ID> {

    List<Object> findById(Long employeeId);

    void deleteById(Long employeeId);
}
