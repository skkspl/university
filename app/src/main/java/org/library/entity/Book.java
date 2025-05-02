package org.library.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Book {
    @Id
    private Long id;
    private String title;
    private String author;
    private String description;
    private String isbn;
    private String coverImage;
    private String content;
}
