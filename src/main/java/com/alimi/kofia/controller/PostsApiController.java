package com.alimi.kofia.controller;

import com.alimi.kofia.dto.PostsSaveRequestDto;
import com.alimi.kofia.dto.PostsUpdateRequestDto;
import com.alimi.kofia.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor // 초기화되지 않은 final 필드에 대한 의존성 주입 (생성자 주입)
@RestController
public class PostsApiController {
    private final PostsService postsService; //Spring에서는 @Autowired 로 Bean을 주입받지만, Spring boot에서는 생성자로 주입받는 방식이 권장된다.

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{regNo}")
    public Long update(@PathVariable Long regNo, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(regNo, requestDto);
    }
}
