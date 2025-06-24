<p align="center">
  <img src="https://raw.githubusercontent.com/LucVinicius-DEV/exception-try-catch/main/banner.png" alt="Banner exception-try-catch" />
</p>

# exception-try-catch

Repositório criado durante o curso de Java do professor **Nélio Alves**.

Este projeto traz exemplos práticos sobre **tratamento de erros e exceções com blocos `try / catch`**, contemplando:

- Leitura de dados e validação de formato  
- Tratamento de `InputMismatchException`, `NumberFormatException` e afins  
- Uso de múltiplos blocos `catch`  
- Garantia de execução com `finally`  
- Boas práticas ao capturar exceções  

---

### 📁 Estrutura do projeto
```
exception-try-catch/
└── src/
    └── application/
        └── Program.java
```

---

### 💡 Conceitos aplicados

- **Try / Catch** – captura de exceções em tempo de execução.  
- **Múltiplos Catch** – tratamento específico para diferentes tipos de erro.  
- **Finally** – bloco executado sempre, independentemente de falhas.  
- **Validações de entrada** – proteção contra dados inválidos e falhas de conversão.  

---

### ✅ Exemplo de uso
```java
try {
    int n = Integer.parseInt(sc.nextLine());
    System.out.println("Você digitou: " + n);
} catch (NumberFormatException e) {
    System.out.println("Erro: entrada não é um número inteiro!");
} finally {
    sc.close();
}
```

---

### 👨‍🏫 Professor

Projeto baseado nas aulas do [Prof. Nélio Alves](https://github.com/nelioalves) — Curso **Java Completo** na Udemy.

---

### 🔗 Licença

Código disponível apenas para fins de estudo e prática.
