package com.alimi.kofia.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

// 생성시간, 수정시간 을 자동화하기 위한 추상 클래스

@Getter
@MappedSuperclass // 객체의 입장에서 공통 매핑 정보가 필요할 때 사용
@EntityListeners(AuditingEntityListener.class) //JPA를 사용하여 테이블에 매핑할 때 도메인들이 공통적으로 가지고 있는 필드나 컬럼에 자동으로 값을 넣어주는 기능
public abstract class BaseTimeEntity {
    @CreatedDate // Entity가 생성되어 저장될 때 시간이 자동으로 저장됨.
    private LocalDateTime createdDate;

    @LastModifiedDate // 조회한 Entity의 값을 변경할 때 시간이 자동으로 저장됨.
    private LocalDateTime modifiedDate;
}
