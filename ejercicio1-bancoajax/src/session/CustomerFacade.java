package session;

import entity.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerFacade {

    private static List<Customer> customers = new ArrayList<>();

    static {

        customers.add(new Customer(1,"Carlos","Gomez",3500));
        customers.add(new Customer(2,"Laura","Martinez",5200));
        customers.add(new Customer(3,"Andres","Lopez",2100));
        customers.add(new Customer(4,"Maria","Ramirez",7800));

    }

    public Customer findCustomer(int id){

        for(Customer c : customers){

            if(c.getId() == id){

                return c;

            }

        }

        return null;

    }

}
