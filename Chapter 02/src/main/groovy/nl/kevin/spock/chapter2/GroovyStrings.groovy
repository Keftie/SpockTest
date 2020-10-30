package nl.kevin.spock.chapter2

class SimpleEmployee {
    String fullName
    int age
    SimpleDepartement departement
}

class SimpleDepartement {
    String name
    String location
}

SimpleDepartement sales = new SimpleDepartement(name: "Sales", location: "block C")
SimpleEmployee employee = new SimpleEmployee(fullName: "Andrew Collins", age: 37, departement: sales)

System.out.println("Age is " + employee.getAge())
println "Age is $employee.age"

System.out.println("Department location is at " + employee.getDepartment().getLocation())
println "Department location is at $employee.department.location"

println "Person is adult ${employee.age > 18}"
println "Amount in dollars is \$300"
println 'Person is adult ${employee.age > 18}'
