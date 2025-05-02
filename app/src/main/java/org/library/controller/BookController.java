package org.library.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.library.dto.request.BookRequest;
import org.library.dto.response.BookResponse;
import org.library.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2/book")
public class BookController {
    private final BookService BookService;

    @Operation(summary = "Добавление книги")
    @PostMapping
    public BookResponse create(@RequestBody BookRequest request){
        return userService.createBook(request);
    }

    @GetMapping(path = "/{title}")
    public BookResponse getByTitle(@PathVariable String title){
        return BookService.getBookByTitle(title);
    }
}
