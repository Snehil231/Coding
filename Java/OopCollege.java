import java.util.Scanner;
/*  public class OOP 
{
  public String name;
 public int age;
  public String email;  

  public OOP(String name , int age, String email)
  {
    this.name = name;
    this.age = age;
    this.email = email;
  }
  public void displayDetails()
  {
    System.out.println("Name :" + name);
    System.out.println("age :" + age);
    System.out.println("email :" + email);
  }

  public static void main(String[] args) 
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter name ");
   String username = sc.nextLine(); 
   System.out.println("Enter email ");
    String useremail = sc.nextLine();
   System.out.println("Enter age " ); 
   int userage = sc.nextInt();
   
    
    OOP person = new OOP(username,userage,useremail);
    System.out.println("\nPerson details are :- ");
    person.displayDetails();

    sc.close(); 
  }
}
 */
/*  
public class MenuDrivenLogin 
{

    static String Name, Email, Password, Contact;

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu Driven");
            System.out.println("---------------------");
            System.out.println("1. Sign-up");
            System.out.println("2. Sign-in");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) 
            {
                case 1:
                    signUp(sc);
                    break;

                case 2:
                    signIn(sc);
                    break;

                case 3:
                    System.out.println("Thank you! Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }

    static void signUp(Scanner sc) 
    {

        System.out.print("Enter Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Email: ");
        Email = sc.nextLine();

        System.out.print("Enter Password: ");
        Password = sc.nextLine();

        System.out.print("Enter Contact: ");
        Contact = sc.nextLine();

        if (isValid())
             {
            System.out.println("Registration Successful");
        } else 
            {
            System.out.println("Registration Failed (Invalid Details)");
        }
    }

    static void signIn(Scanner sc) 
    {

        System.out.print("Enter User Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (name.equals(Name) && pass.equals(Password)) 
            {
            System.out.println("Login Successful");
            showHomePage();
        } else
             {
            System.out.println("Login Failed (Invalid Credentials)");
        }
    }

    static boolean isValid() 
    {
        return (!Name.isEmpty() && Email.contains("@") && Password.length() >= 4 && Contact.length() == 10);
    }

    static void showHomePage() 
    {
        System.out.println("\n----- HOME PAGE -----");
        System.out.println("Welcome, " + Name);
        System.out.println("Email: " + Email);
        System.out.println("Contact: " + Contact);
    }
}
 */
/*  
public class Person {

    String name;
    int age;

    public static void main(String[] args) {

        String[] a = {"Rahul", "Anita"};
        int[] b = {20, 22};

        Person p1 = new Person();
        p1.name = a[0];
        p1.age = b[0];

        Person p2 = new Person();
        p2.name = a[1];
        p2.age = b[1];

        System.out.println("Name: " + p1.name + ", Age: " + p1.age);
        System.out.println("Name: " + p2.name + ", Age: " + p2.age);
    }
}

  */
/*  

public class Person {

    String name;
    int age;

    void introduce() {
        System.out.println("Hello, my name is " + name + ".");
    }

    public static void main(String[] args) {

        Person person1 = new Person();

        person1.name = "Alice";
        person1.age = 30;

        person1.introduce();
    }
}
 */
/*  
public class Person {

    String name;

    void introduce() {
        System.out.println("Hello, my name is " + name + ".");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alice";
        person1.introduce();
    }
}
 */

/*  
public class User {

    private String name;
    private String email;
    private String password;

    public void setName(String a) {
        name = a;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String b) {
        email = b;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String c) {
        password = c;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        User u = new User();

        u.setName("Snehil");
        u.setEmail("snehil@gmail.com");
        u.setPassword("123");

        System.out.println(u.getName());
        System.out.println(u.getEmail());
        System.out.println(u.getPassword());
    }
}
 */