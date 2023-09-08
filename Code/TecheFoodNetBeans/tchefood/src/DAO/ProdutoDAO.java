/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.ModelCategoriaProduto;
import Model.ModelProduto;
import infra.ConexaoMYSQL;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author adriano
 */
public class ProdutoDAO {
    
      public static void salvar(ModelProduto produto){
        try {
            ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
            Connection con = conexaoMYSQL.obterConexao();
            PreparedStatement stmt = null;

            stmt = con.prepareStatement("INSERT INTO tb_produto(categoria_produto_id, descricao, preco) VALUES (?, ?, ?)");

            stmt.setInt(1, produto.getCategoriaProdutoId().getId());
            stmt.setString(2, produto.getDescricao());
            stmt.setDouble(3, produto.getPreco());

            stmt.executeUpdate();

            stmt.close();
            con.close();

        } catch (Exception e1){
            throw new RuntimeException(e1);
        }
    }

    public static void atualizar(ModelProduto produto) {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement("UPDATE tb_produto SET categoria_produto_id = ?, descricao = ?, preco = ? WHERE id = ?");

        stmt.setInt(1, produto.getCategoriaProdutoId().getId());
        stmt.setString(2, produto.getDescricao());
        stmt.setDouble(3, produto.getPreco());
        stmt.setInt(4, produto.getId());

        stmt.executeUpdate();

        stmt.close();
        con.close();

        } catch(Exception e2){
            throw new RuntimeException(e2);
        }
    }

    public static void deletar(ModelProduto produto) {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement("DELETE FROM tb_produto WHERE id = ?");

        stmt.setInt(1, produto.getId());

        stmt.executeUpdate();

        stmt.close();
        con.close();

        } catch(Exception e3){
            throw new RuntimeException(e3);
        }
    }


    public static ArrayList<ModelProduto> consultar() {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement("SELECT id, categoria_produto_id, descricao, preco FROM tb_produto");

        ResultSet rs = stmt.executeQuery();

        ArrayList<ModelProduto> produto = new ArrayList<>();

        while(rs.next()){
            ModelProduto modelProduto = new ModelProduto();

            modelProduto.setId(rs.getInt("id"));
            modelProduto.setDescricao(rs.getString("descricao"));
            modelProduto.setPreco(rs.getDouble("preco"));

            ModelCategoriaProduto categoriaProduto = new ModelCategoriaProduto();
            categoriaProduto.setId(rs.getInt("categoria_produto_id"));

            modelProduto.setCategoriaProdutoId(categoriaProduto);


            produto.add(modelProduto);
        }

        return produto;

        } catch(Exception e4){
            throw new RuntimeException(e4);
        }
    }


    public static boolean isIdValido(ModelProduto produto) {
        try {
        ConexaoMYSQL conexaoMsql = new ConexaoMYSQL();
        Connection con = conexaoMsql.obterConexao();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement("SELECT id FROM tb_produto WHERE id = ?");

        stmt.setInt(1, produto.getId());
        ResultSet rs = stmt.executeQuery();

        boolean idExist = rs.next();

        return idExist;

        } catch(Exception e5){
            throw new RuntimeException(e5);
        }
    }

    public static int getProdutoPorId(int produtoId) {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int categoria = -1;

        stmt = con.prepareStatement("SELECT id FROM tb_produto WHERE id = ?");
        stmt.setInt(1, produtoId);
        rs = stmt.executeQuery();

        if (rs.next()) {
            categoria = rs.getInt("id");
        }

        return categoria;

        } catch(Exception e6){
            throw new RuntimeException(e6);
        }
    }
    
}
