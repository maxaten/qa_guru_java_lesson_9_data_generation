package pages.components;

import java.util.concurrent.ThreadLocalRandom;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {


    public void setDate(String day, String month, String year) {
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();
    }

//    public static int getRandomInt(){
//        int min = 1;
//        int max = 31;
//        return ThreadLocalRandom.current().nextInt(min, max + 1);
//    }

}
