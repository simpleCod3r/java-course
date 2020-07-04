/*
    Programa dedicado a demonstrar o uso de aquisição e impressões
*/

import java.util.Scanner;

public class primeiroPrograma {
    
    public static void main(String[] args) {
        String input;
        Scanner keyboard = new Scanner(System.in);
        input = keyboard.nextLine();
        System.out.println(input + " é assim que se faz uma impressão pulando linha");
    }
}