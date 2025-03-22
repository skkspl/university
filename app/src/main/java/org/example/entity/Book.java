package org.example.entity;

public class Book {
    private int id;
    private String title;
    private String author;
    private String description;
    private String isbn;
    private String coverImage;
    private String content;

    public Book(int id, String title, String author, String description, String isbn, String coverImage, String content) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.isbn = isbn;
        this.coverImage = coverImage;
        this.content = content;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public String getCoverImage() { return coverImage; }
    public void setCoverImage(String coverImage) { this.coverImage = coverImage; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}