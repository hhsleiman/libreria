package com.ac.core.book;

public class BookEntity implements java.io.Serializable{
    public BookEntity(){}
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookEntity books = (BookEntity) o;
        if (bookId != books.bookId) return false;
        if (name != null ? !name.equals(books.name) : books.name != null) return false;
        return true;
    }
    @Override
    public int hashCode() {
        int result = bookId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
    private int bookId;
    private String name;
}