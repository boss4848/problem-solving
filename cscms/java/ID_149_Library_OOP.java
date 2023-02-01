import java.util.ArrayList;
import java.util.Collections;

public class ID_149_Library_OOP {
    public static void main(String[] args) {

        Library rb = new Library("Ratchaburi KMUTT");
        rb.setName("Ratchaburi KMUTT campus");
        rb.addEmployee(new Employee(42647, "Kim Seok-jin", 10891, 25000));
        rb.addEmployee(new Employee(42648, "Kim Tae-hyung", 10892, 24000));
        rb.addEmployee(new Employee(42649, "Choi Soobin ", 10893, 3000));
        rb.addEmployee(new Employee(42650, "Yeonjun", 10894, 32000));
        Employee e = new Employee(42651, "beomgyu", 10895, 20000);
        e.setSalary(21000);
        e.setName("Beomgyu");
        rb.addEmployee(e);

        System.out.println("There are " + rb.getNumberOfEmployees() + " employees work for library " + rb.getName());
        System.out.println("The total salary is " + rb.getTotalSalary());
        System.out.println("===========================================================================");

        if (rb.removeEmployee(20890)) {
            System.out.println("Remove employee id 20890 in library " + rb.getName() + " successfully");
        } else {
            System.out.println("There is no employee id 20890 in library " + rb.getName());
        }

        if (rb.removeEmployee(10893)) {
            System.out.println("Remove employee id 10893 in library " + rb.getName() + " successfully");
        } else {
            System.out.println("There is no employee id 10893 in library " + rb.getName());
        }

        if (rb.removeEmployee(10893)) {
            System.out.println("Remove employee id 10893 in library " + rb.getName() + " successfully");
        } else {
            System.out.println("There is no employee id 10893 in library " + rb.getName());
        }

        if (rb.removeEmployee(10892)) {
            System.out.println("Remove employee id 10892 in library " + rb.getName() + " successfully");
        } else {
            System.out.println("There is no employee id 10892 in library " + rb.getName());
        }

        System.out.println("There are " + rb.getNumberOfEmployees() + " employees work for library " + rb.getName());
        System.out.println("The total salary is " + rb.getTotalSalary());
        System.out.println("===========================================================================");

        rb.addBook(new Book(3871, "Introduction to Programming1"));
        rb.addBook(new Book(3869, "Data structure and Algorithms"));
        rb.addBook(new Book(3899, "Introduction to Programming1"));
        rb.addBook(new Book(3833, "Advance Database"));
        rb.addBook(new Book(3812, "Introduction to Programming1"));

        rb.printInfoOfAllBooks();
        int idx = rb.searchBookById(3833);
        if (idx != -1) {
            System.out.println("Found book id 3833 at index " + idx);
        } else {
            System.out.println("There is no book id 3833 in library " + rb.getName());
        }

        idx = rb.searchBookById(3899);
        if (idx != -1) {
            System.out.println("Found book id 3899 at index " + idx);
        } else {
            System.out.println("There is no book id 3899 in library " + rb.getName());
        }

        idx = rb.searchBookById(3900);
        if (idx != -1) {
            System.out.println("Found book id 3900 at index " + idx);
        } else {
            System.out.println("There is no book id 3900 in library " + rb.getName());
        }

        int cnt = rb.searchBookByName("Advance Database");
        System.out.println("There are " + cnt + " books name Advance Database");

        cnt = rb.searchBookByName("Introduction to Programming1");
        System.out.println("There are " + cnt + " books name Introduction to Programming1");

        cnt = rb.searchBookByName("Introduction to Programming3");
        System.out.println("There are " + cnt + " books name Introduction to Programming3");

        Book borrow1 = rb.borrowBook(3800);
        if (borrow1 != null) {
            System.out.println("Borrow book id 3800 successfully");
        } else {
            System.out.println("There is no book id 3800 in Library " + rb.getName());
        }
        rb.printInfoOfAllBooks();
        System.out.println("There are " + rb.getAmountOfBooks() + " books in library " + rb.getName());

        Book borrow2 = rb.borrowBook(3869);
        if (borrow2 != null) {
            System.out.println("Borrow book id 3869 successfully");
        } else {
            System.out.println("There is no book id 3869 in Library " + rb.getName());
        }
        rb.printInfoOfAllBooks();
        System.out.println("There are " + rb.getAmountOfBooks() + " books in library " + rb.getName());

        Book borrow3 = rb.borrowBook(3812);
        if (borrow3 != null) {
            System.out.println("Borrow book id 3812 successfully");
        } else {
            System.out.println("There is no book id 3812 in Library " + rb.getName());
        }
        rb.printInfoOfAllBooks();
        System.out.println("There are " + rb.getAmountOfBooks() + " books in library " + rb.getName());

        rb.returnBook(borrow3);
        rb.printInfoOfAllBooks();
        System.out.println("There are " + rb.getAmountOfBooks() + " books in library " + rb.getName());

        idx = rb.searchBookById(3869);
        if (idx != -1) {
            System.out.println("Found book id 3869 at index " + idx);
        } else {
            System.out.println("There is no book id 3869 in library " + rb.getName());
        }
    }
}

class Human {
    private int id;
    private String name;

    Human(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Human {
    private int employeeId;
    private double salary;

    Employee(int id, String name, int employeeId, double salary) {
        super(id, name);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

class Book implements Comparable<Book> {
    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Book o) {
        return id - o.getId();
    }
}

class Library {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private ArrayList<Book> books = new ArrayList<Book>();

    public Library(String name) {
        this.name = name;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public boolean removeEmployee(int id) {
        boolean removeCheck = false;
        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getEmployeeId()) {
                employees.remove(i);
                removeCheck = true;
                break;
            }
        }
        if (removeCheck == true) {
            return true;
        } else {
            return false;
        }
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    public double getTotalSalary() {
        int sum = 0;
        for (int i = 0; i < employees.size(); i++) {
            sum += employees.get(i).getSalary();
        }
        return sum;
    }

    public void addBook(Book e) {
        books.add(e);
        Collections.sort(books);

    }

    public void printInfoOfAllBooks() {
        for (int i = 0; i < this.books.size(); i++) {
            System.out.println("(id: " + this.books.get(i).getId() + ", name : " + this.books.get(i).getName() + ")");
        }
    }

    public int searchBookByName(String name) {
        int count = 0;
        for (int i = 0; i < books.size(); i++) {
            if (name.equals(books.get(i).getName())) {
                count++;
            }
        }
        return count;
    }

    public int searchBookById(int id) {
        int index = -1;
        for (int i = 0; i < books.size(); i++) {
            if (id == books.get(i).getId()) {
                index = i;
            }
        }
        return index;

    }

    public Book borrowBook(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                Book b = books.get(i);
                books.remove(i);
                return b;

            }
        }
        return null;
    }

    public void returnBook(Book e) {
        addBook(e);
    }

    public int getAmountOfBooks() {
        return books.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}