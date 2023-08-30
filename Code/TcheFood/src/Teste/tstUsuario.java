package Teste;

import DAO.UsuarioDAO;
import Model.ModelUsuario;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import static DAO.UsuarioDAO.isIdValido;
import static DAO.UsuarioDAO.salvar;

public class tstUsuario {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //testeInsert();
        //testeSelect();
        //testeDeletar();
        //testeAlterar();
    }

    public static void testeInsert() throws SQLException, ClassNotFoundException {
        ModelUsuario a = new ModelUsuario();
        a.setNome("Adriano");
        a.setEmail("Xvideos@xvideos");
        a.setSenha("123");
        a.setPapel("Admin");
        a.setTelefone("51987654322");

        salvar(a);
    }

    public static void testeSelect() throws SQLException, ClassNotFoundException {
        ArrayList<ModelUsuario> adr = UsuarioDAO.consultar("Adriano");

        if (!adr.isEmpty()) {
            for (ModelUsuario ad : adr) {
                System.out.println("ID " + ad.getId());
                System.out.println("Nome " + ad.getNome());
                System.out.println("Email " + ad.getEmail());
                System.out.println("Senha " + ad.getSenha());
                System.out.println("Papel " + ad.getPapel());
                System.out.println("Telefone " + ad.getTelefone());
                System.out.println("Dt criacao " + ad.getDataCriacao());
                System.out.println("Dt alteracao " + ad.getDataAtualizacao());

            }
        } else {
            System.err.println("usuario nao encontrado");
        }

    }

    public static void testeDeletar() throws SQLException, ClassNotFoundException {

        Scanner ler = new Scanner(System.in);
        System.out.println("ID para deletar");
        int id = ler.nextInt();


        if (isIdValido(id)) {
            ModelUsuario a = new ModelUsuario();
            a.setId(id);
            System.out.println("Nome do Cliente: " + UsuarioDAO.nomeUsuario(id));

            //UsuarioDAO.deletar(a);

        } else {
            System.err.println("Nao encontrado");
        }


    }

    public static void testeAlterar() throws SQLException, ClassNotFoundException {
        Scanner ler = new Scanner(System.in);

        System.out.print(" Escolha o ID que quer mudar ");
        int id = ler.nextInt();

        if (isIdValido(id)) {
            ModelUsuario a = new ModelUsuario();

            a.setId(id);
            System.out.println("Informe seu nome");
            a.setNome(ler.next());

            System.out.println("Informe seu email");
            a.setEmail(ler.next());

            System.out.println("Informe seu senha");
            a.setSenha(ler.next());

            System.out.println("Informe seu papel");
            a.setPapel(ler.next());

            System.out.println("Informe seu telefone");
            a.setTelefone(ler.next());


            UsuarioDAO.update(a);
            System.out.println("Atualizado com sucesso");
        } else {
            System.out.println("O ID fornecido não existe");
        }
    }

}
