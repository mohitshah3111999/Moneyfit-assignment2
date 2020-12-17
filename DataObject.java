import java.util.Date;

public class DataObject {
    int id, user_id;
    FundSummaryObj fund_Summary;
    Date which_date;

    public DataObject(int id, int user_id, FundSummaryObj fundSummary, Date which_date) {
        this.id = id;
        this.user_id = user_id;
        this.fund_Summary = fundSummary;
        this.which_date = which_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public FundSummaryObj getFund_Summary() {
        return fund_Summary;
    }

    public void setFund_Summary(FundSummaryObj fund_Summary) {
        this.fund_Summary = fund_Summary;
    }

    public Date getWhich_date() {
        return which_date;
    }

    public void setWhich_date(Date which_date) {
        this.which_date = which_date;
    }
}
