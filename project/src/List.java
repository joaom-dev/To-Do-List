import java.util.Scanner;
import java.util.ArrayList;

public class List {

    private Scanner scan;
    public List(Scanner scan) {
        this.scan = scan;
    }

    private ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();

    public void createTarefa() {
        System.out.println("\n==CADASTRO DE TAREFAS==");
        System.out.println("DIGITE A DESCRICAO DA TAREFA");
        String descricaoScan = scan.nextLine();
        Tarefa tarefa = new Tarefa(descricaoScan);
        tarefa.setId(tarefas.size() + 1);
        tarefas.add(tarefa);
        System.out.println("TAREFA CADASTRADA COM ID: " + tarefa.getId());

    }

    public void listarTarefas() {
        tarefas.forEach(tarefa -> System.out.println("\nID: " + tarefa.getId() + "\nDescrição: " + tarefa.getDescricao() + "\nStatus: " + tarefa.getStatusDescricao()));
    }

    public void marcarConcluido() {
        System.out.println("\nDiGITE O ID DA TAREFA PARA SER CONCLUIDA: ");
        Integer idScan = scan.nextInt();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == idScan) {
                tarefa.setStatus(true);
                System.out.println("TAREFA MARCADA COMO CONCLUIDA!");
                return;
            }
        }
        System.out.println("\nTAREFA NAO ENCONTRADA");
    }

    public void deleteTarefa() {
        System.out.println("\nDIGITE O ID DA TAREFA PARA DELETAR A TAREFA: ");
        Integer idDelete = scan.nextInt();

        Tarefa tarefaParaRemover = null;

        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == idDelete) {
                tarefaParaRemover = tarefa;
                break;
            }
        }
        if (tarefaParaRemover != null) {
            tarefas.remove(tarefaParaRemover);
            System.out.println("\nTAREFA REMOVIDA!");
        }
        else {
            System.out.println("\nTAREFA NAO ENCONTRADA");
        }
    }


}
