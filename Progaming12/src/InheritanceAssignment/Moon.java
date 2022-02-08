package InheritanceAssignment;

import java.util.Objects;

public class Moon {
    private Planet planet;
    private int orbitTime;
    private boolean atmosphere;
    private String designation;

    public Moon(Planet planet, int orbitTime, boolean atmosphere, String designation) {
        this.planet = planet;
        this.orbitTime = orbitTime;
        this.atmosphere = atmosphere;
        this.designation = designation;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public String getDesignation() {
        return designation;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public boolean isAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Moon) {
            return Objects.equals(this.designation, ((Moon) object).designation);
        }
        return false;
    }

    public String toString() {
        return "Designation: " + designation;
    }
}
