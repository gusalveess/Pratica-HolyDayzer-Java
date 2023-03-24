public class App {
    public static void main(String[] args) throws Exception {
        // crio uma nova instância baseada na classe Holiday.
        Holiday holiday = new Holiday();
        // Dou um set na String privada chamada data.
        holiday.setDate("25/12/2023");
        // Dou um get na String privada data.
        String date = holiday.getDate();
        // Procuro qual o feriado baseado na data informada.
        holiday.WhatsHoliday(date);
        // Chamo a função que me retorna todos os feriados do ano.
        holiday.getAllHolidays();
    }
}
