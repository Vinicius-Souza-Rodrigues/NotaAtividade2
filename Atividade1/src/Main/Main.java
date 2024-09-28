package Main;

import conta_corrente.conta_corrente;
import conta_poupanca.conta_poupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de conta que você deseja abrir!: [1] Poupança | [2] Corrente: ");
        int tipo_conta = sc.nextInt();
        if (tipo_conta == 1) {
            conta_poupanca conta1 = new conta_poupanca();
            conta1.setNome_titular("pedro");
            conta1.depositar(200);
            System.out.printf(conta1.exibirdados());
        } else if (tipo_conta == 2) {
            conta_corrente conta2 = new conta_corrente();
            conta2.setNome_titular("matias");
            conta2.depositar(120);
            conta2.cheque_especial(1000);
            System.out.printf(conta2.exibirdados());
        } else {
            System.out.println("Digitou uma opção não existente!");
        }

        sc.close();
    }
}