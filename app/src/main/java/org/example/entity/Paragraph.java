package org.example.entity;

public class Paragraph {
    private Integer id;
    private Integer bookId;
    private Integer paragraphNumber;
    private String text;

    public Paragraph() {
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
