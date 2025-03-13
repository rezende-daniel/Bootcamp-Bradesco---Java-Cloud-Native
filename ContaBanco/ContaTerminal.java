package ContaBanco;

import java.util.*;
class ContaTerminal {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numeroConta;
        String agencia,nome;
        float saldo;
        System.out.println("Insira o numero da conta:");
        numeroContaconta= teclado.nextInt();
        System.out.println("Insira o núemro da agencia:");
        agencia = teclado.nextLine();
        System.out.println("Insira o saldo:");
        saldo=teclado.nextInt();
        System.out.println("Insira o nome");
        nome=teclado.nextLine();
        System.out.println("Olá"+nome+ " , obrigado por criar uma conta em nosso banco, sua agência é" + agencia +", conta"+ numeroConta+" e seu saldo"+ saldo+" já está disponível para saque");
    }
}