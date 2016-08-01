package io.daocloud.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoSpringBootApplication.class, args);
    }

    @RequestMapping("")
    public String hello(){
        return "Hello! Docker!";
    }
    
    @RequestMapping("/time")
    public String nowtime() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }
}
