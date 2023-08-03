package sg.edu.rp.c346.democustomcontactlist;

public class Contact {
    String name;
    int countryCode;
    int phonenum;
    char gender;
    public Contact(String a,int b, int c, char d){
        name=a;
        countryCode=b;
        phonenum=c;
        gender=d;
    }
    public String getName(){
        return name;
    }
    public int getCountryCode(){
        return countryCode;
    }
    public int getPhonenum(){
        return phonenum;
    }
    public char getGender(){
        return gender;
    }
    public void setName(String a){
        name=a;
    }
    public void setCountryCode(int a){
        countryCode=a;
    }
    public void setPhonenum(int a){
        phonenum=a;
    }
    public void setGender(char a){
        gender=a;
    }
}


