package Teste;

import DAO.UsuarioDAO;
import Model.ModelUsuario;

import static DAO.UsuarioDAO.salvar;

public class tstUsuario {
    public static void main(String[] args) {
//        ModelUsuario a = new ModelUsuario();
//        a.setNome("Adriano");
//        a.setEmail("Xvideos@xvideos");
//        a.setSenha("123");
//        a.setPapel("Admin");
//        a.setTelefone("51987654322");
//
//
//        salvar(a);

        for (ModelUsuario a: UsuarioDAO.consultar("Adriano")
             ) {
            System.out.println("ID " + a.getId() );
            System.out.println("Nome " + a.getNome());
            System.out.println("Email " + a.getEmail() );
            System.out.println("Senha " + a.getSenha() );
            System.out.println("Papel " + a.getPapel() );
            System.out.println("Telefone " + a.getTelefone() );
            System.out.println("Dt criacao " + a.getDataCriacao());
            System.out.println("Dt alteracao " + a.getDataAtualizacao());


        }

    }
}
