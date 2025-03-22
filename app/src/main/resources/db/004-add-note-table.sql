CREATE TABLE note (
    id INT PRIMARY KEY AUTO_INCREMENT,
    paragraph_id INT NOT NULL,
    user_id INT NOT NULL,
    text TEXT,
    creation_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (paragraph_id) REFERENCES paragraphs(id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);