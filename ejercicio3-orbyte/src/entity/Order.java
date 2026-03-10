package entity;

public class Order {

    private int tableNumber;
    private String product;
    private String notes;

    public Order(){}

    public Order(int tableNumber,String product,String notes){

        this.tableNumber = tableNumber;
        this.product = product;
        this.notes = notes;

    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
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
