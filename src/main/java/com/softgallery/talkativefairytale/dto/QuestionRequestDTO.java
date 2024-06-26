package com.softgallery.talkativefairytale.dto;

import com.softgallery.talkativefairytale.service.chatGpt.Message;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;

@Getter
public class QuestionRequestDTO implements Serializable {
    private List<Message> messages;

    public QuestionRequestDTO() { }

    public QuestionRequestDTO(List<Message> messages) {
        this.messages = messages;
    }
}
