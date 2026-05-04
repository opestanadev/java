import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    int a, b, c;
    IO.println("Digite três valores:");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    int maior = verificarMaior(a, b, c);
    int menor = verificarMenor(a, b, c);

    mostrarResultado(maior, menor);

    sc.close();
}

int verificarMaior(int a, int b, int c) {
    if(a > b && a > c) {
        return a;
    } else if (b > c) {
        return b;
    } else {
        return c;
    }
}

int verificarMenor(int a, int b, int c) {
    if(a < b && a < c) {
        return a;
    } else if (b < c) {
        return b;
    } else {
        return c;
    }
}

void mostrarResultado(int maior, int menor) {
    IO.println("MAIOR: " + maior);
    IO.println("MENOR: " + menor);
}
