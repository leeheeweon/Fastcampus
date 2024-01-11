package com.fastcampus.projectboard.service;

import com.fastcampus.projectboard.domain.Article;
<<<<<<< HEAD
<<<<<<< HEAD
import com.fastcampus.projectboard.domain.UserAccount;
import com.fastcampus.projectboard.domain.type.SearchType;
import com.fastcampus.projectboard.dto.ArticleDto;
import com.fastcampus.projectboard.dto.ArticleWithCommentsDto;
import com.fastcampus.projectboard.dto.UserAccountDto;
=======
import com.fastcampus.projectboard.domain.type.SearchType;
import com.fastcampus.projectboard.dto.ArticleDto;
import com.fastcampus.projectboard.dto.ArticleUpdateDto;
>>>>>>> cc04734... #21 - 게시글 서비스 로직의 테스트와 골격 잡기
=======
import com.fastcampus.projectboard.domain.UserAccount;
import com.fastcampus.projectboard.domain.type.SearchType;
import com.fastcampus.projectboard.dto.ArticleDto;
import com.fastcampus.projectboard.dto.ArticleWithCommentsDto;
import com.fastcampus.projectboard.dto.UserAccountDto;
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성
import com.fastcampus.projectboard.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
=======
=======
import org.springframework.data.domain.Pageable;
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성

import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
<<<<<<< HEAD
>>>>>>> cc04734... #21 - 게시글 서비스 로직의 테스트와 골격 잡기
=======
import static org.assertj.core.api.Assertions.catchThrowable;
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.*;

@DisplayName("비즈니스 로직 - 게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    @InjectMocks private ArticleService sut;

    @Mock private ArticleRepository articleRepository;

<<<<<<< HEAD
<<<<<<< HEAD
    @DisplayName("검색어 없이 게시글을 검색하면, 게시글 페이지를 반환한다.")
    @Test
    void givenNoSearchParameters_whenSearchingArticles_thenReturnsArticlePage() {
        // Given
        Pageable pageable = Pageable.ofSize(20);
        given(articleRepository.findAll(pageable)).willReturn(Page.empty());

        // When
        Page<ArticleDto> articles = sut.searchArticles(null, null, pageable);

        // Then
        assertThat(articles).isEmpty();
        then(articleRepository).should().findAll(pageable);
    }

    @DisplayName("검색어와 함께 게시글을 검색하면, 게시글 페이지를 반환한다.")
    @Test
    void givenSearchParameters_whenSearchingArticles_thenReturnsArticlePage() {
        // Given
        SearchType searchType = SearchType.TITLE;
        String searchKeyword = "title";
        Pageable pageable = Pageable.ofSize(20);
        given(articleRepository.findByTitle(searchKeyword, pageable)).willReturn(Page.empty());

        // When
        Page<ArticleDto> articles = sut.searchArticles(searchType, searchKeyword, pageable);

        // Then
        assertThat(articles).isEmpty();
        then(articleRepository).should().findByTitle(searchKeyword, pageable);
=======
    @DisplayName("게시글을 검색하면, 게시글 리스트를 반환한다.")
=======
    @DisplayName("검색어 없이 게시글을 검색하면, 게시글 페이지를 반환한다.")
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성
    @Test
    void givenNoSearchParameters_whenSearchingArticles_thenReturnsArticlePage() {
        // Given
        Pageable pageable = Pageable.ofSize(20);
        given(articleRepository.findAll(pageable)).willReturn(Page.empty());

        // When
        Page<ArticleDto> articles = sut.searchArticles(null, null, pageable);

        // Then
<<<<<<< HEAD
        assertThat(articles).isNotNull();
>>>>>>> cc04734... #21 - 게시글 서비스 로직의 테스트와 골격 잡기
=======
        assertThat(articles).isEmpty();
        then(articleRepository).should().findAll(pageable);
    }

    @DisplayName("검색어와 함께 게시글을 검색하면, 게시글 페이지를 반환한다.")
    @Test
    void givenSearchParameters_whenSearchingArticles_thenReturnsArticlePage() {
        // Given
        SearchType searchType = SearchType.TITLE;
        String searchKeyword = "title";
        Pageable pageable = Pageable.ofSize(20);
        given(articleRepository.findByTitle(searchKeyword, pageable)).willReturn(Page.empty());

        // When
        Page<ArticleDto> articles = sut.searchArticles(searchType, searchKeyword, pageable);

        // Then
        assertThat(articles).isEmpty();
        then(articleRepository).should().findByTitle(searchKeyword, pageable);
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성
    }

    @DisplayName("게시글을 조회하면, 게시글을 반환한다.")
    @Test
    void givenArticleId_whenSearchingArticle_thenReturnsArticle() {
        // Given
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성
        Long articleId = 1L;
        Article article = createArticle();
        given(articleRepository.findById(articleId)).willReturn(Optional.of(article));

        // When
        ArticleWithCommentsDto dto = sut.getArticle(articleId);

        // Then
        assertThat(dto)
                .hasFieldOrPropertyWithValue("title", article.getTitle())
                .hasFieldOrPropertyWithValue("content", article.getContent())
                .hasFieldOrPropertyWithValue("hashtag", article.getHashtag());
        then(articleRepository).should().findById(articleId);
    }

    @DisplayName("없는 게시글을 조회하면, 예외를 던진다.")
    @Test
    void givenNonexistentArticleId_whenSearchingArticle_thenThrowsException() {
        // Given
        Long articleId = 0L;
        given(articleRepository.findById(articleId)).willReturn(Optional.empty());
<<<<<<< HEAD

        // When
        Throwable t = catchThrowable(() -> sut.getArticle(articleId));

        // Then
        assertThat(t)
                .isInstanceOf(EntityNotFoundException.class)
                .hasMessage("게시글이 없습니다 - articleId: " + articleId);
        then(articleRepository).should().findById(articleId);
    }

    @DisplayName("게시글 정보를 입력하면, 게시글을 생성한다.")
    @Test
    void givenArticleInfo_whenSavingArticle_thenSavesArticle() {
        // Given
        ArticleDto dto = createArticleDto();
        given(articleRepository.save(any(Article.class))).willReturn(createArticle());

        // When
        sut.saveArticle(dto);
=======
=======
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성

        // When
        Throwable t = catchThrowable(() -> sut.getArticle(articleId));

        // Then
        assertThat(t)
                .isInstanceOf(EntityNotFoundException.class)
                .hasMessage("게시글이 없습니다 - articleId: " + articleId);
        then(articleRepository).should().findById(articleId);
    }

    @DisplayName("게시글 정보를 입력하면, 게시글을 생성한다.")
    @Test
    void givenArticleInfo_whenSavingArticle_thenSavesArticle() {
        // Given
        ArticleDto dto = createArticleDto();
        given(articleRepository.save(any(Article.class))).willReturn(createArticle());

        // When
<<<<<<< HEAD
        sut.saveArticle(ArticleDto.of(LocalDateTime.now(), "Uno", "title", "content", "#java"));
>>>>>>> cc04734... #21 - 게시글 서비스 로직의 테스트와 골격 잡기
=======
        sut.saveArticle(dto);
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성

        // Then
        then(articleRepository).should().save(any(Article.class));
    }

<<<<<<< HEAD
<<<<<<< HEAD
    @DisplayName("게시글의 수정 정보를 입력하면, 게시글을 수정한다.")
    @Test
    void givenModifiedArticleInfo_whenUpdatingArticle_thenUpdatesArticle() {
        // Given
        Article article = createArticle();
        ArticleDto dto = createArticleDto("새 타이틀", "새 내용", "#springboot");
        given(articleRepository.getReferenceById(dto.id())).willReturn(article);

        // When
        sut.updateArticle(dto);

        // Then
        assertThat(article)
                .hasFieldOrPropertyWithValue("title", dto.title())
                .hasFieldOrPropertyWithValue("content", dto.content())
                .hasFieldOrPropertyWithValue("hashtag", dto.hashtag());
        then(articleRepository).should().getReferenceById(dto.id());
    }

    @DisplayName("없는 게시글의 수정 정보를 입력하면, 경고 로그를 찍고 아무 것도 하지 않는다.")
    @Test
    void givenNonexistentArticleInfo_whenUpdatingArticle_thenLogsWarningAndDoesNothing() {
        // Given
        ArticleDto dto = createArticleDto("새 타이틀", "새 내용", "#springboot");
        given(articleRepository.getReferenceById(dto.id())).willThrow(EntityNotFoundException.class);

        // When
        sut.updateArticle(dto);

        // Then
        then(articleRepository).should().getReferenceById(dto.id());
=======
    @DisplayName("게시글의 ID와 수정 정보를 입력하면, 게시글을 수정한다")
=======
    @DisplayName("게시글의 수정 정보를 입력하면, 게시글을 수정한다.")
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성
    @Test
    void givenModifiedArticleInfo_whenUpdatingArticle_thenUpdatesArticle() {
        // Given
        Article article = createArticle();
        ArticleDto dto = createArticleDto("새 타이틀", "새 내용", "#springboot");
        given(articleRepository.getReferenceById(dto.id())).willReturn(article);

        // When
        sut.updateArticle(dto);

        // Then
<<<<<<< HEAD
        then(articleRepository).should().save(any(Article.class));
>>>>>>> cc04734... #21 - 게시글 서비스 로직의 테스트와 골격 잡기
=======
        assertThat(article)
                .hasFieldOrPropertyWithValue("title", dto.title())
                .hasFieldOrPropertyWithValue("content", dto.content())
                .hasFieldOrPropertyWithValue("hashtag", dto.hashtag());
        then(articleRepository).should().getReferenceById(dto.id());
    }

    @DisplayName("없는 게시글의 수정 정보를 입력하면, 경고 로그를 찍고 아무 것도 하지 않는다.")
    @Test
    void givenNonexistentArticleInfo_whenUpdatingArticle_thenLogsWarningAndDoesNothing() {
        // Given
        ArticleDto dto = createArticleDto("새 타이틀", "새 내용", "#springboot");
        given(articleRepository.getReferenceById(dto.id())).willThrow(EntityNotFoundException.class);

        // When
        sut.updateArticle(dto);

        // Then
        then(articleRepository).should().getReferenceById(dto.id());
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성
    }

    @DisplayName("게시글의 ID를 입력하면, 게시글을 삭제한다")
    @Test
    void givenArticleId_whenDeletingArticle_thenDeletesArticle() {
        // Given
<<<<<<< HEAD
<<<<<<< HEAD
        Long articleId = 1L;
        willDoNothing().given(articleRepository).deleteById(articleId);
=======
        willDoNothing().given(articleRepository).delete(any(Article.class));
>>>>>>> cc04734... #21 - 게시글 서비스 로직의 테스트와 골격 잡기
=======
        Long articleId = 1L;
        willDoNothing().given(articleRepository).deleteById(articleId);
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성

        // When
        sut.deleteArticle(1L);

        // Then
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성
        then(articleRepository).should().deleteById(articleId);
    }


    private UserAccount createUserAccount() {
        return UserAccount.of(
                "uno",
                "password",
                "uno@email.com",
                "Uno",
                null
        );
    }

    private Article createArticle() {
        return Article.of(
                createUserAccount(),
                "title",
                "content",
                "#java"
        );
    }

    private ArticleDto createArticleDto() {
        return createArticleDto("title", "content", "#java");
    }

    private ArticleDto createArticleDto(String title, String content, String hashtag) {
        return ArticleDto.of(1L,
                createUserAccountDto(),
                title,
                content,
                hashtag,
                LocalDateTime.now(),
                "Uno",
                LocalDateTime.now(),
                "Uno");
    }

    private UserAccountDto createUserAccountDto() {
        return UserAccountDto.of(
                1L,
                "uno",
                "password",
                "uno@mail.com",
                "Uno",
                "This is memo",
                LocalDateTime.now(),
                "uno",
                LocalDateTime.now(),
                "uno"
        );
<<<<<<< HEAD
=======
        then(articleRepository).should().delete(any(Article.class));
>>>>>>> cc04734... #21 - 게시글 서비스 로직의 테스트와 골격 잡기
=======
>>>>>>> 93f11a1... #21 - 서비스 로직 테스트 코드 업데이트 및 DTO 재설계, 쿼리 메소드 작성
    }

}
