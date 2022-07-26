package com.cho.dto;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DtoTest {

    @Test
    public void 롬북_작동_여부_테스트() {
        //given
        String name = "test";
        int id = 1;

        //when
        HelloResponseDto dto = new HelloResponseDto(id,name);

        //then
        assertThat(dto.getId()).isEqualTo(id);
        assertThat(dto.getName()).isEqualTo(name);
    }
    
}
