import java.util.ArrayList;

public class FundSummaryObj {
    ArrayList<ValObj> mf_sips, stocks;

    public FundSummaryObj(ArrayList<ValObj> mf_sips, ArrayList<ValObj> stocks) {
        this.mf_sips = mf_sips;
        this.stocks = stocks;
    }

    public ArrayList<ValObj> getMf_sips() {
        return mf_sips;
    }

    public void setMf_sips(ArrayList<ValObj> mf_sips) {
        this.mf_sips = mf_sips;
    }

    public ArrayList<ValObj> getStocks() {
        return stocks;
    }

    public void setStocks(ArrayList<ValObj> stocks) {
        this.stocks = stocks;
    }
}
