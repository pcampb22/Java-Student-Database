package com.phylicia;

public class student {

        String firstName;
        String lastName;
        String address;
        String email;
        String emContact;
        String phone;
        int Id;

        public void setFirstName(String fName){
            firstName = fName;
        }

        public void setLastName(String lName){
            lastName = lName;
        }

        public void setAddress(String add1){
            address = add1;
        }

        public void setEmail(String e_mail){
            email = e_mail;
        }

        public void setEmContact(String eCont){
            emContact = eCont;
        }

        public void setPhone(String phNum){
            phone = phNum;

        }

        public void setId(int idNumber){
            Id = idNumber;
        }

        public int getId(){
            return Id;
        }

        public String getFirstName(){
            return firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public String getAddress(){
            return address;
        }

        public String getEmail(){
            return email;
        }

        public String getEmContact(){
            return emContact;
        }

        public String getPhone(){
            return phone;
        }


}
