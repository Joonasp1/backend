package com.wcloud.wcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/test")
public class WcloudController { // 
    

    private final WcloudService service;

    @Autowired
    WcloudController(WcloudService service){
        this.service = service;
    }

    @GetMapping
    public WcloudData GetData(){
        return service.GetData();
    }

}