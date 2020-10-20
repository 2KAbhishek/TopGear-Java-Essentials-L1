class MyEmployeeUtil<T extends Emp> {
    int salary;

    MyEmployeeUtil(Emp e) {
        this.salary = e.getSalary();
    }

    boolean isSalaryEqual(MyEmployeeUtil<?> emp) {
        return this.salary == emp.salary;
    }
}
