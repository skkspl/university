package org.library.service;

import lombok.RequiredArgsConstructor;
import org.library.dto.request.PostRequest;
import org.library.dto.response.PostResponse;
import org.library.mapper.PostMapper;
import org.library.repository.PostRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public PostResponse createPost(PostRequest request) {
        var post = postMapper.toEntity(request);
        var savedPost = postRepository.save(post);
        return postMapper.toResponse(savedPost);
    }

    public PostResponse updatePost(Long id, PostRequest request) {
        var existingPost = postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found"));
        postMapper.updateEntityFromDto(existingPost, request);
        var updatedPost = postRepository.save(existingPost);
        return postMapper.toResponse(updatedPost);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    public PostResponse getPostById(Long id) {
        var post = postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found"));
        return postMapper.toResponse(post);
    }

    public PostResponse getPostByUserId(Integer UserId) {
        return postRepository.findByUserId(UserId)
                .map(postMapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Post not found"));
    }

    public Page<PostResponse> getAllPosts(Pageable pageable) {
        pageable.getOffset();
        pageable.getPageSize();
        return postRepository.findAll(pageable).map(postMapper::toResponse);
    }

}
