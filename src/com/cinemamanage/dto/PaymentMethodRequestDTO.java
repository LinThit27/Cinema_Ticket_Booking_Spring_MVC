package com.cinemamanage.dto;

public class PaymentMethodRequestDTO {
	private int paymentMethodID;
	private String paymentMethodName;
	private String paymentMethodPhone;
	private String status;

	
	
	public int getPaymentMethodID() {
		return paymentMethodID;
	}
	public void setPaymentMethodID(int paymentMethodID) {
		this.paymentMethodID = paymentMethodID;
	}
	public String getPaymentMethodName() {
		return paymentMethodName;
	}
	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName;
	}
	public String getPaymentMethodPhone() {
		return paymentMethodPhone;
	}
	public void setPaymentMethodPhone(String paymentMethodPhone) {
		this.paymentMethodPhone = paymentMethodPhone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
