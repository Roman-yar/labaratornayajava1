package Animal_shelter;
import java.util.Objects;
public class Cats implements Animals {
    private String identifier;

    private String nickname;
    private String animal_type;
    private Double weight;

    //конструктор с параметром
    public Cats(String identifier, String nickname, String animal_type, Double weight) {
        this.identifier= identifier;
        this.nickname = nickname;
        this.animal_type = animal_type;
        this.weight = weight;

    }

    //пустой конструктор
    public Cats() {
        System.out.println("Создали кота!");
    }

    //конструктор копирования
    public Cats(Cats cats) {
        identifier = identifier;
        nickname = nickname;
        animal_type = animal_type;
        weight = weight;
    }


    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }


    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String setAnimal_type() {
        //    this.animal_type= animal_type;
        return animal_type;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }


    public String getNickname() {
        return nickname;
    }

    public String getAnimal_type() {
        return animal_type;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "{" + identifier + ", " + nickname + ", " + animal_type + "," + weight + "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cats cats = (Cats) o;
        return Objects.equals(identifier, cats.identifier);
    }

    @Override
    public void printAnimal() {
        System.out.println("{" + identifier+ ", " + nickname + ", " + animal_type + "," + weight + "} ");
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void destructor() {
        System.gc();
    }
}