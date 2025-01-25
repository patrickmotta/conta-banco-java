package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite a agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo: ");
        float saldo = scanner.nextFloat();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " , e seu saldo " + saldo + " já esta disponível para saque.";

        System.out.println(mensagem);
    }
}
