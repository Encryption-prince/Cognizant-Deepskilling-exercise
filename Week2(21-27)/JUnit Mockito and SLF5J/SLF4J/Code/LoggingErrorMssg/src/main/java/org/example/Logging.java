package org.example;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Logging{

    private static final Logger logger = LoggerFactory.getLogger(Logging.class);

    public static void main(String[] args) {
        logger.error("This is an error message");
        logger.warn("This is a warning message");
        logger.info("This is an info message");
        logger.debug("This is a debug message");

    }
}
