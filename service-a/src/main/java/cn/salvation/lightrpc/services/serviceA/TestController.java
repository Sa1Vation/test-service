package cn.salvation.lightrpc.services.serviceA;

import cn.salvation.cloud.lightrpc.core.annotation.RpcReference;
import cn.salvation.lightrpc.services.serviceA.feign.BClient;
import cn.salvation.lightrpc.services.serviceB.dto.ResDTO;
import cn.salvation.lightrpc.services.serviceB.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouyuehan
 * @Date: 2021/12/21 15:30
 */
@RestController
@RequestMapping("/A")
public class TestController {
    @Autowired
    BClient bClientFeign;

    @RpcReference(version = "version1", group = "test1")
    BService bServiceLightRpc;

    @PostMapping("/hello-feign")
    public String helloFeign() {
        return bClientFeign.hello("abcde");
    }

    @PostMapping("/hello-lightRpc")
    public ResDTO helloLightRpc() {
        return bServiceLightRpc.hello("abcde");
    }
}
