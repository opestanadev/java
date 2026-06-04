void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    IO.print("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();

    int[] nums = new int[n];
    int somaPares = 0, quantPares = 0;
    double mediaPares;

    for(int i = 0; i < n; i++) {
        IO.print("Digite um número: ");
        nums[i] = sc.nextInt();
        if(nums[i] % 2 == 0) {
            quantPares++;
            somaPares += nums[i];
        }
    }

    mediaPares = (double) somaPares / quantPares;

    if(quantPares > 0) {
        IO.println("MÉDIA DOS PARES: " + String.format("%.1f", mediaPares));
    } else {
        IO.println("NENHUM NÚMERO PAR");
    }

    sc.close();
}