import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List lista = new List(scan);
        boolean adicionado = false;

        int opcao = -1;

        do {
            System.out.println("====LISTA DE TAREFAS====");
            System.out.println("1- Cadastrar tarefa");
            System.out.println("2- Listar tarefas");
            System.out.println("3- Marcar como concluido");
            System.out.println("4- Deletar tarefa");
            System.out.println("0- Sair\n");

            System.out.println("ESCOLHA UMA OPCAO ACIMA: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    // cadastrar tarefa
                    lista.createTarefa();
                    adicionado = true;
                    break;

                case 2:
                    // listar tarefa
                    if (!adicionado) {
                        System.out.println("CADASTRAR TAREFA NA LISTA PARA LISTAR");
                    }
                    else {
                        lista.listarTarefas();
                    }
                    break;

                case 3:
                    //marcar como concluido

                    if (!adicionado) {
                        System.out.println("CADASTRAR TAREFA NA LISTA PARA MARCAR COMO CONCLUIDO");
                    }
                    else {
                        lista.marcarConcluido();
                    }
                    break;

                case 4:
                    // deletar tarefa

                    if (!adicionado) {
                        System.out.println("CADASTRAR TAREFA NA LISTA PARA DELETAR TAREFA");
                    }
                    else {
                        lista.deleteTarefa();
                    }
                    break;

                case 0:
                    System.out.println("LISTA DE TAREFAS ENCERRADA");
                    break;

                default:
                    System.out.println("NENHUMA OPCAO VALIDA");

            }

        } while (opcao !=0);

        scan.close();
    }
}