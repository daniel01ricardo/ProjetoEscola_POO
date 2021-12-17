package exercicio_escola;
 import java.sql.Connection;
   import java.sql.PreparedStatement;
   import java.sql.ResultSet;
   import java.sql.SQLException;
   import java.util.ArrayList;
   import java.util.List;

        public class AlunoDAO {
            String sSql; 
            Connection con;   
            PreparedStatement pstmt;
            
        public void adicionarAluno(Aluno a)  {
            try {
                // 1° Abrir conexao
                // 2° Preparar a instrução SQL
                // 3° Setar parâmetros
                // 4° Executar a instrução SQL
                // 5° Fechar conexao
                
                con = Conexao.getConexao();   
                pstmt = con.prepareStatement("INSERT INTO ALUNO(alu_ra,"
                        + " alu_cpf, alu_rg, alu_nome, alu_dataNasc, alu_email1, alu_email2, alu_ddd_tel, alu_telefone, alu_ddd_cel, alu_celular, alu_cep, alu_rua, alu_numero, alu_bairro, alu_cidade, alu_uf, alu_observacao, alu_dataCadastro, alu_situacao)"
                       + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                pstmt.setString(1, a.getRa());
                pstmt.setString(2, a.getCpf());
                pstmt.setString(3, a.getRg());
                pstmt.setString(4,a.getNome());  
                pstmt.setString(5,a.getDataNasc()); 
                pstmt.setString(6,a.getEmail1()); 
                pstmt.setString(7,a.getEmail2()); 
                pstmt.setString(8,a.getDdd_tel()); 
                pstmt.setString(9,a.getTelefone()); 
                pstmt.setString(10,a.getDdd_cel()); 
                pstmt.setString(11,a.getCelular()); 
                pstmt.setString(12,a.getCep()); 
                pstmt.setString(13,a.getRua()); 
                pstmt.setInt(14,a.getNumero());
                pstmt.setString(15,a.getBairro()); 
                pstmt.setString(16,a.getCidade()); 
                pstmt.setString(17,a.getUf());
                pstmt.setString(18,a.getObservacao());
                pstmt.setString(19,a.getDataCadastro());
                pstmt.setString(20,a.getSituacao()); 
                
                pstmt.executeUpdate();           
                pstmt.close();
                con.close();
            } 
            catch (SQLException erro) {
                System.out.println("Erro ao gravar cliente" + erro.getMessage());
            } 
        }
        
        
         public Aluno consultaAlunoPorRA(String ra) {
           ResultSet rs;
           Aluno a;
           a = new Aluno();
           con = null;
  
           sSql = "SELECT alu_ra,"
                        + " alu_cpf, alu_rg, alu_nome, alu_dataNasc, alu_email1, alu_email2, alu_ddd_tel, alu_telefone, alu_ddd_cel, alu_celular, alu_cep, alu_rua, alu_numero, alu_bairro, alu_cidade, alu_uf, alu_observacao, alu_dataCadastro, alu_situacao "
                + "WHERE alu_ra = ? "; 
           //System.out.println(sSql);
           try {           
               con = Conexao.getConexao();
               pstmt = con.prepareStatement(sSql);
               pstmt.setString(1, ra);
               rs = pstmt.executeQuery();
               if (rs.next()) {
                 // a = new Aluno();
                a.setRa(rs.getString("alu_ra"));
                a.setCpf(rs.getString("alu_cpf"));
                a.setRg(rs.getString("alu_rg"));
                a.setNome(rs.getString("alu_nome"));  
                a.setDataNasc(rs.getString("alu_dataNasc"));
                a.setEmail1(rs.getString("alu_email1")); 
                a.setEmail1(rs.getString("alu_email1")); 
                a.setDdd_tel(rs.getString("alu_ddd_tel"));
                a.setTelefone(rs.getString("alu_telefone"));
                a.setDdd_cel(rs.getString("alu_ddd_cel"));
                a.setCelular(rs.getString("alu_celular"));  
                a.setCep(rs.getString("alu_cep"));
                a.setRua(rs.getString("alu_rua")); 
                a.setNumero(rs.getInt("alu_numero"));
                a.setBairro(rs.getString("alu_bairro"));
                a.setCidade(rs.getString("alu_cidade"));
                a.setUf(rs.getString("alu_uf"));
                a.setObservacao(rs.getString("alu_observacao"));  
                a.setDataCadastro(rs.getString("alu_dataCadastro"));
                a.setSituacao(rs.getString("alu_situacao")); 
                 
               }
               else {
                  //System.out.println("RA não cadastrado...");
                  a = null; 
               }  
               pstmt.close();
               rs.close();            
               con.close();
           } 
           catch (SQLException erro) {
               System.out.println("Erro ao consultar aluno - " + erro.getMessage());
           }
           return a;
       }
         
      public List<Aluno> listarAlunos() {
          List listadeAluno = new ArrayList();
          ResultSet rs;
         Aluno a;
          sSql = "SELECT alu_ra,"
                        + " alu_cpf, alu_rg, alu_nome, alu_dataNasc, alu_email1, alu_email2, alu_ddd_tel, alu_telefone, alu_ddd_cel, alu_celular, alu_cep, alu_rua, alu_numero, alu_bairro, alu_cidade, alu_uf, alu_observacao, alu_dataCadastro, alu_situacao";
          try {
              con = Conexao.getConexao();
              pstmt = con.prepareStatement(sSql);
              rs = pstmt.executeQuery();
             while (rs.next()) {
                  a = new Aluno();
                  a.setRa(rs.getString("alu_ra"));
                  a.setCpf(rs.getString("alu_cpf"));
                  a.setRg(rs.getString("alu_rg"));
                  a.setNome(rs.getString("alu_nome"));  
                  a.setDataNasc(rs.getString("alu_dataNasc"));
                  a.setEmail1(rs.getString("alu_email1")); 
                  a.setEmail1(rs.getString("alu_email1")); 
                  a.setDdd_tel(rs.getString("alu_ddd_tel"));
                  a.setTelefone(rs.getString("alu_telefone"));
                  a.setDdd_cel(rs.getString("alu_ddd_cel"));
                  a.setCelular(rs.getString("alu_celular"));  
                  a.setCep(rs.getString("alu_cep"));
                  a.setRua(rs.getString("alu_rua")); 
                  a.setNumero(rs.getInt("alu_numero"));
                  a.setBairro(rs.getString("alu_bairro"));
                  a.setCidade(rs.getString("alu_cidade"));
                  a.setUf(rs.getString("alu_uf"));
                  a.setObservacao(rs.getString("alu_observacao"));  
                  a.setDataCadastro(rs.getString("alu_dataCadastro"));
                  a.setSituacao(rs.getString("alu_situacao")); 
                  listadeAluno.add(a);                              
              }           
          } catch (SQLException erro) {
              listadeAluno = null;
              //System.out.println("Erro ao consultar aluno - " + erro.getMessage());
          }
          return listadeAluno;
      }
      
      public void excluirAluno(String ra)  {
         sSql = "DELETE FROM aluno WHERE alu_ra = ?";
         try {
             con = Conexao.getConexao();
             pstmt = con.prepareStatement(sSql);
             pstmt.setString(1, ra);
             pstmt.executeUpdate(); 
             pstmt.close();
             con.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao excluir aluno - " + erro.getMessage());
         } 
     }
      public List<Aluno> consultarAlunoPorNome(String pnome) {
          List<Aluno> listadeAlunos;
          ResultSet rs;
         Aluno a; 
          listadeAlunos = new ArrayList<>();
          pnome = "%" + pnome + "%";
         sSql = "SELECT * FROM aluno WHERE alu_nome like ? ORDER BY alu_nome";
          try {
             con = Conexao.getConexao();
             pstmt = con.prepareStatement(sSql);
             pstmt.setString(1, pnome);
             
             rs = pstmt.executeQuery();
           while (rs.next()) {
                a = new Aluno();
                 a.setRa(rs.getString("alu_ra"));
                  a.setCpf(rs.getString("alu_cpf"));
                  a.setRg(rs.getString("alu_rg"));
                  a.setNome(rs.getString("alu_nome"));  
                  a.setDataNasc(rs.getString("alu_dataNasc"));
                  a.setEmail1(rs.getString("alu_email1")); 
                  a.setEmail1(rs.getString("alu_email1")); 
                  a.setDdd_tel(rs.getString("alu_ddd_tel"));
                  a.setTelefone(rs.getString("alu_telefone"));
                  a.setDdd_cel(rs.getString("alu_ddd_cel"));
                  a.setCelular(rs.getString("alu_celular"));  
                  a.setCep(rs.getString("alu_cep"));
                  a.setRua(rs.getString("alu_rua")); 
                  a.setNumero(rs.getInt("alu_numero"));
                  a.setBairro(rs.getString("alu_bairro"));
                  a.setCidade(rs.getString("alu_cidade"));
                  a.setUf(rs.getString("alu_uf"));
                  a.setObservacao(rs.getString("alu_observacao"));  
                  a.setDataCadastro(rs.getString("alu_dataCadastro"));
                  a.setSituacao(rs.getString("alu_situacao")); 
                         
                 //....
                 listadeAlunos.add(a);
                 // JOptionPane.showMessageDialog(null,"nome" + a.getNome());
             }
            pstmt.close(); 
             con.close();
         } catch (SQLException erro) {
              System.out.println("Aluno não encontrado..." + erro.getMessage());
        }        
         return listadeAlunos;
     }
}
