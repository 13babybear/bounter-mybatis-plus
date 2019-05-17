package cn.bounter.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.bounter.mybatisplus.dao")
public class BounterMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(BounterMybatisPlusApplication.class, args);
    }

}
