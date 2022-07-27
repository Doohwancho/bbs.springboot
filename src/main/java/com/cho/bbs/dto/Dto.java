package com.cho.bbs.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Dto {
    int id;
    String name;

    Dto(){

    }

    Dto(int id, String name){
        this.id = id;
        this.name = name;
    }
}
