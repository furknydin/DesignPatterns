package CreationalPatterns.Factory.Academic;

public class MasterDegree {
    private String name;
    private String thesis;

    public MasterDegree(String name, String thesis) {
        this.name = name;
        this.thesis = thesis;
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
}
