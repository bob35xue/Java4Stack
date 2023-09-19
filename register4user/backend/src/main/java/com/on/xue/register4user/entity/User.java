package com.on.xue.register4user.entity;

import jakarta.persistence.*;
//import com.on.xue.register4user.Address;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
  
    
    @Column(name = "address_line")
    private String address_line;
    
    @Column(name = "address_city")
    private String address_city;
    
    @Column(name = "postal_code")
    private String postal_code;
   

    public User() {
    }

    public User(String firstName, String lastName,String  address_line, String  address_city,String  postal_code) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address_line = address_line;
        this.address_city = address_city;
        this.postal_code = postal_code;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	public String getAddress_line() {
		return address_line;
	}

	public void setAddress_line(String address_line) {
		this.address_line = address_line;
	}

	public String getAddress_city() {
		return address_city;
	}

	public void setAddress_city(String address_city) {
		this.address_city = address_city;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

   
}