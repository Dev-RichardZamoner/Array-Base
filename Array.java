public class Array {
    private int[] vetor;
    private int tamanho;

    public Array(int capacidade) {
        vetor = new int[capacidade];
        tamanho = 0;
    }

    public void adicionarElemento(int elemento) {
        if (tamanho < vetor.length) {
            vetor[tamanho] = elemento;
            tamanho++;
        } else {
            System.out.println("O Array está cheio. Não é possível adicionar mais elementos.");
        }
    }

    public void removerElemento() {
        if (tamanho > 0) {
            tamanho--;
        } else {
            System.out.println("O Array está vazio. Não é possível remover elementos.");
        }
    }

    public void alterarElemento(int posicao, int novoElemento) {
        if (posicao >= 0 && posicao < tamanho) {
            vetor[posicao] = novoElemento;
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public void listarElementos() {
        System.out.print("Elementos do Array: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public void limparElemento() {
        if (tamanho > 0) {
            tamanho--;
        } else {
            System.out.println("O Array está vazio. Não é possível remover elementos.");
        }
    }

}
