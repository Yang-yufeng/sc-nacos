package com.yufeng.ah;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PingController
 * @Description TODO
 * @Author yangwu
 * @Date 2020/12/17 17:44
 * @Version 1.0
 */
@RefreshScope
@RestController
@RequestMapping("/test")
public class PingController {

    @Value("${name:yangwu}")
    private String name ;

    @RequestMapping("/ping")
    public String ping(){
        return name+"PING SUCCESS!";
    }
}
