package com.example.react.board.controller;

import com.example.react.board.Entity.Board;
import com.example.react.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class BoardController {

    @Autowired
    BoardRepository boardRepository;
    @GetMapping("/test")
    public List<Board> test() {
       List<Board> boardList = boardRepository.findAll();


        return boardList;
    }

}
