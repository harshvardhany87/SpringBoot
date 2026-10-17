package com.example.springboot.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.Entity.Emp;

public interface Emprepo extends JpaRepository<Emp, Integer> {

}
