# Exercícios sobre Listas em Java

---

## Exercício 1 (Fácil) - Lista de Cores

Crie uma lista (`ArrayList`) de 5 cores e exiba todas usando o laço `for-each`.

**Tarefas:**
1. Importar `java.util.ArrayList`
2. Criar um `ArrayList<String>` chamado `cores`
3. Adicionar 5 cores diferentes
4. Exibir todas as cores usando `for (String cor : cores)`

Resposta:




    import java.util.Array.list;

    public class Main {
        public static void main(String[] args) {
        
            ArrayList<String> cores = new ArrayList<>():
       
            cores.add("Azul");
            cores.add("Verde");
            cores.add("Vermelho");
            cores.add("Preto");
            cores.add("Branco");

            for (String cor : cores) {
                System.out.printIn(cor);
            }
        }
    }
    

---

## Exercício 2 (Fácil) - Soma de Números

Crie um programa que adiciona os números de 1 a 10 em uma lista e depois calcula e exibe a soma total.

**Tarefas:**
1. Criar um `ArrayList<Integer>`
2. Adicionar os números de 1 a 10 usando um laço `for`
3. Calcular a soma percorrendo a lista
4. Exibir: `"A soma dos números é: X"`

Resposta:

    import java.util.ArrayList;

    public class Main {

        public static void main(String[] args) {
            ArrayList<Interager> numeros = new ArrayList <>();
            for (int i = 1; i <=10;i++) {
            numeros.add(i);
        }
        int soma = 0;

        for (int numero : numero) {
            soma += numero;
        }
        System.out.printin("A soma dos números e:" +soma);
        }
    }

---

## Exercício 3 (Médio) - Cadastro até "fim"

Faça um programa que recebe nomes do usuário (via `Scanner`) até que ele digite `"fim"`. Depois exiba todos os nomes cadastrados.

**Tarefas:**
1. Criar um `ArrayList<String>` para armazenar os nomes
2. Usar um laço `while (true)` para ler nomes
3. Se o usuário digitar `"fim"`, interromper o laço com `break`
4. Caso contrário, adicionar o nome à lista
5. Após sair, exibir todos os nomes (um por linha)

Resposta:

    import java.util.ArrayList;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            ArrayList<String> nomes = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.print("Digite um nome (ou 'fim' para sair): ");
                String nome = sc.nextLine();
                if (nome.equals("fim")) {
                    break;
                }
                nomes.add(nome);
            }
            System.out.println("\nNomes cadastrados:");

            for (String nome : nomes) {
                System.out.println(nome);
            }

            sc.close();
        }
    }
---

## Exercício 4 (Médio) - Removendo números pequenos

Crie uma lista de números inteiros e remova todos os números **menores que 10**.

**Tarefas:**
1. Criar uma lista com os valores: `5, 15, 3, 20, 8, 25, 2, 30`
2. Percorrer a lista (cuidado com a remoção durante iteração)
3. Remover todos os elementos que são menores que 10
4. Exibir a lista antes e depois da remoção

**Dica:** Para remover durante iteração, percorra a lista de **trás para frente**:
```java
for (int i = lista.size() - 1; i >= 0; i--) {
    if (lista.get(i) < 10) {
        lista.remove(i);
    }
}
```
Resposta:

    import java.util.ArrayList;

    public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(15);
        numeros.add(3);
        numeros.add(20);
        numeros.add(8);
        numeros.add(25);
        numeros.add(2);
        numeros.add(30);

        System.out.println("Lista original:");
        System.out.println(numeros);

        for (int i = numeros.size() - 1; i >= 0; i--) {

            if (numeros.get(i) < 10) {
                numeros.remove(i);
            }
        }

        System.out.println("Lista após remoção:");
        System.out.println(numeros);
    }
    }
---

## Exercício 5 (Médio/Difícil) - Cadastro de Produtos

Faça um cadastro de produtos com **nome** e **preço**. Depois calcule o valor total do carrinho.

**Tarefas:**
1. Criar um `ArrayList<String>` para os nomes dos produtos
2. Criar um `ArrayList<Double>` para os preços dos produtos
3. Adicionar pelo menos 3 produtos manualmente (ou via teclado)
4. Calcular o valor total do carrinho (soma dos preços)
5. Exibir um relatório:
   - Produto 1: [nome] - R$ [preço]
   - Produto 2: [nome] - R$ [preço]
   - ...
   - Total: R$ [soma]

Resposta:

    import java.util.ArrayList;

    public class Main {

    public static void main(String[] args) {

        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();

        produtos.add("Arroz");
        precos.add(25.90);

        produtos.add("Feijão");
        precos.add(12.50);

        produtos.add("Macarrão");
        precos.add(8.75);

        double total = 0;

        for (int i = 0; i < produtos.size(); i++) {

            System.out.println(
                "Produto " + (i + 1) + ": "
                + produtos.get(i)
                + " - R$ "
                + precos.get(i)
            );

            total += precos.get(i);
        }

        System.out.println("Total: R$ " + total);
    }
    }
---

## Exercício 6 (Difícil) - Agenda de Contatos

Crie uma agenda de contatos onde cada contato tem **nome** e **telefone**. Permita as operações:

1. Adicionar contato
2. Buscar contato (por nome)
3. Remover contato (por nome)
4. Listar todos os contatos
5. Sair

**Tarefas:**
1. Criar dois `ArrayList`s: `nomes` e `telefones` (mesmo índice para o mesmo contato)
2. Usar um menu com `do-while` e `switch-case`
3. Implementar cada opção:
   - **Adicionar:** pedir nome e telefone, adicionar às listas
   - **Buscar:** pedir nome, procurar e exibir telefone
   - **Remover:** pedir nome, encontrar a posição e remover das duas listas
   - **Listar:** exibir todos os contatos (número, nome, telefone)

**Exemplo de menu:**
```
--- AGENDA DE CONTATOS ---
1 - Adicionar contato
2 - Buscar contato
3 - Remover contato
4 - Listar todos
5 - Sair
Escolha: _
```

    import java.util.ArrayList;
    import java.util.Scanner;

    public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> telefones = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n--- AGENDA DE CONTATOS ---");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Buscar contato");
            System.out.println("3 - Remover contato");
            System.out.println("4 - Listar todos");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();

                    nomes.add(nome);
                    telefones.add(telefone);

                    System.out.println("Contato adicionado.");
                    break;

                case 2:

                    System.out.print("Digite o nome: ");
                    String busca = sc.nextLine();

                    boolean encontrado = false;

                    for (int i = 0; i < nomes.size(); i++) {

                        if (nomes.get(i).equalsIgnoreCase(busca)) {

                            System.out.println("Telefone: " + telefones.get(i));
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Contato não encontrado.");
                    }

                    break;

                case 3:

                    System.out.print("Digite o nome para remover: ");
                    String remover = sc.nextLine();

                    boolean removido = false;

                    for (int i = 0; i < nomes.size(); i++) {

                        if (nomes.get(i).equalsIgnoreCase(remover)) {

                            nomes.remove(i);
                            telefones.remove(i);

                            System.out.println("Contato removido.");
                            removido = true;
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("Contato não encontrado.");
                    }

                    break;

                case 4:

                    System.out.println("\n--- CONTATOS ---");

                    for (int i = 0; i < nomes.size(); i++) {

                        System.out.println(
                            (i + 1) + " - "
                            + nomes.get(i)
                            + " - "
                            + telefones.get(i)
                        );
                    }

                    break;

                case 5:

                    System.out.println("Encerrando...");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);

        sc.close();
    }
    }

---

## Exercício 7 (Desafio) - Gerenciador de Tarefas com Prioridade

Crie um gerenciador de tarefas onde cada tarefa tem **descrição** (String) e **prioridade** (1 = Alta, 2 = Média, 3 = Baixa).

**Tarefas:**
1. Criar duas listas: `descricoes` (String) e `prioridades` (Integer)
2. Implementar as operações:
   - Adicionar tarefa (descrição + prioridade)
   - Listar tarefas por prioridade (primeiro as prioridade 1, depois 2, depois 3)
   - Marcar tarefa como concluída (remover da lista)
   - Sair

**Exemplo de saída:**
```
--- MINHAS TAREFAS ---
=== PRIORIDADE ALTA ===
1. Estudar Java (Pri: 1)
2. Fazer exercícios (Pri: 1)

=== PRIORIDADE MÉDIA ===
3. Comprar pão (Pri: 2)

=== PRIORIDADE BAIXA ===
4. Assistir série (Pri: 3)
```

---

## Exercício 8 (Desafio) - Remover Duplicatas

Crie um programa que recebe números do usuário até que ele digite `0` e armazena todos em uma lista. Depois, remova todos os números **duplicados**, mantendo apenas a primeira ocorrência de cada número.

**Exemplo:**
```
Entrada: 5, 3, 5, 2, 5, 7, 3, 8
Lista final: [5, 3, 2, 7, 8]
```

**Dica:** Verifique para cada elemento se ele já apareceu antes na lista.

---

## Exercício 9 (Desafio) - Filas usando LinkedList

Use `LinkedList` para simular uma **fila de atendimento** (FIFO - First In, First Out).

**Operações:**
1. Adicionar pessoa à fila (enfileirar)
2. Chamar próxima pessoa (desenfileirar) - remove e exibe o nome
3. Exibir quantas pessoas estão na fila
4. Exibir a fila completa
5. Sair

**Dica:** `LinkedList` possui métodos `addLast()` (adicionar no final) e `removeFirst()` (remover do início).

---

## Exercício 10 (Super Desafio) - Lista de Tarefas com Arquivo

Crie um programa de lista de tarefas que **salva e carrega** as tarefas de um arquivo.

**Tarefas:**
1. Ao iniciar, carregar tarefas de um arquivo `tarefas.txt`
2. Operações: adicionar, remover, listar, concluir
3. Ao sair, salvar todas as tarefas no arquivo

**Dica:** Use `FileWriter` e `BufferedReader` para ler/escrever o arquivo, cada tarefa em uma linha.

---

# Dicas Gerais

| Dica | Explicação |
|------|------------|
| 📌 **Importe no início** | `import java.util.ArrayList;` |
| 📌 **Use tipos Objeto** | `ArrayList<Integer>` não `ArrayList<int>` |
| 📌 **Teste cada operação** | Execute o programa após cada nova funcionalidade |
| 📌 **Use print para debug** | Use `System.out.println()` para ver o que está acontecendo |
| 📌 **Consulte os métodos** | `add()`, `get()`, `remove()`, `size()`, `isEmpty()`, `contains()`, `indexOf()` |

---
