package DAO;
import Infra.ConexaoMYSQL;
import Model.ModelUsuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {
    public static void salvar(ModelUsuario user) {
        try {
        ConexaoMYSQL conexaoMysql = new ConexaoMYSQL();
        Connection con = conexaoMysql.obterConexao();
        PreparedStatement ps = null;

        ps = con.prepareStatement
                ("INSERT INTO tb_usuario(nome, email,senha,papel,telefone) VALUES (?, ?, ?, ?,?)");

        ps.setString(1, user.getNome());
        ps.setString(2, user.getEmail());
        ps.setString(3, user.getSenha());
        ps.setString(4, user.getPapel());
        ps.setString(5, user.getTelefone());


        ps.executeUpdate();

        ps.close();
        con.close();

        } catch(Exception e1){
            throw new RuntimeException(e1);
        }
    }



    public static void deletar(ModelUsuario user) throws SQLException, ClassNotFoundException {

        ConexaoMYSQL conexaoMysql = new ConexaoMYSQL();
        Connection con = conexaoMysql.obterConexao();
        PreparedStatement ps = null;

        ps = con.prepareStatement("DELETE FROM tb_usuario WHERE id = ?");

        ps.setInt(1, user.getId());

        ps.executeUpdate();

        ps.close();
        con.close();

    }


    public static ArrayList<ModelUsuario> consultar(String nome) throws SQLException, ClassNotFoundException {

        ConexaoMYSQL conexaoMysql = new ConexaoMYSQL();
        Connection con = conexaoMysql.obterConexao();
        PreparedStatement ps = null;
        String sql = null;

        if(nome.isEmpty()){
            sql = "SELECT id, nome, email, senha, papel, telefone,data_criacao,data_atualizacao FROM tb_usuario";
            ps = con.prepareStatement(sql);
        }else{
            sql = "SELECT id, nome, email, senha, papel, telefone,data_criacao,data_atualizacao FROM tb_usuario where nome like ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, nome);
        }


        ResultSet rs = ps.executeQuery();

        ArrayList<ModelUsuario> usuarioList = new ArrayList<>();

        while(rs.next()){
            ModelUsuario modelUsuario = new ModelUsuario();

            modelUsuario.setId(rs.getInt("id"));
            modelUsuario.setNome(rs.getString("nome"));
            modelUsuario.setEmail(rs.getString("email"));
            modelUsuario.setSenha(rs.getString("senha"));
            modelUsuario.setPapel(rs.getString("papel"));
            modelUsuario.setTelefone(rs.getString("telefone"));
            modelUsuario.setDataCriacao(rs.getTimestamp("data_criacao"));
            modelUsuario.setDataAtualizacao(rs.getTimestamp("data_atualizacao"));

            usuarioList.add(modelUsuario);
        }

        return usuarioList;


    }

    public static boolean isIdValido(int id) throws SQLException, ClassNotFoundException {

        ConexaoMYSQL conexaoMsql = new ConexaoMYSQL();
        Connection con = conexaoMsql.obterConexao();
        PreparedStatement ps = null;

        ps = con.prepareStatement("SELECT id FROM tb_usuario WHERE id = ?");

        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        boolean idExist = rs.next();


        return idExist;

    }

    public static String nomeUsuario(int id) throws SQLException, ClassNotFoundException {

        ConexaoMYSQL conexaoMsql = new ConexaoMYSQL();
        Connection con = conexaoMsql.obterConexao();
        PreparedStatement ps = null;
        String nome = null;

        ps = con.prepareStatement("SELECT nome FROM tb_usuario WHERE id = ?");

        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
            if(rs.next()){
                nome = rs.getString("nome");
            }

            return nome;


    }

//    public static boolean isEmailValido(ModelUsuario user) {
//        try {
//            ConexaoMYSQL conexaoMsql = new ConexaoMYSQL();
//            Connection con = conexaoMsql.obterConexao();
//            PreparedStatement stmt = null;
//
//            stmt = con.prepareStatement("SELECT email FROM tb_usuario WHERE email = ?");
//
//            stmt.setString(1, user.getEmail());
//            ResultSet rs = stmt.executeQuery();
//
//            boolean emailExists = rs.next();
//
//            return emailExists;
//
//        } catch(Exception e6){
//            throw new RuntimeException(e6);
//        }
//    }


    public static int getUsuarioPorId(int usuarioId) {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int categoria = -1;

        stmt = con.prepareStatement("SELECT nome FROM tb_usuario WHERE id = ?");
        stmt.setInt(1, usuarioId);
        rs = stmt.executeQuery();

        if (rs.next()) {
            categoria = rs.getInt("id");
        }

        return categoria;

        } catch(Exception e7){
            throw new RuntimeException(e7);
        }
    }

    public static void update(ModelUsuario ad) throws SQLException, ClassNotFoundException {
        ConexaoMYSQL conexaoMysql = new ConexaoMYSQL();
        Connection con = conexaoMysql.obterConexao();
        PreparedStatement ps = null;

        ps = con.prepareStatement("UPDATE tb_usuario SET nome = ?, email = ?, senha = ?, papel = ?,telefone = ? WHERE id = ?");
        ps.setString(1, ad.getNome());
        ps.setString(2, ad.getEmail());
        ps.setString(3, ad.getSenha());
        ps.setString(4, ad.getPapel());
        ps.setString(5, ad.getTelefone());
        ps.setInt(6, ad.getId());

        ps.executeUpdate();
        System.out.println("Registro alterado com sucesso.");


    }

}
