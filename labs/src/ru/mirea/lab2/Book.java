package ru.mirea.lab2;

public class Book {
    private String author;
    private String title;
    private int pub_year;

    public String getAuthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public int getPubYear(){
        return this.pub_year;
    }

    public void setAuthor(String word){
        this.author = word;
    }
    public void setTitle(String word){
        this.title = word;
    }
    public void setPubYear(int number){
        this.pub_year = number;
    }

    public String toString(){
        return "A book by " + this.author + ", " + this.title
                + " released in " + this.pub_year;
    }

    public static Boolean compareTwo(Book a, Book b){
        return a.getPubYear() > b.getPubYear();
    }

    public int compareTo(Book o2) {
        return Integer.compare(this.getPubYear(), o2.getPubYear());
    }
}
