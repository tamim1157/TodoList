public class GetterSetter {
    int std_id;
    String name;
    float avg;

    public GetterSetter(int std_id) {
        this.std_id = std_id;
        this.name=name;
        this.avg=avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public int getStd_id() {
        return std_id;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }
}
