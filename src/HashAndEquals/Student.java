package HashAndEquals;

public class Student {
    private Integer id;
    private String name;
    private Integer marks;

    @Override
    public int hashCode(){
      return this.name.hashCode()+this.id.hashCode()+this.marks.hashCode();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o.getClass() != this.getClass()){
            return false;
        }
        Student s = (Student) o;
        if(s.getId()== this.getId() && s.getName() == this.getName() && s.getMarks() == this.getMarks()){
            return true;
        }
        return false;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", marks=" + marks +
//                '}';
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
