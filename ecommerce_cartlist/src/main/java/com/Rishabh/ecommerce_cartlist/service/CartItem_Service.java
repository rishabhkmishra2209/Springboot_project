package com.Rishabh.ecommerce_cartlist.service;

import com.Rishabh.ecommerce_cartlist.entity.CartItem;

import java.util.List;
import java.util.Optional;

public interface CartItem_Service {
    public CartItem saveCartItem(CartItem cartItem);

    public List<CartItem> fetchCartItemList();

    public Optional<CartItem> fetchCartItemListById(Long id);

    public void deleteCartItemsById(Long id);

    public void deleteCartItems();

    public CartItem updateCartItem(Long id, CartItem cartItem);
}
