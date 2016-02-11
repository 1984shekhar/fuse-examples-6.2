package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class CustomerType   {
  
  private String accountNumber = null;
  private String accountType = null;
  private String authorizedUserName = null;
  private String authorizedUserPhone = null;
  private String masterSubscriberNumber = null;
  private String prefferedLocalID = null;
  private String sIMSerialNumber = null;
  private String subscriberGovermentID = null;
  private String subscriberGroup = null;
  private String subscriberPIN = null;
  private String createdDate = null;
  private AddressType personalAddress = null;
  private AddressType companyAddress = null;
  private PersonType personInfo = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountType")
  public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorizedUserName")
  public String getAuthorizedUserName() {
    return authorizedUserName;
  }
  public void setAuthorizedUserName(String authorizedUserName) {
    this.authorizedUserName = authorizedUserName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorizedUserPhone")
  public String getAuthorizedUserPhone() {
    return authorizedUserPhone;
  }
  public void setAuthorizedUserPhone(String authorizedUserPhone) {
    this.authorizedUserPhone = authorizedUserPhone;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("masterSubscriberNumber")
  public String getMasterSubscriberNumber() {
    return masterSubscriberNumber;
  }
  public void setMasterSubscriberNumber(String masterSubscriberNumber) {
    this.masterSubscriberNumber = masterSubscriberNumber;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prefferedLocalID")
  public String getPrefferedLocalID() {
    return prefferedLocalID;
  }
  public void setPrefferedLocalID(String prefferedLocalID) {
    this.prefferedLocalID = prefferedLocalID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("SIMSerialNumber")
  public String getSIMSerialNumber() {
    return sIMSerialNumber;
  }
  public void setSIMSerialNumber(String sIMSerialNumber) {
    this.sIMSerialNumber = sIMSerialNumber;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subscriberGovermentID")
  public String getSubscriberGovermentID() {
    return subscriberGovermentID;
  }
  public void setSubscriberGovermentID(String subscriberGovermentID) {
    this.subscriberGovermentID = subscriberGovermentID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subscriberGroup")
  public String getSubscriberGroup() {
    return subscriberGroup;
  }
  public void setSubscriberGroup(String subscriberGroup) {
    this.subscriberGroup = subscriberGroup;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subscriberPIN")
  public String getSubscriberPIN() {
    return subscriberPIN;
  }
  public void setSubscriberPIN(String subscriberPIN) {
    this.subscriberPIN = subscriberPIN;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createdDate")
  public String getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("personalAddress")
  public AddressType getPersonalAddress() {
    return personalAddress;
  }
  public void setPersonalAddress(AddressType personalAddress) {
    this.personalAddress = personalAddress;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("companyAddress")
  public AddressType getCompanyAddress() {
    return companyAddress;
  }
  public void setCompanyAddress(AddressType companyAddress) {
    this.companyAddress = companyAddress;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("personInfo")
  public PersonType getPersonInfo() {
    return personInfo;
  }
  public void setPersonInfo(PersonType personInfo) {
    this.personInfo = personInfo;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerType customerType = (CustomerType) o;
    return Objects.equals(accountNumber, customerType.accountNumber) &&
        Objects.equals(accountType, customerType.accountType) &&
        Objects.equals(authorizedUserName, customerType.authorizedUserName) &&
        Objects.equals(authorizedUserPhone, customerType.authorizedUserPhone) &&
        Objects.equals(masterSubscriberNumber, customerType.masterSubscriberNumber) &&
        Objects.equals(prefferedLocalID, customerType.prefferedLocalID) &&
        Objects.equals(sIMSerialNumber, customerType.sIMSerialNumber) &&
        Objects.equals(subscriberGovermentID, customerType.subscriberGovermentID) &&
        Objects.equals(subscriberGroup, customerType.subscriberGroup) &&
        Objects.equals(subscriberPIN, customerType.subscriberPIN) &&
        Objects.equals(createdDate, customerType.createdDate) &&
        Objects.equals(personalAddress, customerType.personalAddress) &&
        Objects.equals(companyAddress, customerType.companyAddress) &&
        Objects.equals(personInfo, customerType.personInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountType, authorizedUserName, authorizedUserPhone, masterSubscriberNumber, prefferedLocalID, sIMSerialNumber, subscriberGovermentID, subscriberGroup, subscriberPIN, createdDate, personalAddress, companyAddress, personInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerType {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    authorizedUserName: ").append(toIndentedString(authorizedUserName)).append("\n");
    sb.append("    authorizedUserPhone: ").append(toIndentedString(authorizedUserPhone)).append("\n");
    sb.append("    masterSubscriberNumber: ").append(toIndentedString(masterSubscriberNumber)).append("\n");
    sb.append("    prefferedLocalID: ").append(toIndentedString(prefferedLocalID)).append("\n");
    sb.append("    sIMSerialNumber: ").append(toIndentedString(sIMSerialNumber)).append("\n");
    sb.append("    subscriberGovermentID: ").append(toIndentedString(subscriberGovermentID)).append("\n");
    sb.append("    subscriberGroup: ").append(toIndentedString(subscriberGroup)).append("\n");
    sb.append("    subscriberPIN: ").append(toIndentedString(subscriberPIN)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    personalAddress: ").append(toIndentedString(personalAddress)).append("\n");
    sb.append("    companyAddress: ").append(toIndentedString(companyAddress)).append("\n");
    sb.append("    personInfo: ").append(toIndentedString(personInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

