/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drws.library.model;

/**
 *
 * @author drws
 */
public class Livro {
    private int id;
    private String title;
    private String genre;
    private String year;
    private String pages;
    private Autor author;

    public Livro(int id, String title, String genre, String year, String pages, Autor author) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.pages = pages;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getYear() {
        return year;
    }

    public String getPages() {
        return pages;
    }

    public Autor getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public void setAuthor(Autor author) {
        this.author = author;
    }
    
    
    
}
