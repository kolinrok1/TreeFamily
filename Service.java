import java.time.LocalDate;

public class Service {
    private int id;
    private FamilyTree familyGroup;

    public Service(FamilyTree familyGroup) {
        this.familyGroup = familyGroup;

    }

    public FamilyTree getFamilyGroup() {
        return familyGroup;
    }


    public void sortByID() {
        familyGroup.sortByID();
    }

    public void sortByLastName() {
        familyGroup.sortByLastName();
    }
}