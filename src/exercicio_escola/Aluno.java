package exercicio_escola;

public class Aluno {
     private String ra;
     private String cpf;
     private String rg;
     private String nome;
     private String dataNasc;
     private String email1;
     private String email2;
     private String ddd_tel;
     private String telefone;
     private String ddd_cel;
     private String celular;
     private String cep;
     private String rua;
     private int numero;
     private String bairro;
     private String cidade;
     private String uf;
     private String observacao;
     private String dataCadastro;
     private String situacao;
     
     public Aluno(){
         this.ra = "";
         this.cpf = "";
         this.rg = "";
         this.nome = "";
         this.dataNasc = "";
         this.email1 = "";
         this.email2 = "";
         this.ddd_tel = "";
         this.telefone = "";
         this.ddd_cel = "";
         this.celular = "";
         this.cep = "";
         this.rua = "";
         this.numero = 0;
         this.bairro = "";
         this.cidade = "";
         this.uf = "";
         this.observacao = "";
         this.dataCadastro = "";
         this.situacao = "";    
     }
     
     public Aluno(String ra, String cpf, String rg, String nome, String dataNasc, String email1, String email2, String ddd_tel, String telefone, String ddd_cel, String celular, String cep, String rua, int numero, String bairro, String cidade, String uf, String observacao, String dataCadastro, String situacao){
         this.ra = ra;
         this.cpf = cpf;
         this.rg = rg;
         this.nome = nome;
         this.dataNasc = dataNasc;
         this.email1 = email1;
         this.email2 = email2;
         this.ddd_tel = ddd_tel;
         this.telefone = telefone;
         this.ddd_cel = ddd_cel;
         this.celular = celular;
         this.cep = cep;
         this.rua = rua;
         this.numero = numero;
         this.bairro = bairro;
         this.cidade = cidade;
         this.uf = uf;
         this.observacao = observacao;
         this.dataCadastro = dataCadastro;
         this.situacao = situacao;
         
     }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getDdd_tel() {
        return ddd_tel;
    }

    public void setDdd_tel(String ddd_tel) {
        this.ddd_tel = ddd_tel;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDdd_cel() {
        return ddd_cel;
    }

    public void setDdd_cel(String ddd_cel) {
        this.ddd_cel = ddd_cel;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
             
     
}
