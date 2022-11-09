package com.mustache.bbs4.domain.dto;

import com.mustache.bbs4.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ArticleDto {
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(title, content);
    }
}
