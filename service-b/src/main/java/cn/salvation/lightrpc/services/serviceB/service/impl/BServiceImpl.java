package cn.salvation.lightrpc.services.serviceB.service.impl;

import cn.salvation.cloud.lightrpc.core.annotation.RpcService;
import cn.salvation.lightrpc.services.serviceB.dto.ResDTO;
import cn.salvation.lightrpc.services.serviceB.service.BService;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhouyuehan
 * @Date: 2021/12/15 10:58
 */
@RpcService(group = "test1", version = "version1")
public class BServiceImpl implements BService {
    @Override
    public ResDTO hello(String word) {
        ResDTO res = new ResDTO();
        res.setCode("200");
        res.setMsg("success");
        res.setTime(new Date());
        Map<String, Object> data = new HashMap<>();
        data.put("name", "salvation");
        data.put("age", 19);
        return res;
    }
}
