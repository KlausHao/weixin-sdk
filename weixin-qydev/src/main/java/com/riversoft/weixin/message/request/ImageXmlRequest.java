package com.riversoft.weixin.message.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by exizhai on 9/29/2015.
 */
@JacksonXmlRootElement(localName = "xml")
public class ImageXmlRequest extends XmlRequest {

    @JsonProperty("MsgId")
    private String msgId;

    @JsonProperty("PicUrl")
    @JacksonXmlCData
    private String picUrl;

    @JsonProperty("MediaId")
    @JacksonXmlCData
    private String mediaId;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }
}
