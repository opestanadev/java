void main() {

    double preco = 34.5;
    double desconto;

    // Forma tradicional (usando if-else)

    if(preco < 20) {
        desconto = preco * 0.1;
    } else {
        desconto = preco * 0.05;
    }

    IO.println("Desconto: " + desconto);

    // Usando a estrutura condicional ternária

    desconto = (preco > 20)? preco * 0.1 : preco * 0.05; // Mudei o operador apenas pro valor ser diferente.
    IO.println("Desconto: " + desconto);

    /* SINTAXE PARA LEMBRAR
    *
    *  (condicao)? valor_se_verdadeiro : valor_se_falso;
    *
    * */

}
