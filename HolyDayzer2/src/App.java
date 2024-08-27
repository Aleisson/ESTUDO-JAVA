
public class App {
    public static void main(String[] args) throws Exception {
        HolidayService holidayService = new HolidayService();

        String resultSearch = holidayService.findHolidayForDate("25/12/2023");
        System.out.println(resultSearch);

        resultSearch = holidayService.findHolidayForDate("01/05/2023");
        System.out.println(resultSearch);

        resultSearch = holidayService.findHolidayForDate("01/06/2023");
        System.out.println(resultSearch);

        System.out.println("List Holidays");
        for (Holiday holiday : holidayService.listAllHolidays()) {
            System.out.println(holiday);
        }
    }
}
