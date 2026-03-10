package managed;

import entity.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderManagedBean {

    private int table;
    private String product;
    private String notes;

    private List<Order> orders = new ArrayList<>();

    public void addOrder(){

        orders.add(new Order(table,product,notes));

        table = 0;
        product = "";
        notes = "";

    }

    public List<Order> getOrders() {
        return orders;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}
