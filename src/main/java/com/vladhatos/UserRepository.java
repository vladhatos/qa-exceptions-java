package com.vladhatos;

import java.util.ArrayList;
import java.util.List;

//Repository care gestioneaza lista de utilizatori si valideaza datele la adaugare

public class UserRepository {

    private List<User> users = new ArrayList<>();

    //Metoda addUser adauga un utilizator in lista dupa validare
    //Arunca InvalidUserDataException daca datele sunt invalide

    public void addUser(User user) throws InvalidUserDataException {
        //Arunca InvalidUserDataException daca user este null
        if (user == null) {
            throw new InvalidUserDataException("User este null!");
        }

        //Arunca InvalidUserDataException daca User este null sau mai scurt de 3 caractere
        if (user.getUsername() == null || user.getUsername().length() < 3) {
            throw new InvalidUserDataException("Username-ul '" + user.getUsername() + "' este invalid! "
                            + "Trebuie sa aiba cel putin 3 caractere.");
        }

        //Arunca InvalidUserDataException daca Age este negativ
        if (user.getAge() < 0) {
            throw new InvalidUserDataException("Age " + user.getAge() + " este invalid! "
                            + "Age nu poate fi un numar negativ."
            );
        }

        //Daca toate validarile trec, adaugam utilizatorul si returnam lista
        users.add(user);
        System.out.println("Utilizator adaugat in lista: " + user);
    }


    public List<User> getUsers() {
        return users;
    }
}
