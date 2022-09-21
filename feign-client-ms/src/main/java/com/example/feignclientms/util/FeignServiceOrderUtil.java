package com.example.feignclientms.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "order-service", url = "http://localhost:4003/orders/")
public interface FeignServiceOrderUtil {

    @GetMapping("/Orders")
    String getOrdId();
}
