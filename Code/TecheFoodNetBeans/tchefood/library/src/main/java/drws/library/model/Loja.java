/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drws.library.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author drws
 */
public class Loja {
    private List<LivroVenda> livros;
    private List<Venda> vendas;
    private int codigoLivro = 1;

    public Loja() {
        this.livros = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    public List<LivroVenda> getLivros() {
        return this.livros;
    }

    public List<Venda> getVendas() {
        return vendas;
    }
    
    public int getCodigoLivro() {
        return this.codigoLivro;
    }
        
    public void cadastrarLivro(LivroVenda livro) {
        this.livros.add(livro);
        this.codigoLivro++;
    }
    
    public void devolverLivro(LivroVenda livro) {
        this.livros.add(livro);
    }
    
    public int getIndexLivroPeloCodigo(int codigo) {
        for(int i = 0; i < this.livros.size(); i++) {
            if(this.livros.get(i).getId() == codigo) {
                return i;
            }
        }
        return -1;
    }
    
    public List<LivroVenda> filtrarLivros(String titulo, String genero, int indexAutor) {
        List<LivroVenda> books = new ArrayList<>();
        
        for(LivroVenda livro : this.livros) {
            if(livro.getTitle().toLowerCase().contains(titulo) && livro.getGenre().toLowerCase().contains(genero)) {
                if(indexAutor == 0 || livro.getAuthor().getId() == indexAutor) {
                    books.add(livro);
                }
            }
        }
        return books;
    }
    
    public void cadastrarVenda(Venda venda) {
        this.vendas.add(venda);
    }
    
    public void removerLivro(LivroVenda livro) {
        this.livros.remove(livro);
    }
    
}
