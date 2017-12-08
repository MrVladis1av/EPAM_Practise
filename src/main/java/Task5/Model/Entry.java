package Task5.Model;

public class Entry {
    private String secondName;
    private String firstName;
    private String birthday;
    private String phoneNumber;
    private String homeAddress;


    public Entry() {

    }

    private Entry(EntryBuilder entryBuilder) {
        this.secondName = entryBuilder.secondName;
        this.firstName = entryBuilder.firstName;
        this.birthday = entryBuilder.birthday;
        this.phoneNumber = entryBuilder.phoneNumber;
        this.homeAddress = entryBuilder.homeAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entry entry = (Entry) o;

        if (secondName != null ? !secondName.equals(entry.secondName) : entry.secondName != null) return false;
        if (firstName != null ? !firstName.equals(entry.firstName) : entry.firstName != null) return false;
        if (birthday != null ? !birthday.equals(entry.birthday) : entry.birthday != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(entry.phoneNumber) : entry.phoneNumber != null)
            return false;
        return homeAddress != null ? homeAddress.equals(entry.homeAddress) : entry.homeAddress == null;
    }

    @Override
    public int hashCode() {
        int result = secondName != null ? secondName.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (homeAddress != null ? homeAddress.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }

    public String getSurname() {
        return secondName;
    }

    public void setSurname(String surname) {
        this.secondName = surname;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public static class EntryBuilder {
        private String secondName;
        private String firstName;
        private String birthday;
        private String phoneNumber;
        private String homeAddress;

        public EntryBuilder(){

        }

        public EntryBuilder(String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;
        }

       /* public EntryBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EntryBuilder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }*/

        public EntryBuilder birthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
 
        public EntryBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public EntryBuilder homeAddress(String homeAddress) {
            this.homeAddress = homeAddress;
            return this;
        }

        public Entry build() {
            return new Entry(this);
        }
    }
}
