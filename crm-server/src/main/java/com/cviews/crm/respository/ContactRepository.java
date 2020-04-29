package com.cviews.crm.respository;

import com.cviews.crm.model.Contact;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}