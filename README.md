# Przykład 10 - Pliki. Obsługa wyjątków.

W tym ćwiczeniu przedstawiono sposób korzystania z plików oraz wyjątków. 

Przejrzyj w dokumentacji Javy opis klas:
- [java.io.BufferedReader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/BufferedReader.html)
- [java.io.FileReader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/FileReader.html)
- [java.io.BufferedWriter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/BufferedWriter.html)
- [java.io.FileWriter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/FileWriter.html)
- [java.io.IOException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/IOException.html)


## Zadania

1. Dodaj do klasy Invoice metodę, która zapisze nowy plik zawierający listę produktów i ich cen brutto.
2. Dopisz na końcu metody `main()` w klasie `Main` kod, który:
   - Utworzy kolekcję `ArrayList` obiektów klasy String.
   - Odczyta plik utworzony przez klasę Invoice.
   - Umieści odczytane nazwy produktów w kolekcji (bez cen i podatków)
   - Wyświetli listę produktów odczytanych z pliku w jednym wierszu (`Milk Butter Bread`).
