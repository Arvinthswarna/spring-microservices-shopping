package com.example.orderservice.VO;

import com.example.orderservice.entity.OrderOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private OrderOne order;
    private Product product;
    private Customer customer;
}
