public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        System.out.println();
        int idade = 19;
        int quantidadePessoas = 3;
        //boolean acompanhado = quantidadePessoas >= 2;

        boolean acompanhado;

        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        // OU = ||
        System.out.println("Valor de acompanhado = " + acompanhado);
        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }
    }
}
