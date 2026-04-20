import java.time.LocalDate;

class Relatorio {
    private String description;
    private LocalDate data;
    public Relatorio(String description, LocalDate data){
        this.description = description;
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
