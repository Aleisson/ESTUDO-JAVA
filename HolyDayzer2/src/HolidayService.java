public class HolidayService {

  private Holiday[] holidays;

  public HolidayService() {
      this.holidays = new Holiday[] {
          new Holiday("01/01/2023", "Confraternização mundial"),
          new Holiday("21/02/2023", "Carnaval"),
          new Holiday("17/04/2023", "Páscoa"),
          new Holiday("21/04/2023", "Tiradentes"),
          new Holiday("01/05/2023", "Dia do trabalho"),
          new Holiday("08/06/2023", "Corpus Christi"),
          new Holiday("07/09/2023", "Independência do Brasil"),
          new Holiday("12/10/2023", "Nossa Senhora Aparecida"),
          new Holiday("02/11/2023", "Finados"),
          new Holiday("15/11/2023", "Proclamação da República"),
          new Holiday("25/12/2023", "Natal")
      };
  }

  public String findHolidayForDate(String date) {
      for (Holiday holiday : this.holidays) {
          if (holiday.getDate().equals(date)) {
              return "Holiday: " + holiday.getName();
          }
      }
      return "Not have holiday in this date: " + date;
  }

  public Holiday[] listAllHolidays() {
      return this.holidays;
  }
}
