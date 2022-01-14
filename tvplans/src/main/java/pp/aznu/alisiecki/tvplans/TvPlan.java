package pp.aznu.alisiecki.tvplans;

public class TvPlan {

    protected String name;
    protected double numberOfChannels;
    protected double cost;

    public TvPlan(String name, double numberOfChannels, double cost) {
        this.name = name;
        this.numberOfChannels = numberOfChannels;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberOfChannels() {
        return numberOfChannels;
    }

    public void setNumberOfChannels(double numberOfChannels) {
        this.numberOfChannels = numberOfChannels;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "TvPlan{" +
                "name='" + name + '\'' +
                ", numberOfChannels=" + numberOfChannels +
                ", cost=" + cost +
                '}';
    }
}
