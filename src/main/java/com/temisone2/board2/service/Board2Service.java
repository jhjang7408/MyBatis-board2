package com.temisone2.board2.service;

import com.temisone2.board2.domain.Board2;
import com.temisone2.board2.mapper.Board2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Board2Service {

    @Autowired
    private Board2Mapper board2Mapper;

    public List<Board2> board2List(){
        return board2Mapper.findAll();
    }


    public Board2 view(int id){
        return board2Mapper.findById(id);
    }


    public void write(Board2 board2){
        board2Mapper.write(board2);
    }


    public void update(Board2 board2){
        board2Mapper.update(board2);
    }

    public void delete(int id){
        board2Mapper.delete(id);
    }

}
