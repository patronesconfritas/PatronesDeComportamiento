package com.comportamiento.ejemplo1.controller;

import com.comportamiento.ejemplo1.interfaces.IPaymentMethod;

public class PaymentStrategy {
	private IPaymentMethod paymentMethod;
	
	public void setPaymentMethod(IPaymentMethod paymentMethod) {
		this.paymentMethod=paymentMethod;
	}
	
	public void paid() {
		this.paymentMethod.paid();
	}
}
