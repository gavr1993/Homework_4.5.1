package com.gavr;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Меню:\n1. Добавить контакт\n2. Добавить пропущенный вызов\n" +
                "3. Вывести все пропущенные вызовы\n4. Очистить пропущенные вызовы\n5. Выход");
        int id = in.nextInt();
        switch (id) {
            case 1:
                System.out.println("Введите имя:");
                String name = in.nextLine();
                System.out.println("Введите фамилию:");
                String surname = in.nextLine();
                System.out.println("Введите номер телефона:");
                String phoneNumber = in.nextLine();
                System.out.println("Выберите группу:");
                int i = 1;
                while (i < 4)
                    for (Group gr : Group.values()) {
                        System.out.println(i + gr.toString());
                        i++;
                    }
                int groupId = in.nextInt();
                switch (groupId) {
                    case 1:
                        Contact contactW = new Contact(name, surname, phoneNumber, Group.Work);
                        Contacts.addContact(contactW);

                    case 2:
                        Contact contactFr = new Contact(name, surname, phoneNumber, Group.Friends);
                        Contacts.addContact(contactFr);
                    case 3:
                        Contact contactFam = new Contact(name, surname, phoneNumber, Group.Family);
                        Contacts.addContact(contactFam);
                }
            case 2:

        }
    }
}
