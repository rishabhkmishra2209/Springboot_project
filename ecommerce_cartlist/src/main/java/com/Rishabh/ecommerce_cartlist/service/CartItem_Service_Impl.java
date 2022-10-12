package com.Rishabh.ecommerce_cartlist.service;

import com.Rishabh.ecommerce_cartlist.entity.CartItem;
import com.Rishabh.ecommerce_cartlist.repository.CartItem_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CartItem_Service_Impl implements CartItem_Service{
    private final CartItem_Repository cartItem_repository;

    @Autowired
    public CartItem_Service_Impl(CartItem_Repository cartItem_repository) {
        this.cartItem_repository = cartItem_repository;
    }

    @Override
    public CartItem saveCartItem(CartItem cartItem) {
        cartItem.setCart_discount((15* cartItem.getProduct_price())/100);
        cartItem.setTotal_price(cartItem.getProduct_price()-cartItem.getCart_discount()+cartItem.getDelivery_fees());
        LocalDateTime d=LocalDateTime.now();
        cartItem.setCreated_on(d);
        return cartItem_repository.save(cartItem);
    }

    @Override
    public List<CartItem> fetchCartItemList() {
        return cartItem_repository.findAll();
    }

    @Override
    public Optional<CartItem> fetchCartItemListById(Long id) {
        return cartItem_repository.findById(id);
    }

    @Override
    public void deleteCartItemsById(Long id) {
        cartItem_repository.deleteById(id);
    }

    @Override
    public void deleteCartItems() {
        cartItem_repository.deleteAll();
    }

    @Override
    public CartItem updateCartItem(Long id, CartItem cartItem) {
        LocalDateTime u=LocalDateTime.now();
        CartItem cartDB=cartItem_repository.findById(id).get();
        cartDB.setUpdated_on(u);
        if(Objects.nonNull(cartItem.getProduct_id())&& !"".equalsIgnoreCase(cartItem.getProduct_id())){
            cartDB.setProduct_id(cartItem.getProduct_id());
        }
        if(Objects.nonNull(cartItem.getCustomer_id())&& !"".equalsIgnoreCase(cartItem.getCustomer_id())){
            cartDB.setCustomer_id(cartItem.getCustomer_id());
        }
        if(Objects.nonNull(cartItem.getProduct_price())){
            cartDB.setProduct_price(cartItem.getProduct_price());
        }
        if(Objects.nonNull(cartItem.getQuantity())){
            cartDB.setQuantity(cartItem.getQuantity());
        }
        if(Objects.nonNull(cartItem.getDelivery_fees())){
            cartDB.setDelivery_fees(cartItem.getDelivery_fees());
        }
        cartDB.setCart_discount((15*cartDB.getProduct_price())/100);
        cartDB.setTotal_price(cartDB.getProduct_price()-cartDB.getCart_discount()+cartDB.getDelivery_fees());
        return cartItem_repository.save(cartDB);
    }
}
