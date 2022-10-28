package Animal_shelter;
import java.util.Objects;
public class Cat implements Animal {
    private String identifier;

    private String nickname;
    private String animalType;
    private Double weight;

    //конструктор с параметрами
    public Cat(String identifier, String nickname, String animalType, Double weight) {
        this.identifier= identifier;
        this.nickname = nickname;
        this.animalType = animalType;
        this.weight = weight;

    }

    // конструктор без параметров
    public Cat() {
        System.out.println("Создали кота!");
    }

    //конструктор копирования
    public Cat(Cat cat) {
        identifier = identifier;
        nickname = nickname;
        animalType= animalType;
        weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String getNickname() {
        return nickname;
    }
    @Override
    public String getAnimalType() {
        return animalType;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    //сравнение входящего идентификатора с идентификаторами в базе
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cats = (Cat) o;
        return Objects.equals(identifier, cats.identifier);
    }

    @Override
    public void printAnimal() {
        System.out.println("{"+"идентификатор: " + identifier+ ", "+"кличка: " + nickname + ", "+"вид животного:"+ animalType+"," +"вес животного:"  + weight + "} ");
    }



    @Override
    public void destructor() {
        System.gc();
    }
}