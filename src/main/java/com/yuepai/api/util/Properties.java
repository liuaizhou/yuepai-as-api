package com.yuepai.api.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * Description: 静态变量定义
 *
 * @author zhoutingting
 * @date: 2017年10月30日 下午4:33:12
 * @version 1.0
 * @since JDK 1.8
 */
@RefreshScope
@Configuration
public class Properties {

    @Value("${system.server}")
    private String systemServer;

    public String getSystemServer() {
        return systemServer;
    }

    public void setSystemServer(String systemServer) {
        this.systemServer = systemServer;
    }

}
