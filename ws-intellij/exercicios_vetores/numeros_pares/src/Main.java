void main() {
    Scanner sc = new Scanner(System.in);

    int quantPares = 0;

    IO.print("Quantos números você vai digitar? ");
    int n = sc.nextInt();

    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
        IO.print("Digite um número: ");
        nums[i] = sc.nextInt();
    }

    IO.println();

    IO.println("NÚMEROS PARES:");
    for(int i = 0; i < n; i++) {
        if(nums[i] % 2 == 0) {
            IO.print(nums[i] + " ");
            quantPares++;
        }
    }

    IO.println();
    IO.println();
    IO.println("Quantidade de pares: " + quantPares);

    sc.close();
}
