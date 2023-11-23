package com.fastcampus.projectboard.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private Long id;
    private String title; // 제목
    private String content; // 본문
    private String hashTag; // 해시태그

    private LocalDateTime createAt; // 생성일시
    private String createBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; //수정자
}
