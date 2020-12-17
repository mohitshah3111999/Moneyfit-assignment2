import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class FullJson {
    boolean success;
    ArrayList<DataObject> dataObjects;

    public FullJson(boolean success, ArrayList<DataObject> dataObjects) {
        this.success = success;
        this.dataObjects = dataObjects;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ArrayList<DataObject> getDataObjects() {
        return dataObjects;
    }

    public void setDataObjects(ArrayList<DataObject> dataObjects) {
        this.dataObjects = dataObjects;
    }

    public void getData(Date date) {
//        Print each data. i.e, Date, Mf Sips, Stocks.
        for (DataObject dataObject : dataObjects) {
            Date objDate = dataObject.which_date;
            if (date.before(objDate)) {
                FundSummaryObj fundSummaryObj = dataObject.fund_Summary;
                ArrayList<ValObj> mf_sips = fundSummaryObj.mf_sips;
                ArrayList<ValObj> stocks = fundSummaryObj.stocks;
                System.out.println("Date: " + objDate);
                System.out.println("\nMf Sips");
                for (ValObj valObj : mf_sips) {
                    String res = "";
                    res += "Id: " + valObj.id;
                    res += "\nCurrent_Investment_Value: " + valObj.current_investment_value;
                    res += "\nTotal Investment Value: " + valObj.total_investment_value + "\n";
                    System.out.println(res);
                }
                System.out.println("Stocks");
                for (ValObj valObj : stocks) {
                    String res = "";
                    res += "Id: " + valObj.id;
                    res += "\nCurrent_Investment_Value: " + valObj.current_investment_value;
                    res += "\nTotal Investment Value: " + valObj.total_investment_value + "\n";
                    System.out.println(res);
                }
                System.out.println("======");
            }
        }
    }

    public Date getStartDate() {
//        Gives the earliest date available in list.
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date tempDate = new Date();
        for (DataObject dataObject : dataObjects) {
                if(dataObject.which_date.before(tempDate)){
                    tempDate = dataObject.which_date;
                }
        }
        return tempDate;
    }
}
