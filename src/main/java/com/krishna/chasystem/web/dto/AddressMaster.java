/**
 * 
 */
package com.krishna.chasystem.web.dto;

/**
 * @author tukai.ghosh
 *
 */
public class AddressMaster {

	private long addressId;
	private String address;
	private String city;
	private long pin;
	private long mobileNo;
	
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "AddressMaster [addressId=" + addressId + ", address=" + address
				+ ", city=" + city + ", pin=" + pin + ", mobileNo=" + mobileNo
				+ "]";
	}
}
