package DAO;
import Infra.ConexaoMYSQL;
import Model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PedidoDAO {

    public static void salvar(ModelPedido pedido) {
        try {
            ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
            Connection con = conexaoMYSQL.obterConexao();
            PreparedStatement stmt = null;

            stmt = con.prepareStatement("INSERT INTO tb_pedido(usuario_id, forma_pagamento_id, data_hora, status_pagamento, status_pedido, total) VALUES (?, ?, ?, ?, ?, ?)");

            stmt.setInt(1, pedido.getUsuarioId().getId());
            stmt.setInt(2, pedido.getFormaPagamentoId().getId());
            stmt.setDate(3, pedido.getDataHora());
            stmt.setInt(4, pedido.getStatusPagamento());
            stmt.setInt(5, pedido.getStatusPedido());
            stmt.setDouble(6, pedido.getTotal());

            stmt.executeUpdate();

            stmt.close();
            con.close();

        } catch(Exception e1){
            throw new RuntimeException(e1);
        }
    }

    public static void atualizar(ModelPedido pedido) {
        try {
            ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
            Connection con = conexaoMYSQL.obterConexao();
            PreparedStatement stmt = null;

            stmt = con.prepareStatement("UPDATE tb_pedido SET usuario_id = ?, forma_pagamento_id = ?, data_hora = ?, status_pagamento = ?, status_pedido = ?, total = ? WHERE id = ?");

            stmt.setInt(1, pedido.getUsuarioId().getId());
            stmt.setInt(2, pedido.getFormaPagamentoId().getId());
            stmt.setDate(3, pedido.getDataHora());
            stmt.setInt(4, pedido.getStatusPagamento());
            stmt.setInt(5, pedido.getStatusPedido());
            stmt.setDouble(6, pedido.getTotal());
            stmt.setInt(7, pedido.getId());

            stmt.executeUpdate();

            stmt.close();
            con.close();

        } catch(Exception e1){
            throw new RuntimeException(e1);
        }
    }

    public static void deletar(ModelPedido pedido) {
        try {
            ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
            Connection con = conexaoMYSQL.obterConexao();
            PreparedStatement stmt = null;

            stmt = con.prepareStatement("DELETE FROM tb_pedido WHERE id = ?");

            stmt.setInt(1, pedido.getId());

            stmt.executeUpdate();

            stmt.close();
            con.close();

        } catch (Exception e3){
            throw new RuntimeException(e3);
        }
    }


    public static ArrayList<ModelPedido> consultar() {
        try {
            ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
            Connection con = conexaoMYSQL.obterConexao();
            PreparedStatement stmt = null;

            stmt = con.prepareStatement("SELECT id, usuario_id, forma_pagamento_id, data_hora, status_pagamento, status_pedido, total FROM tb_pedido");

            ResultSet rs = stmt.executeQuery();

            ArrayList<ModelPedido> modelPedido = new ArrayList<>();

            while (rs.next()) {
                ModelPedido pedido = new ModelPedido();

                pedido.setId(rs.getInt("id"));
                pedido.setDataHora(rs.getDate("data_hora"));
                pedido.setStatusPagamento(rs.getInt("status_pagamento"));
                pedido.setStatusPedido(rs.getInt("status_pedido"));
                pedido.setTotal(rs.getDouble("total"));

                ModelUsuario usuarioId = new ModelUsuario();
                usuarioId.setId(rs.getInt("usuario_id"));

                pedido.setUsuarioId(usuarioId);
                modelPedido.add(pedido);

                ModelFormaPagamento pagamentoID = new ModelFormaPagamento();
                pagamentoID.setId(rs.getInt("forma_pagamento_id"));

                pedido.setFormaPagamentoId(pagamentoID);
                modelPedido.add(pedido);

            }
            return modelPedido;

        } catch (Exception e4){
            throw new RuntimeException(e4);
        }
    }


    public static boolean isIdValido(ModelPedido pedido) {
        try {
            ConexaoMYSQL conexaoMsql = new ConexaoMYSQL();
            Connection con = conexaoMsql.obterConexao();
            PreparedStatement stmt = null;

            stmt = con.prepareStatement("SELECT id FROM tb_pedido WHERE id = ?");

            stmt.setInt(1, pedido.getId());
            ResultSet rs = stmt.executeQuery();

            boolean idExist = rs.next();

            return idExist;

        } catch (Exception e5){
            throw new RuntimeException(e5);
        }
    }


    public static int getPedidoPorId(int pedidoId) {
        try {
        ConexaoMYSQL conexaoMYSQL = new ConexaoMYSQL();
        Connection con = conexaoMYSQL.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int categoria = -1;

        stmt = con.prepareStatement("SELECT id FROM tb_pedido WHERE id = ?");
        stmt.setInt(1, pedidoId);
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
