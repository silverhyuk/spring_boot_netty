package com.cafe24corp.sfd.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "common")
public class CommonApplicationProperties {
    private int tcpPort;
    private int bossThreadCount;
    private int workerThreadCount;

}
