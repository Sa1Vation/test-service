package cn.salvation.lightrpc.services.serviceA.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: zhouyuehan
 * @Date: 2021/12/21 15:24
 */
@FeignClient("serviceB")
public interface BClient {
    @PostMapping("/B/hello")
    String hello(String word);
}
