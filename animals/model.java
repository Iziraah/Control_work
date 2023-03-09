package animals;

import java.util.ArrayList;
import java.util.Scanner;

public class model {

    ArrayList<String> menu = new ArrayList<>();
    ArrayList<animal> animalList = new ArrayList<>();
    Scanner in;

    public void addAnimal() {
        // Count count = new Count();
        try (Count count = new Count()) {
            // try{
            Scanner in = new Scanner(System.in);
            System.out.println("Введите вид животного (cat, dog, hamster, etc..):");
            String type = in.next();
            // System.out.println(type);
            System.out.println("Введите имя животного:");
            String name = in.next();
            System.out.println("Введите возраст животного:");
            Integer age = in.nextInt();
            if(type.equals("cat")){
                // System.out.println("Запись кота:");
                // System.out.println("Введите имя животного:");
                // String name = in.next();
                // System.out.println("Введите возраст животного:");
                // Integer age = in.nextInt();
                cat cat = new cat(name, age);
                animalList.add(cat);
                System.out.println("Запись удалась");            
            }
            if (type.equals("dog")) {
                System.out.println("Собака записана.");
                animalList.add(new dog(name, age));
            }
            if (type.equals("hamster")) {
                System.out.println("Хома записан");
                animalList.add(new hamster(name, age));  
            }
            if (type.equals("guineaPig")) {
                System.out.println("Запись морской свинки завершена.");
                animalList.add(new guineaPig(name, age));  
            }
            if (type.equals("fish")) {
                System.out.println("Запись рыбки завершена.");
                animalList.add(new fish(name, age));  
            }
            if (type.equals("horse")) {
                System.out.println("Запись лошади закончена.");
                animalList.add(new horse(name, age));  
            }
            if (type.equals("mule")) {
                System.out.println("Запись мула закончена.");
                animalList.add(new mule(name, age));  
            }
            if (type.equals("donkey")) {
                System.out.println("Запись ослика закончена.");
                animalList.add(new donkey(name, age));  
            }
            if (type.equals("camel")) {
                System.out.println("Записали верблюдика :з");
                animalList.add(new camel(name, age));  
            }
            count.increment();
            in.close();
            
        } catch (Exception e) {
            System.out.println("Упс.. Что-то пошло не так..");
           
        }
    }

    public void showComm() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Введите кличку животного для просмотра его умений");
            String name = in.next();
            // System.out.println(name);

            for (int i = 0; i < animalList.size(); i++) {
                System.out.println("zzz");        
            if (animalList.get(i).getName() == name) {
                    animal animal = animalList.get(i);
                    System.out.println("yo");
                    System.out.println("Список команд:" + animal.getCommands());
            }
            else {
                    System.out.println("Такого животного нет");
            }
            }
        }
    }

    public void addNewComm() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Какое животное будем обучать?");
            String name = in.next();
            System.out.println("Новая команда");
            String command = in.next();

            for (int i = 0; i < animalList.size(); i++) {
                if (animalList.get(i).getName().equals(name)) {
                // if (animalsList.get(i).getName() == name) {
                    animal animal = animalList.get(i);
                    animal.commands.add(command);
                    System.out.println("Успех");
                }
               
            }
            // System.out.println("Успех");
        }
    }
}

class Count implements AutoCloseable {
    private int count;

    public Count() {
        count = 0;
    }

    public int get() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    @Override
    public void close() throws Exception {
        // TODO Auto-generated method stub
        System.out.println(" ");
    }

}