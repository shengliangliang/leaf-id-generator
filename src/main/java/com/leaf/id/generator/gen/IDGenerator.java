package com.leaf.id.generator.gen;


import com.leaf.id.generator.common.Result;

public interface IDGenerator {
    Result get(String key);
    boolean init();
}
