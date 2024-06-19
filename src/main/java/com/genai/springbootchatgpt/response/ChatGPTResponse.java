package com.genai.springbootchatgpt.response;

import com.genai.springbootchatgpt.model.ChatGPTChoice;
import lombok.Data;

import java.util.List;

@Data
public class ChatGPTResponse {

    private List<ChatGPTChoice> choices;

}
