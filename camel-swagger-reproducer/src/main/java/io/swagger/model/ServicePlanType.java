package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class ServicePlanType   {
  
  private String servicePlanID = null;
  private String servicePlanName = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("servicePlanID")
  public String getServicePlanID() {
    return servicePlanID;
  }
  public void setServicePlanID(String servicePlanID) {
    this.servicePlanID = servicePlanID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("servicePlanName")
  public String getServicePlanName() {
    return servicePlanName;
  }
  public void setServicePlanName(String servicePlanName) {
    this.servicePlanName = servicePlanName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicePlanType servicePlanType = (ServicePlanType) o;
    return Objects.equals(servicePlanID, servicePlanType.servicePlanID) &&
        Objects.equals(servicePlanName, servicePlanType.servicePlanName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicePlanID, servicePlanName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePlanType {\n");
    
    sb.append("    servicePlanID: ").append(toIndentedString(servicePlanID)).append("\n");
    sb.append("    servicePlanName: ").append(toIndentedString(servicePlanName)).append("\n");
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

