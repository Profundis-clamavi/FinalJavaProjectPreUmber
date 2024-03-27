package sample.cpro1221_javafx_project_sample.model;

public class Suppliers {
    private String supplier_id;
    private String supplier_name;
    private String supplier_location;

    public String getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(String supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getSupplier_location() {
        return supplier_location;
    }

    public void setSupplier_location(String supplier_location) {
        this.supplier_location = supplier_location;
    }

    public Suppliers(String supplier_id, String supplier_name, String supplier_location) {
        this.supplier_id = supplier_id;
        this.supplier_name = supplier_name;
        this.supplier_location = supplier_location;
    }
}
