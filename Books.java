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
        private String number_pages;

public Books(String Title, String Author, String average_rating, String number_pages)
{
this.Title = Title;
this.Author=Author;
this.average_rating=average_rating;
this.number_pages=number_pages;
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
