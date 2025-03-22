package org.example.entity;

public class Paragraph {
    private int id;
    private int bookId;
    private int paragraphNumber;
    private String text;

    public Paragraph(int id, int bookId, int paragraphNumber, String text) {
        this.id = id;
        this.bookId = bookId;
        this.paragraphNumber = paragraphNumber;
        this.text = text;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }
    public int getParagraphNumber() { return paragraphNumber; }
    public void setParagraphNumber(int paragraphNumber) { this.paragraphNumber = paragraphNumber; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
}
