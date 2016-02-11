package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class OrderDetailConditionValuesType   {
  
  private String conditionID = null;
  private String value = null;

  
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
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailConditionValuesType orderDetailConditionValuesType = (OrderDetailConditionValuesType) o;
    return Objects.equals(conditionID, orderDetailConditionValuesType.conditionID) &&
        Objects.equals(value, orderDetailConditionValuesType.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionID, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailConditionValuesType {\n");
    
    sb.append("    conditionID: ").append(toIndentedString(conditionID)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

