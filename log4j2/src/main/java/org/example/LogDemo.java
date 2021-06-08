package org.example;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo {

    @Test
    public void log() {
//        Logger log = LogManager.getLogger(LogDemo.class);
        Logger log = LoggerFactory.getLogger(LogDemo.class);

        log.trace("===trace===");
        log.debug("===debug===");
        log.info("===info===");
        log.warn("===warn===");
        log.error("===error===");
//        log.fatal("===fatal===");
    }
}
