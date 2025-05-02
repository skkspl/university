package org.library.service;

import lombok.RequiredArgsConstructor;
import org.library.dto.request.BookRequest;
import org.library.dto.response.BookResponse;
import org.library.mapper.BookMapper;
import org.library.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final UserRepository BookRepository;
    private final UserMapper BookMapper;

    public UserResponse createBook(BookRequest request){
        var book = BookMapper.toEntity(request);
        var savedBook = BookRepository.save(book);
        return bookMapper.toResponse(savedBook);
    }

    public BookResponse getBookByTitle(String title) {
        return BookRepository.findByTitle(title).map(bookMapper::toResponse).orElseThrow();
    }
}
