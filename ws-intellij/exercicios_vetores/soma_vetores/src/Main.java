void main() {
    Scanner sc = new Scanner(System.in);

    IO.print("Quantos valores vai ter cada vetor? ");
    int n = sc.nextInt();

    int[] a, b, c;
    a = new int[n];
    b = new int[n];
    c = new int[n];

    IO.println("Digite os valores do vetor A:");
    for(int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }

    IO.println("Digite os valores do vetor B:");
    for(int i = 0; i < n; i++) {
        b[i] = sc.nextInt();
    }

    for(int i = 0; i < n; i++) {
        c[i] = a[i] + b[i];
    }

    IO.println("VETOR RESULTANTE:");
    for(int i = 0; i < n; i++) {
        IO.println(c[i]);
    }

    sc.close();
}