package com.leaf.id.generator.gen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component("idGeneratorFactory")
public class IDGeneratorFactory {

    @Autowired
    Map<String, IDGenerator> idGeneratorMap = new ConcurrentHashMap<>();

    public IDGenerator getService(String component){
        IDGenerator demoService = idGeneratorMap.get(component);
        if(demoService== null) {
            throw new RuntimeException("策略模式没找到对应实现类");
        }
        return demoService;
    }

}
