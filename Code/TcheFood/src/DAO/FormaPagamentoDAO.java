package DAO;

import Infra.ConexaoMYSQL;
import Model.ModelCategoriaProduto;
import Model.ModelFormaPagamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FormaPagamentoDAO {

    public static void salvar(ModelFormaPagamento pagamento) {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement("INSERT INTO tb_forma_pagamento(descricao) VALUES (?)");

        stmt.setString(1, pagamento.getDescricao());

        stmt.executeUpdate();

        stmt.close();
        con.close();

        } catch(Exception e1){
            throw new RuntimeException(e1);
        }
    }

    public static void atualizar(ModelFormaPagamento pagamento) {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement("UPDATE tb_forma_pagamento SET descricao = ? WHERE id = ?");

        stmt.setString(1, pagamento.getDescricao());
        stmt.setInt(2, pagamento.getId());

        stmt.executeUpdate();

        stmt.close();
        con.close();

        } catch(Exception e2){
            throw new RuntimeException(e2);
        }
    }

    public static void deletar(ModelFormaPagamento pagamento) {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement("DELETE FROM tb_forma_pagamento WHERE id = ?");

        stmt.setInt(1, pagamento.getId());

        stmt.executeUpdate();

        stmt.close();
        con.close();

        } catch(Exception e3){
            throw new RuntimeException(e3);
        }
    }

    public static ArrayList<ModelFormaPagamento> consultar() {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement("SELECT id, descricao FROM tb_forma_pagamento");

        ResultSet rs = stmt.executeQuery();

        ArrayList<ModelFormaPagamento> formaPagamento = new ArrayList<>();

        while(rs.next()){
            ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();

            modelFormaPagamento.setId(rs.getInt("id"));
            modelFormaPagamento.setDescricao(rs.getString("descricao"));

            formaPagamento.add(modelFormaPagamento);
        }
        return formaPagamento;

        } catch(Exception e4){
            throw new RuntimeException(e4);
        }
    }

    public static boolean isIdValido(ModelFormaPagamento pagamento) {
        try {
        ConexaoMYSQL conexaoMsql = new ConexaoMYSQL();
        Connection con = conexaoMsql.obterConexao();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement("SELECT id FROM tb_forma_pagamento WHERE id = ?");

        stmt.setInt(1, pagamento.getId());
        ResultSet rs = stmt.executeQuery();

        boolean idExist = rs.next();

        return idExist;

        } catch(Exception e5){
            throw new RuntimeException(e5);
        }
    }


    public static int getFormaPagamentoId(int formaPagamentoId) {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int categoria = -1;

        stmt = con.prepareStatement("SELECT id FROM tb_forma_pagamento WHERE id = ?");
        stmt.setInt(1, formaPagamentoId);
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
