package com.hrpayroll.hrpayroll.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "environment")
@Getter
@Setter
public class EnvironmentProperties {

    @Value( "${hr-worker.url}" )
    private String workerUrl;
}