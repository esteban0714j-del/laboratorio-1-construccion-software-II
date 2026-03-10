package managed;

import entity.Customer;
import session.CustomerFacade;

public class BankingBeanAjax {

    private int customerId;
    private Customer customer;

    CustomerFacade facade = new CustomerFacade();

    public void searchCustomer(){

        customer = facade.findCustomer(customerId);

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Customer getCustomer() {
        return customer;
    }

}
