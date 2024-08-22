public class App {
    public static void main(String[] args) throws Exception {
        Studant studant = new Studant();
        studant.name = "Caio";
        studant.age = 15;
        studant.height = 1.60;
        studant.setCpf("111.111.111-22");
        studant.setEmail("caio@gmail.com");
        studant.adress.city = "Goiania";
        studant.adress.district = "Centro";
        studant.adress.number = 101;
        studant.adress.state = "GO";
        studant.adress.street = "Rua Dona Linda";
        System.out.println(studant.name);
    }
}
