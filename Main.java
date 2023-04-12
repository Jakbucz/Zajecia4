/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<Student> students = Service.loadStudents();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Wybierz opcje (dodaj, lista, zamknij) ");
      String choice = scanner.nextLine();

      if (choice.equalsIgnoreCase("dodaj")) {
        System.out.print("Podaj imię: ");
        String name = scanner.nextLine();
        System.out.print("Podaj wiek: ");
        int age = Integer.parseInt(scanner.nextLine());
        students.add(new Student(name, age));
        Service.saveStudents(students);
        
          
      }
      else if (choice.equalsIgnoreCase("zamknij")){
        break;
        
      }
    }
  }
}