package com.thoughtworks.capability.gtb.selfSerializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class EgeSerializer extends JsonSerializer<Integer> {
    @Override
    public void serialize(Integer age, JsonGenerator jsonGenerator, SerializerProvider provider) throws IOException {
        if(age == null) jsonGenerator.writeNumber(0);
    }
}
