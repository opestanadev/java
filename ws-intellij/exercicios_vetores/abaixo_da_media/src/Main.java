void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    IO.print("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();

    double[] nums = new double[n];
    double somaVetor = 0, mediaVetor;

    for(int i = 0; i < n; i++) {
        IO.print("Digite um número: ");
        nums[i] = sc.nextDouble();
        somaVetor += nums[i];
    }

    mediaVetor = somaVetor / n;

    IO.println();

    IO.println("MÉDIA DO VETOR: " + String.format("%.3f", mediaVetor));
    IO.println("ELEMENTOS ABAIXO DA MÉDIA:");
    for(int i = 0; i < n; i++) {
        if(nums[i] < mediaVetor) {
            IO.println(nums[i]);
        }
    }



    sc.close();
}