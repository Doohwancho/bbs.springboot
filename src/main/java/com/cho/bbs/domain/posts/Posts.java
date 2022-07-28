package com.cho.bbs.domain.posts;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Posts {
    long id;
    String title;
    String content;
    String author;

    public Posts(){

    }

    @Builder
    public Posts(long id, String title, String content, String author){
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
