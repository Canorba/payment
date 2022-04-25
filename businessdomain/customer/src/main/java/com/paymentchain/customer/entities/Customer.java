/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchain.customer.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import lombok.Data;

/**
 *
 * @author sotobotero
 */
@Entity
@Data
public class Customer {
   @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String name;
    private String code;
    private String iban;
    private String names;
    private String surname;
    private String phone;
    private String address; 
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)   
    private List<CustomerProduct> products;
    @Transient
    private List<?> transactions;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the iban
	 */
	public String getIban() {
		return iban;
	}
	/**
	 * @param iban the iban to set
	 */
	public void setIban(String iban) {
		this.iban = iban;
	}
	/**
	 * @return the names
	 */
	public String getNames() {
		return names;
	}
	/**
	 * @param names the names to set
	 */
	public void setNames(String names) {
		this.names = names;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the products
	 */
	public List<CustomerProduct> getProducts() {
		return products;
	}
	/**
	 * @param products the products to set
	 */
	public void setProducts(List<CustomerProduct> products) {
		this.products = products;
	}
	/**
	 * @return the transactions
	 */
	public List<?> getTransactions() {
		return transactions;
	}
	/**
	 * @param transactions the transactions to set
	 */
	public void setTransactions(List<?> transactions) {
		this.transactions = transactions;
	}
    
    
}
