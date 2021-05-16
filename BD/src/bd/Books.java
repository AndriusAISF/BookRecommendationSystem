/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

/**
 *
 * @author Andrius
 */
public class Books {
        private String Title, Author;
        private String average_rating;
        private String number_pages, book_ID;

public Books(String Title, String Author, String average_rating, String number_pages, String book_ID)
{
this.Title = Title;
this.Author=Author;
this.average_rating=average_rating;
this.number_pages=number_pages;
this.book_ID=book_ID;
}

    public String getBook_ID() {
        return book_ID;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getAverage_rating() {
        return average_rating;
    }

    public String getNumber_pages() {
        return number_pages;
    }
}
