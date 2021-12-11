package com.wergroot.poc.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/{text}")
    public String getSample(@PathVariable String text){
        return "We-R-Groot: "+text;
    }
}
