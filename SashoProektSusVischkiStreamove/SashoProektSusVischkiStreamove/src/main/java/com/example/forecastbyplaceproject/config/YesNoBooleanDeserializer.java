package com.example.forecastbyplaceproject.config;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class YesNoBooleanDeserializer extends JsonDeserializer<Boolean> {

    @Override
    public Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        JsonToken token = jsonParser.getCurrentToken();
        if(token.equals(JsonToken.VALUE_STRING)){
            String text = jsonParser.getText();

            if("yes".equalsIgnoreCase(text)){
                return  Boolean.TRUE;
            }
            if("no".equalsIgnoreCase(text)){
                return  Boolean.FALSE;
            }
        }
        return  Boolean.FALSE;
    }
}