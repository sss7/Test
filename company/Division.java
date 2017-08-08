package test.company;

import java.util.ArrayList;
import java.util.List;

public class Division {
    private String divisionName;
    private Leader leader;
    private List<Programmer> programmers = new ArrayList<>();
    private List<Division> subdivisions = new ArrayList<>();

    public Division(String divisionName, Leader leader, List<Programmer> programmers, List<Division> subdivisions) {
        this.divisionName = divisionName;
        this.leader = leader;
        this.programmers = programmers;
        this.subdivisions = subdivisions;
    }

}
