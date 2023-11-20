package CreationalPatterns.Factory.Academic;

import java.util.ArrayList;
import java.util.List;

public class StudentAffairsDepartment {
    private List<UndergraduateStudent> undergraduates;
    private List<MasterDegree> masters;
    private List<PhD> phDs;

    public StudentAffairsDepartment() {
        undergraduates = new ArrayList<>();
        masters = new ArrayList<>();
        phDs = new ArrayList<>();
    }
    
    public void printUndergraduates(){
        for (UndergraduateStudent u: undergraduates) {
            System.out.println(u.toString());
        }
    }

    public void printMasters(){
        for (MasterDegree m: masters) {
            System.out.println(m.toString());
        }
    }

    public void printPhD(){
        for (PhD p: phDs) {
            System.out.println(p.toString());
        }
    }

    public static void main(String[] args) {
        
    }
}
