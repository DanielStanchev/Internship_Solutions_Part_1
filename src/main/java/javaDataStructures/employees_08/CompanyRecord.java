package javaDataStructures.employees_08;

import java.util.ArrayList;
import java.util.List;

public class CompanyRecord {

    private Long id;

    private List<EmployeeRecord> records = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<EmployeeRecord> getRecords() {
        return records;
    }

    public void addEmployee(EmployeeRecord employeeRecord){
        records.add(employeeRecord);
    }

}
