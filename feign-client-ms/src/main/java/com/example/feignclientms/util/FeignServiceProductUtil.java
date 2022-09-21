package com.example.feignclientms.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "product-service", url = "http://localhost:4002/products/")
public interface FeignServiceProductUtil {

    @GetMapping("/Products")
    String getProdId();
}
