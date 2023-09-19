package org.example;

import java.time.LocalDate;

public class Book {
    private String name;
    private String author;
    private int ageOfPublishing;
    private int countPages;

    public Book(String name, String author, int ageOfPublishing, int countPages) {
        this.name = name;
        this.author = author;
        if (checkAgeOfPublishing(ageOfPublishing))
            this.ageOfPublishing = ageOfPublishing;
        if (checkCountPages(countPages))
            this.countPages = countPages;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAutor(String author) {
        this.author = author;
    }

    public int getAgeOfPublishing() {
        return ageOfPublishing;
    }

    public void setAgeOfPublishing(int ageOfPublishing) {
        this.ageOfPublishing = ageOfPublishing;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    @Override
    public String toString() {
        return name;
    }

    private boolean checkCountPages(int countPages) {
        return countPages >= 0;
    }//необходимо для того, чтобы можно было нормально присваивать значения


    private boolean checkAgeOfPublishing(int ageOfPublishing) {
        return -2000 <= ageOfPublishing && ageOfPublishing <= LocalDate.now().getYear();
    }
}