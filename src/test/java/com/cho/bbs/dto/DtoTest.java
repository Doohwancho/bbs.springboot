package com.cho.bbs.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class DtoTest {

    @Test
    public void 롬복_작동_여부_테스트() {
        //given
        int id = 1;
        String name = "test";

        //when
        Dto dto = new Dto();
        dto.setId(1);
        dto.setName("test");

        //then
        assertThat(dto.getId()).isNotNull();
        assertThat(dto.getId()).isEqualTo(id);

        assertThat(dto.getName()).isNotNull();
        assertThat(dto.getName()).isEqualTo(name);
    }

    @Test
    public void 롬복_Builder_작동여부_테스트() {
        //given
        int id = 1;
        String name = "test";

        //when
        Dto dto = new Dto().builder().id(1).name("test").build();

        //then
        assertThat(dto.getId()).isNotNull();
        assertThat(dto.getId()).isEqualTo(id);

        assertThat(dto.getName()).isNotNull();
        assertThat(dto.getName()).isEqualTo(name);
    }
}
