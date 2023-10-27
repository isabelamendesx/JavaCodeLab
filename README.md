# JavaCodeLab
<img src="/imgs/java.png" alt="Logo do Java" width="180" height="100"> 

Bem-vindo ao meu repositório JavaCodeLab! 

Este repositório contém minha jornada na linguagem Java. Aqui, você encontrará uma coleção de listas de exercícios que realizei cuidadosamente enquanto estudava o vasto universo do Java. Comecei este repositório em meu 4º semestre da faculdade de Engenharia de Software, enquanto realizava o curso "Java COMPLETO" do Professor Nélio Alves

Espero que esses exercícios possam guiar você em uma jornada de aprendizado, crescimento e transformação assim como me guiaram. 

## Tópicos disponíveis

- [Conceitos Iniciais de POO](#conceitos-iniciais-de-poo)
- [Arrays e Listas](#arrays-e-listas)
- [Data-Hora](#data-hora)
- [Tratamento de Exceções](#tratamento-de-exceções)
- [Generics](#generics)

## Conceitos Iniciais de POO 
### [clique aqui para ver os exercícios](/conceitos_iniciais_poo/README.md)

A lista "Conceitos Iniciais de POO" contém exercícios relacionados aos conceitos fundamentais de Programação Orientada a Objetos. Esses exercícios visaram fortalecer o entendimento dos princípios iniciais de POO, como classes, atributos, membros estáticos e a classe Object.

### Conceitos aplicados nesta lista

#### `Classes e Objetos`
Os programa utilizam duas classes principais - a classe Main e uma classe Entidade que muda conforma o programa. A classe "Main" é geralmente considerada a classe principal de um programa. Ela contém o ponto de entrada para o programa, onde a execução começa e é responsável por coordenar a lógica geral do programa. A classe "Entidade" é um conceito genérico que representa uma abstração de algo que possui características e comportamentos específicos. Ela serve como um modelo ou molde para criar objetos individuais desse tipo. Cada objeto da classe "Entidade" terá seus próprios valores para as variáveis e terá acesso aos métodos definidos na classe.

#### `Encapsulamento`
Os atributos das classes são declarados como públicos, permitindo acesso direto a eles. Embora isso seja utilizado para fins de simplicidade neste exemplo, lembre-se que em cenários mais complexos, é recomendado o uso de modificadores de acesso adequados e métodos getters e setters para controlar o acesso aos atributos.

#### `Métodos`
Os métodos são blocos de código que definem comportamentos ou ações específicas para uma classe ou objeto. Eles permitem que os objetos executem tarefas, interajam com outros objetos e forneçam informações úteis para o programa.

#### `Entrada e Saída de Dados com a Classe Scanner`
A classe Scanner em Java fornece métodos para ler dados de diferentes tipos a partir de fontes de entrada, como o teclado. Ela simplifica a obtenção de dados do usuário e sua manipulação dentro do programa.
Para usar a classe Scanner, é necessário criar uma instância dela, fornecendo a origem dos dados como argumento do construtor. Por exemplo, para ler dados do teclado, podemos criar um objeto Scanner da seguinte forma:

```java
Scanner scanner = new Scanner(System.in);
```
#### Formatação com o método toString
O método toString() é um método especial em Java que retorna uma representação em formato de string do objeto atual. Esse método é herdado da classe Object e pode ser substituído em classes personalizadas para fornecer uma representação mais adequada do objeto.

Por exemplo, suponha que você tenha uma classe chamada Person com atributos como nome, idade e profissão. Ao substituir o método toString() nessa classe, você pode retornar uma string que inclua esses detalhes formatados de maneira adequada. Por exemplo:
```java
public class Person {
    private String name;
    private int age;
    private String profession;

    // Construtor, getters e setters

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Profession: " + profession;
    }
}
```
Com essa implementação do método toString(), ao imprimir um objeto Person, por exemplo, usando System.out.println(person), a saída será uma string formatada com o nome, idade e profissão do objeto:

```yaml
Name: Isabela Mendes, Age: 22, Profession: Software Engineer
```
#### Membros estáticos
Os membros estáticos em Java são membros de uma classe que pertencem à classe em si, e não a instâncias individuais dessa classe. Esses membros são compartilhados por todas as instâncias da classe e podem ser acessados diretamente usando o nome da classe, sem a necessidade de criar um objeto da classe. Por exemplo:
```java
public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}
```
Nesse exemplo, o método add() é um método estático que recebe dois números inteiros como parâmetros e retorna sua soma. Ele pode ser chamado diretamente usando MathUtils.add(2, 3) sem a necessidade de criar um objeto da classe MathUtils.

## Arrays e Listas
### [clique aqui para ver os exercícios](/arrays_listas/README.md)

### Conceitos aplicados nesta lista

Em Java, listas e arrays são estruturas de dados amplamente utilizadas para armazenar e manipular conjuntos de elementos. Embora tenham finalidades semelhantes, eles diferem em termos de funcionalidade e flexibilidade. Vamos entender os principais conceitos de listas e arrays em Java:

#### Arrays
Um array é uma estrutura de dados fixa que armazena um conjunto de elementos do mesmo tipo em uma ordem sequencial.
Os arrays têm um tamanho fixo, determinado durante a sua criação, e esse tamanho não pode ser alterado posteriormente.
Os elementos de um array são acessados por meio de índices, que representam a posição do elemento no array. O índice começa em 0 para o primeiro elemento e vai até o tamanho do array menos um.
Para criar um array em Java, é necessário especificar o tipo dos elementos e o tamanho do array.
Exemplo de declaração de um array de inteiros com tamanho 5:
```java
int[] numeros = new int[5];
```
Para acessar ou atribuir um valor a um elemento do array, utilizamos o índice correspondente:
```java
numeros[0] = 10; // Atribui o valor 10 ao primeiro elemento do array
int valor = numeros[2]; // Acessa o terceiro elemento do array e atribui o valor à variável "valor"
```

#### Listas
Uma lista em Java é uma estrutura de dados dinâmica que permite armazenar elementos em uma sequência flexível. Ao contrário dos arrays, as listas têm tamanho variável e podem ser redimensionadas dinamicamente. A interface List é a principal interface para implementações de listas em Java. Algumas implementações comuns são ArrayList e LinkedList.
Para usar listas em Java, é necessário importar a classe java.util.List e a implementação específica da lista que você deseja utilizar.
Exemplo de declaração de uma lista de strings usando ArrayList:
```java
import java.util.List;
import java.util.ArrayList;

List<String> nomes = new ArrayList<>();
```
As listas possuem métodos convenientes para adicionar, remover, acessar e manipular elementos.
Exemplo de uso de alguns métodos da lista:
```java
nomes.add("Alice"); // Adiciona um elemento à lista
nomes.add("Bob");
int tamanho = nomes.size(); // Retorna o tamanho da lista
String primeiroNome = nomes.get(0); // Acessa o primeiro elemento da lista
nomes.remove(1); // Remove o elemento da lista no índice 1
```
As listas oferecem mais flexibilidade do que os arrays, permitindo adicionar e remover elementos facilmente, bem como fornecer métodos para busca, ordenação e outras operações úteis.

Em resumo, os arrays são estruturas de dados estáticas com tamanho fixo, enquanto as listas são estruturas dinâmicas que podem ser redimensionadas. As listas em Java fornecem uma interface mais flexível e uma gama mais ampla de operações, mas os arrays são úteis quando se precisa de uma estrutura simples e de tamanho fixo.

## Data-Hora
### [clique aqui para ver os exercícios](/data_hora/README.md)

Em Java, a manipulação de data e hora é realizada por meio do pacote java.time. Essa API introduzida a partir do Java 8 fornece classes e métodos poderosos para trabalhar com datas, horas, intervalos e fusos horários. Vamos explorar os principais conceitos de data e hora em Java:

### Classes Principais

#### `LocalDate`
- Representa uma data sem informações de hora e fuso horário.
- É utilizada para manipular datas, como aniversários, datas de eventos, etc.
- Exemplo de criação de um objeto `LocalDate` para representar a data atual:
```java
LocalDate dataAtual = LocalDate.now();
```

#### `LocalTime`
- Representa um horário sem informações de data e fuso horário.
- É utilizada para manipular horários específicos, como o horário de abertura de uma loja, horário de eventos, etc.
- Exemplo de criação de um objeto `LocalTime` para representar um horário específico:
```java
LocalTime horario = LocalTime.of(14, 30); // 14:30
```

#### `LocalDateTime`
- Representa uma combinação de data e hora, sem informações de fuso horário.
- É utilizada para manipular datas e horários juntos, como registros de eventos, agendamentos, etc.
- Exemplo de criação de um objeto LocalDateTime para representar uma data e hora específicas:
```java
LocalDateTime dataHora = LocalDateTime.of(2023, 7, 14, 10, 30); // 2023-07-14T10:30
```

#### `Instant`
- Representa um ponto específico na linha do tempo, com precisão de nanossegundos.
- É utilizada para trabalhar com timestamps, como registrar eventos em um sistema distribuído, sincronização de relógios, etc.
- Exemplo de criação de um objeto Instant para representar o instante atual:
```java
Instant instant = Instant.now();
```
#### `Conversão de Data e Hora para Texto`
- Para converter uma data ou hora em um formato específico para exibição ou armazenamento, podemos utilizar a classe DateTimeFormatter.
- Essa classe permite criar padrões personalizados para formatar ou analisar datas e horas.
- Exemplo de formatação de uma data em um formato personalizado:
```java
LocalDate data = LocalDate.now();
DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String dataFormatada = data.format(formato); // Retorna a data formatada como uma string
```

#### `Operações com Data e Hora`
- A API java.time oferece métodos convenientes para realizar operações com datas e horas, como adição, subtração, comparação, etc.
- Exemplo de adição de um período de dias a uma data:
```java
LocalDate data = LocalDate.now();
LocalDate dataMais5Dias = data.plusDays(5); // Adiciona 5 dias à data atual
```

#### Conversão entre Diferentes Tipos de Data e Hora
- É possível converter entre diferentes tipos de objetos de data e hora usando os métodos fornecidos pela API.
- Exemplo de conversão de um objeto LocalDateTime para Instant:
```java
LocalDateTime dataHora = LocalDateTime.now();
Instant instant = dataHora.toInstant(); // Converte o LocalDateTime para Instant
```

Esses são apenas alguns dos principais conceitos relacionados à manipulação de data e hora em Java. A API java.time oferece muitas outras classes e recursos para lidar com diferentes casos de uso relacionados a datas e horas.

É importante lembrar de considerar fusos horários, formatos de data e hora específicos, além de lidar com exceções e erros que podem ocorrer durante a manipulação de dados temporais.

Consulte a documentação oficial da API java.time para obter mais detalhes e exemplos de uso: [Documentação oficial da API java.time.](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/time/package-summary.html)

## Tratamento de Exceções

### O que é uma exceção?
Uma exceção em Java é um evento anormal que ocorre durante a execução de um programa e que interrompe o fluxo normal de execução. As exceções podem ser causadas por diversos motivos, como erros de programação, entrada de dados inválida, problemas de hardware, entre outros. As exceções podem ser de dois tipos:

#### `Exceções Verificadas (Checked Exceptions):`

- As exceções verificadas são exceções que o compilador obriga você a tratar (ou declarar que seu método pode lançá-las usando a cláusula throws).
- Elas são normalmente usadas para lidar com situações que podem ocorrer durante a execução do programa, mas que podem ser previstas e tratadas de forma adequada.
- São subclasses da classe Exception que não herdam de RuntimeException. Isso significa que elas são verificadas pelo compilador e exigem tratamento.
- Exemplos de exceções verificadas incluem IOException, ClassNotFoundException e SQLException.
- Você precisa usar um bloco try-catch ou declarar explicitamente a exceção no método (usando throws) para lidar com exceções verificadas. Isso garante que o código que lida com essas exceções seja tratado de forma apropriada.

#### `Exceções Não Verificadas (Unchecked Exceptions):`

- As exceções não verificadas são exceções que não exigem tratamento obrigatório pelo compilador. Elas são subclasses de RuntimeException.
- Geralmente representam erros de programação ou condições inesperadas que podem ocorrer durante a execução do programa.
- Exemplos de exceções não verificadas incluem NullPointerException, ArrayIndexOutOfBoundsException e ArithmeticException.
- Como o compilador não obriga o tratamento dessas exceções, é responsabilidade do programador tomar medidas para evitar que elas ocorram, quando possível, ou para capturá-las e tratá-las adequadamente.
- Apesar de não serem obrigatórias de serem tratadas, ainda é uma boa prática capturar e tratar exceções não verificadas quando você puder prever que elas possam ocorrer, a fim de melhorar a robustez do seu programa.

### Hierarquia de Exceções

Em Java, as exceções são organizadas em uma hierarquia de classes que começa com a classe Throwable. Essa hierarquia é dividida em duas categorias principais: exceções e erros, ambas subclasses de Throwable. Vou explicar essa hierarquia em mais detalhes:

#### `1. Throwable:`
- É a raiz da hierarquia de exceções em Java.
- Possui duas subclasses principais: Error e Exception.
- 
#### `2. Error:`
- Representa condições irrecuperáveis que normalmente estão fora do controle do programador.
- Erros geralmente indicam problemas no ambiente de execução, como falta de recursos ou falhas no sistema.
- Os erros não são normalmente capturados e tratados pelo programa, pois não se espera que o programa possa se recuperar deles.
Exemplos de erros incluem OutOfMemoryError e StackOverflowError.

#### `3. Exception:`
- Representa condições excepcionais que podem ocorrer durante a execução do programa, mas que podem ser previstas e tratadas.
- As exceções são subdivididas em duas categorias: exceções verificadas (checked exceptions) e exceções não verificadas (unchecked exceptions).
Exceções Verificadas (Checked Exceptions):

### Bloco Try-Catch

#### `1. Bloco Try`
Você coloca o código que pode lançar uma exceção dentro de um bloco try. Isso isola esse trecho de código, permitindo que o programa continue sua execução mesmo se uma exceção for lançada.

#### `2. Bloco Catch`
Em seguida, você pode definir um ou mais blocos catch logo após o bloco try. Cada bloco catch especifica um tipo de exceção que deseja capturar e tratar. Se a exceção especificada ocorrer no bloco try, o código no bloco catch correspondente será executado.

#### `3. Tratamento da Exceção`
Dentro do bloco catch, você pode adicionar código para lidar com a exceção, seja exibindo uma mensagem de erro, registrando informações relevantes ou tomando medidas específicas para recuperar-se da situação excepcional.

Exemplo de utilização:

```java
public class ExemploTryCatch {

    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;

        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Erro de divisão por zero: " + e.getMessage());
        }
    }
}

```

### Bloco Finally

O bloco finally é uma construção fundamental em Java que complementa o bloco try-catch no tratamento de exceções e na gestão de recursos. O bloco finally é usado para definir código que deve ser executado, independentemente de ocorrerem exceções ou não. Ele é útil para garantir que recursos sejam liberados adequadamente, como fechar arquivos, conexões de banco de dados ou sockets, independentemente do resultado da execução do bloco try.

Exemplo de Uso:

```java
FileReader arquivoLeitura = null;
try {
    arquivoLeitura = new FileReader("arquivo.txt");
    // Código para ler o arquivo
} catch (IOException e) {
    // Tratamento de exceções
} finally {
    if (arquivoLeitura != null) {
        try {
            arquivoLeitura.close();
        } catch (IOException e) {
            // Tratamento de exceções durante o fechamento do arquivo
        }
    }
}

```
### Criando exceções personalizadas 

Exceções personalizadas são exceções que você cria em sua aplicação Java, estendendo as classes de exceção existentes, como Exception ou RuntimeException, para representar erros ou situações específicas dentro do seu código.

#### `Como criar uma exceção personalizada?`

1. Crie uma nova classe que estenda Exception (ou uma de suas subclasses, como RuntimeException) para representar sua exceção personalizada.
```java

public class MinhaExcecaoPersonalizada extends Exception {
    public MinhaExcecaoPersonalizada() {
        super("Esta é uma exceção personalizada.");
    }

    public MinhaExcecaoPersonalizada(String mensagem) {
        super(mensagem);
    }
}
```
- No construtor da sua exceção personalizada, você pode passar uma mensagem de erro personalizada para a classe pai usando super(mensagem).
- Você também pode adicionar métodos e atributos adicionais à sua exceção personalizada, dependendo das necessidades da sua aplicação.

2. Lance e captura suas Exceções Personalizadas
Para lançar uma exceção personalizada, você pode simplesmente criar uma instância da sua exceção e lançá-la:
```java
if (algumaCondicao) {
    throw new MinhaExcecaoPersonalizada("Ocorreu um erro específico.");
}
```

Para capturar uma exceção personalizada, use um bloco try-catch:
```java
try {
    // Código que pode lançar MinhaExcecaoPersonalizada
} catch (MinhaExcecaoPersonalizada e) {
    // Tratar a exceção personalizada
    System.err.println("Exceção personalizada capturada: " + e.getMessage());
}
```
Criar exceções personalizadas é uma prática comum em Java para tornar seu código mais claro, robusto e adaptado às necessidades da sua aplicação. Isso permite que você represente de forma adequada e semântica as situações excepcionais específicas que podem ocorrer ao longo do desenvolvimento do seu programa.


## Generics

Generics são uma poderosa característica da linguagem de programação Java que permitem escrever código flexível e reutilizável. Eles desempenham um papel fundamental no fornecimento de tipos paramétricos, o que significa que você pode criar classes, interfaces e métodos que operam em tipos especificados em tempo de compilação, em vez de tipos fixos.

### Benefícios dos Generics

- `Segurança de Tipo:` Generics fornecem um mecanismo para garantir que apenas tipos apropriados sejam usados em um contexto particular, o que reduz erros em tempo de execução.

- `Reutilização de Código:` Com generics, você pode criar componentes que funcionam com diferentes tipos de dados, promovendo a reutilização de código.

- `Legibilidade do Código:` O código com generics tende a ser mais legível, pois declara claramente quais tipos de dados são esperados e retornados por uma classe ou método.

### Sintaxe Básica

```java
public class Caixa<T> {
    private T valor;
    
    public T getValor() {
        return valor;
    }
    
    public void setValor(T valor) {
        this.valor = valor;
    }
}
```




















## Contribuição 👋

Embora o JavaCodeLab seja um repositório pessoal, eu sempre estou aberta a sugestões e colaborações. Se você tiver alguma sugestão, dica ou correção em relação ao código ou aos conceitos que estou estudando, por favor, sinta-se à vontade para contribuir!

Aqui estão algumas maneiras de contribuir para o JavaCodeLab:

- **Reportar problemas**: Se você encontrar algum problema ou bug no código, por favor, abra uma nova *issue* e descreva o problema detalhadamente. Ficarei feliz em corrigir e melhorar o código.

- **Fornecer sugestões**: Se você tiver ideias de como melhorar o código ou sugestões para novos recursos, fique à vontade para compartilhar suas ideias através das *issues*. Adoro ouvir diferentes perspectivas e ideias criativas!

- **Enviar solicitações de pull**: Se você quiser contribuir diretamente com o código, sinta-se à vontade para enviar uma solicitação de pull. Certifique-se de descrever suas mudanças e o motivo por trás delas para facilitar o processo de revisão.

- **Compartilhar conhecimento**: Se você tiver algum conhecimento ou dica relacionados aos conceitos que estou estudando, compartilhe através das *issues* ou dos comentários. Acredito que a troca de conhecimento é fundamental para o crescimento pessoal e profissional.

Lembre-se de que o JavaCodeLab é um espaço de aprendizado e desenvolvimento, então vamos manter uma atmosfera colaborativa, respeitosa e inclusiva.

Obrigado por visitar o JavaCodeLab! Vamos aprender e evoluir juntos! 🚀



