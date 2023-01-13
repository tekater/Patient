public class Patient {

    String name;
    String changeName;
    String name2 = "Steve";


    public void setName(String name) {
        if (changeName != null) {
            this.name = name;
        } else {
            this.name = name2;
        }
    }
    public void setChangeName(String changeName) {
        this.changeName = changeName;
    }
    @Override
    public String toString() {
        return "Patient{" +
                "name=" + name +
                ", changeName=" + changeName +
                '}';
    }
}
