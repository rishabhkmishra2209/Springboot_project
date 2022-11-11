package com.Rishabh.ecommerce_cartlist.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table(name = "Cart_Item")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
    @GenericGenerator(name = "seq", strategy="increment")
    private Long id;
    @Column
    private String product_id;
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

}
