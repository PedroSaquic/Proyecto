/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbiblioteca;

/**
 *
 * @author pedro
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int año;
    private String editorial;

    public Libro(String isbn, String titulo, String autor, int año, String editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public static Libro agregarL(String isbn, String titulo, String autor, int año, String editorial) {
        return new Libro(isbn, titulo, autor, año, editorial);
    }

    @Override
    public String toString() {
        return "\nISBN: " + isbn + 
               "\nTítulo: " + titulo + 
               "\nAutor: " + autor + 
               "\nAño: " + año + 
               "\nEditorial: " + editorial + "\n";
    }
    
}
