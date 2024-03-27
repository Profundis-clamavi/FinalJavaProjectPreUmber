package sample.cpro1221_javafx_project_sample.model;

import java.sql.Date;

public class Orders {
    private String order_number;
    private String account_id;
    private double order_subtotal;
    private double discount_total;
    private double shipping_total;
    private Date order_date;

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public double getOrder_subtotal() {
        return order_subtotal;
    }

    public void setOrder_subtotal(double order_subtotal) {
        this.order_subtotal = order_subtotal;
    }

    public double getDiscount_total() {
        return discount_total;
    }

    public void setDiscount_total(double discount_total) {
        this.discount_total = discount_total;
    }

    public double getShipping_total() {
        return shipping_total;
    }

    public void setShipping_total(double shipping_total) {
        this.shipping_total = shipping_total;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Date getShip_date() {
        return ship_date;
    }

    public void setShip_date(Date ship_date) {
        this.ship_date = ship_date;
    }

    public Orders(String order_number, String account_id, double order_subtotal, double discount_total, double shipping_total, Date order_date, Date ship_date) {
        this.order_number = order_number;
        this.account_id = account_id;
        this.order_subtotal = order_subtotal;
        this.discount_total = discount_total;
        this.shipping_total = shipping_total;
        this.order_date = order_date;
        this.ship_date = ship_date;
    }

    private Date ship_date;

}
