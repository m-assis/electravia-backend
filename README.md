# ⚡ ElectraVia - Backend

API REST desenvolvida em **Java com Spring Boot** para o ecossistema de eletromobilidade **ElectraVia**, integrando inteligência artificial (Google Gemini) para análise preditiva e otimização energética de recargas de veículos elétricos.

## 🚀 Tecnologias Utilizadas
* **Java 17+** / **Spring Boot**
* **Spring Data JPA** & **H2 Database** (Banco em memória)
* **Spring RestClient** (Comunicação HTTP nativa)
* **Google Gemini API** (Inteligência Artificial para análise de consumo)
* **Maven** (Gerenciamento de dependências)

## ⚙️ Arquitetura e Funcionalidades
* **Gestão de Estações**: Cadastro e listagem de pontos de recarga de veículos elétricos.
* **Controle de Recargas**: Registro de sessões de recarga vinculadas às estações.
* **Análise Inteligente (IA)**: Endpoint dedicado (`/api/recargas/analise-ia`) que consome os dados de recarga e envia para o modelo Gemini gerar sugestões de otimização energética e manutenção preditiva.

## 🔑 Como Executar Localmente

1. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/electravia-backend.git](https://github.com/seu-usuario/electravia-backend.git)