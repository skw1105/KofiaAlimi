package com.alimi.kofia.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}

// Entity 클래스로 DB에 접근하게 해주는 Entity Repository
// JpaRepository<Entity 클래스, PK필드 타입>

