package org.example;

/**
 Declare the first BOOK class to represent a book with fields: title, author, year of publication, number of pages.
 Define the necessary constructors, setters and getters for writing and reading data (the data must have obvious restrictions on the range of values).
 Declare a second Lib class that will store references to Book books in the form of an array:
    Book[] lib = new Book[MAX_BOOOKS];

 where MAX BOOOK is a constant that determines the maximum number of books.
 Provide the ability to add, delete and display a list of books using methods of the Lib class.
 There should be no direct access from outside to the Lib array.
 */

/**
 Объявить первый класс ВооК для представления книги с полями: название, автор, год издания, число страниц.
 Определить необходимые конструкторы, сеттеры и геттеры для записи и считывания данных (данные должны быть с очевидными ограничениями по диапазону значений).
 Объявить второй класс Lib, который будет хранить ссылки на книги Воок в виде массива:
    Воок [] lib = new Воок[МАХ_ВООКS];

 где МАХ ВООК -— константа, определяющая максимальное число книг.
 Обеспечить возможность добавления,удаления и вывода списка книг посредством методов класса Lib.
 Прямого доступа извне к массиву Lib быть не должно.
 */
public class App 
{
    public static void main( String[] args ) {
        Book book1 = new Book("Анна Каренина", "Лев Толстой", 1885, 445);
        Book book2 = new Book("Дурак", "Лев Толстой", 1887, 357);
        Lib lib1 = new Lib(200);
        lib1.insertBook(book1, 2);//большинство книг будут инициализированы нулом, кроме второй
        lib1.insertBook(book2, 3);
        lib1.deleteBook(2);
        lib1.insertBook(book1, 2);
        lib1.showBooks();
    }
}
