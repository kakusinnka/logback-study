package com.hzh;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test001() {
        Logger logger = LoggerFactory.getLogger(AppTest.class);

        logger.trace("trace!!!");
        logger.debug("debug!!!");
        logger.info("info!!!");
        logger.warn("warn!!!");
        logger.error("error!!!");
    }
}
