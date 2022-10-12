package com.Rishabh.ecommerce_cartlist.controller;

import com.Rishabh.ecommerce_cartlist.entity.CartItem;
import com.Rishabh.ecommerce_cartlist.service.CartItem_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartItem_Controller {
    private final CartItem_Service cartItem_service;
    @Autowired
    public CartItem_Controller(CartItem_Service cartItem_service) {
        this.cartItem_service = cartItem_service;
    }
    @PostMapping("/cartitems")
    public CartItem saveCartItem(@RequestBody CartItem cartItem){
        return cartItem_service.saveCartItem(cartItem);
    }
    @GetMapping("/cartitems")
    public List<CartItem> fetchCartItemList(){
        return cartItem_service.fetchCartItemList();
    }
    @GetMapping("/cartitems/{id}")
    public Object fetchCartItemListById(@PathVariable("id") Long id){
        return cartItem_service.fetchCartItemListById(id);
    }
    @DeleteMapping("/cartitems/{id}")
    public String deleteCartItemsById(@PathVariable("id") Long id){
        cartItem_service.deleteCartItemsById(id);
        return (id+" deleted successfully");
    }
    @DeleteMapping("/cartitems")
    public String deleteCartItems(){
        cartItem_service.deleteCartItems();
        return ("record deleted successfully");
    }
    @PutMapping("/cartitems/{id}")
    public CartItem updateCartItem(@PathVariable("id") Long id,@RequestBody CartItem cartItem){
        return cartItem_service.updateCartItem(id,cartItem);
    }
}
