/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms.ijse.layered.entity;



public class CustomerEntity {
    
    private Long id;
    
    private String firstName;
    private String lastName;
    private String birthDate;
    private String gender;
    private String email;
    private String nic;
    private String mobile;
    private String landPhone;
    private String addressL1;
    private String addressL2;
    private String city;
    private String postalCode;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
    


    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the landPhone
     */
    public String getLandPhone() {
        return landPhone;
    }

    /**
     * @param landPhone the landPhone to set
     */
    public void setLandPhone(String landPhone) {
        this.landPhone = landPhone;
    }

    /**
     * @return the addressL1
     */
    public String getAddressL1() {
        return addressL1;
    }

    /**
     * @param addressL1 the addressL1 to set
     */
    public void setAddressL1(String addressL1) {
        this.addressL1 = addressL1;
    }

    /**
     * @return the addressL2
     */
    public String getAddressL2() {
        return addressL2;
    }

    /**
     * @param addressL2 the addressL2 to set
     */
    public void setAddressL2(String addressL2) {
        this.addressL2 = addressL2;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}