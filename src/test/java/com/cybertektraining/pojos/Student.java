package com.cybertektraining.pojos;

public class Student {
    private String admissionNo;
    private int batch;
    private String birthDate;
    private Company company;
    private Contact contact;
    private String firstName;
    private String gender;
    private String joinDate;
    private String lastName;
    private String major;
    private String password;
    private String section;
    private String subject;

    public Student(){

    }

    public Student(String admissionNo, int batch, String birthDate, Company company, Contact contact, String firstName, String gender, String joinDate, String lastName, String major, String password, String section, String subject) {
        this.admissionNo = admissionNo;
        this.batch = batch;
        this.birthDate = birthDate;
        this.company = company;
        this.contact = contact;
        this.firstName = firstName;
        this.gender = gender;
        this.joinDate = joinDate;
        this.lastName = lastName;
        this.major = major;
        this.password = password;
        this.section = section;
        this.subject = subject;
    }

    public String getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "admissionNo='" + admissionNo + '\'' +
                ", batch=" + batch +
                ", birthDate='" + birthDate + '\'' +
                ", company=" + company +
                ", contact=" + contact +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", lastName='" + lastName + '\'' +
                ", major='" + major + '\'' +
                ", password='" + password + '\'' +
                ", section='" + section + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
