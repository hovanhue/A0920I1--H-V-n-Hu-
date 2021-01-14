package Ls9_Collection_Framework.thuchanh;

public class Students implements Comparable<Students>{
    private String name;
    private Integer age;
    private String address;

    public Students(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "Students: "+"\nName= "+getName()
                +" \nAge= "+getAge()+" \nAddress= "+getAddress();
    }


    @Override
    public int compareTo(Students o) {
        return this.name.compareTo(o.getName());
    }
}
