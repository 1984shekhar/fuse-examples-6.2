package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class OrderAddressesType   {
  
  private String orderAddressTypeID = null;
  private AddressType orderAddress = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderAddressTypeID")
  public String getOrderAddressTypeID() {
    return orderAddressTypeID;
  }
  public void setOrderAddressTypeID(String orderAddressTypeID) {
    this.orderAddressTypeID = orderAddressTypeID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderAddress")
  public AddressType getOrderAddress() {
    return orderAddress;
  }
  public void setOrderAddress(AddressType orderAddress) {
    this.orderAddress = orderAddress;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderAddressesType orderAddressesType = (OrderAddressesType) o;
    return Objects.equals(orderAddressTypeID, orderAddressesType.orderAddressTypeID) &&
        Objects.equals(orderAddress, orderAddressesType.orderAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderAddressTypeID, orderAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAddressesType {\n");
    
    sb.append("    orderAddressTypeID: ").append(toIndentedString(orderAddressTypeID)).append("\n");
    sb.append("    orderAddress: ").append(toIndentedString(orderAddress)).append("\n");
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

