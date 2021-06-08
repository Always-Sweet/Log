package org.example;

import org.example2.LogDemo2;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo {

    @Test
    public void mains() {
        Logger log = LoggerFactory.getLogger(LogDemo.class);

        log.info("===info===");
        log.debug("===debug===");
        log.warn("===debug===");

        new LogDemo2().log();
    }

}