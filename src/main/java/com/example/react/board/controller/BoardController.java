package com.example.react.board.controller;

import com.example.react.board.repository.BoardRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class BoardController {
    BoardRepository boardRepository;
    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
