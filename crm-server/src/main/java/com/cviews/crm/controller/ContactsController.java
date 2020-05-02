package com.cviews.crm.controller;

import java.net.URISyntaxException;
import java.util.Collection;

import javax.validation.Valid;

import com.cviews.crm.model.Contact;
import com.cviews.crm.respository.ContactRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactsController {
  private final ContactRepository contactRepository;

  public ContactsController(ContactRepository contactRepository) {
    this.contactRepository = contactRepository;
  }

  @GetMapping("/contacts")
  public Collection<Contact> getContacts() {
    return (Collection<Contact>) contactRepository.findAll();
  }

  @PostMapping("/contacts")
  public ResponseEntity<Contact> createContact(@Valid @RequestBody Contact contact) throws URISyntaxException {
    Contact result = contactRepository.save(contact);
    return ResponseEntity.ok().body(result);
  }
}