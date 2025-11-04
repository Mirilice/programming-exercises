# Quantidade de Questões Resolvidas por Linguagem

Questões divididas por linguagem de programação:

| Linguagem | Questões Resolvidas |
|-----------|---------------------|
| Java      |  8                  |
| Python    |  8                  |
| C         |  8                  |
| JavaScript|  8                  |
| C#        |  8                  |
| **Total** | 40                  |

Questões divididas por plataforma:

| Site      | Questões Resolvidas |
|-----------|---------------------|
| Beecrowd  | 38                  |
| LeetCode  |  2                  |
| **Total** | 40                  |

Questões divididas por tópico:

|          Tópico           |       Questões Resolvidas               |
|---------------------------|-----------------------------------------|
| Iniciante                 | 35    ![](https://geps.dev/progress/89) |
| Ad-Hoc                    |  2    ![](https://geps.dev/progress/5)  |
| Strings                   |  1    ![](https://geps.dev/progress/2)  |
| Estruturas e Bibliotecas  |  1    ![](https://geps.dev/progress/2)  |
| Matemática                |  1    ![](https://geps.dev/progress/2)  |
| **Total**                 | 40    ![](https://geps.dev/progress/100)|

# Cuidados em Programação

## Erro de Apresentação (Presentation Error)

O erro de apresentação ocorre quando a saída do programa está correta em termos de valores, mas contém diferenças sutis em espaços, quebras de linha ou formatação. Para evitar esse erro:

- Certifique-se de seguir rigorosamente o formato de saída solicitado.
- Evite espaços extras no final das linhas.
- Verifique se há quebras de linha a mais ou a menos.
- Utilize ferramentas de comparação para checar se a saída gerada é idêntica à esperada.

## Importância do `input.close()` no Java

No Java, ao utilizar a classe `Scanner` para entrada de dados, é fundamental fechar o objeto após o uso com `input.close();`. Isso porque:

- **Libera recursos do sistema:** O `Scanner` utiliza um fluxo de entrada, e não fechá-lo pode causar vazamento de memória.
- **Evita possíveis conflitos:** Em alguns casos, manter o `Scanner` aberto pode interferir na leitura de dados posteriores.
- **Boa prática de programação:** Fechar fluxos de entrada e saída quando não são mais necessários melhora a eficiência e a segurança do código.

**Exemplo de uso:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        System.out.println("Valor lido: " + valor);
        input.close(); // Fecha o Scanner corretamente
    }
}
```

## Importância do `import java.io.IOException;` 

A inclusão dessa importação é necessária quando se trabalha com operações de entrada e saída em Java que podem gerar exceções, como leitura de arquivos ou outros fluxos. O IOException captura exceções de entrada e saída.

**Exemplo de uso:**
```java
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Exemplo de código que pode gerar IOException
    }
}
```

## Importância do `.equalsIgnoreCase` em Java

O método `.equalsIgnoreCase` é usado para comparar duas strings sem considerar diferenças entre maiúsculas e minúsculas. Isso é útil quando queremos garantir comparações case-insensitive.

**Exemplo de uso:**
```java
String str1 = "Hello";
String str2 = "hello";
if (str1.equalsIgnoreCase(str2)) {
    System.out.println("As strings são iguais.");
}
```

## Importância do `toUpperCase().charAt()` em Java

Em Java, o método `toUpperCase()` converte todos os caracteres de uma string para maiúsculo, enquanto o `charAt()` retorna o caractere na posição especificada. Juntos, são úteis quando queremos comparar ou manipular caracteres específicos de forma insensível a maiúsculas e minúsculas.

**Exemplo de uso:**
```java
String str = "java";
char c = str.toUpperCase().charAt(0); // 'J'
```

## Como fazer String format em Java, Python, C e JavaScript

- **Java: `String.format` ou `System.out.printf`**

```java
System.out.printf("Valor: %.2f\n", 10.5);
```

- **Python: Usando `f-strings` ou `.format`**

```python
valor = 10.5
print(f'Valor: {valor:.2f}')
```

- **C: Usando `printf`**

```c
printf("Valor: %.2f\n", 10.5);
```

- **JavaScript: Usando template literals ou o método `toFixed()`**

```javascript
let valor = 10.5;
console.log(`Valor: ${valor.toFixed(2)}`);
```

## Importância do `var input = require('fs').readFileSync('/dev/stdin', 'utf8');` no JavaScript

Esse código é usado para ler a entrada diretamente do fluxo padrão no Node.js. É útil quando queremos processar múltiplas linhas de entrada em competições de programação ou outras situações em que precisamos ler grandes quantidades de dados de forma eficiente.

**Exemplo de uso:**
```javascript
var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
```

## Importância do `trim()` em JavaScript

O método `trim()` é usado para remover espaços em branco no início e no final de uma string. Isso é essencial quando precisamos garantir que a string esteja limpa para processamento, evitando problemas com comparações e validações.

**Exemplo de uso:**
```javascript
let str = "  exemplo  ";
str = str.trim(); // 'exemplo'
```

## Importância do `parse` em JavaScript

O `parseInt()` ou `parseFloat()` são usados para converter strings em números inteiros ou flutuantes. Isso é essencial quando precisamos manipular entradas numéricas em formato de texto.

**Exemplo de uso do `parseInt()`:**
```javascript
let str = "123";
let num = parseInt(str);
console.log(num); // 123
```

## Como ler mais de uma variável numa mesma entrada (para Java, Python, JS e C, C#)

- **Java:**
```java
Scanner input = new Scanner(System.in);
int a = input.nextInt();
int b = input.nextInt();
```

- **Python**
```python
a, b = map(int, input().split())
```

- **JavaScript**
```javascript
let [a, b] = input().split(' ').map(Number);
```

- **C**
```c
int a, b;
scanf("%d %d", &a, &b);
```

- **C#**
```c#
string[] input = Console.ReadLine().Split(); // Lê a linha e divide em partes
int A = int.Parse(input[0]); // Converte o primeiro valor para inteiro
int B = int.Parse(input[1]); // Converte o segundo valor para inteiro
Console.WriteLine($"A = {A}, B = {B}");
```

## Fixar casas decimais (em Java, Python, JS e C)

- **Java: Usar `String.format()` ou `System.out.printf()`**
```java
System.out.printf("%.2f\n", 3.14159);
```

- **Python: Usar `format()` ou `f-strings`**
```python
print(f'{3.14159:.2f}')
```

- **JavaScript: Usar `toFixed()`**
```javascript
let valor = 3.14159;
console.log(valor.toFixed(2));
```

- **C: Usar `printf`**
```c
printf("%.2f\n", 3.14159);
```

## Importância do `append` no Python

O método `append()` é usado para adicionar um item no final de uma lista. Isso é importante quando queremos modificar a lista mantendo sua ordem e tamanho.

**Exemplo de uso:**
```python
lista = [1, 2, 3]
lista.append(4)
print(lista)  # [1, 2, 3, 4]
```

## Importância do `join()` no Python

O método `join()` é usado para concatenar os elementos de uma lista ou tupla em uma única string, separando-os por um delimitador. É útil quando precisamos formar uma string a partir de uma lista de elementos.

**Exemplo de uso:**
```python
lista = ['a', 'b', 'c']
print(' '.join(lista))  # 'a b c'
```
























