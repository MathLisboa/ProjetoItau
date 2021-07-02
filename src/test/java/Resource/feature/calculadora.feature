#language: pt
#/*
# * Autor: Matheus Lisboa
# * Data: 01/07/2021
# */

Funcionalidade: Calculadora

  Como usuário
  Desejo realizar operações matemáticas simples

  @Calculadora
  Esquema do Cenario: <VSTS> Operacoes <cenario>
    Quando realizar a operacao "<operacao>", <n1> e <n2>
    Entao deve validar que o resultado apresentado esta correto ao "<resultado>"

    Exemplos:
      | VSTS  | cenario                                   | n1  | n2 | resultado | operacao    |
      | CT001 | Somar 4 com 4 e validar o resultado       | 4   | 4  | 8         | Somar       |
      | CT002 | Subtrair 10 de 25 e validar o resultado   | 10  | 25 | 15        | Subtrair    |
      | CT003 | Multiplicar 5 por 2 e vali  dar o resultado | 5   | 2  | 10        | Multiplicar |
      | CT004 | Dividir 300 por 2 validar o resultado     | 300 | 2  | 150       | Dividir     |