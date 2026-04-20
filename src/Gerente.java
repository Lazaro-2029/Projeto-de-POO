class Gerente {
    private Usuario user;
    private Avaliador[] listaDeAvaliadores;
    private Autor[] listaDeAutores;
    private Obra[] listaDeObras;
    public Gerente(Usuario user,Avaliador[] listaDeAvaliadores,Autor[] listaDeAutores, Obra[] listaDeObras){
        this.user = user;
        this.listaDeAutores = listaDeAutores;
        this.listaDeAvaliadores = listaDeAvaliadores;
        this.listaDeObras = listaDeObras;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Autor[] getListaDeAutores() {
        return listaDeAutores;
    }

    public void setListaDeAutores(Autor[] listaDeAutores) {
        this.listaDeAutores = listaDeAutores;
    }

    public Avaliador[] getListaDeAvaliadores() {
        return listaDeAvaliadores;
    }

    public void setListaDeAvaliadores(Avaliador[] listaDeAvaliadores) {
        this.listaDeAvaliadores = listaDeAvaliadores;
    }

    public Obra[] getListaDeObras() {
        return listaDeObras;
    }

    public void setListaDeObras(Obra[] listaDeObras) {
        this.listaDeObras = listaDeObras;
    }

}

