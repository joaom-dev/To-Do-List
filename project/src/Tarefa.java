
public class Tarefa {

    private Integer id;
    private String descricao;
    private boolean status;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.status = false;
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

    public void setStatus(Boolean status){
        this.status = status;
    }
    public boolean getStatus() {
        return status;
    }


    public String getStatusDescricao() {
        return status ? "concluido" : "pendente";
    }

}


