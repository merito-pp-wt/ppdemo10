# Przykład 10 - Pliki. Obsługa wyjątków.

W tym ćwiczeniu przedstawiono sposób korzystania z tabli

Tablice w języku Java są obiektami, tak więc mają właściwości takie jak np. length. Ponieważ rozmiar tablicy nie może się zmienić, length nie jest metodą, ale polem o stałej wartości.

Znajdź w dokumentacji Javy opis klasy java.util.Arrays, która zawiera różne funkcje umożliwiające manipulowanie tablicami (wypełnianie wartością, porównanie, sortowanie i in.)

## Zadania

Dodaj do klasy App następujące metody:

Metodę min(int[] t) znajdującą najmniejszą wartość w tablicy.
Metodę average1(int[] t) obliczającą średnią wartość liczb zawartych w tablicy. Wykorzystaj metodę sumOfElements().
Metodę average2(int[] t) obliczającą średnią wartość liczb zawartych w tablicy, ale bez pomocy metody sumOfElements().
Metodę last(int[] t) zwracającą wartość ostatniego elementu w tablicy (elementu o największym indeksie).