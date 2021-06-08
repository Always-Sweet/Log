package org.example;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;

public class LogDemo {

    @Test
    public void log() {
        Logger log = Logger.getLogger(LogDemo.class);
        log.setLevel(Level.WARN);

        log.info("===info===");
        log.debug("===debug===");
        log.warn("===debug===");

    }
}
