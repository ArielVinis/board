# 📋 Board - Sistema de Gerenciamento de Kanban

## 📖 Descrição

O **Board** é um sistema de gerenciamento de quadros Kanban desenvolvido em Java, que permite aos usuários criar, gerenciar e acompanhar tarefas através de um sistema de colunas organizadas. O projeto implementa uma arquitetura robusta com persistência de dados, migrações automáticas e uma interface de usuário intuitiva via linha de comando.

## 🚀 Funcionalidades

- **Criação de Boards**: Crie quadros personalizados com colunas customizáveis
- **Gerenciamento de Colunas**: Sistema flexível de colunas (Inicial, Pendente, Final, Cancelamento)
- **Gestão de Cards**: Adicione, mova e gerencie tarefas entre colunas
- **Persistência de Dados**: Armazenamento persistente com banco de dados
- **Migrações Automáticas**: Sistema de migração de banco de dados integrado
- **Interface Intuitiva**: Menu interativo via linha de comando

## 🛠️ Tecnologias Utilizadas

### **Linguagem e Plataforma**
- **Java** - Linguagem principal de desenvolvimento
- **Gradle** - Sistema de build e gerenciamento de dependências

### **Banco de Dados e Persistência**
- **MySQL** - Banco de dados para o desenvolvimento
- **Liquibase** - Ferramenta de migração e versionamento de banco de dados
- **JDBC** - API para conexão com banco de dados

### **Ferramentas e Bibliotecas**
- **Lombok** - Redução de código boilerplate com anotações
- **Gradle Wrapper** - Distribuição independente do Gradle

### **Arquitetura e Padrões**
- **DAO Pattern** - Padrão de acesso a dados
- **Service Layer** - Camada de serviços para lógica de negócio
- **DTO Pattern** - Transferência de dados entre camadas
- **Entity Pattern** - Modelagem de entidades de domínio

## 🏗️ Estrutura do Projeto

```
board/
├── src/main/java/br/com/board/
│   ├── dto/                    # Objetos de transferência de dados
│   ├── exception/              # Classes de exceção customizadas
│   ├── persistence/            # Camada de persistência
│   │   ├── config/            # Configurações de conexão
│   │   ├── converter/         # Conversores de dados
│   │   ├── dao/               # Objetos de acesso a dados
│   │   ├── entity/            # Entidades do domínio
│   │   └── migration/         # Estratégias de migração
│   ├── service/               # Camada de serviços
│   └── ui/                    # Interface do usuário
├── src/main/resources/
│   ├── db/                    # Arquivos de banco de dados
│   │   ├── changelog/         # Changelog do Liquibase
│   │   └── migrations/        # Scripts de migração SQL
│   └── liquibase.properties   # Configurações do Liquibase
├── build.gradle.kts           # Configuração do Gradle
└── gradle/                    # Wrapper do Gradle
```

## 🔧 Configuração e Instalação

### **Pré-requisitos**
- Java 11 ou superior
- Gradle (opcional, o projeto inclui o wrapper)

### **Passos para Execução**

1. **Clone o repositório**
   ```bash
   git clone https://github.com/ArielVinis/board.git
   cd board
   ```

2. **Execute o projeto**
   ```bash
   # Usando o wrapper do Gradle
   ./gradlew run
   
   # Ou usando Java diretamente
   java -cp build/libs/board-1.0-SNAPSHOT.jar br.com.board.Main
   ```

3. **Compile o projeto**
   ```bash
   ./gradlew build
   ```

## 📊 Modelo de Dados

### **Entidades Principais**

- **Board**: Representa um quadro Kanban completo
- **BoardColumn**: Colunas do quadro (Inicial, Pendente, Final, Cancelamento)
- **Card**: Tarefas que são movidas entre colunas
- **Block**: Sistema de bloqueio para controle de fluxo

### **Tipos de Coluna**
- **INITIAL**: Coluna inicial onde as tarefas começam
- **PENDING**: Colunas intermediárias para tarefas em andamento
- **FINAL**: Coluna final para tarefas concluídas
- **CANCEL**: Coluna para tarefas canceladas

## 🎯 Como Usar

1. **Criar um Board**: Escolha a opção 1 no menu principal
2. **Configurar Colunas**: Defina nomes para as colunas padrão
3. **Adicionar Colunas Extras**: Configure colunas adicionais conforme necessário
4. **Gerenciar Tarefas**: Adicione cards e mova-os entre colunas
5. **Acompanhar Progresso**: Visualize o status das tarefas em tempo real

## 🔄 Migrações de Banco

O projeto utiliza **Liquibase** para gerenciar mudanças no esquema do banco de dados:

- **Changelog Master**: Arquivo principal que inclui todas as migrações
- **Migrations**: Scripts SQL individuais para cada mudança
- **Execução Automática**: Migrações são executadas automaticamente na inicialização

## 🧪 Funcionalidades Técnicas

- **Tratamento de Exceções**: Sistema robusto de tratamento de erros
- **Validações**: Verificações de integridade dos dados
- **Transações**: Controle de transações para operações críticas
- **Logs**: Sistema de logging para auditoria e debug

## 👤 Autor

Desenvolvido por **Ariel França**.

## 🤝 Contribuição

Sinta-se à vontade para contribuir com este projeto! Sugestões, melhorias e pull requests são muito bem-vindos. Basta abrir uma issue ou enviar um PR para colaborar.
