package week5.inner_classes;

class Employee {
    private String name;
    private String surname;
    private ContactInfo contactInfo;
//Constructor
public Employee (String name, String surname,String phone, String email) {
    this.name = name;
    this.surname = surname;
    this.contactInfo = new ContactInfo(phone, email);
}
//Inner class
class ContactInfo{
    private String phoneNumber;
    private String email;
    //Constructor
    public ContactInfo(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public void displayContactInfo() {
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}
public void displayEmployeeInfo(){
    System.out.println("Worker: " + name + " " + surname);
    contactInfo.displayContactInfo();
}
}

