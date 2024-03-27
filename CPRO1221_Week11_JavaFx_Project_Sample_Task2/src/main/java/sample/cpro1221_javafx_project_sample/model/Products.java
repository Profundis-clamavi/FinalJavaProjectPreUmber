package sample.cpro1221_javafx_project_sample.model;

public class Products {
    private String product_code;
    private String product_name;
    private double cost_to_order;
    private double price;
    private int current_stock;
    private String supplier_id;

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getCost_to_order() {
        return cost_to_order;
    }

    public void setCost_to_order(double cost_to_order) {
        this.cost_to_order = cost_to_order;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCurrent_stock() {
        return current_stock;
    }

    public void setCurrent_stock(int current_stock) {
        this.current_stock = current_stock;
    }

    public String getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(String supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Products(String product_code, String product_name, double cost_to_order, double price, int current_stock, String supplier_id) {
        this.product_code = product_code;
        this.product_name = product_name;
        this.cost_to_order = cost_to_order;
        this.price = price;
        this.current_stock = current_stock;
        this.supplier_id = supplier_id;
    }
}
