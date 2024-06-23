package com.inventory.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, String>{

}
