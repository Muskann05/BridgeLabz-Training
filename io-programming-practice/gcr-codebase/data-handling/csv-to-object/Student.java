class Student {
    String id, name, age, marks;
    Student(String id, String name, String age, String marks) {
        this.id = id; this.name = name; this.age = age; this.marks = marks;
    }
    public String toString() {
        return id + " " + name + " " + age + " " + marks;
    }
}