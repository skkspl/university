package org.example.entity;

public class BookFavorite {
    private int userId;
    private int bookId;

    public BookFavorite(int userId, int bookId) {
        this.userId = userId;
        this.bookId = bookId;
    }

    // Getters and Setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }
}
