package org.library.entity;

public class ReadingProgress {
    private int userId;
    private int bookId;
    private int currentPage;

    public ReadingProgress(int userId, int bookId, int currentPage) {
        this.userId = userId;
        this.bookId = bookId;
        this.currentPage = currentPage;
    }

    // Getters and Setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }
    public int getCurrentPage() { return currentPage; }
    public void setCurrentPage(int currentPage) { this.currentPage = currentPage; }
}