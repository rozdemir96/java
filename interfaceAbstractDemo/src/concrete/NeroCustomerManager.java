package concrete;

import abstracts.BaseCustomerManager;
import interfaceAbstractDemo.entities.Customer;


public class NeroCustomerManager extends BaseCustomerManager{//Hem nero hem starbucks'�n ortak kodu var yani kod implementasyonu olacak. Bu y�zden abstract olacak.

	
	public void save(Customer customer) {
		
		System.out.println("Saved to db: " + customer.getFirstName());
	}

	

}
