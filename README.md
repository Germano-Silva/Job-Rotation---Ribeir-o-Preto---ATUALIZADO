#Job Rotation - Ribeirão Preto - ATUALIZADO
1) Observe o trecho de código abaixo:

~~~
int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);
~~~



Ao final do processamento, qual será o valor da variável SOMA?

Resposta:
SOMA = 1+2+3+4+5+6+7+8+9+10+11+12+13 = 91
O valor da variável SOMA ao final do processamento será 91.


2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;



3) Descubra a lógica e complete o próximo elemento:
a) 1, 3, 5, 7, ___
b) 2, 4, 8, 16, 32, 64, ____
c) 0, 1, 4, 9, 16, 25, 36, ____
d) 4, 16, 36, 64, ____
e) 1, 1, 2, 3, 5, 8, ____
f) 2,10, 12, 16, 17, 18, 19, ____

Resposta:
a) Adicione 2 ao número anterior. O próximo número será 9.
b) Multiplicar o número anterior por 2. O próximo número será 128.
c) Elevar o índice do número em sequência ao quadrado. O próximo número será 49.
d) Elevar o índice do número em sequência ao quadrado e multiplicar por 4. O próximo número será 100.
e) Adicionar os dois números anteriores para obter o próximo número. O próximo número será 13.
f) Não há uma sequência, pois parece ser uma combinação aleatória de números. O próximo número pode ser qualquer um.


4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?

IMPORTANTE:

a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.
b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)
c) Explique como chegou no resultado.

Resposta:
Velocidade média = distância percorrida / tempo

Carro:  t = d / 110
Caminhão: t = d / 80

t= d / (velocidade do carro + velocidade do caminhão)
t= 100 km / (110 km/h + 80 km/h) = 37,5 minutos

Sabendo que o ponto de encontro foi 37,5 minutos após a saida de cada um temos a distancia percorrida para cada.
Carro = 110 km/h x 37,5 minutos = 68,75 km

Lembrando que o caminhão tem dois pedagios.
Caminhão = (80 km/h x 37,5 minutos) + (2 x 5 minutos x 80 km/h / 60 minutos) = 50 km + 13,33 km = 63,33 km

Carro = 31,25 km
Caminhão =36,67 km

Desta maneira o carro esta mais proximo.
 

5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
