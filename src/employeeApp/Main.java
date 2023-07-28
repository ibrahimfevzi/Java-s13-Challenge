package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {

        Healthplan.Plan basicPlan = Healthplan.Plan.BASIC;
        Healthplan.Plan standardPlan = Healthplan.Plan.STANDARD;
        Healthplan.Plan premiumPlan = Healthplan.Plan.PREMIUM;

        // Create Employee objects with healthplans
        String[] healthplans1 = {basicPlan.getName()};
        Employee employee1 = new Employee(1, "Ibrahim", "ibrahimfevzi@gmail.com", "password123", healthplans1);

        String[] healthplans2 = {standardPlan.getName()};
        Employee employee2 = new Employee(2, "Ali Veli", "ali@gmail.com.com", "pass456", healthplans2);

        String[] healthplans3 = {premiumPlan.getName()};
        Employee employee3 = new Employee(3, "Ayşe Mert", "ayse@gmail.com", "pass", healthplans3);

        // Add more healthplans to employees
        employee1.addHealthplan(2, premiumPlan.getName());
        employee1.addHealthplan(4, standardPlan.getName());
        employee1.addHealthplan(5, basicPlan.getName());

        employee2.addHealthplan(2, basicPlan.getName());

        employee3.addHealthplan(3, premiumPlan.getName());

        // Create Company object with employees
        String[] developers = {employee1.getFullName(), employee2.getFullName(), employee3.getFullName()};
        Company company = new Company(1, "ABC Corp", 5000, developers);

        // Add more employees to company
        company.addEmployee(4, "Hasan Kara");
        company.addEmployee(5, "Kerem Tuncer");
        company.addEmployee(6, "Meyra Mert");

        // Print objects
        System.out.println("Healthplan objects:\n" + basicPlan + "\n" + standardPlan + "\n" + premiumPlan);
        System.out.println("\nEmployee objects:\n" + employee1 + "\n" + employee2 + "\n" + employee3);
        System.out.println("\nCompany object:\n" + company);

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
