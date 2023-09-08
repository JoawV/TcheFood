package DAO;

import Infra.ConexaoMYSQL;
import Model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ItensPedidoDAO {

    public static void salvar(ModelItensPedido item) {
        try {
            ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
            Connection con = conexaoMYSQL.obterConexao();
            PreparedStatement stmt = null;

            stmt = con.prepareStatement("INSERT INTO tb_itens_pedido(pedido_id, produto_id, quantidade, status_item) VALUES (?, ?, ?, ?)");

            stmt.setInt(1, item.getPedidoId().getId());
            stmt.setInt(2, item.getProdutoId().getId());
            stmt.setInt(3, item.getQuantidade());
            stmt.setInt(4, item.getStatusItem());

            stmt.executeUpdate();

            stmt.close();
            con.close();

        } catch(Exception e1){
            throw new RuntimeException(e1);
        }

    }

    public static void atualizar(ModelItensPedido item) {
        try {
            ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
            Connection con = conexaoMYSQL.obterConexao();
            PreparedStatement stmt = null;

            stmt = con.prepareStatement("UPDATE tb_itens_pedido SET pedido_id = ? produto_id = ?, quantidade = ?, status_item = ? WHERE id = ?");

            stmt.setInt(1, item.getPedidoId().getId());
            stmt.setInt(2, item.getProdutoId().getId());
            stmt.setInt(3, item.getQuantidade());
            stmt.setInt(4, item.getStatusItem());
            stmt.setInt(5, item.getId());

            stmt.executeUpdate();

            stmt.close();
            con.close();

        } catch(Exception e1){
            throw new RuntimeException(e1);
        }
    }

    public static void deletar(ModelItensPedido item) {
        try {
            ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
            Connection con = conexaoMYSQL.obterConexao();
            PreparedStatement stmt = null;

            stmt = con.prepareStatement("DELETE FROM tb_itens_pedido WHERE id = ?");

            stmt.setInt(1, item.getId());

            stmt.executeUpdate();

            stmt.close();
            con.close();

        } catch (Exception e3){
            throw new RuntimeException(e3);
        }
    }


    public static ArrayList<ModelItensPedido> consultar() {
        try {
            ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
            Connection con = conexaoMYSQL.obterConexao();
            PreparedStatement stmt = null;

            stmt = con.prepareStatement("SELECT id, pedido_id, produto_id, quantidade, status_item FROM tb_itens_pedido");

            ResultSet rs = stmt.executeQuery();

            ArrayList<ModelItensPedido> modelItensPedido = new ArrayList<>();

            while (rs.next()) {
                ModelItensPedido item = new ModelItensPedido();

                item.setId(rs.getInt("id"));
                item.setQuantidade(rs.getInt("quantidade"));
                item.setStatusItem(rs.getInt("status_item"));

                ModelPedido pedidoId = new ModelPedido();
                pedidoId.setId(rs.getInt("pedido_id"));
                item.setPedidoId(pedidoId);

                ModelProduto produtoId = new ModelProduto();
                produtoId.setId(rs.getInt("produto_id"));
                item.setProdutoId(produtoId);

                modelItensPedido.add(item);

            }
            return modelItensPedido;

        } catch (Exception e4){
            throw new RuntimeException(e4);
        }
    }


    public static boolean isIdValido(ModelItensPedido item) {
        try {
            ConexaoMYSQL conexaoMsql = new ConexaoMYSQL();
            Connection con = conexaoMsql.obterConexao();
            PreparedStatement stmt = null;

            stmt = con.prepareStatement("SELECT id FROM tb_itens_pedido WHERE id = ?");

            stmt.setInt(1, item.getId());
            ResultSet rs = stmt.executeQuery();

            boolean idExist = rs.next();

            return idExist;

        } catch (Exception e5){
            throw new RuntimeException(e5);
        }
    }
}
