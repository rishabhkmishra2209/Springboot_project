package com.Rishabh.ecommerce_cartlist.controller;

import com.Rishabh.ecommerce_cartlist.common.ApiResponse;
import com.Rishabh.ecommerce_cartlist.entity.Cart;
import com.Rishabh.ecommerce_cartlist.error.CartNotFound_Exception;
import com.Rishabh.ecommerce_cartlist.service.Cart_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class Cart_Controller {
    private final Cart_Service cart_service;
    @Autowired
    public Cart_Controller(Cart_Service cart_service) {this.cart_service = cart_service;}

    @PostMapping("/cart/add")
    public ApiResponse saveCart(@RequestBody Cart cart){
        return cart_service.saveCart(cart);
    }

    @GetMapping("/cart/get")
    public ApiResponse fetchCartList() throws CartNotFound_Exception {
        return cart_service.fetchCartList();
    }

    @GetMapping("/cart/get/{id}")
    public ApiResponse fetchCartListById(@PathVariable("id") Long cart_id) throws CartNotFound_Exception {
        return cart_service.fetchCartListById(cart_id);
    }

    @DeleteMapping("/cart")
    public ApiResponse deleteCart() throws CartNotFound_Exception {
        return cart_service.deleteCart();
    }

    @DeleteMapping("/cart/id/{id}")
    public ApiResponse deleteCartById(@PathVariable("id") Long cart_id) throws CartNotFound_Exception {
        return cart_service.deleteCartById(cart_id);
    }

}
