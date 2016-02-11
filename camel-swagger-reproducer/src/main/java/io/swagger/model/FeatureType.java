package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class FeatureType   {
  
  private String deductible = null;
  private String deatureType = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deductible")
  public String getDeductible() {
    return deductible;
  }
  public void setDeductible(String deductible) {
    this.deductible = deductible;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deatureType")
  public String getDeatureType() {
    return deatureType;
  }
  public void setDeatureType(String deatureType) {
    this.deatureType = deatureType;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureType featureType = (FeatureType) o;
    return Objects.equals(deductible, featureType.deductible) &&
        Objects.equals(deatureType, featureType.deatureType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deductible, deatureType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureType {\n");
    
    sb.append("    deductible: ").append(toIndentedString(deductible)).append("\n");
    sb.append("    deatureType: ").append(toIndentedString(deatureType)).append("\n");
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

