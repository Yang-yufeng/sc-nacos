package com.yufeng.ah;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PingController
 * @Description TODO
 * @Author yangwu
 * @Date 2020/12/17 17:44
 * @Version 1.0
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ApiHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiHelloApplication.class, args);
    }

}
