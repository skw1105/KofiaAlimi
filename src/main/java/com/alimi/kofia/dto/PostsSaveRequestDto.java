package com.alimi.kofia.dto;

import com.alimi.kofia.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String author;
    private String title;

    @Builder
    public PostsSaveRequestDto(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Posts toEntity() {
        return Posts.builder()
                .author(this.author)
                .title(this.title)
                .build();
    }
}

// Dto 클래스는 Entity 클래스와 매우 유사한 형태이지만 따로 생성해야하며
// 절대 Entity 클래스를 Request 또는 Response 클래스로 사용해서는 안된다.

// Request 또는 Response용 Dto 클래스는 View를 위한 클래스이므로 자주 변경이 일어난다.