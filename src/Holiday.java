public class Holiday implements HolidayInterface {

    private String[] AllHolidays = {
            "01/01/2023 => Confraternização mundial",
            "21/02/2023 => Carnaval",
            "17/04/2023 => Páscoa",
            "21/04/2023 => Tiradentes",
            "01/05/2023 => Dia do trabalho",
            "08/06/2023 => Corpus Christi",
            "07/09/2023 => Independência do Brasil",
            "12/10/2023 => Nossa Senhora Aparecida",
            "02/11/2023 => Finados",
            "15/11/2023 => Proclamação da República",
            "25/12/2023 => Natal"
    };

    private String Date;

    public String getDate() {
        return this.Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

    public void WhatsHoliday(String holiday) {
        String[] days = { "01/01/2023", "21/02/2023", "17/04/2023", "21/04/2023", "01/05/2023", "08/06/2023",
                "07/09/2023", "12/10/2023", "02/11/2023", "15/11/2023", "25/12/2023" };
        String[] holidays = { "Confraternização mundial", "Carnaval", "Páscoa", "Tiradentes", "Dia do trabalho",
                "Corpus Christi", "Independência do Brasil", "Dia de Nossa Senhora Aparecida", "Dia de Finados",
                "Proclamação da República", "Natal" };
        for (int i = 0; i < days.length; i++) {
            if (holiday.equals(days[i])) {
                System.out.println("Este feriado é " + holidays[i]);
                return;
            }
        }
        System.out.println("Não existe feriado na data informada");
    }

    public void getAllHolidays() {
        for (int i = 0; i < this.AllHolidays.length; i++) {
            System.out.println(this.AllHolidays[i]);
        }
    }

    public void setAllHolidays(String[] allHolidays) {
        this.AllHolidays = allHolidays;
    }
}
