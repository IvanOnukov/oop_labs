public class Student implements Comparable<Student> {
    private String name;
    private int course;
    private String faculty;
    private double averScore;

    public Student(String name, int course, String faculty, double averScore ) {
        this.name = name;
        this.course = course;
        this.faculty = faculty;
        this.averScore = averScore;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public String getFaculty() {
        return faculty;
    }

    public double getAverScore() {
        return averScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setAverScore(int averScore) {
        this.averScore = averScore;
    }

    public int  compareTo(Student s){
        return this.getCourse() - s.getCourse();
    }

}

