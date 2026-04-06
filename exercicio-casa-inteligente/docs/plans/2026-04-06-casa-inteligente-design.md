# Design: Sistema de Casa Inteligente

## Escopo

Implementacao minima do exercicio com:

- 3 interfaces
- 2 classes concretas
- 1 `Main` para demonstrar o uso

## Estrutura

- `Autenticavel`: declara `validarAcesso(String senha)`.
- `DispositivoLigavel`: declara `ligar()` e `desligar()`.
- `SensorTemperatura`: declara `lerTemperatura()`.
- `FechaduraEletronica`: implementa `Autenticavel` e `DispositivoLigavel`.
- `TermostatoSmart`: implementa `DispositivoLigavel` e `SensorTemperatura`.

## Regras de comportamento

- A `FechaduraEletronica` armazena uma senha correta.
- `validarAcesso` compara a senha informada com a senha cadastrada.
- `ligar` so destranca se o acesso tiver sido validado.
- `desligar` representa trancar a fechadura.
- O `TermostatoSmart` pode ser ligado e desligado.
- `lerTemperatura` retorna a temperatura atual armazenada no objeto.

## Demonstracao

O `Main` instancia os dois dispositivos e chama os metodos principais para mostrar o funcionamento basico pedido pelo exercicio.
