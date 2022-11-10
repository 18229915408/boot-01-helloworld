package com.atguigu.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Component
@Data
@ConfigurationProperties(prefix = "servers")
@Validated
public class ServerConfig {
     @Max(value = 8888,message = "最大值不能超过8888")
    // @Min(value = 202,message = "最小值不能低于202")
     private String ipAddress;
     private  int port;
     private  long timeout;

}
