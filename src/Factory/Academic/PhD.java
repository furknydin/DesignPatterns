package Factory.Academic;

public class PhD {
    public String name;
    public String thesis;
    public String master;

    public PhD(String name, String thesis, String master) {
        this.name = name;
        this.thesis = thesis;
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }
}
