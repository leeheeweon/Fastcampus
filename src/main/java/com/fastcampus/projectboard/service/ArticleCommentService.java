package com.fastcampus.projectboard.service;

import com.fastcampus.projectboard.dto.ArticleCommentDto;
import com.fastcampus.projectboard.repository.ArticleCommentRepository;
import com.fastcampus.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleCommentService {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    @Transactional(readOnly = true)
<<<<<<< HEAD
    public List<ArticleCommentDto> searchArticleComments(Long articleId) {
=======
    public List<ArticleCommentDto> searchArticleComment(Long articleId) {
>>>>>>> aa4dea0... #21 - 댓글 서비스 로직의 테스트와 골격 잡기
        return List.of();
    }

    public void saveArticleComment(ArticleCommentDto dto) {
    }

<<<<<<< HEAD
    public void updateArticleComment(ArticleCommentDto dto) {
    }

    public void deleteArticleComment(Long articleCommentId) {
    }

=======
>>>>>>> aa4dea0... #21 - 댓글 서비스 로직의 테스트와 골격 잡기
}
