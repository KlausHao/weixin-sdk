package com.riversoft.weixin.message.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.riversoft.weixin.message.base.MsgType;
import com.riversoft.weixin.message.base.Text;
import com.riversoft.weixin.util.BooleanDeserializer;
import com.riversoft.weixin.util.BooleanSerializer;

/**
 * Created by exizhai on 9/26/2015.
 */
public class TextMessage extends JsonMessage {

    private Text text;
    @JsonSerialize(using = BooleanSerializer.class)
    @JsonDeserialize(using = BooleanDeserializer.class)
    private boolean safe = false;

    public TextMessage() {
        this.msgType = MsgType.text;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public boolean isSafe() {
        return safe;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }

    public TextMessage text(String content) {
        this.text = new Text(content);
        return this;
    }

    public TextMessage safe() {
        this.safe = true;
        return this;
    }
}
