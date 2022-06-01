package cn.salvation.lightrpc.services.serviceB.dto;

import lombok.Data;

import java.util.Date;

/**
 * @Author: zhouyuehan
 * @Date: 2021/12/15 10:56
 */
@Data
public class ResDTO {
    String code;
    String msg;
    Date time;
    Object data;
}
