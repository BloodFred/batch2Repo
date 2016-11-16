package classes;

/**
 * Created by JPMPC-B205 on 11/10/2016.
 */
public  class Person
{

    public String name;
    public boolean gender;
    public int age;
    public float height;
    public String nationality;
    public String email;





    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getNationality() {return nationality;}

    public void setNationality(String nationality) {this.nationality = nationality;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public boolean isGender() {return gender;}

    public void setGender(boolean gender) {this.gender = gender;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public float getHeight() {return height;}

    public void setHeight(float height) {this.height = height;}

    public float getWeight() {return weight;}

    public void setWeight(float weight) {this.weight = weight;}

    float weight;

    public String introduceYourSelf() {return this.name;}

    public String introduceYourSelf(String eName, String eDepartment){return eName + eDepartment;}

    public String introduceYourSelf(String eName , String eAddress, String homeNumber) {return eName + eAddress + homeNumber;}






}
