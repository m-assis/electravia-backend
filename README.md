# ⚡ ElectraVia - Backend Core & Telemetry API

> Plataforma de alta performance desenvolvida em **Java com Spring Boot** para gestão inteligente de redes de recarga de veículos elétricos, projetada sob os princípios de arquitetura de microsserviços, observabilidade e integração nativa com Inteligência Artificial Generativa.

---

## 🏗️ Visão Arquitetural & Alinhamento com Cloud Software

O **ElectraVia Backend** foi concebido para operar em ecossistemas de nuvem distribuídos (Cloud Native). A arquitetura separa responsabilidades em camadas bem definidas:
* **Controllers & Endpoints REST**: Exposição de contratos padronizados para consumo por aplicações front-end e gateways de API.
* **Service Layer**: Implementação de regras de negócio desacopladas e processamento de telemetria energética.
* **Data Access Layer (JPA/Hibernate)**: Gerenciamento persistente otimizado para escalabilidade horizontal.

---

## 📡 Simulação de Telemetria IoT & Microsserviços

Em um cenário real de infraestrutura de postos de recarga, o microsserviço de backend lida diretamente com o fluxo contínuo de dados vindos de dispositivos IoT instalados nas estações:
* **Monitoramento de Estado (Health Check)**: Endpoints dedicados a aferir a saúde operacional (*heartbeat*) das estações de recarga, simulando a resiliência contra quedas de pacotes ou falhas de rede típicas de ambientes de borda (*Edge Computing*).
* **Tratamento de Exceções Resiliente**: Mecanismos de fallback e tratamento de falhas de comunicação para garantir que quedas temporárias de conectividade com as estações não comprometam a integridade do banco de dados relacional.

---

## 🤖 Inteligência Artificial, FinOps e Otimização de Tokens

A aplicação integra a API do **Google Gemini** para gerar análises preditivas de consumo energético, diagnósticos de manutenção preventiva e recomendações dinâmicas de recarga.

Para garantir a sustentabilidade financeira da operação em nuvem (**FinOps**):
* **Payloads Enxutos**: As requisições enviadas ao modelo de IA são tratadas e compactadas no Service, enviando apenas os metadados estritamente necessários da sessão de recarga.
* **Controle de Custos e Latência**: Evita-se o desperdício de *tokens* através de prompts estruturados e direcionados, mitigando custos operacionais desnecessários (*Token Optimization*) e garantindo respostas em tempo real para os gestores da rede.

---

## 🛠️ Tecnologias e Stack

* **Java 21** / **Spring Boot 3.x**
* **Spring Data JPA** & **H2 Database** (Preparado para migração relacional em nuvem)
* **Spring RestClient** (Comunicação HTTP otimizada)
* **Google Gemini SDK / API**
* **Maven** (Gerenciamento de build e dependências)

---

## 🚀 Como Executar Localmente

1. Clone o repositório:
   ```bash
   git clone [https://github.com/m-assis/electravia-backend.git](https://github.com/m-assis/electravia-backend.git)