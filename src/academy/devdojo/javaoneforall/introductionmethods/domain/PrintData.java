package academy.devdojo.javaoneforall.introductionmethods.domain;

public class PrintData {
    public void printData(Employee employee) {
        double[] values = employee.getSalary();
        double average = 0;
        for(double value: values) {
            average += value;
        }

        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(average/3);
    }
    
}
