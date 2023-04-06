import java.util.UUID;

public class Person {
    public String name;
    private String ID_person; // служебное ID, для нормальной сборки при импорте. да и правьльно сравнивать
                              // объект человек по ID а не по имени...
                              // из String вообще как то можно перейти в UUID?? хотя бы костиылями парсить в 2 лонга и клеить  ГГШВ,

    public Person(String name) {
        this.name = name;
        this.ID_person = UUID.randomUUID().toString();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID_person() {
        return ID_person;
    }

    public void setID_person(String iD_person) {
        ID_person = iD_person;
    }

}
