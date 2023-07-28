package employeeApp;

import java.util.Arrays;

public class Company {

    private int id;
    private String name;
    private int giro;

    private String[] developerNames;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        if (giro < 0) {
            System.out.println("Giro cannot be negative");
            System.exit(0);
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }


    //Constructor


    public Company(int id, String name, int giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro); // setGiro metodu ile giro değerini kontrol ediyoruz.
        this.developerNames = developerNames;
    }

    // toString() method

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }

    public void addEmployee(int index, String name){
        if (index >= 0 && index < developerNames.length) {
            if (developerNames[index] == null) {
                developerNames[index] = name;
                System.out.println("Employee " + name + " is assigned to index " + index);
            } else {
                System.out.println("The employee at index " + index + " is already assigned.");
            }
        } else {
            System.out.println("Invalid index: " + index);
        }
    }
}
