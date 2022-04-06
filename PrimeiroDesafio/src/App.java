import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        char opcao;
        String nome = "", profissao = "";
        double[] salarios = new double[12];

        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao calculo de imposto!");

        do {

            System.out.println("Digite c para cadastrar nome e profissao do habitante");
            System.out.println("Digite l para cadastrar os salarios");
            System.out.println("Digite x para exibir salarios");
            System.out.println("Digite i Para calcular e exibir imposto");
            System.out.println("Digite A para exibir nome e profissao");
            System.out.println("Digite S para sair");

            opcao = sc.next().charAt(0);
            sc.nextLine();

            if (opcao == 'c') {
                System.out.println("Digite o nome do habitante");
                nome = sc.nextLine();

                System.out.println("Digite a profissao do habitante");
                profissao = sc.nextLine();
            }

            if (opcao == 'a') {
                System.out.println(nome + ", " + profissao);
            }

            if (opcao == 'l') {

                for (int i = 0; i < salarios.length; i++) {
                    System.out.println("Digite o " + (i + 1) + " salario");
                    salarios[i] = sc.nextDouble();
                    sc.nextLine();
                }

            }

            if (opcao == 'x') {

                for (int i = 0; i < salarios.length; i++) {
                    System.out.println("salario " + (i + 1) + ": " + salarios[i]);
                }

            }

            if (opcao == 'i') {

                for (int i = 0; i < salarios.length; i++) {
                    System.out.println("Salario " + (i + 1) + " ("
                            + salarios[i] + "): "
                            + calcularImposto(salarios[i])
                            + " de imposto");
                }

            }

        } while (opcao != 's');

        sc.close();
    }

    public static double calcularImposto(double valor) {

        if (valor >= 2001 && valor <= 3000) {
            return (valor * 8) / 100;
        }

        if (valor >= 3001 && valor <= 4500) {
            return (valor * 18) / 100;
        }

        if (valor > 4500) {
            return (valor * 28) / 100;
        }

        return 0.00;
    }

}
