void main() {
    int x = 20;

    // Boxing
    Object obj = x;

    System.out.println(obj);

    // Unboxing (como eu utilizei a classe Object, é preciso fazer casting pra que ela seja compatível com o tipo int).
    int y = (int) obj;

    System.out.println(y);

    /* ANOTAÇÕES
    *
    *  Boxing: É o processo de conversão de um objeto do tipo valor para um do tipo referência compatível. (Transforma uma variável comum em objeto)
    *
    * Unboxing: Naturalmente, é o processo contrário, converter um objeto tipo referência para um objeto do tipo valor compatível.
    *
    * Wrapper classes: São classes equivalente aos seus tipos primitivos. O esquema fica parecido com isso:
    *
    * Object
    *   Character -> char
    *   Boolean -> boolean
    *   Number
    *       Byte -> byte
    *       Short -> short
    *       Integer -> int
    *       Long -> long
    *       Float -> float
    *       Double -> double
    * */
}