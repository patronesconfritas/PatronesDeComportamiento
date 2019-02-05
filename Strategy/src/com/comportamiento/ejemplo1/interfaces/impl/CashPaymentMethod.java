package com.comportamiento.ejemplo1.interfaces.impl;

import com.comportamiento.ejemplo1.interfaces.IPaymentMethod;

public class CashPaymentMethod implements IPaymentMethod{

	@Override
	public void paid() {
		System.out.println("i am paying with cash");
	}	
}
