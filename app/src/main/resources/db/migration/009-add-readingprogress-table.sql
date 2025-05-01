CREATE TABLE reading_progress (
    user_id BIGINT NOT NULL,
    book_id BIGINT NOT NULL,
    current_page INT NOT NULL,
    PRIMARY KEY (user_id, book_id),
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    FOREIGN KEY (book_id) REFERENCES books(id) ON DELETE CASCADE
);