package de.telran.HomeWork201223;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String lastname;
    private String patronymicж;
    private String jobTitle;
    private String Department;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", patronymicж='" + patronymicж + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", Department='" + Department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPatronymicж() {
        return patronymicж;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getDepartment() {
        return Department;
    }

    public Employee(String name, String lastname, String patronymicж, String jobTitle, String department, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.patronymicж = patronymicж;
        this.jobTitle = jobTitle;
        Department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public static List<Employee> ListingEmploees(List<Employee> par1, double par2){
        List<Employee> rez = par1.stream()
                .filter(employee -> employee.getSalary()>par2)
                .toList();
        return rez;
    }
    public static double CountAverageSalary(List list) {

        double averageSalary = 0;
        averageSalary = (double) list.stream()
                .collect(Collectors.summingDouble(Employee::getSalary))/list.size();

        return averageSalary;
    };


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иван","Иванов",  "Иванович", "Менеджер", "Отдел продаж", 1200));
        employees.add(new Employee("Петр","Петров",  "Петрович", "Разработчик", "Отдел разработки", 1500));
        employees.add(new Employee( "Сидор","Сидоров", "Сидорович", "Тестировщик", "Отдел тестирования", 900));
        employees.add(new Employee("Андрей","Кузнецов",  "Андреевич", "Дизайнер", "Отдел маркетинга", 1100));


        System.out.println("средняя зарплата = "+CountAverageSalary(employees));
        List<Employee> rez = ListingEmploees(employees,1000);
        System.out.println("список сотрудников с зп > 1000 = ");
        rez.forEach(employee -> System.out.println(employee.patronymicж + " " + employee.getSalary()));

        rez = employees.stream()
                .filter(employee -> employee.Department == "Отдел маркетинга")
                .peek(employee -> employee.setSalary(employee.getSalary()*1.15))
                .toList();
        System.out.println("список сотрудников маркетинга = ");
        rez.forEach(employee -> System.out.println(employee.patronymicж + " " + employee.getSalary()));

        Optional<Employee> rez1 = employees.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(" сотрудник с самой низкой ЗП = ");
        System.out.println(rez1.get().patronymicж  + " " + rez1.get().getSalary());

        rez1 = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(" сотрудник с самой высокой ЗП = ");
        System.out.println(rez1.get().patronymicж  + " " + rez1.get().getSalary());

//        7. Получите сотрудников из всех отделов с максимальной зп
        Map<String, Optional<Employee>> map1  = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println("список сотрудников по отделам с максимальной ЗП = ");
        var entries1 = map1.entrySet();
        for (var entry1 : entries1) {
            System.out.println(entry1.getKey());
            Employee prom1 = entry1.getValue().get();
                System.out.println(prom1.toString());
        }
//        8. Сгруппировать сотрудников по должности
        Map<String, Set<Employee>> map2  = employees.stream()
                .collect(Collectors.groupingBy(Employee::getJobTitle, Collectors.toSet()));

        System.out.println("список сотрудников по должности = ");
        var entries = map2.entrySet();
        for (var entry : entries) {
            System.out.println(entry.getKey());
            Set prom = entry.getValue();
            Iterator<Employee> i = prom.iterator();
            while (i.hasNext())
                System.out.println(i.next().toString());

        }
    }
}
