package com.softgallery.talkativefairytale.service.chatGpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.softgallery.talkativefairytale.service.chatGpt.Message;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
public class Choice implements Serializable {

    private Message message;
    private Integer index;
    @JsonProperty("finish_reason")
    private String finishReason;

    @Builder
    public Choice(Message message, Integer index, String finishReason) {
        this.message = message;
        this.index = index;
        this.finishReason = finishReason;
    }
}
