CREATE TABLE chat_room (
    id INT PRIMARY KEY AUTO_INCREMENT,
    book_id INT NOT NULL,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    creator_id INT NOT NULL,
    FOREIGN KEY (book_id) REFERENCES books(id) ON DELETE CASCADE,
    FOREIGN KEY (creator_id) REFERENCES users(id) ON DELETE CASCADE
);