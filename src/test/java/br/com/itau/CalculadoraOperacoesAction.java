package br.com.itau;

public class CalculadoraOperacoesAction {


    public void tipoOperacao(String operacao, Integer n1, Integer n2) {
        switch (operacao) {
            case "Somar":
                int result = n1 + n2;
                break;

            case "Subtrair":
                int sub = n1 - n2;
                break;

            case "Multiplicar":
                int mult = n1 * n2;
                break;

            case "Dividir":
                int div = n1 / n2;
                break;
        }
    }

//    public void somar(Integer n1, Integer n2) {
//        int result = n1 + n2;
//    }

//    public void subtrair() {
//
//
//    }

    public void dividir() {


    }

    public void multiplicar() {


    }
}
