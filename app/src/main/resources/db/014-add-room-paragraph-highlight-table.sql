CREATE TABLE room_paragraph_highlight (
    room_id INT NOT NULL,
    paragraph_id INT NOT NULL,
    user_id INT NOT NULL,
    color VARCHAR(20) NOT NULL,
    PRIMARY KEY (room_id, paragraph_id, user_id),
    FOREIGN KEY (room_id) REFERENCES chat_rooms(id) ON DELETE CASCADE,
    FOREIGN KEY (paragraph_id) REFERENCES paragraphs(id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);