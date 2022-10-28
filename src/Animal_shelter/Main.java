package Animal_shelter;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Animal dog = new Dog("2", "Мухтар", "собака", "кобель");
        Animal cat = new Cat("3", "Барсик", "кот", 4.4);



        List<Animal> animals = new ArrayList<Animal>();




        Scanner sc = new Scanner(System.in);

        String s = " ";

        while (!"5".equals(s)) {
            System.out.println("1. Для добавление кошки нажмите 1");
            System.out.println("2. Для добавление собаки нажмите 2");
            System.out.println("3. Для показа всех зверей нажмите 3");
            System.out.println("4. Для удаления животного из базы нажмите 4");
            System.out.println("5. Для выхода из приложения нажмите 5");
            s = sc.nextLine();

            try {

            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }

            switch (s) {
                case "1":
                    //добавления записи кота
                    Main.addCat(sc, animals);
                    break;
                case "2":

                    Main.addDog(sc, animals);
                    break;
                case "3":
                    //показаз всех записей
                    for (Animal t : animals) {
                        t.printAnimal();
                    }
                    break;
                case "4":
                    //удаление записи
                    Main.goToRemove(sc, animals);

                    break;
            }
        }
        System.out.println("До свидания!");


    }


    private static void addCat(Scanner sc,List<Animal> animals ) {
        System.out.println("Введите через пробел идентификатор животного, кличку животного, вид животного, вес в кг: ");
        String str = sc.nextLine();
        String buf[] = str.trim().split(" +");


        try {
            if (buf.length != 4)
            {    throw new NumberFormatException();}
            Cat cat1 = new Cat(  buf[0], buf[1], buf[2], Double.parseDouble(buf[3]));



            if (animals.stream().anyMatch(p -> p.getIdentifier().equals(cat1.getIdentifier())))
                System.err.println("этот идентификатор уже есть в базе ");


            if (Double.parseDouble(buf[3])<0)
                System.err.println("вес котика не может быть меньше или равен 0");
            else {
                animals.add(cat1);
                System.out.println("Готово!");
                System.out.println("создан: "+cat1.getAnimalType()+ " с кличкой:" +cat1.getNickname()+" он весит:"+cat1.getWeight()+"кг");
            }


        } catch (NumberFormatException e) {
            System.err.println("неверный формат данных");
        }
    }
    private static void addDog(Scanner sc,List<Animal> animals ) {
        System.out.println("Введите через пробел идентификатор животного, кличку животного, вид животного, вес в кг: ");
        String str = sc.nextLine();
        String buf[] = str.trim().split(" +");

        try {
            if (buf.length != 4)
            {    throw new NumberFormatException();}
            Dog dog1 = new Dog(buf[0], buf[1], buf[2], buf[3]);
            if (animals.stream().anyMatch(p -> p.getIdentifier().equals(dog1.getIdentifier())))
                System.err.println("этот идентификатор уже есть в базе");

            else {
                animals.add(dog1);
                System.out.println("Готово!");
                System.out.println("создан "+ dog1.getAnimalType()+" с кличкой: " +dog1.getNickname());
            }

        } catch (NumberFormatException e) {
            System.err.println("неверный формат данных");
        }
    }
    //удаление записи о животном по номеру идентификатора
    public static void goToRemove(Scanner sc, List<Animal> animals) {
        System.out.println("Введите идентификатор животного ");
        String str = sc.nextLine();
        if (animals.stream().anyMatch(p -> str.equals(p.getIdentifier()))) {
            Animal animal = animals.stream().filter(p -> str.equals(p.getIdentifier())).findAny().get();

            animals.remove(animal);

            System.out.println("Готово!");
        } else {
            System.err.println("такого идентификатора нет в базе");
        }

    }





}


