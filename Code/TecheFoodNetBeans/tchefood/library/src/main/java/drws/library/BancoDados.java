/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drws.library;

import drws.library.model.Autor;
import drws.library.model.Biblioteca;
import drws.library.model.Leitor;
import drws.library.model.Livro;
import drws.library.model.Loja;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author drws
 */
public class BancoDados {
    private Biblioteca biblioteca;
    private Loja loja;
    private List<Autor> autores;
    private List<Leitor> leitores;
    

    public BancoDados() {
        this.biblioteca = new Biblioteca();
        this.loja = new Loja();
        this.autores = new ArrayList<>();
        this.leitores = new ArrayList<>();
        this.preencherDados();
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public Loja getLoja() {
        return loja;
    }
    
    public List<Autor> getAutores() {
        return autores;
    }
    
    public List<Leitor> getLeitores() {
        return leitores;
    }
    
    public int getIndexAutor(Autor autor) {
        for(int i = 0; i < this.autores.size(); i++) {
            if(this.autores.get(i).getId() == autor.getId()) {
                return i;
            }
        }
        return -1;
    }
    
    public int getIndexAutorPeloCodigo(int codigo) {
        for(int i = 0; i < this.autores.size(); i++) {
            if(this.autores.get(i).getId() == codigo) {
                return i;
            }
        }
        return -1;
    }
    
    public int getIndexLeitorPeloCodigo(int codigo) {
        for(int i = 0; i < this.leitores.size(); i++) {
            if(this.leitores.get(i).getId() == codigo) {
                return i;
            }
        }
        return -1;
    }
    
    private void preencherDados() {
        this.autores.add(new Autor(1, "John Green", "Estados Unidos"));
        this.autores.add(new Autor(2, "Paulo Coelho", "Brasil"));
        this.autores.add(new Autor(3, "J.R.R. Tolkien", "África do Sul"));
        this.autores.add(new Autor(4, "Machado de Assis", "Brasil"));
        this.autores.add(new Autor(5, "Agatha Christie", "Reino Unido"));
        this.autores.add(new Autor(6, "Sir Arthur Conan Doyle", "Reino Unido"));
        
        this.leitores.add(new Leitor(1, "017.740.440-05", "Douglas Rodrigo Werb", "(51) 99253-4507", "douglaswerb@gmail.com", "Rua Thomas Flores, 95 - Ap 202", "São Leopoldo", "RS"));
        
        this.getBiblioteca().cadastrarLivro(new Livro(1, "A Culpa é das Estrelas", "Romance", "2012", "314", this.autores.get(0)));
        this.getBiblioteca().cadastrarLivro(new Livro(2, "O Alquimista", "Romance", "1988", "208",  this.autores.get(1)));
        this.getBiblioteca().cadastrarLivro(new Livro(3, "O Assassinato No Expresso Oriente", "Romance", "1934", "256",  this.autores.get(4)));
        this.getBiblioteca().cadastrarLivro(new Livro(4, "O Alienista", "Ficção", "1882", "80",  this.autores.get(3)));
        this.getBiblioteca().cadastrarLivro(new Livro(1004, "Um Estudo em Vermelho", "Romance", "1888", "152",  this.autores.get(5)));
        this.getBiblioteca().cadastrarLivro(new Livro(1005, "O Hobbit", "Fantasia", "1937", "336",  this.autores.get(2)));
    }
    
    public void cadastrarAutor(Autor autor) {
        this.autores.add(autor);
    }
    
    public void cadastrarLeitor(Leitor leitor) {
        this.leitores.add(leitor);
    }
    
    public List<Autor> filtrarAutores(String nome, String pais) {
        List<Autor> autores = new ArrayList<>();
        
        for(Autor autor : this.autores) {
            if(autor.getName().toLowerCase().contains(nome) && autor.getCountry().toLowerCase().contains(pais)) {
                autores.add(autor);
            }
        }
        return autores;
    }
}
