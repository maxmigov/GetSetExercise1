package com;

public class Book implements ThingInterface{    //answer below!
    private Integer pages;
    private String title;
    private String authorName;
    private Integer publishingYear;
    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Integer publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Book(Integer pages, String title, String authorName, Integer publishingYear) {
        this.pages = pages;
        this.title = title;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public Book(){

    }

    @Override
    public String toString() {
        return "Book { " +
                "pages = " + pages +
                ", title = '" + title + '\'' +
                ", authorName = '" + authorName + '\'' +
                ", publishingYear = " + publishingYear +
                '}';
    }

    /** public static void main(String[] args) {
        Book oneBook = new Book(100,"1984", "George Orwell", 1948);
        Book anotherBook = new Book(20000000, "War and peace", "Leo Tolstoy", 1869);
        oneBook.title = anotherBook.title;
        System.out.println(oneBook.title);
    }
     */
    /** с модификатором private у нас есть доступ для переменных только в нашем классе
     */

}
