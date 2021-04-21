package com.nginx.nginxdemo.contorll;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/nginx")
@RestController
public class nginxControll {
@Value("${server.port}")
    public String prot;

    @RequestMapping("/getprot")
    public  String  selecprot(){

        return "我是"+prot+"端口";
    }
    
    
}
