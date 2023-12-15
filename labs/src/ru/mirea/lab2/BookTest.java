package ru.mirea.lab2;

import java.util.Scanner;

public class BookTest {
    //class book//
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);
        BookShelf books = new BookShelf();
        int input;
        while(true){
            System.out.println("""
                    Введите:\s
                     0 для добавления новой книги\s
                     1 для вывода книг на полке\s
                     2 для сортировки книг на полке
                     -1 для выхода из программы""");
            while(!ex.hasNextInt()){
                System.out.println("На вход принимаются числа типа Integer");
                ex.next();
            }
            input = ex.nextInt();
            ex.nextLine();
            switch (input){
                case (-1):
                    break;
                case (0):
                    boolean error = false;
                    Book temp = new Book();
                    //author
                    System.out.println("Введите автора книги");
                    temp.setAuthor(ex.nextLine());
                    //title
                    System.out.println("Введите название книги");
                    temp.setTitle(ex.nextLine());
                    //date
                    System.out.println("Введите год написания книги");
                    while(!ex.hasNextInt()){
                        System.out.println("Вводимая дата должна быть числом типа Integer");
                        ex.next();
                    }
                    temp.setPubYear(ex.nextInt());
                    books.addBook(temp);
                    continue;
                case (1):
                    for (int i = 0; i < books.getnBooks(); i++){
                        // doesnt work
                        System.out.println(books.getByi(i));
                    }
                    continue;
                case (2):
                    //dk if works
                    books.SortShelf();
                    continue;
                default:
                    System.out.println("Неверный код ввода");
                    continue;

            }
            break;
        }
    }
}
