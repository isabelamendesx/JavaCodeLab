# Lista Conceitos Iniciais de Programação Orientada a Objetos

## 1. [📦 Gerenciamento de Produto no Estoque](conceitos_iniciais_poo/controle_de_estoque)
<table>  
  <tr>
    <td width="50%">
      <img src="../imgs/estoque.jpeg" alt="Imagem 1" width="450px">
    </td>
    <td width="50%">
      <img src="../imgs/estoque1.jpeg" alt="Imagem 2" width="450px">
    </td>
  </tr>
</table>


Um exemplo básico de **gerenciamento de produto em um estoque**. Ele permite ao usuário informar os dados de um produto, como nome, preço e quantidade em estoque, e realizar operações de adição e remoção de produtos do estoque.


## 2. [📈 Calculadora Dólar -> Real](/dollar_calculator)
<table>
  <tr>
    <td width="50%">
      <img src="../imgs/dolar.jpeg" alt="Imagem 1" width="900px">
    </td>
    <td width="50%">&nbsp;</td>
  </tr>
</table>

Esse programa é um conversor de moeda simples. Ele solicita ao usuário o preço do dólar e a quantidade de dólares que serão comprados. Em seguida, ele utiliza uma classe auxiliar chamada CurrencyConverter para calcular o valor total em reais a ser pago, levando em consideração a taxa de IOF (Imposto sobre Operações Financeiras) de 6%.

Note que a classe CurrencyConverter contém um atributo estático IOF que armazena a taxa de imposto. O método amountCalculator() realiza o cálculo do valor em reais, multiplicando o preço do dólar pela quantidade desejada e adicionando o valor do imposto.

## 3. [📐 Propriedades de um retângulo](/retangulox)
<table>
  <tr>
    <td width="50%">
      <img src="../imgs/retangulo.jpeg" alt="Imagem 1" width="900px">
    </td>
    <td width="50%">&nbsp;</td>
  </tr>
</table>

Esse programa calcula e exibe informações sobre um retângulo com base nas dimensões fornecidas pelo usuário.

O programa solicita ao usuário a largura e a altura do retângulo. Em seguida, utiliza a classe Rectangle para realizar os cálculos da área, perímetro e diagonal do retângulo com base nas dimensões informadas.

## 4. [💼  Salário líquido de um funcionário](/employee)
<table>
  <tr>
    <td width="50%">
      <img src="../imgs/funcionario.jpeg" alt="Imagem 1" width="900px">
    </td>
    <td width="50%">&nbsp;</td>
  </tr>
</table>

Este programa permite ao usuário inserir os dados de um funcionário, como nome, salário bruto e taxa de imposto. Em seguida, utiliza a classe Employee para calcular o salário líquido do funcionário (após a dedução do imposto) e exibir os dados na tela.

O programa também solicita ao usuário um percentual de aumento salarial desejado. Em seguida, utiliza o método increaseSalary() da classe Employee para calcular e aplicar o aumento salarial com base no percentual informado.


## 5. [🎓 Aluno aprovado ou reprovado?](/student)
<table>
  <tr>
    <td width="50%">
      <img src="../imgs/aluno.jpeg" alt="Imagem 1" width="900px">
    </td>
    <td width="50%">&nbsp;</td>
  </tr>
</table>

Este programa permite ao usuário inserir os dados de um estudante, como nome e notas em três disciplinas diferentes. Em seguida, utiliza a classe Student para calcular a nota final do estudante e exibir se ele foi aprovado ou reprovado.
