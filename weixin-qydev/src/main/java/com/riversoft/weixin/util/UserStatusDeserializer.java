package com.riversoft.weixin.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.riversoft.weixin.contact.bean.user.UserStatus;

import java.io.IOException;

/**
 * Created by exizhai on 10/4/2015.
 */
public class UserStatusDeserializer extends JsonDeserializer<UserStatus> {

    @Override
    public UserStatus deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        int status = jsonParser.getIntValue();
        if (1 == status) return UserStatus.FOLLOWED;
        if (2 == status) return UserStatus.SUSPEND;
        if (4 == status) return UserStatus.UN_FOLLOWED;

        return UserStatus.UNKNOWN;
    }
}
