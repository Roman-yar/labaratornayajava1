package Animal_shelter;
import java.util.Objects;
public class Dogs implements Animals {
    private String identifier;

    private String nickname;
    private String animal_type ;
    private String gender;

    public Dogs(String identifier, String nickname, String animal_type, String gender) {
        this.identifier = identifier;
        this.nickname = nickname;
        this.animal_type = animal_type;
        this.gender= gender;

    }






    public void setCage_number(String identifier) {
        this.identifier = identifier;
    }



    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAnimal_type(String animal_type) {
        this.animal_type= animal_type;
    }

    public void setGender(String gender) {
        this.gender= gender;
    }

  //  public String getCage_number() {
    //    return cage_number;
   // }



    public String getNickname() {
        return nickname;
    }

    public String getAnimal_type() {
        return animal_type;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "{" + identifier + ", " + nickname+ ", "  + animal_type + "," + gender + "} ";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       Dogs dogs = (Dogs) o;
        return Objects.equals(identifier, dogs.identifier);
    }
    @Override
    public void printAnimal() {
        System.out.println("{" + identifier + ", " + nickname+ ", "  + animal_type + "," + gender + "} ");
    }
    //получение номера клетки
    @Override
    public String getIdentifier() {
        return identifier;
    }
    @Override
    public void destructor() {
        System.gc();
    }
}