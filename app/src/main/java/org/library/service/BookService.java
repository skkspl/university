package org.library.service;

import lombok.RequiredArgsConstructor;
import org.library.dto.request.BookRequest;
import org.library.dto.response.BookResponse;
import org.library.entity.Book;
import org.library.mapper.BookMapper;
import org.library.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.stream.StreamSupport;
import java.util.stream.Collectors;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookResponse createBook(BookRequest request) {
        var book = bookMapper.toEntity(request);
        var savedBook = bookRepository.save(book);
        return bookMapper.toResponse(savedBook);
    }

    public BookResponse getBookByTitle(String title) {
        return bookRepository.findByTitle(title)
                .map(bookMapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public BookResponse updateBook(Long id, BookRequest request) {
        var existingBook = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        // Метод updateEntityFromDto должен обновлять поля существующей книги (existingBook) на основе данных из request.
        // Если такого метода нет в вашем маппере, его необходимо добавить.
        bookMapper.updateEntityFromDto(existingBook, request);
        var updatedBook = bookRepository.save(existingBook);
        return bookMapper.toResponse(updatedBook);
    }

    public BookResponse getBookById(Long id) {
        var book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        return bookMapper.toResponse(book);
    }

    public List<BookResponse> getAllBooks() {
        Iterable<Book> books = bookRepository.findAll();
        return StreamSupport.stream(books.spliterator(), false)
                .map(bookMapper::toResponse)
                .collect(Collectors.toList());
    }

}
