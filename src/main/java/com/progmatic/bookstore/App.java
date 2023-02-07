package com.progmatic.bookstore;

import java.awt.print.Book;
import java.util.Scanner;

public class App {

    private Controller controller;

    private static void printMenu() {
        System.out.println("=".repeat(30));
        System.out.println("\tÚj könyv felvétele - (új)");
        System.out.println("=".repeat(30));
    }

    private void mainMenu(Scanner sc) {
        String option = "könyv";
        do {
            switch (option) {
                case "i" -> controller.initBooksStoresAuthors();
                case "új" -> {
                    System.out.println("Add meg az új könyv isbn számát: ");
                    String isbn = sc.nextLine();

                    System.out.println("Add meg a könyv szerzőjét: ");
                    String author = sc.nextLine();

                    System.out.println("Add meg a könyv címét: ");
                    String title = sc.nextLine();
                    sc.nextLine();

                    controller.addBook(isbn, author, title);
                }

                default -> {
                    if (!option.equalsIgnoreCase("bolt")) {
                        System.out.println("Nem ismert opcio...");
                    }
                }
            }

            printMenu();
            System.out.println("Mit szeretnél?");
        } while (!"q".equalsIgnoreCase(option = sc.nextLine()));
    }

    public static void main(String[] args) {

        App a = new App();

        try (
                Scanner sc = new Scanner(System.in);
                Controller c = new Controller()
        ) {
            a.controller = c;
            a.mainMenu(sc);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
