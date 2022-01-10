package com.alimi.kofia.domain;

import com.alimi.kofia.domain.posts.Posts;

import java.util.ArrayList;
import java.util.List;

public class KofiaCrawler {
    private final String sURL = "http://www.kofia.or.kr/brd/m_96/list.do";

    public static List<Posts> getPostsList() {
        List<Posts> posts = new ArrayList<>();
        return posts;
    }

}
