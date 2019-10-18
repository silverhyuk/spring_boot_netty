package com.cafe24corp.sfd;

import com.cafe24corp.sfd.server.NettyServer;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Log4j2
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        NettyServer nettyServer = context.getBean(NettyServer.class);
        nettyServer.start();
        log.debug("==========End=========");
    }

}
