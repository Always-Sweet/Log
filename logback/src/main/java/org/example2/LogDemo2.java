package org.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo2 {

    public void log() {
        Logger log = LoggerFactory.getLogger(LogDemo2.class);

        log.info("===info===");
        log.debug("===debug===");
        log.warn("===debug===");
    }

}
