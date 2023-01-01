package com.example.react.board.controller;

import com.example.react.board.repository.Board;
import com.example.react.board.repository.BoardRepository;
import com.example.react.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class BoardController {
    private BoardService boardService;
    BoardRepository boardRepository;

    @Autowired
    public BoardController(BoardService boardService, BoardRepository boardRepository) {
        this.boardService = boardService;
        this.boardRepository = boardRepository;
    }

    // get all board
    @GetMapping("/board")
    public List<Board> getAllBoards() {
//        ArrayList test = new ArrayList<>();
//        test = (ArrayList) boardService.getAllBoard();


        // 2. 게시글 저장
        boardRepository.findAll();
        System.out.println("test");
        return boardService.getAllBoard();
    }
}
