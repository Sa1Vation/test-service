package cn.salvation.lightrpc.services.serviceA;

import cn.salvation.cloud.lightrpc.core.annotation.RpcScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: zhouyuehan
 * @Date: 2021/12/13 13:43
 */
@SpringCloudApplication
@RpcScan(basePackage = "cn.salvation.lighrpc.services.serviceA")
@EnableFeignClients
public class ServiceAApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }
}
