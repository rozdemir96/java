package abstracts;

import java.rmi.RemoteException;
import interfaceAbstractDemo.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{//abstract class'ýn içinde tamamlanmýþ metot yapýlabiliyor.	

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException{ //abstract metotun sadece imzasý olur, gövdesi olmaz.
		
		System.out.println("Saved to db: " + customer.getFirstName());
	}
}
