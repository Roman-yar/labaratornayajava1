package Animal_shelter;
import java.util.Objects;
public class Dog implements Animal {
    private String identifier;

    private String nickname;
    private String animalType ;
    private String gender;

    public Dog(String identifier, String nickname, String animalType, String gender) {
        this.identifier = identifier;
        this.nickname = nickname;
        this.animalType = animalType;
        this.gender= gender;

    }
    public String getGender() {
        return gender;
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
        Dog dogs = (Dog) o;
        return Objects.equals(identifier, dogs.identifier);
    }
    @Override
    public void printAnimal() {
        System.out.println("{"+"идентификатор: " + identifier+ ", "+"кличка: " + nickname + ", "+"вид животного:"+ animalType+"," +"пол  животного:"  + gender + "} ");

    }


    @Override
    public void destructor() {
        System.gc();
    }
}