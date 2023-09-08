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
public class Venda {
    private int codigo;
    private String data;
    private Leitor leitor;
    private List<LivroVenda> livros;
    private Double total;

    public Venda(int codigo, String data, Leitor leitor, List<LivroVenda> livros) {
        this.codigo = codigo;
        this.data = data;
        this.leitor = leitor;
        this.livros = livros;
        
        //this.total = total;
    }

    public List<LivroVenda> getLivros() {
        return livros;
    }

    public Double getTotal() {
        return total;
    }
    
   
    /*private void addPrice(LivroVenda livro) {
        this.total += livro.getPrice();
    }*/
}
