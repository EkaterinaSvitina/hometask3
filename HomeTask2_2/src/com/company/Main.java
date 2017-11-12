package com.company;
import com.company.People;
import com.company.Functions;

import java.util.*;
import java.io.*;



public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        People people1 = new People(15, "Kate", "Skibenko", 25);
        People people2 = new People(20, "Petr", "Ivanov", 31);
        People people3 = new People(3, "Olga", "Marsalova", 45);
        People people4 = new People(31, "Olga", "Mirnaya", 18);
        People people5 = new People(47, "Ivan", "Ivanov", 27);
        People people6 = new People(5, "Evgenij", "Denisov", 22);
        People people7 = new People(52, "Tatiana", "Petrova", 54);
        People people8 = new People(13, "Anna", "Kurtikova", 32);
        People people9 = new People(1, "Evgenij", "Romanov", 25);
        People people10 = new People(17, "Oleg", "Sidorov", 13);

        List<People> peoples = new ArrayList();

        peoples.add(people1);
        peoples.add(people2);
        peoples.add(people3);
        peoples.add(people4);
        peoples.add(people5);
        peoples.add(people6);
        peoples.add(people7);
        peoples.add(people8);
        peoples.add(people9);
        peoples.add(people10);


        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(new File("MyFile.txt")));

            o.writeObject(people1);
            o.writeObject(people2);
            o.writeObject(people3);
            o.writeObject(people4);
            o.writeObject(people5);
            o.writeObject(people6);
            o.writeObject(people7);
            o.writeObject(people8);
            o.writeObject(people9);
            o.writeObject(people10);

            o.close();

        } catch ( FileNotFoundException e ) {
            System.out.println("File not found");
        } catch ( IOException e ) {
            System.out.println("Error initializing stream");
        }

        System.out.println("List of people:\n");
        try {
            ObjectInputStream oi = new ObjectInputStream(new FileInputStream(new File("MyFile.txt")));

            People pr1 = (People) oi.readObject();
            People pr2 = (People) oi.readObject();
            People pr3 = (People) oi.readObject();
            People pr4 = (People) oi.readObject();
            People pr5 = (People) oi.readObject();
            People pr6 = (People) oi.readObject();
            People pr7 = (People) oi.readObject();
            People pr8 = (People) oi.readObject();
            People pr9 = (People) oi.readObject();
            People pr10 = (People) oi.readObject();

            System.out.println(pr1.toString());
            System.out.println(pr2.toString());
            System.out.println(pr3.toString());
            System.out.println(pr4.toString());
            System.out.println(pr5.toString());
            System.out.println(pr6.toString());
            System.out.println(pr7.toString());
            System.out.println(pr8.toString());
            System.out.println(pr9.toString());
            System.out.println(pr10.toString());

            oi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        Functions function = new Functions();
        function.SortById(peoples);

        System.out.println("\nList sorted by ID: ");
        for(People people : peoples){
            System.out.println(people);
        }

        System.out.println("\nAverage by age: " +  function.averageAge(peoples));

        System.out.println("\nInput the first letter from Last Name: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println("People: ");
        function.SearchByLetter(peoples,str);

    }
        }


