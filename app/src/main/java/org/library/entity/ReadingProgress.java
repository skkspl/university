package org.library.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReadingProgress {
    private int userId;
    private int bookId;
    private int currentPage;
}