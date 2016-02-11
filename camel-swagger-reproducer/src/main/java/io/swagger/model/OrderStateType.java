package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class OrderStateType   {
  
  private String orderStateID = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderStateID")
  public String getOrderStateID() {
    return orderStateID;
  }
  public void setOrderStateID(String orderStateID) {
    this.orderStateID = orderStateID;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStateType orderStateType = (OrderStateType) o;
    return Objects.equals(orderStateID, orderStateType.orderStateID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderStateID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStateType {\n");
    
    sb.append("    orderStateID: ").append(toIndentedString(orderStateID)).append("\n");
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

