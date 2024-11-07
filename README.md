# Teoria da computação - Atividade 3

Este repositório contém a solução para a 3ª Lista de Exercícios de Codificação em Java, com foco na verificação e
geração de cadeias baseadas em gramáticas regulares

## Exercícios

### Exercício 1: Verificação de Cadeias em uma Gramática Regular

Implemente um método em Java que verifique se uma cadeia de caracteres pertence
à linguagem definida pela gramática regular abaixo:

**Detalhes da Gramática**

- Produções:
    - `S → aA | bB`
    - `A → aA | ε`
    - `B → bB | ε`

### Exercício 2: Geração de Cadeias de Comprimento N

Implementei um método em Java que gera todas as cadeias de comprimento `N` que podem ser geradas pela gramática regular
a seguir:

**Detalhes da Gramática**

- Produções:
    - `S → aA | bB | c`
    - `A → aA | ε`
    - `B → bB | ε`

### Exercício 3 (Não implementado): Validação de Cadeias para Gramáticas Personalizadas

Implemente um método em Java que recebe como parâmetros uma gramática e uma
cadeia e retorne se é essa cadeia pode ser gerada pela gramática informada


