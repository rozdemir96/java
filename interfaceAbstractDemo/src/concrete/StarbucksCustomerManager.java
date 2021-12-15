package concrete;

import java.rmi.RemoteException;
import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{

	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException{
		
		if (this.customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);//Veritabanýna kaydeden kod.
		}
		else {
			 System.out.println("Not a real person.");
		}
		
	}


}
