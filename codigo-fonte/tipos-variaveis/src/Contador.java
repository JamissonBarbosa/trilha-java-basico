import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro par�metro");
        int parametroUm = terminal.nextInt(); // Ler o primeiro par�metro
        System.out.println("Digite o segundo par�metro");
        int parametroDois = terminal.nextInt(); // Ler o segundo par�metro

        try {
            // Chamando o m�todo contendo a l�gica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem da exce��o
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm � MAIOR que parametroDois e lan�ar a exce��o
        if (parametroUm > parametroDois) {
            // Instanciar a exce��o com a mensagem
            ParametrosInvalidosException exception = new ParametrosInvalidosException("O segundo par�metro deve ser maior que o primeiro");
            throw exception;
        }

        int contagem = parametroDois - parametroUm;

        // Realizar um loop para imprimir os n�meros com base na vari�vel contagem
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}
