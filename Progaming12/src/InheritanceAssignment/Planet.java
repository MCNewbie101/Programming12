package InheritanceAssignment;

import java.util.ArrayList;
import java.util.Objects;

public class Planet {
    private int orbitTime;
    private ArrayList<Moon> moons = new ArrayList<Moon>();
    String designation;

    public Planet() {
        orbitTime = 0;
        designation = "";
    }

    public Planet(int orbitTime, String designation) {
        this.orbitTime = orbitTime;
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public void addMoon(Moon moon) {
        moons.add(moon);
    }

    public ArrayList<Moon> getMoons() {
        return moons;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Planet) {
            return Objects.equals(this.designation, ((Planet) object).designation);
        }
        return false;
    }

    public String toString() {
        return "Designation: " + designation;
    }
}
