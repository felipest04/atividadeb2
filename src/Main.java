public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        exibirResultado("Soma", somar(a, b));
        exibirResultado("Subtração", subtrair(a, b));
        exibirResultado("Multiplicação", multiplicar(a, b));
        exibirResultado("Divisão", dividir(a, b));
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static String dividir(int a, int b) {
        if (b != 0) {
            return String.valueOf(a / b);
        } else {
            return "Não é possível dividir por zero.";
        }
    }

    public static void exibirResultado(String operacao, String resultado) {
        System.out.println(operacao + ": " + resultado);
    }

    public static void exibirResultado(String operacao, int resultado) {
        System.out.println(operacao + ": " + resultado);
    }
}
