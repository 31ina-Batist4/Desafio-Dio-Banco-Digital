package br.com.dio.bancodigital;


public class Main {

    public static void main(String[] args) {
        Cliente elina = new Cliente();
        elina.setNome("Elina Batista");

        Conta cc = new ContaCorrente(elina);
        Conta poupanca = new ContaPoupanca(elina);
        Conta cs = new ContaSalario(elina);

        cc.depositar(1500);
        cc.imprimirExtrato();
        cc.transferir(100, poupanca);
        cc.transferir(350, cs);

        cc.imprimirExtrato();
        cs.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
