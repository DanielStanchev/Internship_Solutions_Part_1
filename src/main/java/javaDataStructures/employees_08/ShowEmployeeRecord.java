package javaDataStructures.employees_08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ShowEmployeeRecord {
    public static void main(String[] args) {

        Employee manager = new Employee(1L, "Daniel");
        Employee employee1 = new Employee(2L, "Georgi");
        Employee employee2 = new Employee(3L, "Ivan");
        Employee employee3 = new Employee(4L, "Stefan");
        Employee employee4 = new Employee(5L, "Petkan");
        Employee employee5 = new Employee(6L, "Leiko");

        EmployeeRecord employeeRecordDaniel = new EmployeeRecord(manager.getName(), null);
        EmployeeRecord employeeRecordGeorgi = new EmployeeRecord(employee1.getName(), manager.getId());
        EmployeeRecord employeeRecordIvan = new EmployeeRecord(employee2.getName(), manager.getId());
        EmployeeRecord employeeRecordStefan = new EmployeeRecord(employee3.getName(), manager.getId());
        EmployeeRecord employeeRecordPetkan = new EmployeeRecord(employee4.getName(), employee1.getId());
        EmployeeRecord employeeRecordLeiko = new EmployeeRecord(employee5.getName(), employee1.getId());

        CompanyRecord companyRecord = new CompanyRecord();
        companyRecord.addEmployee(employeeRecordDaniel);
        companyRecord.addEmployee(employeeRecordGeorgi);
        companyRecord.addEmployee(employeeRecordIvan);
        companyRecord.addEmployee(employeeRecordStefan);
        companyRecord.addEmployee(employeeRecordPetkan);
        companyRecord.addEmployee(employeeRecordLeiko);

        traverse(companyRecord);
    }

    private static void traverse(CompanyRecord companyRecord) {
        List<EmployeeRecord> recordsToVisit = new ArrayList<>(companyRecord.getRecords());
        Set<EmployeeRecord> visited = new HashSet<>(); // Track visited employees

        while (!recordsToVisit.isEmpty()) {
            EmployeeRecord currentRecord = recordsToVisit.remove(0); // Remove from the beginning

            // Check if the currentRecord has been visited before processing it
            if (!visited.contains(currentRecord)) {
                System.out.println(currentRecord.getName());

                List<EmployeeRecord> subordinates = getSubordinates(companyRecord.getRecords(), currentRecord.getManagerId());
                if (!subordinates.isEmpty()) {
                    // Add subordinates to the beginning of the list to ensure correct order
                    recordsToVisit.addAll(0, subordinates);
                }

                // Add the currentRecord to the visited set to mark it as visited
                visited.add(currentRecord);
            }
        }
    }

    private static List<EmployeeRecord> getSubordinates(List<EmployeeRecord> records, Long managerId) {
        List<EmployeeRecord> subordinates = new ArrayList<>();
        for (EmployeeRecord record : records) {
            if (Objects.equals(record.getManagerId(), managerId)) {
                subordinates.add(record);
            }
        }
        return subordinates;
    }


}
