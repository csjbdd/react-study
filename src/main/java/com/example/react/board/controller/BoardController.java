package com.example.react.board.controller;

import com.example.react.board.repository.Board;
import com.example.react.board.repository.BoardRepository;
import com.example.react.board.service.BoardService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class BoardController {
//    private BoardService boardService;
//    BoardRepository boardRepository;
//
//    @Autowired
//    public BoardController(BoardService boardService, BoardRepository boardRepository) {
//        this.boardService = boardService;
//        this.boardRepository = boardRepository;
//    }

    // get all board
//    @GetMapping("/board")
//    public List<Board> getAllBoards() {
//        HashMap<String,Object> result = new HashMap<>();
//        ArrayList test = (ArrayList) boardRepository.findAll();
//        result.put("data",test);
//        return test;
//    }

    @GetMapping("/test")
    public String test() {
        return "안녕하세요 리액트와 스프링부트를 Proxy 설정을통해연결하고 있습니다";
    }

}
