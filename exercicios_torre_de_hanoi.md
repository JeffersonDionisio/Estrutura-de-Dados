---

# 🧩 20 Perguntas — Torre de Hanói em Java

## 🧠 Parte 1 – Conceitos Gerais

1. O que representa o problema da Torre de Hanói?  
R:

2. Quem foi o criador da Torre de Hanói e em que ano ela foi proposta?  
    R:  Criado pelo matemático francês Édouard Lucas, foi proposta no ano de 1883.

3. Quais são as três regras fundamentais do jogo da Torre de Hanói?  
    R:    1.Somente um disco pode ser movido por vez.
          2.Um disco nunca pode ser colocado sobre um disco menor.
          3.Todos os discos devem ser movidos de um pino inicial para um pino destino, utilizando um pino auxiliar

5. Qual é o objetivo principal do algoritmo da Torre de Hanói?  
    R: Resolver o problema com números possivel de movimento usando recursão.

6. Qual é a fórmula que calcula o número mínimo de movimentos necessários para resolver o problema com `n` discos?  
    R: [ M(n) = 2^n - 1 ]

7. Quantos movimentos são necessários para resolver o problema com 3 discos?  
    R: 7

8. Qual o tempo de complexidade do algoritmo da Torre de Hanói?  
    R: A complexidade de tempo da Torre de Hanói é O(2ⁿ), pois o número de movimentos dobra a cada disco adicionado: n (discos) Movimentos mínimos

9. Por que o problema da Torre de Hanói é considerado um exemplo clássico de **recursão**?  
    R: Porque ele encaixa perfeitamente na lógica de recursão — resolver um problema grande chamando a solução dele mesmo em versão menor.

10. O que significa “caso base” em um algoritmo recursivo, e qual é o caso base na Torre de Hanói?  
    R: Caso base é a condição mais simples de um algoritmo recursivo — quando a função para de se chamar. Sem isso, vira loop infinito. nA Torre o caso base é quando há apenas um disco.

11. O que acontece com o número de movimentos totais quando se adiciona mais um disco ao problema?
    R: Ele dobra a quantidade
---

## 💻 Parte 2 – Código Java

11. Qual é o papel dos parâmetros `origem`, `destino` e `auxiliar` no método `moverDiscos()`?  
    R:      origem → é a torre que tem os discos no momento
            destino → é a torre que deve receber os discos
            auxiliar → é a torre de apoio, usada no meio do processo

12. O que acontece se o caso base `if (n == 1)` for removido do código?  
    R: Quebra o algoritmo.

13. No trecho abaixo, o que significa a linha `moverDiscos(n - 1, origem, auxiliar, destino);`?

    ```java
    moverDiscos(n - 1, origem, auxiliar, destino);
    System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
    moverDiscos(n - 1, auxiliar, destino, origem);
    ```

14. Por que o algoritmo chama o próprio método dentro dele (recursão)?  
    R: Porque é o jeito mais direto de resolver um problema que se repete em versão menor.

15. O que a função `System.out.println()` exibe em cada iteração da função recursiva?  
    R: A System.out.println() mostra cada movimento de disco que o algoritmo faz.

16. Como o número de chamadas recursivas está relacionado ao número de discos (`n`)?  
    R: O número de chamadas (e movimentos) cresce exponencialmente com n.

17. O que aconteceria se os parâmetros `destino` e `auxiliar` fossem trocados na primeira chamada recursiva?  
    R:Se você trocar destino e auxiliar na primeira chamada recursiva, o algoritmo quebra a lógica da Torre de Hanói.

18. Qual é o tipo de dado utilizado para representar as hastes (`A`, `B`, `C`) no código?  
    R: As hastes (A, B, C) normalmente são representadas como char (caractere).

19. No programa com contador de movimentos, qual é a finalidade da variável `contador`?  
    R: A variável contador serve pra contar quantos movimentos foram feitos durante a execução.

20. Se `n = 4`, quantos movimentos o programa imprimirá no total?
    R: Use a fórmula da Torre de Hanói:

𝑇(𝑛)=2𝑛−1
---
