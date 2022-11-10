package com.Rishabh.ecommerce_cartlist.service;

import com.Rishabh.ecommerce_cartlist.common.ApiResponse;
import com.Rishabh.ecommerce_cartlist.entity.Cart;
import com.Rishabh.ecommerce_cartlist.error.CartNotFound_Exception;
import com.Rishabh.ecommerce_cartlist.repository.Cart_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class RestService {

    private RestTemplate restTemplate;
//    private Cart_Repository cart_repository;
    @Autowired
    private Cart_Service cartService;
    private ApiResponse apiResponse;
    public RestService() {
        this.restTemplate = new RestTemplateBuilder().build();
    }

    public String placeOrder(Long cartId) throws CartNotFound_Exception {
        String url = "http://192.168.1.121:8383/meesho/order/placeOrder";
        apiResponse = cartService.fetchCartListById(cartId);
        return restTemplate.postForObject(url, apiResponse, String.class);
    }
}
