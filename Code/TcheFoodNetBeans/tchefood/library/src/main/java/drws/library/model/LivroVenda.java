/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drws.library.model;

/**
 *
 * @author drws
 */
public class LivroVenda extends  Livro {
    private Double preco;
    
    public LivroVenda(int id, String title, String genre, String year, String pages, Autor author, Double preco) {
        super(id, title, genre, year, pages, author);
        this.preco = preco;
    }

    public Double getPrice() {
        return preco;
    }
    
    
    
    
}
