class SystemSearch {
    private Obra[] obras;
    private Autor[] autores;
    private Avaliador[] avaliadores;
    public SystemSearch(Obra[] obras, Autor[] autores, Avaliador[] avaliadores){
        this.obras = obras;
        this.autores = autores;
        this.avaliadores = avaliadores;
    }

    public Obra[] getObras() {
        return obras;
    }

    public void setObras(Obra[] obras) {
        this.obras = obras;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    public Avaliador[] getAvaliadores() {
        return avaliadores;
    }

    public void setAvaliadores(Avaliador[] avaliadores) {
        this.avaliadores = avaliadores;
    }
}
