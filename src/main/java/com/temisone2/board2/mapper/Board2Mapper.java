package com.temisone2.board2.mapper;

import com.temisone2.board2.domain.Board2;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface Board2Mapper {

    List<Board2> findAll();

    Board2 findById(int id);

    void write(Board2 board2);

    void update(Board2 board2);

    void delete(int id);

}
