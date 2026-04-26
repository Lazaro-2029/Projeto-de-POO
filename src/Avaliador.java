import java.util.ArrayList;

class Avaliador {
    private Usuario usuarioAvaliador;
    private ArrayList<Obra> obrasAvaliadas;

    public Avaliador(Usuario avaliador){
        setavaliador(avaliador);
        this.obrasAvaliadas = new ArrayList<>();

    }
    public void setavaliador( Usuario useravaliador){
        if (useravaliador == null){
            throw new IllegalArgumentException("avaliador invalido bebe");
        }
        this.usuarioAvaliador = useravaliador;
    }

    public Usuario getavaliador(){
        return usuarioAvaliador;
    }

    public ArrayList<Obra> getObrasAvaliadas(){
        return obrasAvaliadas;
    }

    public void aprovarObra(int id, SystemSearch sistema){
        Obra obra = sistema.buscarporObra(id);

        if(obra == null){
            throw new IllegalArgumentException("Obra não encontrada");
        }
        if (!obra.getStatus().equalsIgnoreCase("PENDENTE")) {
            throw new IllegalArgumentException("Essa obra já foi avaliada");
        }
        obra.alterarStatus("APROVADO");
        obrasAvaliadas.add(obra);
    }

    public void reprovarObra(int id, SystemSearch sistema){
        Obra obra = sistema.buscarporObra(id);

        if(obra == null){
            throw new IllegalArgumentException("Obra não encontrada");
        }

        if (!obra.getStatus().equalsIgnoreCase("PENDENTE")) {
            throw new IllegalArgumentException("Essa obra já foi avaliada");
        }

        obra.alterarStatus("REPROVADO");
        obrasAvaliadas.add(obra);
    }

    public void listarObrasAvaliadas(){
        if(obrasAvaliadas.isEmpty()){
            System.out.println("Nenhuma obra avaliada.");
            return;
        }

        for(Obra obra : obrasAvaliadas){
            obra.exibirDados();
            System.out.println("-----------");
        }
    }
    public void listarObrasPendentes() {
        for (Obra obra : obrasAvaliadas) {
            if (obra.getStatus().equalsIgnoreCase("PENDENTE")) {
                obra.exibirDados();
                System.out.println("-----------");
            }
        }
    }
}
