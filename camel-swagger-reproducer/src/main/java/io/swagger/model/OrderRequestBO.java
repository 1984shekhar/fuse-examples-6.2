package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class OrderRequestBO   {
  
  private HeaderType header = null;
  private String customerPOReference = null;
  private String orderShipType = null;
  private PersonType customerName = null;
  private AddressType customerAddress = null;
  private OrderType order = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("header")
  public HeaderType getHeader() {
    return header;
  }
  public void setHeader(HeaderType header) {
    this.header = header;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customerPOReference")
  public String getCustomerPOReference() {
    return customerPOReference;
  }
  public void setCustomerPOReference(String customerPOReference) {
    this.customerPOReference = customerPOReference;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderShipType")
  public String getOrderShipType() {
    return orderShipType;
  }
  public void setOrderShipType(String orderShipType) {
    this.orderShipType = orderShipType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customerName")
  public PersonType getCustomerName() {
    return customerName;
  }
  public void setCustomerName(PersonType customerName) {
    this.customerName = customerName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customerAddress")
  public AddressType getCustomerAddress() {
    return customerAddress;
  }
  public void setCustomerAddress(AddressType customerAddress) {
    this.customerAddress = customerAddress;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("order")
  public OrderType getOrder() {
    return order;
  }
  public void setOrder(OrderType order) {
    this.order = order;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderRequestBO orderRequestBO = (OrderRequestBO) o;
    return Objects.equals(header, orderRequestBO.header) &&
        Objects.equals(customerPOReference, orderRequestBO.customerPOReference) &&
        Objects.equals(orderShipType, orderRequestBO.orderShipType) &&
        Objects.equals(customerName, orderRequestBO.customerName) &&
        Objects.equals(customerAddress, orderRequestBO.customerAddress) &&
        Objects.equals(order, orderRequestBO.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, customerPOReference, orderShipType, customerName, customerAddress, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRequestBO {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    customerPOReference: ").append(toIndentedString(customerPOReference)).append("\n");
    sb.append("    orderShipType: ").append(toIndentedString(orderShipType)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerAddress: ").append(toIndentedString(customerAddress)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

