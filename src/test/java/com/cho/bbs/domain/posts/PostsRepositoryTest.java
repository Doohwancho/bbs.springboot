package com.cho.bbs.domain.posts;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @AfterAll
    public void 테스트_게시글_삭제(){
        postsRepository.deleteAll();
    }

    @Test
    public void postsRepository_의존성_주입_테스트(){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(postsRepository.getClass().getName());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void 롬복_빌더_작동_여부_확인() {
        //given
        String title = "hello";
        String content = "hello world";
        String author = "cho";

        //when
        Posts post = new Posts()
                .builder()
                .title(title)
                .content(content)
                .author(author)
                .build();

        //then
        assertThat(post.getTitle()).isNotNull();
        assertThat(post.getTitle()).isEqualTo(title);

        assertThat(post.getContent()).isNotNull();
        assertThat(post.getContent()).isEqualTo(content);

        assertThat(post.getAuthor()).isNotNull();
        assertThat(post.getAuthor()).isEqualTo(author);
    }


    @Test
    public void 게시글_저장_후_불러오기(){
        //given
        String title = "hello";
        String content = "hello world";
        String author = "cho";

        Posts post = new Posts()
                .builder()
                .title(title)
                .content(content)
                .author(author)
                .build();

        postsRepository.save(post);

        //when
        List<Posts> postList = postsRepository.findAll();


        //then
        Posts result = postList.get(0);

        assertThat(result.getTitle()).isNotNull();
        assertThat(result.getTitle()).isEqualTo(title);

        assertThat(result.getContent()).isNotNull();
        assertThat(result.getContent()).isEqualTo(content);

        assertThat(result.getAuthor()).isNotNull();
        assertThat(result.getAuthor()).isEqualTo(author);
    }


}
