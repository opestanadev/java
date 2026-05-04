import java.util.Locale;

void main() {

    // Apenas testando o printf() com seus comandos de formatação.

    Locale.setDefault(Locale.US);

    String produto = "Pão";
    int quantidade = 5;
    double valor = 2.50;

    System.out.printf("Produto: %s | Quantidade comprada: %d | Valor: R$ %.2f", produto, quantidade, valor);

    /* Comandos de Formatação para lembrar
    *
    *  %n -> Quebra de linha (\n também funciona);
    *  %f -> Indica que o valor é um número de ponto flutuante (double ou float)
    *   %.2f -> Especifica o número de casas decimais (2 pode ser qualquer valor que você preferir);
    *  %d -> Tipos inteiros;
    *  %s -> String;
    *  %c -> char;
    *  %% -> Escreve % (É só pro programa não confudir quando você quer usar um comando de formatação e quando você simplesmente quer escrever o símbolo %).
    *
    * */

}
