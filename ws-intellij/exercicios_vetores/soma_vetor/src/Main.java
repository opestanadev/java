void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    IO.print("Quantos números você vai digitar? ");
    int n = sc.nextInt();

    double[] nums = new double[n];
    double soma = 0;

    for(int i = 0; i < n; i++) {
        IO.print("Digite um número: ");
        nums[i] = sc.nextDouble();
        soma+= nums[i];
    }

    IO.print("VALORES = ");
    for(int i = 0; i < n; i++) {
        IO.print(nums[i] + " ");
    }

    IO.println();
    IO.println();

    IO.println("SOMA = " + String.format("%.2f",soma));
    IO.println("MÉDIA = " + String.format("%.2f", soma / n));

    sc.close();
}
