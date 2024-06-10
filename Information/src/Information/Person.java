package Information;

class Person {
    private String name;
    private String address;
    private String telephone;
    private String mobile;
    private String headOfFamily;
    private String uniqueID;

    public Person(String name, String address, String telephone, String mobile, String headOfFamily, String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.mobile = mobile;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getTelephone() { return telephone; }
    public String getMobile() { return mobile; }
    public String getHeadOfFamily() { return headOfFamily; }
    public String getUniqueID() { return uniqueID; }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Telephone: " + telephone +
                ", Mobile: " + mobile + ", Head of Family: " + headOfFamily + ", Unique ID: " + uniqueID;
    }
}

