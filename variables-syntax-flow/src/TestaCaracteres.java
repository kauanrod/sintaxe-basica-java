public class TestaCaracteres {
    public static void main(String[] args) {
        char letra = 'a'; //PARA CHAR, OBRIGATÓRIO ASPAS SIMPLES
        System.out.println(letra);

        char valor = 65;
        System.out.println(valor);

        valor = (char) (valor + 1);
        System.out.println(valor);

        String palavra = "Alura Cursos Online de Tecnologia";
        System.out.println(palavra);

        palavra = palavra + 2020;
        System.out.println(palavra);
    }
}
