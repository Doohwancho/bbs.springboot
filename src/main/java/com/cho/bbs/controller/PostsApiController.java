package com.cho.bbs.controller;

import com.cho.bbs.dto.PostsSaveRequestDto;
import com.cho.bbs.dto.PostsUpdateRequestDto;
import com.cho.bbs.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody
            PostsUpdateRequestDto requestDto) {

        return postsService.update(id, requestDto);
    }

}