package com.example.fastcampusmysql.domain.member.entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
public class MemberNameHistory {
    final private Long id;
    final private Long memberId;
    final private String name;
    final private LocalDateTime createdAt;
    @Builder
    public MemberNameHistory(Long id, Long memberId, String name, LocalDateTime createdAt) {
        this.id = id;
        this.memberId = Objects.requireNonNull(memberId);
        this.name = Objects.requireNonNull(name);
        this.createdAt = createdAt == null ? LocalDateTime.now() : createdAt;
    }
}
