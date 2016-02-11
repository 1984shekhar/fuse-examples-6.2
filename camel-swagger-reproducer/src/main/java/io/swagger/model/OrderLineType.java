package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class OrderLineType   {
  
  private String partNumber = null;
  private String customerPartNumber = null;
  private OrderPartType part = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("partNumber")
  public String getPartNumber() {
    return partNumber;
  }
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customerPartNumber")
  public String getCustomerPartNumber() {
    return customerPartNumber;
  }
  public void setCustomerPartNumber(String customerPartNumber) {
    this.customerPartNumber = customerPartNumber;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("part")
  public OrderPartType getPart() {
    return part;
  }
  public void setPart(OrderPartType part) {
    this.part = part;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLineType orderLineType = (OrderLineType) o;
    return Objects.equals(partNumber, orderLineType.partNumber) &&
        Objects.equals(customerPartNumber, orderLineType.customerPartNumber) &&
        Objects.equals(part, orderLineType.part);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partNumber, customerPartNumber, part);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineType {\n");
    
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    customerPartNumber: ").append(toIndentedString(customerPartNumber)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
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

