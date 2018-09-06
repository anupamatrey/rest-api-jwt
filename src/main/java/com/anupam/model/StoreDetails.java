/**
 * 
 */
package com.anupam.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Anupam Sharma
 *
 */
@Document(collection = "store")
public class StoreDetails {

	private long no;
	private String name;
	private String country;
	private String streetAddress;
	private String city;
	private String stateProvCode;
	private String zip;
	private String phoneNumber;
	private boolean sundayOpen;
	private String timezone;

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvCode() {
		return stateProvCode;
	}

	public void setStateProvCode(String stateProvCode) {
		this.stateProvCode = stateProvCode;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isSundayOpen() {
		return sundayOpen;
	}

	public void setSundayOpen(boolean sundayOpen) {
		this.sundayOpen = sundayOpen;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	@Override
	public String toString() {
		return "StoreDetails [no=" + no + ", name=" + name + ", country=" + country + ", streetAddress=" + streetAddress
				+ ", city=" + city + ", stateProvcode=" + stateProvCode + ", zip=" + zip + ", phoneNumber="
				+ phoneNumber + ", sundayOpen=" + sundayOpen + ", timezone=" + timezone + "]";
	}

}
