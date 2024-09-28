package Main;

import calculo_corrida.calculo_corrida;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        calculo_corrida calculo = new calculo_corrida();
        System.out.println("Qual a distancia?: ");
        calculo_corrida.setDistancia(sc.nextDouble());



        sc.close();
    }
}