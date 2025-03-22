CREATE TABLE paragraph (
    id INT PRIMARY KEY AUTO_INCREMENT,
    book_id INT NOT NULL,
    paragraph_number INT NOT NULL,
    text TEXT,
    FOREIGN KEY (book_id) REFERENCES books(id) ON DELETE CASCADE
);