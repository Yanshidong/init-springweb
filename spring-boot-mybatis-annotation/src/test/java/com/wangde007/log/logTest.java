package com.wangde007.log;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;


@SpringBootTest
@RunWith(SpringRunner.class)
public class logTest {

    private static final Logger logger=Logger.getLogger("Foo");
    @Test
    public void write()
    {
        logger.info("info info info!");


    }

    @Test
    public void loggerNew()
    {
        org.slf4j.Logger logger = LoggerFactory.getLogger(com.wangde007.log.logTest.class);
        logger.debug("日志信息");
        // print internal state
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);


    }
}
