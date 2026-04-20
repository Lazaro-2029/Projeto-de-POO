class Avaliador {
    private Usuario user;
    private Obra[] obrasAvaliadas;
    public Avaliador(Usuario user, Obra[] obrasAvaliadas){
        this.obrasAvaliadas = obrasAvaliadas;
        this.user = user;

    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Usuario getUser() {
        return user;
    }

    public Obra[] getObrasAvaliadas() {
        return obrasAvaliadas;
    }

    public void setObrasAvaliadas(Obra[] obrasAvaliadas) {
        this.obrasAvaliadas = obrasAvaliadas;
    }
}
