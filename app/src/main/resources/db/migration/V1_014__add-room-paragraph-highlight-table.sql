CREATE TABLE room_paragraph_highlight (
    room_id BIGINT NOT NULL,
    paragraph_id BIGINT NOT NULL,
    user_id BIGINT NOT NULL,
    color VARCHAR(20) NOT NULL,
    PRIMARY KEY (room_id, paragraph_id, user_id),
    FOREIGN KEY (room_id) REFERENCES chat_room(id) ON DELETE CASCADE,
    FOREIGN KEY (paragraph_id) REFERENCES paragraph(id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES "user"(id) ON DELETE CASCADE
);