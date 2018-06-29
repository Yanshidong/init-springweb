package com.wangde007.log;


import ch.qos.logback.core.util.StatusPrinter;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;




@SpringBootTest
@RunWith(SpringRunner.class)
public class logTest {

    private static final Logger logger=LoggerFactory.getLogger(logTest.class);
    @Test
    public void write()
    {
        logger.info("info info info!");

    }

    @Test
    public void loggerNew()
    {
//        org.slf4j.Logger logger = LoggerFactory.getLogger(com.wangde007.log.logTest.class);
//        logger.info("日志信息");
        logger.info("测试日志","参数1","参数2","参数3");
        logger.error("hahah");
        logger.debug("修行");
        logger.trace("aaa","参数1","参数2","参数3");
        logger.warn("warning mesage","参数1","参数2","参数3");
        // print internal state
//        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
//        StatusPrinter.print(lc);


    }
}
