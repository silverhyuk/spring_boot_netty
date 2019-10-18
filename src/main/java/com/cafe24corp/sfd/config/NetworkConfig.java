package com.cafe24corp.sfd.config;

import com.cafe24corp.sfd.properties.CommonApplicationProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.net.InetSocketAddress;

@Configuration
@ComponentScan("com.cafe24corp.sfd")
@RequiredArgsConstructor
@Getter
public class NetworkConfig {

    private final CommonApplicationProperties commonApplicationProperties;

    @Bean
    public InetSocketAddress tcpPort() {
        return new InetSocketAddress(commonApplicationProperties.getTcpPort());
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
