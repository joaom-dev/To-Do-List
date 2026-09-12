
public class Tarefa {

    private Integer id;
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setConcluida(Boolean concluida){
        this.concluida = concluida;
    }
    public boolean getConcluida() {
        return concluida;
    }


}


