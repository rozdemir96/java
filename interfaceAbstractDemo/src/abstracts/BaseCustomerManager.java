package abstracts;

import java.rmi.RemoteException;
import interfaceAbstractDemo.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{//abstract class'�n i�inde tamamlanm�� metot yap�labiliyor.	

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException{ //abstract metotun sadece imzas� olur, g�vdesi olmaz.
		
		System.out.println("Saved to db: " + customer.getFirstName());
	}
}
