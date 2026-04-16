package com.vladhatos;

import java.util.List;

//Clasa Main pentru testarea functionalitatii

public class Main {

    public static void main(String[] args) {
        //creeaza o instanta de UserRepository
        UserRepository repository = new UserRepository();

        System.out.println("Se testeaza utilizatorii\n");

        //User 1: User valid
        System.out.println("testuser, 25");
        try {
            User user1 = new User("testuser", 25);
            repository.addUser(user1);
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        System.out.println();

        //User 2: AdminUser valid
        System.out.println("admin, 30, full_access");
        try {
            AdminUser admin = new AdminUser("admin", 30, "full_access");
            repository.addUser(admin);
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        System.out.println();

        //User 3: User cu username prea scurt
        System.out.println("ab, 22");
        try {
            User user3 = new User("ab", 22);
            repository.addUser(user3);
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        System.out.println();

        //User 4: User cu age negativ
        System.out.println("baduser, -5");
        try {
            User user4 = new User("baduser", -5);
            repository.addUser(user4);
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        System.out.println();

        //Afisarea tuturor utilizatorilor valizi care au fost adaugati
        System.out.println("Utilizatori valizi:");
        List<User> validUsers = repository.getUsers();

        if (validUsers.isEmpty()) {
            System.out.println("Niciun utilizator adaugat");
        } else {
            for (User u : validUsers) {
                System.out.println("Utilizatori valizi adaugati: " + u.afiseazaDetalii());
            }
        }


    }
}
