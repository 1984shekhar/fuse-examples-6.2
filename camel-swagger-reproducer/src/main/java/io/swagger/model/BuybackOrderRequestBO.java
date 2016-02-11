package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class BuybackOrderRequestBO   {
  
  private String stolenCheckProviderId = null;
  private String serial = null;
  private String stolenCheckProviderName = null;
  private String externalReference = null;
  private String shopID = null;
  private String userID = null;
  private String creationDate = null;
  private String currencyid = null;
  private OrderStateType orderState = null;
  private List<OrderAddressesType> orderAddresses = new ArrayList<OrderAddressesType>();
  private List<OrderCustomersType> orderCustomers = new ArrayList<OrderCustomersType>();
  private List<OrderDetailsType> orderDetails = new ArrayList<OrderDetailsType>();
  private List<OrderDetailExtraDataType> orderextradatas = new ArrayList<OrderDetailExtraDataType>();

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stolenCheckProviderId")
  public String getStolenCheckProviderId() {
    return stolenCheckProviderId;
  }
  public void setStolenCheckProviderId(String stolenCheckProviderId) {
    this.stolenCheckProviderId = stolenCheckProviderId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serial")
  public String getSerial() {
    return serial;
  }
  public void setSerial(String serial) {
    this.serial = serial;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stolenCheckProviderName")
  public String getStolenCheckProviderName() {
    return stolenCheckProviderName;
  }
  public void setStolenCheckProviderName(String stolenCheckProviderName) {
    this.stolenCheckProviderName = stolenCheckProviderName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalReference")
  public String getExternalReference() {
    return externalReference;
  }
  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shopID")
  public String getShopID() {
    return shopID;
  }
  public void setShopID(String shopID) {
    this.shopID = shopID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userID")
  public String getUserID() {
    return userID;
  }
  public void setUserID(String userID) {
    this.userID = userID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creationDate")
  public String getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currencyid")
  public String getCurrencyid() {
    return currencyid;
  }
  public void setCurrencyid(String currencyid) {
    this.currencyid = currencyid;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderState")
  public OrderStateType getOrderState() {
    return orderState;
  }
  public void setOrderState(OrderStateType orderState) {
    this.orderState = orderState;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderAddresses")
  public List<OrderAddressesType> getOrderAddresses() {
    return orderAddresses;
  }
  public void setOrderAddresses(List<OrderAddressesType> orderAddresses) {
    this.orderAddresses = orderAddresses;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderCustomers")
  public List<OrderCustomersType> getOrderCustomers() {
    return orderCustomers;
  }
  public void setOrderCustomers(List<OrderCustomersType> orderCustomers) {
    this.orderCustomers = orderCustomers;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderDetails")
  public List<OrderDetailsType> getOrderDetails() {
    return orderDetails;
  }
  public void setOrderDetails(List<OrderDetailsType> orderDetails) {
    this.orderDetails = orderDetails;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderextradatas")
  public List<OrderDetailExtraDataType> getOrderextradatas() {
    return orderextradatas;
  }
  public void setOrderextradatas(List<OrderDetailExtraDataType> orderextradatas) {
    this.orderextradatas = orderextradatas;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuybackOrderRequestBO buybackOrderRequestBO = (BuybackOrderRequestBO) o;
    return Objects.equals(stolenCheckProviderId, buybackOrderRequestBO.stolenCheckProviderId) &&
        Objects.equals(serial, buybackOrderRequestBO.serial) &&
        Objects.equals(stolenCheckProviderName, buybackOrderRequestBO.stolenCheckProviderName) &&
        Objects.equals(externalReference, buybackOrderRequestBO.externalReference) &&
        Objects.equals(shopID, buybackOrderRequestBO.shopID) &&
        Objects.equals(userID, buybackOrderRequestBO.userID) &&
        Objects.equals(creationDate, buybackOrderRequestBO.creationDate) &&
        Objects.equals(currencyid, buybackOrderRequestBO.currencyid) &&
        Objects.equals(orderState, buybackOrderRequestBO.orderState) &&
        Objects.equals(orderAddresses, buybackOrderRequestBO.orderAddresses) &&
        Objects.equals(orderCustomers, buybackOrderRequestBO.orderCustomers) &&
        Objects.equals(orderDetails, buybackOrderRequestBO.orderDetails) &&
        Objects.equals(orderextradatas, buybackOrderRequestBO.orderextradatas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stolenCheckProviderId, serial, stolenCheckProviderName, externalReference, shopID, userID, creationDate, currencyid, orderState, orderAddresses, orderCustomers, orderDetails, orderextradatas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuybackOrderRequestBO {\n");
    
    sb.append("    stolenCheckProviderId: ").append(toIndentedString(stolenCheckProviderId)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    stolenCheckProviderName: ").append(toIndentedString(stolenCheckProviderName)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    shopID: ").append(toIndentedString(shopID)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    currencyid: ").append(toIndentedString(currencyid)).append("\n");
    sb.append("    orderState: ").append(toIndentedString(orderState)).append("\n");
    sb.append("    orderAddresses: ").append(toIndentedString(orderAddresses)).append("\n");
    sb.append("    orderCustomers: ").append(toIndentedString(orderCustomers)).append("\n");
    sb.append("    orderDetails: ").append(toIndentedString(orderDetails)).append("\n");
    sb.append("    orderextradatas: ").append(toIndentedString(orderextradatas)).append("\n");
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

