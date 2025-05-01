CREATE TABLE note (
    id BIGSERIAL PRIMARY KEY,
    paragraph_id BIGINT NOT NULL,
    user_id BIGINT NOT NULL,
    text TEXT,
    creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (paragraph_id) REFERENCES paragraphs(id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);