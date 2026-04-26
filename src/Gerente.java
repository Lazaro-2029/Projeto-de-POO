import java.util.ArrayList;

class Gerente {
    private Usuario user;
    private ArrayList<Avaliador> listaDeAvaliadores;
    private ArrayList<Autor> listaDeAutores;
    private ArrayList<Obra> listaDeObras;

    public Gerente(Usuario user) {
        setgerente(user);
        this.user = user;
        this.listaDeAutores = new ArrayList<>();
        this.listaDeAvaliadores = new ArrayList<>();
        this.listaDeObras = new ArrayList<>();
    }

    public void setgerente(Usuario usergerente) {
        if (usergerente == null) {
            throw new IllegalArgumentException(" gerente invalido ");
        } else if (usergerente.getNome().equals("PaulaoAdm")) {
            this.user = usergerente;
        }
    }

    public Usuario getUser() {
        return user;
    }

    public ArrayList<Autor> getListaDeAutores() {
        return listaDeAutores;
    }

    public ArrayList<Avaliador> getListaDeAvaliadores() {
        return listaDeAvaliadores;
    }

    public ArrayList<Obra> getListaDeObras() {
        return listaDeObras;
    }


    public Avaliador BuscarAvaliador (Usuario user){
        for (Avaliador names : listaDeAvaliadores) {
            if (names.getavaliador().getNome().equals(user)) {
                return names;
            }
        }
        return null;
    }
    public Autor BuscarAutor (Usuario user){
        for (Autor names : listaDeAutores) {
            if (names.getautor().getNome().equals(user)) {
                return names;
            }
        }
        return null;
    }
    public void ExcluirAvaliador(Usuario user){
        Avaliador usuarioPesquisado = BuscarAvaliador(user);

        if (user == null){
            throw new IllegalArgumentException("O Avaliador que você procura não existe");
        }
        listaDeAvaliadores.remove(usuarioPesquisado);
    }
    public void ExclirAutor(Usuario user){
        Autor usuarioPesquisado = BuscarAutor(user);

        if (user == null){
            throw new IllegalArgumentException("O Autor que você procura não existe");
        }
        listaDeAutores.remove(usuarioPesquisado);
    }
    public Obra PesquisarObraPorNome(String something) {
        System.out.println("Aqui está algumas obras relacionadas a sua pesquisa");
        for (Obra names : listaDeObras) {
            if (names.getTitulo().equals(something)) {
                return names;
            }
        }
        return null;
    }
    public Obra PesquisarObraPorGenero(String something) {
        System.out.println("Aqui está algumas obras relacionadas a sua pesquisa");
        for (Obra names : listaDeObras) {
            if (names.getGenero().equals(something)) {
                return names;
            }
        }
        return null;
    }
    public Obra PesquisarObraPorStatus(String something) {
        System.out.println("Aqui está algumas obras relacionadas a sua pesquisa");
        for (Obra names : listaDeObras) {
            if (names.getStatus().equals(something)) {
                return names;
            }
        }
        return null;
    }
    public Obra PesquisarObraPorAno(int number) {
        System.out.println("Aqui está algumas obras relacionadas a sua pesquisa");
        for (Obra names : listaDeObras) {
            if (names.getAno() == number) {
                return names;
            }
        }
        return null;
    }
    public Obra PesquisarObraPorId(int number) {
        System.out.println("Aqui está algumas obras relacionadas a sua pesquisa");
        for (Obra names : listaDeObras) {
            if (names.getId() == number) {
                return names;
            }
        }
        return null;
    }
    public Obra PesquisarObraPorAutor(Autor autor) {
        System.out.println("Aqui está algumas obras relacionadas a sua pesquisa");
        for (Obra names : listaDeObras) {
            if (names.getAutor().getautor().equals(getUser())) {
                return names;
            }
        }
        return null;
    }
}

