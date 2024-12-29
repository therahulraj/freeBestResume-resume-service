package com.freebestresume.resume_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class PersonalDto {

    @NotEmpty
    @Size(max = 50)
    private String firstName;

    @Size(max = 50)
    private String lastName;

    @NotEmpty
    @Email
    @Size(max = 70)
    private String email;

    @Size(max = 30)
    private String city;

    @Size(max = 30)
    private String country;

    @Size(max = 20)
    private String pinCode;

    @Size(max = 30)
    private String phoneNumber;

    @Size(max = 30)
    private String passport;

    @Size(max = 30)
    private String drivingLicence;

    @Size(max = 30)
    private String dateOfBirthOrAge;

    @Size(max = 20)
    private String nationality;

    @Size(max = 10)
    private String gender;

    @Size(max = 20)
    private String visaStatus;

    @Size(max = 20)
    private String religion;

    @Size(max = 20)
    private String maritalStatus;

    @Size(max = 70)
    private String website;

    @Size(max = 70)
    private String linkedIn;

    @Size(max = 70)
    private String github;

    @Size(max = 70)
    private String other;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(String drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public String getDateOfBirthOrAge() {
        return dateOfBirthOrAge;
    }

    public void setDateOfBirthOrAge(String dateOfBirthOrAge) {
        this.dateOfBirthOrAge = dateOfBirthOrAge;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getVisaStatus() {
        return visaStatus;
    }

    public void setVisaStatus(String visaStatus) {
        this.visaStatus = visaStatus;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
