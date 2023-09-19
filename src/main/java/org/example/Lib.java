package org.example;

public class Lib {
    private int MAX_BOOKS; //по условию максимальный размер библиотеки никогда не меняется, поэтому делаем поле приватным и не создаём сеттер
    private Book[] lib;

    public Lib(int MAX_BOOKS) {
        this.MAX_BOOKS = MAX_BOOKS;
        lib = new Book[MAX_BOOKS];
    }//создание пустой библиотеки

    public void insertBook(Book book, int indexBook) {
        lib[indexBook] = book;
    }

    public void deleteBook(int indexBook) {
        lib[indexBook] = null;
    }

    public void showBooks() {
        for (Book book : lib) {
            if (book != null) System.out.println(book);
        }
    }

    public int getMAX_BOOKS() {
        return MAX_BOOKS;
    }

    public Book[] getLib() {
        return lib;
    }

    //    public void pushBook(Book book){
//
//    }

//    public void popBook(){
//
//    }
}
