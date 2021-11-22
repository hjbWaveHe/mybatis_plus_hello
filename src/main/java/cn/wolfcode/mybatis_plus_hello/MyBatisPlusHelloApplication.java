package cn.wolfcode.mybatis_plus_hello;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author WaveHi
 * @Date 22/11/2021 下午 8:49
 * @Version 1.0
 * @Contact HJBWaveHi@163.com
 */
@MapperScan("cn.wolfcode.mybatis_plus_hello.mapper")
@SpringBootApplication
public class MyBatisPlusHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusHelloApplication.class,args);
    }
}
