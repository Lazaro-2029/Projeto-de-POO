import java.util.ArrayList;

class SystemSearch {
    private ArrayList<Obra> obrasguardadas;
    private ArrayList<Autor>autoresguardados;
    private ArrayList<Avaliador> avaliadorguardados;


    public SystemSearch(){
        this.obrasguardadas = new ArrayList<>(obrasguardadas);
        this.autoresguardados = new ArrayList<>(autoresguardados);
        this.avaliadorguardados = new ArrayList<>(avaliadorguardados);
    }

    public void cadastrarAutor(Autor novoautor){
        if (novoautor == null){
        throw new IllegalArgumentException("cadastro de autor inválido no sistema");
        }
        autoresguardados.add(novoautor);
    }

    public void cadastrarAvaliador(Avaliador novoavaliador){
        if (novoavaliador == null){
            throw new IllegalArgumentException("cadastro de avaliador inválido no sistema");
        }
        avaliadorguardados.add(novoavaliador);
    }

    public void cadastrarObra(Obra novaobra){
        if (novaobra == null){
            throw new IllegalArgumentException("cadastro de obra inválido no sistema");
        }
        obrasguardadas.add(novaobra);
    }
    public Obra buscarporObra(int id){
        for (Obra Obra : obrasguardadas){
            if (Obra.getId() == id){
                return Obra;
            }
        }
        return null;
    }
    public Autor buscarAutorPorNome(String nome) {
        for (Autor autor : autoresguardados) {
            if (autor.getautor().getNome().equalsIgnoreCase(nome)) {
                return autor;
            }
        }
        return null;
    }
    public void listarTodasObras() {
        if (obrasguardadas.isEmpty()) {
            System.out.println("Nenhuma obra listada no sistema.");
            return;
        }

        for (Obra obra : obrasguardadas) {
            obra.exibirDados();
            System.out.println("-------------");
        }
    }

    public void listarAutores() {
        if (autoresguardados.isEmpty()) {
            System.out.println("Nenhum autor listado no sistema.");
            return;
        }

        for (Autor autor : autoresguardados) {
            autor.getautor().exibirDados();
            System.out.println("-------------");
        }
    }

    public void listarAvaliadores() {
        if (avaliadorguardados.isEmpty()) {
            System.out.println("Nenhum avaliador listado no sistema.");
            return;
        }

        for (Avaliador avaliador : avaliadorguardados) {
            avaliador.getavaliador().exibirDados();
            System.out.println("-------------");
        }
    }

    public ArrayList<Autor> getAutores() {
        return autoresguardados;
    }

    public ArrayList<Avaliador> getAvaliadores() {
        return avaliadorguardados;
    }

    public ArrayList<Obra> getObras() {
        return obrasguardadas;
    }
}
