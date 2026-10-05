# Paladar

O Paladar é um aplicativo de restaurantes que fizemos para o Trabalho 2 da faculdade.

A ideia foi fazer um aplicativo onde o usuário consegue cadastrar restaurantes e categorias, ver os detalhes deles e marcar restaurantes como favoritos.

## Funcionalidades

- Adicionar restaurantes
- Remover restaurantes
- Adicionar categorias
- Remover categorias
- Ver detalhes dos restaurantes
- Ver detalhes das categorias
- Marcar restaurantes como favoritos
- Navegar entre as telas pelo menu inferior

## Tecnologias

- Kotlin
- Jetpack Compose
- Android Studio
- Material 3
- Navigation Compose

## Sobre o projeto

O projeto possui duas listas principais, uma de restaurantes e outra de categorias.

Também existem telas de detalhes para cada tipo de item. Quando o usuário clica em um restaurante ou categoria, o aplicativo identifica o item selecionado e mostra suas informações.

Nos detalhes do restaurante também colocamos uma classificação baseada na nota e a opção de favoritar o restaurante.

Os dados ficam apenas em memória usando `mutableStateListOf`, então eles são perdidos quando o aplicativo é fechado.

## Como executar

Para executar o projeto, basta abrir a pasta no Android Studio, esperar o projeto carregar e executar em um emulador ou celular Android.

## Trabalho

Projeto feito para o Trabalho 2 da disciplina de Desenvolvimento Mobile da Universidade Positivo.

Mais informações sobre o desenvolvimento do projeto estão no arquivo `PROCESSO.md`.
