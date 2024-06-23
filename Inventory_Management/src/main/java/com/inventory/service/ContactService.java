package com.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Contact;
import com.inventory.repo.ContactRepo;

@Service
public class ContactService {
	@Autowired
	private ContactRepo contactRepo;

	public List<Contact> getAllContacts() {
		return contactRepo.findAll();

	}
}
