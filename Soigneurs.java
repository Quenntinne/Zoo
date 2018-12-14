package zoo;

public class Soigneurs {
    private String name;
    private String sexe;
    private Integer age;
    private Integer experience = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Soigneurs(String name, String sexe, Integer age) {
        this.name = name;
        this.sexe = sexe;
        this.age = age;
    }
}
