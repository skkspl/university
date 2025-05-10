CREATE TABLE chat_room (
    id BIGSERIAL PRIMARY KEY,
    book_id BIGINT NOT NULL,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    creator_id BIGINT NOT NULL,
    FOREIGN KEY (book_id) REFERENCES book(id) ON DELETE CASCADE,
    FOREIGN KEY (creator_id) REFERENCES "user"(id) ON DELETE CASCADE
);