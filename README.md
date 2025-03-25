# 📌 Gerenciador de Tarefas Inteligente

Um sistema de gerenciamento de tarefas desenvolvido em Java com funcionalidades avançadas para ajudar profissionais a organizarem seu dia a dia de forma eficiente.

## 🚀 Funcionalidades

### ✅ Cadastro de Tarefas
- Cadastro com título, descrição, data limite (deadline) e status
- Validação para evitar datas no passado
- Prevenção contra títulos muito curtos
- Garantia de status válido

### 🔍 Gerenciamento e Filtragem
- Listagem completa de todas as tarefas
- Filtragem por status (Pendente, Em andamento, Bloqueado e Concluído)
- Ordenação por data limite
- Visualização organizada das tarefas

### 🔔 Notificações Inteligentes
- Alertas automáticos para prazos próximos
- Sistema de notificação assíncrono

## 🛠 Tecnologias e Conceitos Utilizados

- **Java** - Linguagem principal
- **java.time** - Para manipulação avançada de datas
- **Programação Funcional** - Streams, Optional e Predicate
- **Concorrência** - CompletableFuture para notificações assíncronas
- **Boas práticas** - Validações robustas e tratamento de erros

## 📦 Repositório

O código fonte está disponível no GitHub:  
[github.com/guibonf1m/Tarefas_Inteligentes](https://github.com/guibonf1m/Tarefas_Inteligentes)

## 🚀 Como Executar

1. Certifique-se de ter o Java JDK 11+ instalado
2. Clone o repositório
3. Compile e execute a classe principal

```bash
git clone https://github.com/guibonf1m/Tarefas_Inteligentes.git
cd Tarefas_Inteligentes
javac src/main/java/App.java
java -cp src/main/java App
