package com.alimi.kofia.dto;

import com.alimi.kofia.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String author;
    private String title;

    @Builder
    public PostsUpdateRequestDto(String author, String title) {
        this.author = author;
        this.title = title;
    }
}



//@Getter
//public class PostsResponseDto {
//    private Long regNo;
//    private String author;
//    private String title;
//
//    public PostsResponseDto(Posts entity) {
//        this.regNo = entity.getRegNo();
//        this.author = entity.getAuthor();
//        this.title = entity.getTitle();
//    }
//}
