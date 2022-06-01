package cn.salvation.lightrpc.services.serviceB.controller;

import cn.salvation.lightrpc.services.serviceB.dto.ResDTO;
import cn.salvation.lightrpc.services.serviceB.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouyuehan
 * @Date: 2021/12/21 15:22
 */
@RestController
@RequestMapping("/B")
public class BController {
    @Autowired
    BService bService;
    @PostMapping("/hello")
    public ResDTO hello() {
        return bService.hello("abcde");
    }
}
