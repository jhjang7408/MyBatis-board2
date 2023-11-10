package com.temisone2.board2.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Board2 {

    private int id;

    private String title;

    private String content;

    private String NAME;

}
