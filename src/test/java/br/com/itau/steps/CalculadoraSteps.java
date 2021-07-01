package br.com.itau.steps;

import br.com.itau.CalculadoraOperacoesAction;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.Assert.*;

public class CalculadoraSteps {

    CalculadoraOperacoesAction operacoes = new CalculadoraOperacoesAction();

    @Quando("realizar a operacao {string}, {int} e {int}")
    public void realizatAOperacao(String operacao, Integer n1, Integer n2) {
        operacoes.tipoOperacao(operacao, n1, n2);
    }

    @Entao("deve validar que o resultado apresentado esta correto ao {string}")
    public void deveValidarQueOResultadoApresentadoEstaCorretoAo(String resultado) {
        switch (resultado) {
            case "Somar":
                fail("validando soma");

                break;
            case "Subtrair":
                fail("validando operacao de subtracao");
                break;
            case "Multiplicar":
                fail("validando multiplicacao");

                break;
                case "Dividir":
                fail("validando divisao");
                break;
        }
    }
}
