CREATE TABLE paragraph (
    id BIGSERIAL PRIMARY KEY,
    book_id BIGINT NOT NULL,
    paragraph_number INT NOT NULL,
    text TEXT,
    FOREIGN KEY (book_id) REFERENCES book(id) ON DELETE CASCADE
);