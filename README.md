# Projeto Submarino
Projeto para simular movimentação de um submarino de acordo com comandos enviados. Estes são passados em todos de uma vez, em uma única linha como argumento de execução. 
Vale ressaltar que o submarino sempre iniciará em coordenadas <b>0, 0, 0, NORTE</b>.



## Comandos e regras utilizadas 
<ul>
<li><b>L</b>: Muda direção de submarino, virando-o para a esquerda(Ex. NORTE para OESTE, OESTE para SUL).</li>
<li><b>R</b>: Muda direção de submarino, virando-o para a direita(Ex. NORTE para LESTE, LESTE para SUL).</li>
<li>
<b>M</b>: Move submarino, respeitando sua direção:<br />
      <ol>
        <li>Caso movimente-se em direção NORTE, acrescentando 1 em eixo Y;</li>
        <li>Caso movimente-se em direção LESTE, acrescentando 1 em eixo X;</li>
        <li>Caso movimente-se em direção SUL, reduzindo 1 em eixo Y;</li>
        <li>Caso movimente-se em direção OESTE, reduzindo 1 em eixo X.</li>
      </ol>
</li>
<li><b>U</b>: Sobe submarino, acrescentando 1 em eixo Z caso este não esteja na superfície(eixo Z com valor 0).</li>
<li><b>D</b>: Desce submarino, reduzindo 1 em eixo Z.</li>
</ul>




## Exemplo de execução
Dado seguinte argumento de execução para a aplicação:
```
RMMLMMMDDLL
```
Levando em consideração eixos X,Y,Z e direção respectivamente, a saída será:
```
Submarino(2, 3, -2, SUL)
```
