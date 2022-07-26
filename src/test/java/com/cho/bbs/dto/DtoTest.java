package com.cho.bbs.dto;


import com.cho.bbs.dto.Dto;
import lombok.Builder;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;



import static org.assertj.core.api.Assertions.assertThat;
@Builder
public class DtoTest {

    @Test
    public void 롬북_작동_여부_테스트() {
        //given
        int id = 1;
        String name = "test";

        //when
        Dto dto = new Dto();
        dto.setId(1);
        dto.setName("test");

        //then
        assertThat(dto.getId()).isEqualTo(id);
        assertThat(dto.getName()).isEqualTo(name);
    }
    
}
