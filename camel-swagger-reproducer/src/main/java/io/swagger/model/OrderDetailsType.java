package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class OrderDetailsType   {
  
  private String basePrice = null;
  private String conditionID = null;
  private String purchasePrice = null;
  private String serial = null;
  private String phonemodelID = null;
  private List<OrderDetailConditionValuesType> orderdetailconditionvalues = new ArrayList<OrderDetailConditionValuesType>();
  private List<OrderDetailExtraDataType> orderdetailextradatas = new ArrayList<OrderDetailExtraDataType>();
  private String colourID = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("basePrice")
  public String getBasePrice() {
    return basePrice;
  }
  public void setBasePrice(String basePrice) {
    this.basePrice = basePrice;
  }

  
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
  @JsonProperty("purchasePrice")
  public String getPurchasePrice() {
    return purchasePrice;
  }
  public void setPurchasePrice(String purchasePrice) {
    this.purchasePrice = purchasePrice;
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
  @JsonProperty("phonemodelID")
  public String getPhonemodelID() {
    return phonemodelID;
  }
  public void setPhonemodelID(String phonemodelID) {
    this.phonemodelID = phonemodelID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderdetailconditionvalues")
  public List<OrderDetailConditionValuesType> getOrderdetailconditionvalues() {
    return orderdetailconditionvalues;
  }
  public void setOrderdetailconditionvalues(List<OrderDetailConditionValuesType> orderdetailconditionvalues) {
    this.orderdetailconditionvalues = orderdetailconditionvalues;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderdetailextradatas")
  public List<OrderDetailExtraDataType> getOrderdetailextradatas() {
    return orderdetailextradatas;
  }
  public void setOrderdetailextradatas(List<OrderDetailExtraDataType> orderdetailextradatas) {
    this.orderdetailextradatas = orderdetailextradatas;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("colourID")
  public String getColourID() {
    return colourID;
  }
  public void setColourID(String colourID) {
    this.colourID = colourID;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailsType orderDetailsType = (OrderDetailsType) o;
    return Objects.equals(basePrice, orderDetailsType.basePrice) &&
        Objects.equals(conditionID, orderDetailsType.conditionID) &&
        Objects.equals(purchasePrice, orderDetailsType.purchasePrice) &&
        Objects.equals(serial, orderDetailsType.serial) &&
        Objects.equals(phonemodelID, orderDetailsType.phonemodelID) &&
        Objects.equals(orderdetailconditionvalues, orderDetailsType.orderdetailconditionvalues) &&
        Objects.equals(orderdetailextradatas, orderDetailsType.orderdetailextradatas) &&
        Objects.equals(colourID, orderDetailsType.colourID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basePrice, conditionID, purchasePrice, serial, phonemodelID, orderdetailconditionvalues, orderdetailextradatas, colourID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailsType {\n");
    
    sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
    sb.append("    conditionID: ").append(toIndentedString(conditionID)).append("\n");
    sb.append("    purchasePrice: ").append(toIndentedString(purchasePrice)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    phonemodelID: ").append(toIndentedString(phonemodelID)).append("\n");
    sb.append("    orderdetailconditionvalues: ").append(toIndentedString(orderdetailconditionvalues)).append("\n");
    sb.append("    orderdetailextradatas: ").append(toIndentedString(orderdetailextradatas)).append("\n");
    sb.append("    colourID: ").append(toIndentedString(colourID)).append("\n");
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

