# Recursividad_Tecnicas
1. Dado el siguiente fragmento de código C:

a) ¿Qué calcula la llamada a la función recursiva bisect(0,N)? Si cambiamos el
valor de N, ¿qué estaríamos calculando? ¿Y si cambiásemos la función f(x)?
Calcula la raíz cuadrada, a través de método bisectriz, que se basa en ir dividiendo los intervalos a la mitad hasta verificar en que intervalo se cambia
de signo y ahi se encontrará la raíz. Si cambiaramos el valor de N a tres, por ejemplo, estaríamos calculado la raíz de tres. Si cambiaramos f(x) la funcion 
bisect() seguirá buscando la raíz cuadrada. Pero dará error si la función f(x) no es continua. 
b) Implemente un algoritmo iterativo equivalente.
Está en el ejericio1 

2. Dado el siguiente algoritmo recursivo:
a) Dado un número cualquiera x, ¿qué nos muestra por pantalla la llamada a la función
recursiva f(x,2)? ¿Cuál sería un nombre más adecuado para la función f?
Se va mostrando por la pantalla todos los divisores de parámetro x hasta que se reduce a un número que solo se puedoe dividir por si mismo (primo), está factorizando.
Primero comprueba que sea mayor que 1, ya que sino no tendría números primos. comprueba si el divisor daría un resultado igual a 0 y sino lo aumenta 1 hasta 
encontrar un número que lo haga, utilizanco la recursividad y llamando a la función otra vez. Cuando lo encuentra lo divide y vuelve a llamar a la función 
para mostrar todos los números. 
Por ello, el nombre que debería tener la función es factorización. 

b) Implemente un algoritmo iterativo y uno implementado mediante expresiones lambda
equivalentes.


3. Construya una función que convierta un número decimal en una cadena que represente el
valor del número en hexadecimal (base 16). A continuación, generalice la función para
convertir un número decimal en un número en base B (con B<10). Resuélvalo mediante
expresiones lambda.
Recordatorio: El cambio de base se realiza mediante divisiones sucesivas por 16
en las cuales los restos determinan los dígitos hexadecimales del número según
la siguiente correspondencia:
Resto 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
Dígito 0 1 2 3 4 5 6 7 8 9 A B C D E F
Por ejemplo:
65029|10 = FE05|16


4. Implemente, tanto de forma recursiva como de forma iterativa, una función que nos diga
si una cadena de caracteres es simétrica (un palíndromo). Por ejemplo,
“DABALEARROZALAZORRAELABAD” es un palíndromo.


5. Implemente, tanto de forma recursiva como de forma iterativa y con expresiones lambda,
una función que nos devuelva el máximo común divisor de dos números enteros
utilizando el algoritmo de Euclides.
ALGORITMO DE EUCLIDES
Dados dos números enteros positivos m y n, tal que m > n,
para encontrar su máximo común divisor
(es decir, el mayor entero positivo que divide a ambos):
- Dividir m por n para obtener el resto r (0 ≤ r < n)
- Si r = 0, el MCD es n.
- Si no, el máximo común divisor es MCD(n,r).


