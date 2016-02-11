package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class HeaderType   {
  
  private String userID = null;
  private String shopID = null;
  private String locationAppID = null;
  private String securityToken = null;
  private String password = null;
  private String organizationID = null;
  private String companyID = null;
  private String locationID = null;
  private String applicationID = null;
  private String application = null;
  private String applicationDomain = null;
  private ChannelType clientID = null;
  private String channel = null;
  private String customerEntityID = null;
  private String note = null;
  private String noteLocaleID = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userID")
  public String getUserID() {
    return userID;
  }
  public void setUserID(String userID) {
    this.userID = userID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shopID")
  public String getShopID() {
    return shopID;
  }
  public void setShopID(String shopID) {
    this.shopID = shopID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationAppID")
  public String getLocationAppID() {
    return locationAppID;
  }
  public void setLocationAppID(String locationAppID) {
    this.locationAppID = locationAppID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("securityToken")
  public String getSecurityToken() {
    return securityToken;
  }
  public void setSecurityToken(String securityToken) {
    this.securityToken = securityToken;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("organizationID")
  public String getOrganizationID() {
    return organizationID;
  }
  public void setOrganizationID(String organizationID) {
    this.organizationID = organizationID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("companyID")
  public String getCompanyID() {
    return companyID;
  }
  public void setCompanyID(String companyID) {
    this.companyID = companyID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationID")
  public String getLocationID() {
    return locationID;
  }
  public void setLocationID(String locationID) {
    this.locationID = locationID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("applicationID")
  public String getApplicationID() {
    return applicationID;
  }
  public void setApplicationID(String applicationID) {
    this.applicationID = applicationID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  public String getApplication() {
    return application;
  }
  public void setApplication(String application) {
    this.application = application;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("applicationDomain")
  public String getApplicationDomain() {
    return applicationDomain;
  }
  public void setApplicationDomain(String applicationDomain) {
    this.applicationDomain = applicationDomain;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("clientID")
  public ChannelType getClientID() {
    return clientID;
  }
  public void setClientID(ChannelType clientID) {
    this.clientID = clientID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("channel")
  public String getChannel() {
    return channel;
  }
  public void setChannel(String channel) {
    this.channel = channel;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customerEntityID")
  public String getCustomerEntityID() {
    return customerEntityID;
  }
  public void setCustomerEntityID(String customerEntityID) {
    this.customerEntityID = customerEntityID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("noteLocaleID")
  public String getNoteLocaleID() {
    return noteLocaleID;
  }
  public void setNoteLocaleID(String noteLocaleID) {
    this.noteLocaleID = noteLocaleID;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderType headerType = (HeaderType) o;
    return Objects.equals(userID, headerType.userID) &&
        Objects.equals(shopID, headerType.shopID) &&
        Objects.equals(locationAppID, headerType.locationAppID) &&
        Objects.equals(securityToken, headerType.securityToken) &&
        Objects.equals(password, headerType.password) &&
        Objects.equals(organizationID, headerType.organizationID) &&
        Objects.equals(companyID, headerType.companyID) &&
        Objects.equals(locationID, headerType.locationID) &&
        Objects.equals(applicationID, headerType.applicationID) &&
        Objects.equals(application, headerType.application) &&
        Objects.equals(applicationDomain, headerType.applicationDomain) &&
        Objects.equals(clientID, headerType.clientID) &&
        Objects.equals(channel, headerType.channel) &&
        Objects.equals(customerEntityID, headerType.customerEntityID) &&
        Objects.equals(note, headerType.note) &&
        Objects.equals(noteLocaleID, headerType.noteLocaleID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userID, shopID, locationAppID, securityToken, password, organizationID, companyID, locationID, applicationID, application, applicationDomain, clientID, channel, customerEntityID, note, noteLocaleID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderType {\n");
    
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    shopID: ").append(toIndentedString(shopID)).append("\n");
    sb.append("    locationAppID: ").append(toIndentedString(locationAppID)).append("\n");
    sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    organizationID: ").append(toIndentedString(organizationID)).append("\n");
    sb.append("    companyID: ").append(toIndentedString(companyID)).append("\n");
    sb.append("    locationID: ").append(toIndentedString(locationID)).append("\n");
    sb.append("    applicationID: ").append(toIndentedString(applicationID)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    applicationDomain: ").append(toIndentedString(applicationDomain)).append("\n");
    sb.append("    clientID: ").append(toIndentedString(clientID)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    customerEntityID: ").append(toIndentedString(customerEntityID)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    noteLocaleID: ").append(toIndentedString(noteLocaleID)).append("\n");
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

