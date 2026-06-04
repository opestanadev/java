void main() {
    String[] vect = new String[] {"David Lucas", "Arthur", "Samuel"};

    // Jeito tradicional de percorrer um vetor
    for(int i = 0; i < vect.length; i++) {
        System.out.println(vect[i]);
    }

    System.out.println();

    // Usando for each
    for(String obj : vect) {
        System.out.println(obj);
    }

    // Leitura: Para cada objeto obj dentro de vect, faça.
}