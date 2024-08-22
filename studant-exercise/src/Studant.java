public class Studant {

  int age;
  double height;
  String name;
  private String cpf;
  private String email;
  Adress adress = new Adress();

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }
}