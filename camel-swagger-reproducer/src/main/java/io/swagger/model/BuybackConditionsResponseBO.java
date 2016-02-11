package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class BuybackConditionsResponseBO   {
  
  private List<PhoneConditionType> conditions = new ArrayList<PhoneConditionType>();

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("conditions")
  public List<PhoneConditionType> getConditions() {
    return conditions;
  }
  public void setConditions(List<PhoneConditionType> conditions) {
    this.conditions = conditions;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuybackConditionsResponseBO buybackConditionsResponseBO = (BuybackConditionsResponseBO) o;
    return Objects.equals(conditions, buybackConditionsResponseBO.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuybackConditionsResponseBO {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

