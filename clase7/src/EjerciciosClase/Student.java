package EjerciciosClase;

public class Student extends Person{
  private int legacy;
  private String[] approvedSubjects;
  public Student (String birthDate, String name, String id, int legacy, String[] approvedSubjects) {
    super(birthDate,name, id);
    this.legacy = legacy;
    this.approvedSubjects = approvedSubjects;
  }

  public int getLegacy() {
    return legacy;
  }

  public void setLegacy(int legacy) {
    this.legacy = legacy;
  }

  public String[] getApprovedSubjects() {
    return approvedSubjects;
  }

  public void setApprovedSubjects(String[] approvedSubjects) {
    this.approvedSubjects = approvedSubjects;
  }
}