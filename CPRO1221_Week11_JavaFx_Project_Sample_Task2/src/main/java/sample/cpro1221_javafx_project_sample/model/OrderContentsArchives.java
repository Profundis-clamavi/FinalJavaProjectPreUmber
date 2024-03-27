package sample.cpro1221_javafx_project_sample.model;

import java.sql.Timestamp;

public class OrderContentsArchives {
    private String archive_id;
    private String product_code;
    private  int order_sequence;
    private String order_number;
    private int quantity;
    private Timestamp archived_at;

    public String getArchive_id() {
        return archive_id;
    }

    public void setArchive_id(String archive_id) {
        this.archive_id = archive_id;
    }

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

    public Timestamp getArchived_at() {
        return archived_at;
    }

    public void setArchived_at(Timestamp archived_at) {
        this.archived_at = archived_at;
    }

    public OrderContentsArchives(String archive_id, String product_code, int order_sequence, String order_number, int quantity, Timestamp archived_at) {
        this.archive_id = archive_id;
        this.product_code = product_code;
        this.order_sequence = order_sequence;
        this.order_number = order_number;
        this.quantity = quantity;
        this.archived_at = archived_at;
    }
}
