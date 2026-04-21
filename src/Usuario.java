import java.util.Scanner;

class Usuario {

    private String nome;
    private String endereco;
    private String cpf;
    public Usuario (String nome, String endereco, String cpf){
        setNome(nome);
        setEndereco(endereco);
        setCpf(cpf);
    }
//---------------------------------------------------------------------------------
     public String getNome() {
         return nome;
     }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }
//---------------------------------------------------------------------------------

     public String getCpf() {
         return cpf;
     }

     public void setCpf(String cpf) {
         if (cpf == null || cpf.isEmpty()) {
             throw new IllegalArgumentException("cpf inválido");
         }
         this.cpf = cpf;
     }

//---------------------------------------------------------------------------------
     public String getEndereco() {
         return endereco;
     }

     public void setEndereco(String endereco) {
         if( endereco == null || endereco.isEmpty()){
             throw new IllegalArgumentException("endereço inválido");
         }
             this.endereco = endereco;
     }
//---------------------------------------------------------------------------------

     public void alterarnome(String nome){
         if (nome == null || nome.isEmpty()) {
             throw new IllegalArgumentException("Nome inválido");
         }
         this.nome = nome;
     }

    public void alterarendereco(String endereco){
        if (endereco == null || endereco.isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.endereco = endereco;
    }
//---------------------------------------------------------------------------------

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CPF: " + cpf);
    }

 }
