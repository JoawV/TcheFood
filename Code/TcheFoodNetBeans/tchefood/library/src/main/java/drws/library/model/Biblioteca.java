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
public class Biblioteca {
    private List<Livro> livros;
    private List<Emprestimo> emprestimos;
    private int codigoLivro = 1;
    private int codigoEmprestimo = 1;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return livros;
    }
    
    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    
    public int getCodigoLivro() {
        return this.codigoLivro;
    }
    
    public int getCodigoEmprestimo() {
        return this.codigoEmprestimo;
    }
    
    public int getIndexLivroPeloCodigo(int codigo) {
        for(int i = 0; i < this.livros.size(); i++) {
            if(this.livros.get(i).getId() == codigo) {
                return i;
            }
        }
        return -1;
    }
    
    public int getIndexEmprestimoPeloCodigo(int codigo) {
        for(int i = 0; i < this.emprestimos.size(); i++) {
            if(this.emprestimos.get(i).getCodigo() == codigo) {
                return i;
            }
        }
        return -1;
    }
    
    
    public List<Livro> filtrarLivros(String titulo, String genero, int indexAutor) {
        List<Livro> books = new ArrayList<>();
        
        for(Livro livro : this.livros) {
            if(livro.getTitle().toLowerCase().contains(titulo) && livro.getGenre().toLowerCase().contains(genero)) {
                if(indexAutor == 0 || livro.getAuthor().getId() == indexAutor) {
                    books.add(livro);
                }
            }
        }
        return books;
    }
    
    
    public void cadastrarLivro(Livro livro) {
        this.livros.add(livro);
        this.codigoLivro++;
    }
    
    public void removerLivro(Livro livro) {
        this.livros.remove(livro);
    }
    
    public void cadastrarEmprestimo(Emprestimo emprestimo) {
        this.emprestimos.add(emprestimo);
        codigoEmprestimo++;
    }
    
    public void removerEmprestimo(int indexEmprestimo) {
        this.emprestimos.remove(indexEmprestimo);
    }
    
    public void devolverLivro(Livro livro) {
        this.livros.add(livro);
    }
    
    public void removeEmprestimo(Emprestimo livroEmprestado) {
        for(int i = 0; i < this.emprestimos.size(); i++) {
            if(this.emprestimos.get(i).equals(livroEmprestado)) {
                this.emprestimos.remove(this.emprestimos.get(i));
            }
        }
    }
    
    public void printLivros() {
        for(Livro livro : this.livros) {
            System.out.print(livro.getId());
            System.out.print(" " + livro.getTitle());
            System.out.print(" " + livro.getGenre());
            System.out.print(" " + livro.getYear());
            System.out.print(" " + livro.getPages());
            System.out.println(" " + livro.getAuthor().getName());
        }
    }
}
