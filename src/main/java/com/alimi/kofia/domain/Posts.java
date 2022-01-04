package com.alimi.kofia.domain;

import javax.persistence.Entity;

//@Entity // 테이블과 연결될 클래스임을 나타냄. 기본적으로 CamelCase 형식의 클래스를 CAMEL_CASE 형식의 테이블로 매핑시켜줌
public class Posts extends BaseTimeEntity {
}

// Domain Model
// 도메인이라 불리는 개발 대상을 모든 사람이 동일한 관점에서 이해할 수 있도록 단순화시킨 것.
// 비즈니스 로직 처리 담당.
// ex) 택시 앱이라고 한다면  배차, 탑승, 요금  등이 도메인 모델이다.
// @Entity가 사용된 영역도 도메인 모델이라고 할 수 있다.
// 꼭 DB의 테이블과 관계가 있어야만 하는 것은 아니다.