package models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    Long id;

    @Column(name = "First Name")
    String firstName;

    @Column(name = "Last Name")
    String lastName;

    @Column(name = "Employee Number")
    String employeeNumber;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    public Employee(
            String firstName,
            String lastName,
            String employeeNumber,
            Department department
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.department = department;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}
