package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class ServicePlanDetailsType   {
  
  private List<FeatureType> features = new ArrayList<FeatureType>();
  private ServicePlanType servicePlan = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("features")
  public List<FeatureType> getFeatures() {
    return features;
  }
  public void setFeatures(List<FeatureType> features) {
    this.features = features;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("servicePlan")
  public ServicePlanType getServicePlan() {
    return servicePlan;
  }
  public void setServicePlan(ServicePlanType servicePlan) {
    this.servicePlan = servicePlan;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicePlanDetailsType servicePlanDetailsType = (ServicePlanDetailsType) o;
    return Objects.equals(features, servicePlanDetailsType.features) &&
        Objects.equals(servicePlan, servicePlanDetailsType.servicePlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(features, servicePlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePlanDetailsType {\n");
    
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    servicePlan: ").append(toIndentedString(servicePlan)).append("\n");
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

