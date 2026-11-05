# Aula síncrona Herança em Java

## Disciplina

Programação de Sistemas I


---

# 1. Objetivos da Aula

Ao final da aula, os alunos deverão ser capazes de:

- Entender o conceito de herança em orientação a objetos
- Identificar relações do tipo “é um” (is-a)
- Criar classes utilizando `extends`
- Reutilizar atributos e métodos de uma superclasse
- Utilizar sobrescrita de métodos (`@Override`)
- Utilizar `super`
- Compreender construtores em herança
- Diferenciar herança de composição
- Aplicar herança em exemplos práticos

---

# 2. Pré-requisitos

Os alunos já devem conhecer:

- Classes e objetos
- Atributos e métodos
- Encapsulamento
- Construtores
- Modificadores de acesso (`private`, `protected`, `public`)

---

# 3. Introdução Motivacional

## Pergunta inicial

> Imagine um sistema de universidade.
>
> Temos:
> - Pessoa
> - Aluno
> - Professor
> - Funcionário
>
> O que essas entidades possuem em comum?

### Esperado

- nome
- cpf
- idade
- email

---

## Problema sem herança

```java
class Aluno {
    String nome;
    String cpf;
}

class Professor {
    String nome;
    String cpf;
}
```

➡ Código duplicado.

---

# 4. Conceito de Herança

Herança permite que uma classe herde características de outra.

## Relação IS-A

- Aluno É UMA Pessoa
- Professor É UMA Pessoa

---

# 5. Estrutura Básica da Herança

```java
class Pessoa {
    String nome;
    int idade;
}

class Aluno extends Pessoa {
    String ra;
}
```

---

# 6. Primeiro Exemplo Completo

```java
class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Nome: " + nome);
    }
}

class Aluno extends Pessoa {
    String curso;

    void estudar() {
        System.out.println(nome + " está estudando.");
    }
}
```

```java
public class Main {

    public static void main(String[] args) {

        Aluno a = new Aluno();

        a.nome = "Thiago";
        a.idade = 30;
        a.curso = "Ciência da Computação";

        a.apresentar();
        a.estudar();
    }
}
```

---

# 7. O que é Herdado?

## Herdado

- atributos
- métodos públicos/protegidos

## Não herdado

- construtores
- membros privados diretamente

---

# 8. Modificador `protected`

```java
protected String nome;
```

| Modificador | Mesma classe | Subclasse | Outro pacote |
|---|---|---|---|
| private | ✅ | ❌ | ❌ |
| protected | ✅ | ✅ | parcialmente |
| public | ✅ | ✅ | ✅ |

---

# 9. Construtores e Herança

```java
class Pessoa {

    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }
}
```

```java
class Aluno extends Pessoa {

    String curso;

    Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }
}
```

---

# 10. Sobrescrita de Métodos (`@Override`)

```java
class Professor extends Pessoa {

    @Override
    void apresentar() {
        System.out.println("Sou professor.");
    }
}
```

---

# 11. Polimorfismo Básico

```java
Pessoa p = new Aluno();
p.apresentar();
```

---

# 12. Herança vs Composição

## Herança → IS-A

```text
Aluno É UMA Pessoa
```

## Composição → HAS-A

```text
Carro TEM UM Motor
```

```java
class Motor {
}

class Carro {

    Motor motor;
}
```

---

# 13. Exercício Guiado

## Sistema de Animais

```java
class Animal {

    String nome;

    void emitirSom() {
        System.out.println("Som genérico");
    }
}
```

```java
class Cachorro extends Animal {

    @Override
    void emitirSom() {
        System.out.println("Au au");
    }
}
```

```java
class Gato extends Animal {

    @Override
    void emitirSom() {
        System.out.println("Miau");
    }
}
```

```java
public class Main {

    public static void main(String[] args) {

        Animal a1 = new Cachorro();
        Animal a2 = new Gato();

        a1.emitirSom();
        a2.emitirSom();
    }
}
```

---

# 14. Exercício Individual

## Criar:

### Superclasse
- Veiculo

### Subclasses
- Carro
- Moto
- Caminhao

---

# 15. Perguntas de Fixação

1. O que é herança?
2. O que o `extends` faz?
3. O que significa relação IS-A?
4. Qual a diferença entre herança e composição?
5. O que faz o `@Override`?
6. O que faz o `super`?
7. Java permite herança múltipla?

---

# 16. Fechamento

> “Herança existe para reutilizar e especializar comportamentos.
>
> Mas a melhor herança é a que realmente representa uma relação natural entre objetos.”

