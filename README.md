# Sistema de Pedido com Java

Este projeto simula um sistema de pedidos de um cliente, com cadastro de itens, cálculo de total e exibição de um resumo detalhado do pedido.

## 🚀 Funcionalidades

- Cadastro de cliente (nome, e-mail, data de nascimento)
- Cadastro de pedido com status (`PENDING_PAYMENT`, `PROCESSING`, `SHIPPED`, `DELIVERED`)
- Cadastro de múltiplos itens com nome, preço, quantidade
- Cálculo de subtotal por item e total geral
- Exibição de um resumo formatado do pedido no console

## 🛠 Tecnologias Utilizadas

- Java (JDK 17 ou superior)
- Programação Orientada a Objetos (POO)
- Enums (`OrderStatus`)
- Composição de objetos (`Order`, `Client`, `OrderItem`, `Product`)
- Manipulação de datas com `Date` e `SimpleDateFormat`
- Entrada de dados com `Scanner`
- Utilização da classe StringBuilder para exibição formatada
- Estruturas de repetição e listas (`ArrayList`)
