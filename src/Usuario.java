import java.util.Scanner;

class Usuario {

    private String nome;
    private String endereco;
    private String cpf;
    public Usuario (String nome, String endereco, String cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;

    }

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public String getCpf() {
         return cpf;
     }

     public void setCpf(String cpf) {
         this.cpf = cpf;
     }


     public String getEndereco() {
         return endereco;
     }

     public void setEndereco(String endereco) {
         this.endereco = endereco;
     }

     public void alterarNome(){
        Scanner cin = new Scanner(System.in);
        String nomeAlterado = cin.nextLine();
        this.nome = nomeAlterado;
        cin.close();
     }
     public void alterarEndereco(){
        Scanner cin = new Scanner(System.in);
        String enderecoAlterado = cin.nextLine();
        this.endereco = enderecoAlterado;
        cin.close();

     }
 }
