# README - Cuidados com Input e Output em Programação

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
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        System.out.println("Valor lido: " + valor);
        input.close(); // Fecha o Scanner corretamente
    }
}
