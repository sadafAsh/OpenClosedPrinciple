package com.soj.principle.openclosed;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculation {
    static final Logger logger = LogManager.getLogger(Calculation.class.getName());

    public Shape calculate(Shape shapes) {

        try {
            shapes.area();
        } catch (Exception e) {
            logger.error("cannot calculate the area");
        }
        return shapes;
    }
}

