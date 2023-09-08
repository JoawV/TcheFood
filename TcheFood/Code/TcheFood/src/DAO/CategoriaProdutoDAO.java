package DAO;
import Infra.ConexaoMYSQL;
import Model.ModelCategoriaProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoriaProdutoDAO {
    public static void salvar(ModelCategoriaProduto categoriaProduto) {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement("INSERT INTO tb_categoria_produto(descricao) VALUES (?)");

        stmt.setString(1, categoriaProduto.getDescricao());

        stmt.executeUpdate();

        stmt.close();
        con.close();

        } catch(Exception e1){
            throw new RuntimeException(e1);
        }
    }

    public static void atualizar(ModelCategoriaProduto categoriaProduto) {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement("UPDATE tb_categoria_produto SET descricao = ? WHERE id = ?");

        stmt.setString(1, categoriaProduto.getDescricao());
        stmt.setInt(2, categoriaProduto.getId());

        stmt.executeUpdate();

        stmt.close();
        con.close();

        } catch(Exception e2){
            throw new RuntimeException(e2);
        }
    }

    public static void deletar(ModelCategoriaProduto categoriaProduto) {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement("DELETE FROM tb_categoria_produto WHERE id = ?");

        stmt.setInt(1, categoriaProduto.getId());

        stmt.executeUpdate();

        stmt.close();
        con.close();

        } catch(Exception e3){
            throw new RuntimeException(e3);
        }
    }

    public static ArrayList<ModelCategoriaProduto> consultar() {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement("SELECT id, descricao FROM tb_categoria_produto");

        ResultSet rs = stmt.executeQuery();

        ArrayList<ModelCategoriaProduto> categoriaProduto = new ArrayList<>();

        while(rs.next()){
            ModelCategoriaProduto modelCategoriaProduto = new ModelCategoriaProduto();

            modelCategoriaProduto.setId(rs.getInt("id"));
            modelCategoriaProduto.setDescricao(rs.getString("descricao"));

            categoriaProduto.add(modelCategoriaProduto);
        }
        return categoriaProduto;

        } catch(Exception e4){
            throw new RuntimeException(e4);
        }
    }

    public static boolean isIdValido(ModelCategoriaProduto categoriaProduto) {
        try {
        ConexaoMYSQL conexaoMsql = new ConexaoMYSQL();
        Connection con = conexaoMsql.obterConexao();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement("SELECT id FROM tb_categoria_produto WHERE id = ?");

        stmt.setInt(1, categoriaProduto.getId());
        ResultSet rs = stmt.executeQuery();

        boolean idExist = rs.next();

        return idExist;

        } catch(Exception e5){
            throw new RuntimeException(e5);
        }
    }

    public static int getCategoriaPorId(int clienteId) {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int categoria = -1;

        stmt = con.prepareStatement("SELECT id FROM tb_categoria_produto WHERE id = ?");
        stmt.setInt(1, clienteId);
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
