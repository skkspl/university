package org.library.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.library.dto.request.BookRequest;
import org.library.dto.response.BookResponse;
import org.library.dto.response.UserResponse;
import org.library.service.BookService;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/book")
public class BookController {
    private final BookService bookService;

    @Operation(summary = "Добавление книги")
    @PostMapping
    public BookResponse create(@RequestBody @Valid BookRequest request) {
        return bookService.createBook(request);
    }

    @Operation(summary = "Обновление книги")
    @PutMapping("/{id}")
    public BookResponse update(@PathVariable Long id, @RequestBody @Valid BookRequest request) {
        return bookService.updateBook(id, request);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

    @Operation(summary = "Получение книги по ID")
    @GetMapping("/{id}")
    public BookResponse getById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @Operation(summary = "Получение книги по названию")
    @GetMapping("/title/{title}")
    public BookResponse getByTitle(@PathVariable String title) {
        return bookService.getBookByTitle(title);
    }

    @Operation(summary = "Получение списка всех книг")
    @GetMapping
    public List<BookResponse> getAllBooks(@ParameterObject @PageableDefault(sort = "title") Pageable pageable) {
        return bookService.getAllBooks();
    }
}
