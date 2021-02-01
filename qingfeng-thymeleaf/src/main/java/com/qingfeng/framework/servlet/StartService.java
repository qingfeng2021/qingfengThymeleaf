package com.qingfeng.framework.servlet;

/**
 * @author anxingtao
 * @Title: StartService
 * @ProjectName com.qingfeng
 * @Description: TODO
 * @date 2018-10-2310:21
 */
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 继承Application接口后项目启动时会按照执行顺序执行run方法
 * 通过设置Order的value来指定执行的顺序
 */
@Component
@Order(value = 1)
public class StartService implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
//        System.out.println("#############正在初始FtpServer##############");
//        FtpServer server = FtpServerUtil.getFtpServer();
//        server.start();
//        System.out.println("#############正在初始化企业微信access_token线程##############");
        System.out.println("###############################项目启动成功###############################");
    }
}
