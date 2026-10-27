package com.example.springboot.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.springboot.Entity.Emp;

public interface Emprepo extends JpaRepository<Emp, Integer> {

    @Query("SELECT e FROM Emp e WHERE e.First_Name = :name")
    List<Emp> findByEmployeeName(@Param("name") String name);

    @Query(value = "SELECT COUNT(*) FROM  emp_data", nativeQuery = true)
    Long getTotalEMP();

    @Query(value = "SELECT MAX(salary) FROM  emp_data", nativeQuery = true)
    Long getMaxSalary();
}
