package com.hendisantika.springjacksondemo.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-jackson-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-22
 * Time: 18:38
 */
public @Component
class CustomOffsetDateTimeDeserializer extends JsonDeserializer<OffsetDateTime> {

    private final DateTimeFormatter dateTimeFormatter;

    public CustomOffsetDateTimeDeserializer(final DateTimeFormatter dateTimeFormatter) {
        this.dateTimeFormatter = dateTimeFormatter;
    }

    @Override
    public OffsetDateTime deserialize(final JsonParser p, final DeserializationContext ctxt)
            throws IOException {
        return OffsetDateTime.parse(p.getValueAsString(), dateTimeFormatter);
    }
}
