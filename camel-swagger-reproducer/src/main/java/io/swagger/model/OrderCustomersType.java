package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class OrderCustomersType   {
  
  private String documentNumberID = null;
  private String email = null;
  private String IBAN = null;
  private String customerName = null;
  private String phone = null;
  private String sfID = null;
  private String companyName = null;
  private String contactName = null;
  private String birthDate = null;
  private String ticket = null;
  private String documentTypeID = null;
  private String orderCustomerTypeID = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documentNumberID")
  public String getDocumentNumberID() {
    return documentNumberID;
  }
  public void setDocumentNumberID(String documentNumberID) {
    this.documentNumberID = documentNumberID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("IBAN")
  public String getIBAN() {
    return IBAN;
  }
  public void setIBAN(String IBAN) {
    this.IBAN = IBAN;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customerName")
  public String getCustomerName() {
    return customerName;
  }
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sfID")
  public String getSfID() {
    return sfID;
  }
  public void setSfID(String sfID) {
    this.sfID = sfID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("companyName")
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contactName")
  public String getContactName() {
    return contactName;
  }
  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("birthDate")
  public String getBirthDate() {
    return birthDate;
  }
  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticket")
  public String getTicket() {
    return ticket;
  }
  public void setTicket(String ticket) {
    this.ticket = ticket;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documentTypeID")
  public String getDocumentTypeID() {
    return documentTypeID;
  }
  public void setDocumentTypeID(String documentTypeID) {
    this.documentTypeID = documentTypeID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderCustomerTypeID")
  public String getOrderCustomerTypeID() {
    return orderCustomerTypeID;
  }
  public void setOrderCustomerTypeID(String orderCustomerTypeID) {
    this.orderCustomerTypeID = orderCustomerTypeID;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCustomersType orderCustomersType = (OrderCustomersType) o;
    return Objects.equals(documentNumberID, orderCustomersType.documentNumberID) &&
        Objects.equals(email, orderCustomersType.email) &&
        Objects.equals(IBAN, orderCustomersType.IBAN) &&
        Objects.equals(customerName, orderCustomersType.customerName) &&
        Objects.equals(phone, orderCustomersType.phone) &&
        Objects.equals(sfID, orderCustomersType.sfID) &&
        Objects.equals(companyName, orderCustomersType.companyName) &&
        Objects.equals(contactName, orderCustomersType.contactName) &&
        Objects.equals(birthDate, orderCustomersType.birthDate) &&
        Objects.equals(ticket, orderCustomersType.ticket) &&
        Objects.equals(documentTypeID, orderCustomersType.documentTypeID) &&
        Objects.equals(orderCustomerTypeID, orderCustomersType.orderCustomerTypeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentNumberID, email, IBAN, customerName, phone, sfID, companyName, contactName, birthDate, ticket, documentTypeID, orderCustomerTypeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCustomersType {\n");
    
    sb.append("    documentNumberID: ").append(toIndentedString(documentNumberID)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    IBAN: ").append(toIndentedString(IBAN)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    sfID: ").append(toIndentedString(sfID)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    ticket: ").append(toIndentedString(ticket)).append("\n");
    sb.append("    documentTypeID: ").append(toIndentedString(documentTypeID)).append("\n");
    sb.append("    orderCustomerTypeID: ").append(toIndentedString(orderCustomerTypeID)).append("\n");
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

