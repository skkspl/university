package org.library.repository;

import org.library.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepository extends CrudRepository<Post, Long>, PagingAndSortingRepository<Post, Long> {
    Optional<Post> findByUserId(Integer UserId);

    Page<Post> findAllByUserIdAndBookId(Long userId, Long bookId, Pageable pageable);

    @Query("""
            select * from post
            where (:user_id is null or :user_id = user_id)
              and (:bookId is null or :bookId = bookId)
            offset :offset limit :limit""")
    Page<Post> findAllByUserIdAndBookId(Long userId, Long bookId, int offset, int limit);
}
