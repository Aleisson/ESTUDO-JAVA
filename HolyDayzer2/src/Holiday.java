/**
 * Holiday
 */
public class Holiday {

  private String date;
  private String name;

  public Holiday(String date, String name) {
    this.date = date;
    this.name = name;
  }
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String toString(){
    return this.date + "=>" + this.name;
  }
  
}