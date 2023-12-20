package com.leaf.id.generator.gen.zero;


import com.leaf.id.generator.common.Result;
import com.leaf.id.generator.common.Status;
import com.leaf.id.generator.gen.IDGenerator;
import org.springframework.stereotype.Service;

@Service("zero")
public class ZeroIDGenerator implements IDGenerator {
    public static final String BEAN_NAME="zero";

    @Override
    public Result get(String key) {
        return new Result(0, Status.SUCCESS);
    }

    @Override
    public boolean init() {
        return true;
    }
}
