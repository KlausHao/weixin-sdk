package com.riversoft.weixin.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.riversoft.weixin.agent.bean.WritableAgent;

import java.io.IOException;

/**
 * Created by exizhai on 10/6/2015.
 */
public class ReportLocationSerializer extends JsonSerializer<WritableAgent.ReportLocation> {

    @Override
    public void serialize(WritableAgent.ReportLocation reportLocation, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        if (WritableAgent.ReportLocation.NO == reportLocation) jsonGenerator.writeNumber(0);
        if (WritableAgent.ReportLocation.ONLY_IN_SESSION == reportLocation) jsonGenerator.writeNumber(1);
        if (WritableAgent.ReportLocation.ALWAYS == reportLocation) jsonGenerator.writeNumber(2);
    }
}
