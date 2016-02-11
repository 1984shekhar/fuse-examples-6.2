package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class ServicePlanResponseBO   {
  
  private SKUType sKUType = null;
  private ServicePlanDetailsType servicePlanDetails = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("SKUType")
  public SKUType getSKUType() {
    return sKUType;
  }
  public void setSKUType(SKUType sKUType) {
    this.sKUType = sKUType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("servicePlanDetails")
  public ServicePlanDetailsType getServicePlanDetails() {
    return servicePlanDetails;
  }
  public void setServicePlanDetails(ServicePlanDetailsType servicePlanDetails) {
    this.servicePlanDetails = servicePlanDetails;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicePlanResponseBO servicePlanResponseBO = (ServicePlanResponseBO) o;
    return Objects.equals(sKUType, servicePlanResponseBO.sKUType) &&
        Objects.equals(servicePlanDetails, servicePlanResponseBO.servicePlanDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sKUType, servicePlanDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePlanResponseBO {\n");
    
    sb.append("    sKUType: ").append(toIndentedString(sKUType)).append("\n");
    sb.append("    servicePlanDetails: ").append(toIndentedString(servicePlanDetails)).append("\n");
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

