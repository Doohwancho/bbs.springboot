package com.cho.bbs.domain.posts;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PostsRepositoryTest {

    @Test
    public void 빌더_작동_여부_확인() {
        //given
        long id = 1;
        String title = "hello";
        String content = "hello world";
        String author = "cho";

        //when
        Posts post = new Posts()
                .builder()
                .id(id)
                .title(title)
                .content(content)
                .author(author)
                .build();

        //then
        assertThat(post.getId()).isNotNull();
        assertThat(post.getId()).isEqualTo(id);

        assertThat(post.getTitle()).isNotNull();
        assertThat(post.getTitle()).isEqualTo(title);

        assertThat(post.getContent()).isNotNull();
        assertThat(post.getContent()).isEqualTo(content);

        assertThat(post.getAuthor()).isNotNull();
        assertThat(post.getAuthor()).isEqualTo(author);
    }
}
