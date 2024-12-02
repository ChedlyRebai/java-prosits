public class Student {
    int id;
    String nom;
    int age;

    Student(int id, String nom, int age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }

    Student() {

    }

    @Override
    public String toString(){
        return "id:"+id+ " nom: "+ this.nom +" age: " +this.age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
