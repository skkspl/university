package org.library.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.library.dto.request.PostRequest;
import org.library.dto.response.BookResponse;
import org.library.dto.response.PostResponse;
import org.library.dto.response.UserResponse;
import org.library.service.PostService;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/post")
public class PostController {
    private final PostService postService;

    @Operation(summary = "Добавление поста")
    @PostMapping
    public PostResponse create(@RequestBody @Valid PostRequest request) {
        return postService.createPost(request);
    }

    @Operation(summary = "Обновление поста")
    @PutMapping("/{id}")
    public PostResponse update(@PathVariable Long id, @RequestBody @Valid PostRequest request) {
        return postService.updatePost(id, request);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        postService.deletePost(id);
    }

    @Operation(summary = "Получение поста по ID")
    @GetMapping("/{id}")
    public PostResponse getById(@PathVariable Long id) {
        return postService.getPostById(id);
    }

    @GetMapping(path = "/{UserId}")
    public PostResponse getByUserId(@PathVariable Integer UserId) {
        return postService.getPostByUserId(UserId);
    }

    @Operation(summary = "Получение списка всех постов")
    @GetMapping
    public Page<PostResponse> getAllPosts(
            @RequestParam(required = false) Long userId,
            @RequestParam(required = false) Long bookId,
            @ParameterObject @PageableDefault(sort = "userId") Pageable pageable) {
        return postService.getAllPosts(pageable);
    }
}
