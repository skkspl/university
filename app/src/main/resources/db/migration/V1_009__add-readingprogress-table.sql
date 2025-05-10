CREATE TABLE reading_progress (
    user_id BIGINT NOT NULL,
    book_id BIGINT NOT NULL,
    current_page INT NOT NULL,
    PRIMARY KEY (user_id, book_id),
    FOREIGN KEY (user_id) REFERENCES "user"(id) ON DELETE CASCADE,
    FOREIGN KEY (book_id) REFERENCES book(id) ON DELETE CASCADE
);