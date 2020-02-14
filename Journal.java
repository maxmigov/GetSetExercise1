package com;

public class Journal implements ThingInterface{
    private Integer pages;
    private String title;
    private String category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Journal(Integer pages, String title, String category) {
        this.pages = pages;
        this.title = title;
        this.category = category;
    }

    public Journal(){

    }

    @Override
    public String toString() {
        return "Journal { " +
                "pages = " + pages +
                ", title = '" + title + '\'' +
                ", category = '" + category + '\'' +
                '}';
    }

}
