void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    IO.print("Quantos números você vai digitar? ");
    int n = sc.nextInt();

    double[] nums = new double[n];
    double maior = 0;
    int indiceMaior = 0;

    for(int i = 0; i < n; i++) {
        IO.print("Digite um número: ");
        nums[i] = sc.nextDouble();
        if(nums[i] > maior) {
            maior = nums[i];
            indiceMaior = i;
        }
    }

    IO.println();

    IO.println("MAIOR VALOR = " + String.format("%.1f", maior));
    IO.println("POSIÇÃO DO MAIOR VALOR = " + indiceMaior);

    sc.close();
}