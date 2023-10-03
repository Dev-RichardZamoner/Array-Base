import java.util.Scanner;

public class ArrayTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bem vindo, informe seu nome: ");
        String name = scanner.nextLine();
        System.out.print("Digite o tamanho do array (LIMITE ATÉ 50 POR FAVOR NÃO ULTRAPASSE): ");
        int capacidade = scanner.nextInt();
        Array vetor = new Array(capacidade);

        int opcao;
        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Inserir Elemento");
            System.out.println("2. Remover Elemento");
            System.out.println("3. Listar todos os Elementos");
            System.out.println("4. Alterar Elemento");
            System.out.println("5. Pesquisar por Elementos");
            System.out.println("6. Exibir sua posição na fila");
            System.out.println("7. Esvaziar Fila");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o elemento a ser adicionado: ");
                    int elementoAdicionar = scanner.nextInt();
                    vetor.adicionarElemento(elementoAdicionar);
                    break;
                case 2:
                    vetor.removerElemento();
                    break;
                case 3:
                    vetor.listarElementos();
                    break;
                case 4:
                    System.out.print("Digite a posição do elemento a ser alterado: ");
                    int posicao = scanner.nextInt();
                    System.out.print("Digite o novo elemento: ");
                    int novoElemento = scanner.nextInt();
                    vetor.alterarElemento(posicao, novoElemento);
                    break;
                case 5:
                    System.out.print("Digite um valor para pesquisar: ");
                    int valorPesquisar = scanner.nextInt();
                    break;
                case 6:
                    System.out.print("Digite a posição da fila que deseja exibir: ");
                    int posicaoExibir = scanner.nextInt();
                    vetor.listarElementos();
                    break;
                case 7:
                    vetor.listarElementos();
                    vetor.removerElemento();
                    break;

                case 8:
                    System.out.println("Encerrando o aplicativo, é sempre bom te ver por aqui.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 8);

        scanner.close();
    }
}
