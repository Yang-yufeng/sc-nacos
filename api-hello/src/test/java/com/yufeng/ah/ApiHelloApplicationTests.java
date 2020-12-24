package com.yufeng.ah;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ApiHelloApplicationTests {

    public static void main(String[] args) {
        int a= 3;
        int b = 4;
        double degree = (Math.atan2(a,b))*180/Math.PI;
        System.out.println(degree);

    }

}
