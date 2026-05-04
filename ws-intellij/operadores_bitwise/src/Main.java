void main() {
    int x = 89;
    int y = 60;

    IO.println(x & y);
    IO.println(x | y);
    IO.println(x ^ y);

    /* EXPLICANDO O QUE EU ENTENDI DISSO
    *
    *  Primeiramente, vai ocorrer uma conversão dos valores inteiros das variáveis para valores binários, logo:
    *
    *  x = 0101 1001 e y = 0011 1100
    *
    *  Depois, ele vai fazer uma comparação bit a bit, seguindo os critérios do operador, naturalmente, onde 0 é false e 1 é true.
    *
    *  Pra usar de exemplo, vamos pegar o operador %. Considere que cada célula da tabela de cima pra baixo é um bit respectivo ao valor da variável, eu peguei a ordem da esquerda pra direita. Agora, é só usar tabela verdade.
    *
    *  | x | y | z |
    *  | 0 | 0 | 0 | -> Se os dois forem falsos (0), o resultado é falso;
    *  | 1 | 0 | 0 | -> Se somente um for verdadeiro (1) e o outro falso (0), o resultado também é falso;
    *  | 0 | 0 | 0 |
    *  | 1 | 1 | 1 | -> Agora, se os dois forem verdadeiros (1), o resultado é verdadeiro.
    *  | 1 | 1 | 1 |
    *  | 0 | 1 | 0 |
    *  | 0 | 0 | 0 |
    *  | 1 | 0 | 0 |
    *
    *  Como resultado, temos (de cima pra baixo agora sendo da esquerda pra direita) o valor 0001 1000. Agora, ele vai fazer a conversão de volta para decimal, que vai resultar no valor 24, que é justamente o valor da saída do operador %.
    *
    * */
}