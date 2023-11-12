package de.telran.HomeWork2.Exercise1;
//Сотрудник
public class Employee extends Human {
    private int experience;
    private String jobTitle;

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "experience=" + experience +
                ", jobTitle='" + jobTitle + '\'' +
                "} " + super.toString();
    }
}
