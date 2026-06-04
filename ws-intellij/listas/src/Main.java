void main() {
    // Instanciação da lista
    List<String> list = new ArrayList<>();

    // Adiciona elementos na lista
    list.add("David");
    list.add("Arthur");
    list.add("Samuel");
    list.add("Apollo");
    list.add(2, "Heitor"); // Adiciona um elemento na posição especificada

    // Retorna o tamanho da lista
    System.out.println(list.size());

    // Percorre a lista
    for(String x : list) {
        System.out.println(x);
    }

    System.out.println();

    // Remove um elemento da lista (pode conter um valor ou uma posição)
    list.remove(0);

    // Remove um elemento com base em um predicado (não faço ideia do que é, será visto futuramente)
    list.removeIf(x -> x.charAt(0) == 'A');

    for(String x : list) {
        System.out.println(x);
    }

    System.out.println();

    // Retorna o indice da primeira ocorrência do valor
    System.out.println("Index of Samuel: " + list.indexOf("Samuel"));
    System.out.println("Index of Danilo: " + list.indexOf("Danilo"));

    System.out.println();

    // Filtra a lista com base em um predicado (Que Deus me ajude a lembrar disso tudo...)
    List<String> result = list.stream().filter(x -> x.charAt(0) == 'S').toList();

    for(String x : result) {
        System.out.println(x);
    }

    System.out.println();

    // Encontra a primeira ocorrência com base em predicado
    String name = list.stream().filter(x -> x.charAt(0) == 'H').findFirst().orElse(null);
    System.out.println(name);
}