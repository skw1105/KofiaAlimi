package com.alimi.kofia.service.posts;

import com.alimi.kofia.domain.posts.Posts;
import com.alimi.kofia.domain.posts.PostsRepository;
import com.alimi.kofia.dto.PostsSaveRequestDto;
import com.alimi.kofia.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository; // @RequiredArgsConstructor 를 통해 생성자로 Bean객체를 주입받는다.

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getRegNo();
    }
    @Transactional
    public Long update(Long regNo, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(regNo).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. 등록번호: " + regNo));
        posts.update(requestDto.getAuthor(), requestDto.getTitle());
        return regNo;
    }
}
