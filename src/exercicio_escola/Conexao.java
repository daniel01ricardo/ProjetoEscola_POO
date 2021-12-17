package exercicio_escola;

import java.sql.Connection;
  import java.sql.DriverManager;
  import java.sql.SQLException;
  
  public class Conexao {
      public static Connection getConexao(){
          Connection conexao = null;          
          String usuario = "root";
          String senha   = "";
          String caminho = "jdbc:mysql://localhost:3306/bdescola"; 
         try {
             conexao = DriverManager.getConnection(caminho,usuario, senha);     
             System.out.println("Conexao efetuada com sucesso !!!");
         }
         catch ( SQLException erro) {
             System.out.println("Erro efetuar conexão com o "
                     + "banco de dados: " + erro);     
         }        
        return conexao;
     }      
 }
        