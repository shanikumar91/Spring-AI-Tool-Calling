
package com.spring.ai.firstproject.tools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.context.i18n.LocaleContextHolder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleDateTimeTool {

    private static final Logger logger =
            LoggerFactory.getLogger(SimpleDateTimeTool.class);

//    information  tool
    @Tool(description = "Get the current date and time in the user's time zone.")
    public String getCurrentDateTime() {
        logger.info("Tool calling");
        logger.info("Getting current date and time");
        return LocalDateTime.now()
                .atZone(LocaleContextHolder.getTimeZone().toZoneId())
                .toString();
    }
//    action tool
    @Tool(description = "Set the alarm for given time.")
    void setAlarm(@ToolParam(description = "Time in ISO-8601 format") String time){
        var dateTime = LocalDateTime.parse(time, DateTimeFormatter.ISO_DATE_TIME);
        logger.info("Set the alarm for given time. {}", dateTime);
    }
}
