@GetMapping("/name/{name}")
public List<Employee> getEmployeeByName(@PathVariable String name) {
    return employeeService.getEmployeesByName(name);
}

@GetMapping("/department/{id}")
public List<Employee> getEmployeeByDepartment(@PathVariable Long id) {
    return employeeService.getEmployeesByDepartment(id);
}

@GetMapping("/email/{keyword}")
public List<Employee> searchEmail(@PathVariable String keyword) {
    return employeeService.searchEmail(keyword);
}

@GetMapping("/departmentname/{name}")
public List<Employee> getDepartmentName(@PathVariable String name) {
    return employeeService.getEmployeesByDepartmentName(name);
}