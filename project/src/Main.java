import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List lista = new List(scan);

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
                    break;

                case 2:
                    // listar tarefa
                    break;

                case 3:
                    //marcar como concluido
                    break;

                case 4:
                    // deletar tarefa
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