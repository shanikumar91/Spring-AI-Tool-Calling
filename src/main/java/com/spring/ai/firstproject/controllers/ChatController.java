package com.spring.ai.firstproject.controllers;
import com.spring.ai.firstproject.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
public class ChatController {
    private ChatService chatService;

    public ChatController(ChatService chatService)
    {
        this.chatService = chatService;
    }

    @GetMapping()
    public String chat(@RequestParam("q") String q){
        return chatService.chat(q);
    }
}
