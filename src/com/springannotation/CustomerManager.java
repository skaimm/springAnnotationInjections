package com.springannotation;

public class CustomerManager implements ICustomerService{
	
	//Dependency injection
	private ICustomerDal customerDal;
	
	//constructor injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	

	public void add() {
		
		// business codes here
		customerDal.add();
	}

}
