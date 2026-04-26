import java.time.LocalDate;

class Obra {
    private String titulo;
    private String genero;
    private int ano;
    private String status;
    private LocalDate dataAvaliacao;

    private Autor autor;
    private Avaliador avaliadorResponsavel;

    private int id;
    private static int contadorid = 1;


    public Obra(String titulo ,String genero ,int ano, Autor autor){
        setTitulo(titulo);
        setGenero(genero);
        setAno(ano);
        setAutor(autor);

        this.status = "PENDENTE";

        this.id = contadorid;
        contadorid++;

    }

    public void setAvaliadorResponsavel(Avaliador avaliadorResponsavel) {
        this.avaliadorResponsavel = avaliadorResponsavel;
    }

    public Avaliador getAvaliadorResponsavel() {
        return avaliadorResponsavel;
    }

    //---------------------------------------------------------------------------------
    public int getId() {
        return id;
    }
    //---------------------------------------------------------------------------------
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("título não pode ser nulo");
        }
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    //---------------------------------------------------------------------------------
    public void setGenero(String genero) {
        if (genero == null){
            throw new IllegalArgumentException("genero não pode ser vazio");
        }
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    //---------------------------------------------------------------------------------
    public void setAno(int ano) {
        if (ano <= 0) {
            throw new IllegalArgumentException("Ano inválido");
        }
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }


    public void alterarStatus(String novoStatus){
        if (!novoStatus.equalsIgnoreCase("APROVADO") &&
                !novoStatus.equalsIgnoreCase("REPROVADO") &&
                !novoStatus.equalsIgnoreCase("PENDENTE")) {

            throw new IllegalArgumentException("Status inválido");
        }

        this.status = novoStatus.toUpperCase();
    }


    public String getStatus() {
        return status;

    //---------------------------------------------------------------------------------
    }

    public void setAutor(Autor autor) {
        if (autor == null) {
            throw new IllegalArgumentException("Autor não pode ser nulo");
        }
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void alterarTitulo(String titulo){
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("novo título inválido");
        }
        this.titulo = titulo;
    }
    public void alterarGenero(String genero){
        if (genero == null || genero.isEmpty()) {
            throw new IllegalArgumentException("novo gênero inválido");
        }
        this.genero = genero;

    }
    public void alterarAno(int ano){
        if (ano <= 0) {
            throw new IllegalArgumentException("novo ano inválido");
        }
        this.ano = ano;
    }

    public void setDataAvaliacao(LocalDate dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    public LocalDate getDataAvaliacao() {
        return dataAvaliacao;
    }


    public void exibirDados() {
        System.out.println("título: " + getTitulo());;
        System.out.println("Gênero: " + getGenero());
        System.out.println("Ano: " + getAno());
        System.out.println("Autor: " + getAutor().getUser().getNome());;
        System.out.println("Status: " + getStatus());
    }

}
