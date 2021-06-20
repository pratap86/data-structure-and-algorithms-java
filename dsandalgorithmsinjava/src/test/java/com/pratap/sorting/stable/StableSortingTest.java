package com.pratap.sorting.stable;

import com.pratap.beans.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StableSortingTest {
    private List<Employee> employees;

    @BeforeEach
    void setup(){
        employees = Arrays.asList(
                new Employee("Bill", "Microsoft"),
                new Employee("Adam", "Google"),
                new Employee("Emily", "Google"),
                new Employee("Kevin", "HP"),
                new Employee("Michael", "Google"),
                new Employee("Daniel", "Indian Oil")
        );
    }

    @Test
    void testRelativeOrderSorting(){

        Collections.sort(employees, Comparator.comparing(Employee::getCompany));
        employees.forEach(System.out::println);
    }
}
