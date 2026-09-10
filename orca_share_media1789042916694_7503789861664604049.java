class Main { 
    public static void main(String[] args) {
        Person student = new Student("JHOANA", 20, "jap", "WEB DEVELOPER");  
        Person employee = new Employee("CHRIS", 21, "yii", "HM");   

        student.displayInfo();
        employee.displayInfo();
    }
}

class Person { 
    private String name; 
    private int age;   

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {  
        return name;
    }

    public int getAge() {   
        return age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person { 
    private String studentId; 
    private String major;  

    public Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    @Override // Polymorphism 
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Student ID: " + studentId + ", Major: " + major);
    }
}

class Employee extends Person {
    private String employeeId; 
    private String department;  

    public Employee(String name, int age, String employeeId, String department) {
        super(name, age); 
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override 
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Employee ID: " + employeeId + ", Department: " + department);
    }
}