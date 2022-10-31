package com.Rishabh.ecommerce_cartlist.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
    @GenericGenerator(name = "seq", strategy="increment")
    private Long cart_id;
    @Column
    private Long customer_id;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Cart_id",referencedColumnName = "cart_id")
    private List<CartItem> cartItems;
}
