import java.util.Scanner;


class Obra {
    private String titulo;
    private String genero;
    private int ano;
    private String status;
    private Autor autor;
    public Obra(String titulo ,String genero ,int ano,String status, Autor autor){
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.status = status;
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;

    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void alterarTitulo(){
        Scanner cin = new Scanner(System.in);
        String novoTitulo = cin.nextLine();
        this.titulo = novoTitulo;
        cin.close();
    }
    public void alterarGenero(){
        Scanner cin = new Scanner(System.in);
        String novoGenero = cin.nextLine();
        this.genero = novoGenero;
        cin.close();

    }
    public void alterarAno(){
        Scanner cin = new Scanner(System.in);
        int novoAno = cin.nextInt();
        this.ano = novoAno;
        cin.close();
    }
}
