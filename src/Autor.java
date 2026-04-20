import java.util.List;

class Autor {
    private Usuario user;
    private Obra[] obrasEscritas;
    public Autor(Usuario user,Obra[] obrasEscritas){
        this.user = user;
        this.obrasEscritas = obrasEscritas;
    }

    public Obra[] getObrasEscritas() {
        return obrasEscritas;
    }

    public void setObrasEscritas(Obra[] obrasEscritas) {
        this.obrasEscritas = obrasEscritas;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
