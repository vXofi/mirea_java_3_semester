package ru.mirea.lab2;

import java.util.*;

public class BookShelf {
    private final List<Book> books = new ArrayList<Book>();
    private int nBooks = 0;

    int early_i = 0;
    int late_i = 0;

    public void addBook(Book sample){
        books.add(sample);
        nBooks += 1;
        if(nBooks != 1){
            //early
            if(sample.getPubYear() < books.get(early_i).getPubYear()){
                early_i = books.indexOf(sample);
            }
            //late
            if(sample.getPubYear() > books.get(late_i).getPubYear()){
                late_i = books.indexOf(sample);
            }
        }
    }
    public Book getEarly(){
        return books.get(early_i);
    }
    public Book getLate(){
        return books.get(late_i);
    }
    public Book getByi(int i) {
        if (i < this.nBooks && i > -1){
        return books.get(i);
        } else{
            System.out.println("ошибка: запрос некорректного индекса книги");
            return null;
        }
    }
    public int getnBooks(){ return this.nBooks;}
    public void SortShelf(){
        books.sort(Book::compareTo);
        early_i = 0;
        late_i = nBooks-1;
    }
}
