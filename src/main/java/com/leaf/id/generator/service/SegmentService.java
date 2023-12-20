package com.leaf.id.generator.service;

import com.leaf.id.generator.gen.IDGenerator;
import com.leaf.id.generator.common.Result;
import com.leaf.id.generator.gen.segment.SegmentIDGenerator;
//import com.leaf.id.generator.dao.mapper.IDAllocDao;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("segmentService")
public class SegmentService {
    private Logger logger = LoggerFactory.getLogger(SegmentService.class);

    @Resource(name = "segment")
    private IDGenerator idGen;
    //private DruidDataSource dataSource;

    /*public SegmentService() throws SQLException, InitException {
        Properties properties = PropertyFactory.getProperties();
        boolean flag = Boolean.parseBoolean(properties.getProperty(Constants.LEAF_SEGMENT_ENABLE, "true"));
        if (flag) {
            // Config dataSource
            dataSource = new DruidDataSource();
            dataSource.setUrl(properties.getProperty(Constants.LEAF_JDBC_URL));
            dataSource.setUsername(properties.getProperty(Constants.LEAF_JDBC_USERNAME));
            dataSource.setPassword(properties.getProperty(Constants.LEAF_JDBC_PASSWORD));
            dataSource.init();

            // Config Dao
            IDAllocDao dao = new IDAllocDaoImpl(dataSource);

            // Config ID Gen
            idGen = new SegmentIDGenImpl();
            ((SegmentIDGenImpl) idGen).setDao(dao);
            if (idGen.init()) {
                logger.info("Segment Service Init Successfully");
            } else {
                throw new InitException("Segment Service Init Fail");
            }
        } else {
            idGen = new ZeroIDGen();
            logger.info("Zero ID Gen Service Init Successfully");
        }
    }*/

    public Result getId(String key) {
        return idGen.get(key);
    }

    public SegmentIDGenerator getIdGen() {
        if (idGen instanceof SegmentIDGenerator) {
            return (SegmentIDGenerator) idGen;
        }
        return null;
    }
}
