package cn.salvation.lightrpc.services.serviceB.service;

import cn.salvation.lightrpc.services.serviceB.dto.ResDTO;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouyuehan
 * @Date: 2021/12/15 10:57
 */
@Service
public interface BService {
    ResDTO hello(String word);
}
