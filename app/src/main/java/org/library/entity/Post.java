package org.library.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Post {
    @Id
    private Long id;
    private Integer userId;
    private Integer bookId;
    private String text;
    private String creationDate;
}
