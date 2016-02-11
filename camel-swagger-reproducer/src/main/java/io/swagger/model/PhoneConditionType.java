package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class PhoneConditionType   {
  
  private String conditionID = null;
  private String conditionName = null;
  private String conditionDescription = null;
  private String companyID = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("conditionID")
  public String getConditionID() {
    return conditionID;
  }
  public void setConditionID(String conditionID) {
    this.conditionID = conditionID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("conditionName")
  public String getConditionName() {
    return conditionName;
  }
  public void setConditionName(String conditionName) {
    this.conditionName = conditionName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("conditionDescription")
  public String getConditionDescription() {
    return conditionDescription;
  }
  public void setConditionDescription(String conditionDescription) {
    this.conditionDescription = conditionDescription;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneConditionType phoneConditionType = (PhoneConditionType) o;
    return Objects.equals(conditionID, phoneConditionType.conditionID) &&
        Objects.equals(conditionName, phoneConditionType.conditionName) &&
        Objects.equals(conditionDescription, phoneConditionType.conditionDescription) &&
        Objects.equals(companyID, phoneConditionType.companyID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionID, conditionName, conditionDescription, companyID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneConditionType {\n");
    
    sb.append("    conditionID: ").append(toIndentedString(conditionID)).append("\n");
    sb.append("    conditionName: ").append(toIndentedString(conditionName)).append("\n");
    sb.append("    conditionDescription: ").append(toIndentedString(conditionDescription)).append("\n");
    sb.append("    companyID: ").append(toIndentedString(companyID)).append("\n");
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

