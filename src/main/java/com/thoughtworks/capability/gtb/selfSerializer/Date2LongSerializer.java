package com.thoughtworks.capability.gtb.selfSerializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.Date;

public class Date2LongSerializer extends StdSerializer<Date> {

    protected Date2LongSerializer() {
        super(Date.class);
    }
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider provider) throws IOException {
        jsonGenerator.writeNumber(date.getTime()); //毫秒
    }
}
