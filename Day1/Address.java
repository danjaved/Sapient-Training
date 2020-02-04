public class Address
{
    private String houseNo;
    private String street;
    private String city;
    private String zipCode;

    public Address(String houseNo, String street, String city,String zipcode)
    {
        this.houseNo=houseNo;
        this.street=street;
        this.city=city;
        this.zipCode=zipcode;
    }

    public void showAddress()
    {
        System.out.println(this.houseNo);
        System.out.println(this.street);
        System.out.println(this.city);
        System.out.println(this.zipCode);
    }
    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}