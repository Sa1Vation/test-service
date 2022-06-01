package cn.salvation.lightrpc.services.serviceB;

import cn.salvation.cloud.lightrpc.core.annotation.RpcScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @Author: zhouyuehan
 * @Date: 2021/12/13 13:44
 */
@SpringCloudApplication
@RpcScan(basePackage = "cn.salvation.lightrpc.services.serviceB")
public class ServiceBApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceBApplication.class, args);
    }
}
