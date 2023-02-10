# Bem vindo à DEVinHouse <img width="180px" alt="Philips" src="./src/assets/images/logo-phil.png"/>
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

# Lista de exercícios <img width="75px" alt="Philips" src="./src/assets/images/lista.png"/>
### [M1S11] Ex 1 - Criando um pipe

Com a ajuda do decorator @pipe crie um pipe com o ng g p pipes/captalizePhillips para transformar a primeira letra de cada palavra em maiúscula.

### [M1S11] Ex 2 - Menu

O exercício consiste em fazer uma navbar, com ajuda do bootstrap ou não, como no exemplo da imagem em anexo para acessar diferentes componentes ou containers html ao clicar em cada uma das opções.

- Depois do fechamento da tag html <navbar> cole o código abaixo:

```
<div>
  <h2>Estou na página de Home</h2>
  <h2>Estou na página de Preços</h2>
  <h2>Estou na página de Informações</h2>
</div>
```
    
- Declare na classe do seu componente uma variável page do tipo string.
- Com a construção da sua navbar adicione um evento de click em cada uma das opções da navbar e no seu valor diga que a variável page recebe um valor correspondente a aquela página, como se fosse um id. <br>
Exemplo: levando em conta o exemplo na imagem em anexo, será adicionado um evento de click na palavra Home onde seu valor será page=‘Home’ ( (click)=”page = ‘Home’” ).
- Já na `<div>` deverá ser adicionada a diretiva ngSwitch passando a variável page como valor.
- Após isso em cada tag html `<h2>` será adicionada a cláusula ngSwitchcase recebendo o valor correspondente a aquela página. Ex: no segundo h2 ficaria *ngSwitchCase=”’Preços’”.
- O primeiro h1 deve ser o valor padrão para o ngSwitchDefault.

### [M1S11] Ex 3 - ngFor

Em um projeto angular na classe do seu component declare a variável abaixo.

```
arrayFotos: any = [
  {
    url: "",
    description:""
  },
  {
    url: "",
    description:""
  },
  {
    url: "",
    description:""
  },
  {
    url: "",
    description:""
  },
  {
    url: "",
    description:""
  }
]
```

- A variável arrayFotos consiste em um array de objetos com duas propriedades, a url que recebe o caminho da sua foto e a description contendo uma breve descrição da foto.
- Agora escolha 5 imagens de sua preferência, a url de cada imagem deve ser armazenada dentro da propriedade url e a descrição dentro da description.
- Já no html do componente faça um card usando classes do css ou bootstrap, o design fica a sua escolha.
- Com o uso do ngFor repita e mostre cada imagem em um card diferente com a descrição dela abaixo da imagem.

### [M1S11] Ex 4 - ngIf

Para treinar a diretiva ngIf vamos seguir as instruções abaixo:

- Inicie um projeto angular e no css do seu componente cole o código do arquivo em anexo.
- Depois disso adicione no template html do seu componente o código abaixo.

```
<div class="card">
  <a>Open Demo Modal</a>
</div>

<div class="modal">
  <div class="modal__content">
    <h1>Example modal</h1>
    <p>
      Lorem ipsum dolor sit amet consectetur adipisicing elit. Error minima
      libero veniam, modi corrupti doloremque repellendus vitae mollitia. Ipsum
      voluptatibus ea ab quos molestiae at expedita maiores dolore a corrupti!
    </p>
    <a class="modal__close">&times;</a>
  </div>
</div>
```

- Declare uma variável chamada showModal do tipo boolean na classe do seu componente.
- Após isso nas duas tags html <a> com a ajuda do evento de click mude a variável para o valor contrário ao valor atual.
- Já na tag html <div> que possui a classe ‘modal’, adicione a diretiva ngIf para apenas mostrar essa <div> caso a variável for true.

### [M1S11] Ex 5 - ng-content

Utilizando o modal criado no exercício 04, substitua toda a tag HTML <p> por ng-content , chame esse componente em outro local e adicione um parágrafo com lorem ipsum.

### [M1S11] Ex 6 - ng-content

Observe a imagem em anexo, crie um componente e recrie um modelo igual ou semelhante a ela, porém o título, o subtítulo e a descrição deverão ser passados através do ng-content. <br>
Dica: Lembre-se das aulas onde são passados dois tipos de content para o mesmo componente.

### [M1S11] Ex 7 - ngIf e else

Usando um input html crie uma validação para se caso o input estiver com a validação correta apareça uma mensagem com a fonte verde e se caso não estiver correta, aparecer uma mensagem em vermelha. Pode usar a criatividade para a estilização que quiser e para a mensagem também.
OBS: Utilize ngIf e else (com o uso do ng-template) para trocar as mensagens.

### [M1S11] Ex 8 - Revisão geral

Em um projeto angular e com ajuda do bootstrap monte uma lista de tarefas onde você poderá adicionar itens a partir de um `<input>`, esse `<input>` receberá um ngModel para armazenar a string que será digitada pelo usuário. Feito isso, vamos às observações:

- A variável que carrega a listagem deve ser declarada na classe do componente e inicialmente será vazia.
- No html do componente deverá ter um `<input>` para cadastrar sua tarefa, um botão para adicionar (tag `<button>`), a listagem (tag `<ul>` e `<li>`) e uma mensagem de aviso para quando a listagem for vazia (tag `<p>`).
- Ao clicar no botão de salvar item a função que adiciona um item ao array deverá ser ativada para adicionar esse item digitado ao array de strings ( .push ).
- O container que carregará a listagem apenas se tornará visível quando estiver com no mínimo 1 item no array de tarefas.
- Deverá ser apresentada uma mensagem de aviso para quando o array estiver vazio. Faça isso com ajuda no ngIf.
- A listagem será processada em um ngFor e com isso no container que será repetido irá imprimir cada item do array.

---

# O que é DEVinHouse?
DEVinhouse é uma jornada de aceleração da carreira com: grade curricular direcionada, professores do mercado, prática constante, interação frequente com as houses parceiras de cada turma, simulação do dia-a-dia DEV e vagas exclusivas que são abertas pelas Houses durante a jornada.

No DEVinHouse você vira um desenvolvedor Fullstack em 9 meses, ao longo de 900 horas de conteúdo, divididas em três módulos de 3 meses cada, com intervalo de uma semana entre cada um. Aproximadamente 25 horas de dedicação por semana entre aulas, atividades e vivências.

__1º módulo:__ Front-End – JavaScript e Angular <br/>
__2º módulo:__ Back-End – Java, Spring e SQL <br/>
__3º módulo:__ Full-Stack – Scrum, DevOps, Clean Code e Design Patterns <br/>
__Ferramentas__ – GitHub, Trello e Slack

---

# Tecnologias Utilizadas <img width="35px" alt="🌐" src="./src/assets/images/tag.gif"/>
Nos exercícios dessa semana foram utilizadas as seguintes tecnologias:
<div style="display: inline_block">
    <img align="center" alt="Angular" src="https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white"/>
    <img align="center" alt="Bootstrap" src="https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white"/>
    <img align="center" alt="TypeScript" src="https://img.shields.io/badge/TypeScript-007ACC?style=for-the-badge&logo=typescript&logoColor=white"/>
    <img align="center" alt="HTML5" src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white"/>
    <img align="center" alt="CSS3" src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white"/>
    <img align="center" alt="JavaScript" src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"/>
</div>
