package com.Rishabh.ecommerce_cartlist.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Cart_Item")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String product_id;
    @Column
    private String customer_id;
    @Column
    private float cart_discount;
    @Column
    private float product_price;
    @Column
    private int quantity;
    @Column
    private String supplier_name;
    @Column
    private float delivery_fees;
    @Column
    private float total_price;
    @Column
    private LocalDateTime created_on;
    @Column
    private LocalDateTime updated_on;

    public CartItem() {
    }

    public CartItem(Long id, String product_id, String customer_id, float cart_discount, float product_price, int quantity, String supplier_name, float delivery_fees, float total_price, LocalDateTime created_on, LocalDateTime updated_on) {
        this.id = id;
        this.product_id = product_id;
        this.customer_id = customer_id;
        this.cart_discount = cart_discount;
        this.product_price = product_price;
        this.quantity = quantity;
        this.supplier_name = supplier_name;
        this.delivery_fees = delivery_fees;
        this.total_price = total_price;
        this.created_on = created_on;
        this.updated_on = updated_on;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public float getCart_discount() {
        return cart_discount;
    }

    public void setCart_discount(float cart_discount) {
        this.cart_discount = cart_discount;
    }

    public float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public float getDelivery_fees() {
        return delivery_fees;
    }

    public void setDelivery_fees(float delivery_fees) {
        this.delivery_fees = delivery_fees;
    }

    public float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }

    public LocalDateTime getCreated_on() {
        return created_on;
    }

    public void setCreated_on(LocalDateTime created_on) {
        this.created_on = created_on;
    }

    public LocalDateTime getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(LocalDateTime updated_on) {
        this.updated_on = updated_on;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "id='" + id + '\'' +
                ", product_id='" + product_id + '\'' +
                ", customer_id='" + customer_id + '\'' +
                ", cart_discount=" + cart_discount +
                ", product_price=" + product_price +
                ", quantity=" + quantity +
                ", supplier_name='" + supplier_name + '\'' +
                ", delivery_fees=" + delivery_fees +
                ", total_price=" + total_price +
                ", created_on=" + created_on +
                ", updated_on=" + updated_on +
                '}';
    }
}
