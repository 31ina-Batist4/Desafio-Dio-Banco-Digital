package br.com.dio.bancodigital;

public class ContaSalario  extends Conta{
        public ContaSalario(Cliente cliente) {
            super(cliente);
        }
        @Override
        public void imprimirExtrato() {
            System.out.println("****Extrato Conta Salario****");
            super.imprimirInfosComuns();
        }
    }

