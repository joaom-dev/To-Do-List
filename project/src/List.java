import java.util.Scanner;
import java.util.ArrayList;

public class List {

    private Scanner scan;
    public List(Scanner scan) {
        this.scan = scan;
    }

    private ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();

    public void createTarefa() {
        System.out.println("==CADASTRO DE TAREFAS==");
        System.out.println("DIGITE A DESCRICAO DA TAREFA");
        String descricaoScan = scan.nextLine();
        Tarefa tarefa = new Tarefa(descricaoScan);
        tarefa.setId(tarefas.size() + 1);
        tarefas.add(tarefa);
        System.out.println("TAREFA CADASTRADA COM ID: " + tarefa.getId());

    }

    public void listarTarefas() {
        tarefas.forEach(tarefa -> System.out.println("ID: " + tarefa.getId() + "\nDescrição: " + tarefa.getDescricao() + "\nStatus: " + tarefa.getStatusDescricao()));
    }

    public void marcarConcluido() {

    }

    public void deleteTarefa() {

    }


}
