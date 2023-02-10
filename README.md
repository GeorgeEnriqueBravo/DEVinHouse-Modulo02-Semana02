# Bem vindo à DEVinHouse <img width="180px" alt="Philips" src="ExerciciosM02S02/images/logo-phil.png"/>
## Módulo 02 - Semana 02

Eu desenvolvi um projeto `Java` para a elaboração dos 10 exercícios referentes a essa semana. <br>

Para visualizar o meu projeto, <a href="https://github.com/GeorgeEnriqueBravo/DEVinHouse-Modulo02-Semana02/archive/refs/heads/main.zip" target="_blank">
    clique aqui
</a>
para baixa-lo. <br>

Após o download, abra a pasta "ExerciciosM02S02" utilizando o software `IntelliJ`. Para baixar a última versão grátis do IntelliJ 
<a href="https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC" target="_blank">
    clique aqui
</a>.
  
---

# Lista de exercícios <img width="75px" alt="Philips" src="ExerciciosM02S02/images/lista.png"/>
### [M2S02] Ex 1 - Acesse elementos de um Array

Implemente um código copiando o array abaixo, e depois imprima no console o valor dos seguintes elementos:

int[] arr = { 56, 57, 58, 67, 99, 12, 11, 88 };

a) Imprima o valor do primeiro elemento; <br>
b) Imprima o valor do último elemento; <br>
c) Imprima o valor do terceiro elemento; <br>

### [M2S02] Ex 2 - Acesse elementos de um Array (multidimensional)

Implemente um código copiando o array abaixo, e depois imprima no console o valor dos seguintes elementos:

```
double[][] notas = {
    {10, 8.5, 5.5, 9.5},
    {8.5, 7, 7.5, 6},
    {8, 9, 10, 7.5},
    {9, 9.5, 10, 8}
};
```
    
a) Imprima o valor da nota do primeiro elemento do terceiro array de notas. <br>
b) Imprima o valor da nota do segundo elemento do quarto array de notas. <br>
c) Imprima o valor da soma das quatro primeiras notas de cada array. <br>

### [M2S02] Ex 3 - Estrutura de Repetição

Percorra array com estrutura de repetição e faça operações com condicionais:

O array abaixo representa lançamentos na conta bancária do Luke.
Os valores negativos são débitos e os valores positivos são créditos.

Implemente um código copiando o array abaixo, e depois imprima no console o que se pede:

int[] extrato = { 100, -35, -15, -5, 55, -20 };

a) Percorra o array (operador 'for') e imprima cada elemento do array na ordem; <br>
b) Percorra o array (operador 'for') e imprima os elementos de trás pra frente (do último para o primeiro); <br>
c) Percorra o array (operador 'for') e calcule o saldo final da conta (valor inicial era zero), <br>
imprima o resultado no console. (Dica: crie uma variável saldo inicializada com zero e vá atualizando seu valor); <br>
d) Imprima no console a mensagem 'saldo positivo' ou 'saldo negativo', dependendo do resultado do saldo final calculado.

### [M2S02] Ex 4 - Estrutura de Repetição e Condicionais

Mike tem um nro da sorte: 25. <br>
Ele conseguiu uma listagem do histórico dos resultados da loteria conforme arrays abaixo. <br>
Escreva um código para percorrer os elementos de nros sorteados e contabilizar quantas vezes o nro da sorte dele foi sorteado.

- Dica: Usar um for dentro do outro para percorrer os arrays internos.

```
int sorteados[][] = {
    { 1, 44,  6,  2, 45, 60},
    {10, 21, 55, 25, 34, 44},
    { 8, 18, 28, 29, 55, 59},
    {60, 25, 11, 34,  6,  9},
    {55, 43, 25, 12,  7, 11}
};
```

### [M2S02] Ex 5 - Estrutura de Repetição e Condicionais

Implemente uma função 'calcular' que receba como parâmetro um array (numérico) e identifique o maior e menor valor do mesmo. Imprima no console estes valores ou "Não é possível calcular" qdo não for possível.

Teste a função com as seguintes entradas:

- {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47}
- {1}
- {1, -1}
- null
- {-2,-2,-2,-2}
- {20,10, 30}

### [M2S02] Ex 6 - Listas

Dado a lista de números:

List<Integer> lista = Arrays.asList(1,2,3,4);

Percorra a lista e gere uma nova com o triplo do valor de cada elemento:
    
### [M2S02] Ex 7 - Listas
    
Dado a lista de nomes:

List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");

a) Percorra a lista usando o operador 'for' clássico, usando uma variável para iterar pelos índices, e imprima no console os valores de cada nome; <br>
b) Percorra a lista usando o operador 'for-each' usando a forma simplificada, e imprima no console os valores de cada nome; <br>
c) Percorra a lista usando o operador 'while', e imprima no console os valores de cada nome;

### [M2S02] Ex 8 - Listas
    
Localize na lista abaixo e imprima no console a primeira ocorrência de número maior que 50.

List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);
    
### [M2S02] Ex 9 - Estrutura de Repetição
    
Antigamente tinha um programa de televisão onde o apresentador chamava alguém da platéia e fazia o seguinte desafio valendo um prêmio: a pessoa tinha que contar até determinado número, por exemplo de 0 a 30, e a cada múltiplo de um número (por exemplo 3) deveria substituir pela palavra "PIN".
Apesar de parecer fácil, muita gente se enrolava e nao conseguia chegar no final do jogo.

Lembrando que para saber se é múltiplo de um número basta dividi-lo por este número e certificar que o resto da divisão é zero.
Exemplo: 16 é múltiplo de 4 porque 16 % 4 == 0;

Então, dada o array com a sequência abaixo (de 0 a 30), use a função 'for' para iterar sobre seus elementos e a cada múltiplo de 3 imprimir a palavra 'PIN', ou o próprio número caso contrário.

int[] sequencia = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
21,22,23,24,25,26,27,28,29,30};
    
### [M2S02] Ex 10 - Estrutura de Repetição
    
Um palíndrome (ou palíndromo), segundo o dicionário Houaiss,
"diz-se de frase ou palavra que se pode ler, indiferentemente, da esquerda para direita ou vice-versa", como por exemplo: osso, ana, radar.
Ou seja, é uma palavra que quando lida de trás pra frente tem o mesmo significado.

Implemente um código com o que aprendemos até agora que retorne se determinada palavra é um palíndromo.
    
---

# O que é DEVinHouse?
DEVinhouse é uma jornada de aceleração da carreira com: grade curricular direcionada, professores do mercado, prática constante, interação frequente com as houses parceiras de cada turma, simulação do dia-a-dia DEV e vagas exclusivas que são abertas pelas Houses durante a jornada.

No DEVinHouse você vira um desenvolvedor Fullstack em 9 meses, ao longo de 900 horas de conteúdo, divididas em três módulos de 3 meses cada, com intervalo de uma semana entre cada um. Aproximadamente 25 horas de dedicação por semana entre aulas, atividades e vivências.

__1º módulo:__ Front-End – JavaScript e Angular <br/>
__2º módulo:__ Back-End – Java, Spring e SQL <br/>
__3º módulo:__ Full-Stack – Scrum, DevOps, Clean Code e Design Patterns <br/>
__Ferramentas__ – GitHub, Trello e Slack

---

# Tecnologias Utilizadas <img width="35px" alt="🌐" src="ExerciciosM02S02/images/tag.gif"/>
Nos exercícios dessa semana foram utilizadas as seguintes tecnologias:
<div style="display: inline_block">
    <img align="center" alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
    <img align="center" alt="Trello" src="https://img.shields.io/badge/Trello-0052CC?style=for-the-badge&logo=trello&logoColor=white"/>
    <img align="center" alt="GitHub" src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"/>
</div>
