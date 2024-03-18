class Organization implements Cloneable {
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;

    // Constructor
    public Organization(int code, String name, String address) {
        this.organizationCode = code;
        this.organizationName = name;
        this.organizationAddress = address;
    }

    // Method to print object details
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    // Overriding clone method
    @Override
    public Organization clone() throws CloneNotSupportedException {
        return (Organization) super.clone();
    }
}

public class Cloning {
    public static void main(String[] args) {
        // Creating an Organization object
        Organization org1 = new Organization(1, "ABC Corp", "123 Main St");

        // Cloning the organization object
        Organization org2 = null;
        try {
            org2 = org1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Printing details of both objects
        System.out.println("Original Organization:");
        org1.printDetails();

        System.out.println("\nCloned Organization:");
        if (org2 != null) {
            org2.printDetails();
        }
    }
}