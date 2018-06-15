package com.springcloud.hzm.hzmeurekaclient2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * Package: com.springcloud.hzm.hzmeurekaclient.controller
 * Author: houzm
 * Date: Created in 2018/4/15 18:43
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 * Description： TODO
 */
@Controller
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/client/demo/hello")
    public @ResponseBody String demoHello(){
        List<String> services = discoveryClient.getServices();
        logger.info("Client获取注册中心所有服务：{}", Arrays.toString(services.toArray()));
        if (!CollectionUtils.isEmpty(services)) {
            for (String service : services) {
                logger.info("==========={}服务所有实例===========", service);
                List<ServiceInstance> instances = discoveryClient.getInstances(service);
                logger.info(":::"+Arrays.toString(instances.toArray()));
            }
        }
        logger.info("=======================================");
        String description = discoveryClient.description();
        logger.info(description);
        return "hello";
    }

}
