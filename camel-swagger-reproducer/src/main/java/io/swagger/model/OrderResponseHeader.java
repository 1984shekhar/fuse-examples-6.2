package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class OrderResponseHeader   {
  
  private String securityToken = null;
  private String locationAppID = null;
  private String responseStatusID = null;
  private String responseStatus = null;

  
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
  @JsonProperty("responseStatusID")
  public String getResponseStatusID() {
    return responseStatusID;
  }
  public void setResponseStatusID(String responseStatusID) {
    this.responseStatusID = responseStatusID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("responseStatus")
  public String getResponseStatus() {
    return responseStatus;
  }
  public void setResponseStatus(String responseStatus) {
    this.responseStatus = responseStatus;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderResponseHeader orderResponseHeader = (OrderResponseHeader) o;
    return Objects.equals(securityToken, orderResponseHeader.securityToken) &&
        Objects.equals(locationAppID, orderResponseHeader.locationAppID) &&
        Objects.equals(responseStatusID, orderResponseHeader.responseStatusID) &&
        Objects.equals(responseStatus, orderResponseHeader.responseStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityToken, locationAppID, responseStatusID, responseStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponseHeader {\n");
    
    sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
    sb.append("    locationAppID: ").append(toIndentedString(locationAppID)).append("\n");
    sb.append("    responseStatusID: ").append(toIndentedString(responseStatusID)).append("\n");
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
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

