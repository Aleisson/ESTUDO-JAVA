public class App {
    public static void main(String[] args) throws Exception {
        Holiday util = new Holiday();
        util.listHolidays();
        System.out.println(util.isHoliday("25/03/2035"));
        System.out.println(util.isHoliday("01/01/2023"));
    }
}
