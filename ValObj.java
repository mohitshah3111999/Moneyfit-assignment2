public class ValObj {
    int id, current_investment_value, total_investment_value;

    public ValObj(int id, int current_investment_value, int total_investment_value) {
        this.id = id;
        this.current_investment_value = current_investment_value;
        this.total_investment_value = total_investment_value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrent_investment_value() {
        return current_investment_value;
    }

    public void setCurrent_investment_value(int current_investment_value) {
        this.current_investment_value = current_investment_value;
    }

    public int getTotal_investment_value() {
        return total_investment_value;
    }

    public void setTotal_investment_value(int total_investment_value) {
        this.total_investment_value = total_investment_value;
    }
}
