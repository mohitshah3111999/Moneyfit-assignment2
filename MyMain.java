import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class MyMain {
    static FullJson jsonObject;

    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        ArrayList<DataObject> dataObjects = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            try {
                LocalDate localDate = LocalDate.now().minusDays(i);
                Date date = format.parse(localDate.toString());
                ValObj valObj = new ValObj(i, 1000, 1000);
                ArrayList<ValObj> arrayList = new ArrayList<>();
                arrayList.add(valObj);
                FundSummaryObj fundSummaryObj = new FundSummaryObj(arrayList, arrayList);
                DataObject dataObject = new DataObject(i, i + 1, fundSummaryObj, date);
                dataObjects.add(dataObject);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        jsonObject = new FullJson(true, dataObjects);


        printData(0, 0, 0, 1);
        printData(0, 0, 1, 0);
        printData(0, 1, 0, 0);
        printData(1, 0, 0, 0);

        System.out.println("\nIteration start\n");
        Date date = jsonObject.getStartDate();
        jsonObject.getData(date);
        System.out.println("\nIteration over\n");
    }

    public static void printData(int years, int months, int weeks, int days){
        System.out.println("\nIteration start\n");
        LocalDate localDate = LocalDate.now().minusYears(years).minusMonths(months).minusWeeks(weeks).minusDays(days);
        Date date = Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        jsonObject.getData(date);
        System.out.println("\nIteration over\n");
    }
}
