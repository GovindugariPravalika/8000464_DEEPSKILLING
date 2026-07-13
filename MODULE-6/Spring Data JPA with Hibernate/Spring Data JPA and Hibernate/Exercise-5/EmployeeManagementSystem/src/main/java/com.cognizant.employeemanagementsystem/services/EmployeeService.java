public List<Employee> getEmployeesByName(String name) {
    return employeeRepository.findByName(name);
}

public List<Employee> getEmployeesByDepartment(Long id) {
    return employeeRepository.findByDepartmentId(id);
}

public List<Employee> searchEmail(String keyword) {
    return employeeRepository.searchByEmail(keyword);
}

public List<Employee> getEmployeesByDepartmentName(String departmentName) {
    return employeeRepository.findEmployeesByDepartment(departmentName);
}