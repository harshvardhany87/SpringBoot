package com.example.springboot.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.Entity.Contact;

public interface contactrepo extends JpaRepository<Contact, Integer> {

}
