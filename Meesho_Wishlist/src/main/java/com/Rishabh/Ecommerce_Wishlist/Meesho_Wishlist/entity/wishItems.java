package com.Rishabh.Ecommerce_Wishlist.Meesho_Wishlist.entity;

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
@NoArgsConstructor
@Builder
@Table(name = "Wish_Item")
public class wishItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
    @GenericGenerator(name = "seq", strategy="increment")
    private Long id;
    @Column
    private String productId;
    @Column
    private String customerId;
    @Column
    private float productPrice;
    @Column
    private LocalDateTime createdOn;
    @Column
    private LocalDateTime updatedOn;
}
