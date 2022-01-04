package com.alimi.kofia.domain;

import javax.persistence.Entity;

@Entity // 테이블과 연결될 클래스임을 나타냄. 기본적으로 CamelCase 형식의 클래스를 CAMEL_CASE 형식의 테이블로 매핑시켜줌
public class Posts extends BaseTimeEntity {
}
