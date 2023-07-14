# JavaCodeLab
<img src="/imgs/java.png" alt="Logo do Java" width="180" height="100"> 

Bem-vindo ao meu repositório JavaCodeLab! 

Este repositório contém minha jornada na linguagem Java. Aqui, você encontrará uma coleção de listas de exercícios que realizei cuidadosamente enquanto estudava o vasto universo do Java. Comecei este repositório em meu 4º semestre da faculdade de Engenharia de Software, enquanto realizava o curso "Java COMPLETO" do Professor Nélio Alves

Espero que esses exercícios possam guiar você em uma jornada de aprendizado, crescimento e transformação assim como me guiaram. 

## Tópicos disponíveis

- [Conceitos Iniciais de POO](#conceitos-iniciais-de-poo)
- [Arrays e Listas](#arrays-e-listas)

## Conceitos Iniciais de POO 
### [clique aqui para ver os exercícios](/conceitos_iniciais_poo/README.md)

A lista "Conceitos Iniciais de POO" contém exercícios relacionados aos conceitos fundamentais de Programação Orientada a Objetos. Esses exercícios visaram fortalecer o entendimento dos princípios iniciais de POO, como classes, atributos, membros estáticos e a classe Object.

### Conceitos aplicados nesta lista

#### Classes e Objetos
Os programa utilizam duas classes principais - a classe Main e uma classe Entidade que muda conforma o programa. A classe "Main" é geralmente considerada a classe principal de um programa. Ela contém o ponto de entrada para o programa, onde a execução começa e é responsável por coordenar a lógica geral do programa. A classe "Entidade" é um conceito genérico que representa uma abstração de algo que possui características e comportamentos específicos. Ela serve como um modelo ou molde para criar objetos individuais desse tipo. Cada objeto da classe "Entidade" terá seus próprios valores para as variáveis e terá acesso aos métodos definidos na classe.

#### Encapsulamento
Os atributos das classes são declarados como públicos, permitindo acesso direto a eles. Embora isso seja utilizado para fins de simplicidade neste exemplo, lembre-se que em cenários mais complexos, é recomendado o uso de modificadores de acesso adequados e métodos getters e setters para controlar o acesso aos atributos.

#### Métodos
Os métodos são blocos de código que definem comportamentos ou ações específicas para uma classe ou objeto. Eles permitem que os objetos executem tarefas, interajam com outros objetos e forneçam informações úteis para o programa.

#### Entrada e Saída de Dados com a Classe Scanner
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


## Contribuição

Sinta-se à vontade para contribuir com este repositório! Se você tiver exercícios adicionais, melhorias ou correções, ficarei em receber suas contribuições. Basta fazer um fork deste repositório, criar uma branch para suas alterações e enviar um pull request.

Espero que você aproveite as listas de exercícios e que elas sejam úteis para aprimorar suas habilidades em Java!

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



