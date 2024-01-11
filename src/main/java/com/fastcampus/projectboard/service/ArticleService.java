package com.fastcampus.projectboard.service;

import com.fastcampus.projectboard.domain.type.SearchType;
import com.fastcampus.projectboard.dto.ArticleDto;
<<<<<<< HEAD
<<<<<<< HEAD
import com.fastcampus.projectboard.dto.ArticleWithCommentsDto;
import com.fastcampus.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

=======
import com.fastcampus.projectboard.dto.ArticleUpdateDto;
=======
import com.fastcampus.projectboard.dto.ArticleWithCommentsDto;
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성
import com.fastcampus.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

<<<<<<< HEAD
import java.time.LocalDateTime;
import java.util.List;

>>>>>>> cc04734... #21 - 게시글 서비스 로직의 테스트와 골격 잡기
=======
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성
@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
<<<<<<< HEAD
<<<<<<< HEAD
    public Page<ArticleDto> searchArticles(SearchType searchType, String searchKeyword, Pageable pageable) {
=======
    public Page<ArticleDto> searchArticles(SearchType title, String search_keyword) {
>>>>>>> cc04734... #21 - 게시글 서비스 로직의 테스트와 골격 잡기
=======
    public Page<ArticleDto> searchArticles(SearchType searchType, String searchKeyword, Pageable pageable) {
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성
        return Page.empty();
    }

    @Transactional(readOnly = true)
<<<<<<< HEAD
<<<<<<< HEAD
    public ArticleWithCommentsDto getArticle(Long articleId) {
=======
    public ArticleDto searchArticle(long l) {
>>>>>>> cc04734... #21 - 게시글 서비스 로직의 테스트와 골격 잡기
=======
    public ArticleWithCommentsDto getArticle(Long articleId) {
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성
        return null;
    }

    public void saveArticle(ArticleDto dto) {
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public void updateArticle(ArticleDto dto) {
=======
    public void updateArticle(long articleId, ArticleUpdateDto dto) {
>>>>>>> cc04734... #21 - 게시글 서비스 로직의 테스트와 골격 잡기
=======
    public void updateArticle(ArticleDto dto) {
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성
    }

    public void deleteArticle(long articleId) {
    }
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> cc04734... #21 - 게시글 서비스 로직의 테스트와 골격 잡기
=======

>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성
}
