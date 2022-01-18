package com.alimi.kofia.domain;

import com.alimi.kofia.domain.posts.Posts;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KofiaCrawler {
    private final String URL = "http://www.kofia.or.kr/brd/m_96/list.do";

    private Document getHTML() throws IOException {
        Connection conn = Jsoup.connect(this.URL);
        return conn.get();
    }

    public static List<Posts> getPostsList() {
        List<Posts> posts = new ArrayList<>();
        return posts;
    }

}
