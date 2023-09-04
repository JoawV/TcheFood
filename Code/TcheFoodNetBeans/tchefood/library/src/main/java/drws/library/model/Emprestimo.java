/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drws.library.model;

/**
 *
 * @author drws
 */
public class Emprestimo {
    private int codigo;
    private String data;
    private String devolverAte;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo(int codigo, String data, String devolverAte, Leitor leitor, Livro livro) {
        this.codigo = codigo;
        this.data = data;
        this.devolverAte = devolverAte;
        this.leitor = leitor;
        this.livro = livro;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public Livro getLivro() {
        return livro;
    }
    
    
}
