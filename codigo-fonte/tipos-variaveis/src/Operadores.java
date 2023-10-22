public class Operadores {
    public static void main(String[] args) {
        int primeiroParametro = 10;
        int segundoParametro = 5;

        try {
            if (primeiroParametro > segundoParametro) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            // Se os parâmetros estiverem corretos, execute sua lógica aqui.
        } catch (ParametrosInvalidosException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}