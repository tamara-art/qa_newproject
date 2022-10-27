package phonebookframeworklesson16.model;

public class ContactLesson16 {
    private String name;
    private String lastName;
    private String phone;
    private String address;
    private String description;

    public ContactLesson16() {

    }

    public ContactLesson16(String name, String lastName, String phone, String address, String description) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public ContactLesson16 setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public ContactLesson16 setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public ContactLesson16 setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public ContactLesson16 setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ContactLesson16 setDescription(String description) {
        this.description = description;
        return this;
    }

}
