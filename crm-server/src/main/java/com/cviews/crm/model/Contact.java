package com.cviews.crm.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact {
  @Id
  @GeneratedValue
  private Long id;
  private String firstName;
  private String lastName;
  private String email;

  private Contact() {
    this(null, null, null);
  }

  public Contact(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) o;
        return Objects.equals(id, contact.id) && Objects.equals(firstName, contact.firstName) && Objects.equals(lastName, contact.lastName) && Objects.equals(email, contact.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email);
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", firstName='" + getFirstName() + "'" +
      ", lastName='" + getLastName() + "'" +
      ", email='" + getEmail() + "'" +
      "}";
  }

}