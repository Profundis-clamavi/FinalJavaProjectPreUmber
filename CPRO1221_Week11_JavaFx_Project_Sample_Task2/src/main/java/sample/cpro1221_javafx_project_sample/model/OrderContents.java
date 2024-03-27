package sample.cpro1221_javafx_project_sample.model;

public class OrderContents {
    private String product_code;
    private int order_sequence;
    private String order_number;//not sure why we used Varchar here
    private int quantity;

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public int getOrder_sequence() {
        return order_sequence;
    }

    public void setOrder_sequence(int order_sequence) {
        this.order_sequence = order_sequence;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderContents(String product_code, int order_sequence, String order_number, int quantity) {
        this.product_code = product_code;
        this.order_sequence = order_sequence;
        this.order_number = order_number;
        this.quantity = quantity;
    }
}
