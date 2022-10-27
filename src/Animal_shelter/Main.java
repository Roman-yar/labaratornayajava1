package Animal_shelter;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Animals cats= new Cats();

        Animals dogs = new Dogs("2", "Мухтар", "собака", "кобель");
        Animals cats = new Cats("3", "sgdds3", "кот", 4.4);



        List< Animals> animals = new ArrayList< Animals >();


        for (Animals s : animals) {
                   s.printAnimal();
                 }

        Scanner sc = new Scanner(System.in);
        int x = 0;
        String s = " ";

        while (!"5".equals(s)) {
            System.out.println("1. Для добавление кошки нажмите 1");
            System.out.println("2. Для добавление собаки нажмите 2");
            System.out.println("3. Для показа всех зверей нажмите 3");
            System.out.println("4. Для удаления животного из базы нажмите 4");
            System.out.println("5. Для выхода из приложения нажмите 5");
            s = sc.nextLine();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }

            switch (s) {
                case "1":
                    // добавление кота
                    Main.addCats(sc, animals);
                    break;
                case "2":

                    Main.addDogs(sc, animals);
                    break;
                case "3":
                    //показаз всех записей
                    for (Animals t : animals) {
                        t.printAnimal();
                    }
                    break;
                case "4":
                    Main.goToRemove(sc, animals);

                    break;
            }
        }
        System.out.println("До свидания!");


    }


    private static void addCats(Scanner sc,List<Animals> animals ) {
        System.out.println("Введите через пробел идентификатор животного, кличку животного, вид животного, вес в кг: ");
        String str = sc.nextLine();
        String buf[] = str.trim().split(" +");


        try {
            if (buf.length != 4)
            {    throw new NumberFormatException();}
            Cats cats1 = new Cats(  buf[0], buf[1], buf[2], Double.parseDouble(buf[3]));



               if (animals.stream().anyMatch(p -> p.getIdentifier().equals(cats1.getIdentifier())))
              System.err.println("этот идентификатор уже есть в базе ");


            if (Double.parseDouble(buf[3])<0)
                System.err.println("вес котика не может быть меньше или равен 0");
else {
                   animals.add(cats1);
                   System.out.println("Готово!");

               }


        } catch (NumberFormatException e) {
            System.err.println("неверный формат данных");
        }
    }
    private static void addDogs(Scanner sc,List<Animals> animals ) {
        System.out.println("Введите через пробел идентификатор животного, кличку животного, вид животного, вес в кг: ");
        String str = sc.nextLine();
        String buf[] = str.trim().split(" +");

        try {
            if (buf.length != 4)
            {    throw new NumberFormatException();}
            Dogs dogs1 = new Dogs(buf[0], buf[1], buf[2], buf[3]);
            if (animals.stream().anyMatch(p -> p.getIdentifier().equals(dogs1.getIdentifier())))
                System.err.println("этот идентификатор уже есть в базе");

            else {
                animals.add(dogs1);
                System.out.println("Готово!");

            }

        } catch (NumberFormatException e) {
            System.err.println("неверный формат данных");
        }
    }
    public static void goToRemove(Scanner sc, List<Animals> animals) {
        System.out.println("Введите идентификатор животного ");
        String str = sc.nextLine();
        if (animals.stream().anyMatch(p -> str.equals(p.getIdentifier()))) {
            Animals animal = animals.stream().filter(p -> str.equals(p.getIdentifier())).findAny().get();

            animals.remove(animal);
            System.out.println("Готово!");
        } else {
            System.err.println("такого идентификатора нет в базе");
        }

    }





}




