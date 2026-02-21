# 💱 Conversor de Moedas em Java
### Projeto 01/30 — Saga de Projetos em Java

Este projeto é o **primeiro** da minha **saga de 30 projetos em Java**, criada com o objetivo de evoluir gradualmente minhas habilidades na linguagem, passando por conceitos de lógica, organização de código, consumo de APIs, boas práticas e estruturação profissional.

---

## 📌 Descrição

O **Conversor de Moedas** é uma aplicação de console desenvolvida em **Java puro**, que permite converter um valor em **Real Brasileiro (BRL)** para:

- 💵 Dólar Americano (USD)
- 💶 Euro (EUR)
- 💷 Libra Esterlina (GBP)

As taxas de câmbio são obtidas **em tempo real** através de uma API pública de câmbio.

---

## 🚀 Funcionalidades

- Entrada de valor em BRL via terminal
- Consumo de API externa usando `HttpURLConnection`
- Conversão automática para:
    - USD
    - EUR
    - GBP
- Código organizado em métodos
- Tratamento básico de exceções
- Execução simples via console

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+** (compatível com Java 8+)
- `HttpURLConnection`
- `Scanner`
- API pública:  
  👉 https://open.er-api.com/v6/latest/BRL

---

## 📂 Estrutura do Projeto

src/
└── org/
└── otavio/
└── Main.java


---

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```

---

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
```

Acesse a pasta do projeto:
```bash
cd nome-do-repositorio
```

Compile o projeto:
```bash
javac src/org/otavio/Main.java
```

Execute:
```bash
java org.otavio.Main
```

## 🧪 Exemplo de Uso
```Digite o valor em reais (BRL): 100```

Taxa BRL/USD: 0.20
Valor convertido: 20.00 USD

Taxa BRL/EUR: 0.18
Valor convertido: 18.00 EUR

Taxa BRL/GBP: 0.15
Valor convertido: 15.00 GBP

## 📚 O que aprendi neste projeto

- Consumo de APIs REST em Java
- Leitura de dados via terminal
- Manipulação de Strings para extração de dados
- Organização de código com métodos
- Boas práticas iniciais em Java
