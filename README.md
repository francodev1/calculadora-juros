# Cálculo de Juros em Java

Este projeto é uma aplicação em Java que permite calcular juros simples e compostos, além de calcular a taxa de juros a partir de um montante final, capital inicial e tempo. A aplicação é projetada para ser interativa, permitindo que o usuário escolha o tipo de cálculo desejado.

## Funcionalidades

- Cálculo de **Juros Simples**
- Cálculo de **Juros Compostos**
- Cálculo da **Taxa de Juros** a partir do montante final

## Tecnologias Utilizadas

- Java 22
- IDE: IntelliJ IDEA
- Pacotes:
    - `entities`: contém a classe `Juros` que representa os dados necessários para os cálculos.
    - `service`: contém as classes `SimplesService`, `CompostoService`, e `TaxaJurosService`, que implementam as regras de cálculo.

## Estrutura do Projeto

````commandline
 ├── src │ ├── entities │ │ └── Juros.java │ ├── service │ │ ├── CompostoService.java │ │ ├── SimplesService.java │ │ └── TaxaJurosService.java │ └── Main.java └── README.md
````



## Como Usar

Para usar este programa, basta compilar e executar a classe `Main`. O usuário será solicitado a escolher o tipo de cálculo desejado e a inserir os valores necessários. O resultado do cálculo será exibido no console.

## Exemplo de Uso

```plaintext
Escolha seu tipo de cálculo:
1 - Juros Simples
2 - Juros Compostos
3 - Cálculo de taxas de juros

Para Juros Simples:

Capital: 1000
Taxa: 5 (em %)
Tempo: 1 (ano)
Resultado:

Montante: 1050.00


Para Juros Compostos:

Capital: 1000
Taxa: 5 (em %)
Tempo: 1 (ano)
Resultado:

Montante: 1050.00

Para Calcular Taxa de Juros:

Montante Final: 1050
Capital Inicial: 1000
Tempo: 1 (ano)
Resultado:

Taxa de juros: 5.00
```


### Observações Finais

Esse `README.md` agora está formatado para fornecer todas as informações sobre o projeto sem passos individuais de instalação ou uso, concentrando-se nas funcionalidades e no exemplo de uso. Se precisar de mais alguma coisa ou ajustes adicionais, é só avisar!


## Autor
### Lucas Franco