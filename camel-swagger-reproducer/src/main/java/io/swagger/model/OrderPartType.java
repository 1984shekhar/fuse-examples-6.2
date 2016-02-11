package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class OrderPartType   {
  
  private String catalogPartMasterID = null;
  private String warehouseID = null;
  private String catalogID = null;
  private String carrierID = null;
  private String partNumber = null;
  private String customerPartNumber = null;
  private String customerEntityID = null;
  private String active = null;
  private String available = null;
  private String quantityReserved = null;
  private String quantityUnreserved = null;
  private String quantityStandard = null;
  private String isReservable = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("catalogPartMasterID")
  public String getCatalogPartMasterID() {
    return catalogPartMasterID;
  }
  public void setCatalogPartMasterID(String catalogPartMasterID) {
    this.catalogPartMasterID = catalogPartMasterID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("warehouseID")
  public String getWarehouseID() {
    return warehouseID;
  }
  public void setWarehouseID(String warehouseID) {
    this.warehouseID = warehouseID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("catalogID")
  public String getCatalogID() {
    return catalogID;
  }
  public void setCatalogID(String catalogID) {
    this.catalogID = catalogID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("carrierID")
  public String getCarrierID() {
    return carrierID;
  }
  public void setCarrierID(String carrierID) {
    this.carrierID = carrierID;
  }

  
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
  @JsonProperty("customerEntityID")
  public String getCustomerEntityID() {
    return customerEntityID;
  }
  public void setCustomerEntityID(String customerEntityID) {
    this.customerEntityID = customerEntityID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public String getActive() {
    return active;
  }
  public void setActive(String active) {
    this.active = active;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("available")
  public String getAvailable() {
    return available;
  }
  public void setAvailable(String available) {
    this.available = available;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("quantityReserved")
  public String getQuantityReserved() {
    return quantityReserved;
  }
  public void setQuantityReserved(String quantityReserved) {
    this.quantityReserved = quantityReserved;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("quantityUnreserved")
  public String getQuantityUnreserved() {
    return quantityUnreserved;
  }
  public void setQuantityUnreserved(String quantityUnreserved) {
    this.quantityUnreserved = quantityUnreserved;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("quantityStandard")
  public String getQuantityStandard() {
    return quantityStandard;
  }
  public void setQuantityStandard(String quantityStandard) {
    this.quantityStandard = quantityStandard;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isReservable")
  public String getIsReservable() {
    return isReservable;
  }
  public void setIsReservable(String isReservable) {
    this.isReservable = isReservable;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPartType orderPartType = (OrderPartType) o;
    return Objects.equals(catalogPartMasterID, orderPartType.catalogPartMasterID) &&
        Objects.equals(warehouseID, orderPartType.warehouseID) &&
        Objects.equals(catalogID, orderPartType.catalogID) &&
        Objects.equals(carrierID, orderPartType.carrierID) &&
        Objects.equals(partNumber, orderPartType.partNumber) &&
        Objects.equals(customerPartNumber, orderPartType.customerPartNumber) &&
        Objects.equals(customerEntityID, orderPartType.customerEntityID) &&
        Objects.equals(active, orderPartType.active) &&
        Objects.equals(available, orderPartType.available) &&
        Objects.equals(quantityReserved, orderPartType.quantityReserved) &&
        Objects.equals(quantityUnreserved, orderPartType.quantityUnreserved) &&
        Objects.equals(quantityStandard, orderPartType.quantityStandard) &&
        Objects.equals(isReservable, orderPartType.isReservable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogPartMasterID, warehouseID, catalogID, carrierID, partNumber, customerPartNumber, customerEntityID, active, available, quantityReserved, quantityUnreserved, quantityStandard, isReservable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPartType {\n");
    
    sb.append("    catalogPartMasterID: ").append(toIndentedString(catalogPartMasterID)).append("\n");
    sb.append("    warehouseID: ").append(toIndentedString(warehouseID)).append("\n");
    sb.append("    catalogID: ").append(toIndentedString(catalogID)).append("\n");
    sb.append("    carrierID: ").append(toIndentedString(carrierID)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    customerPartNumber: ").append(toIndentedString(customerPartNumber)).append("\n");
    sb.append("    customerEntityID: ").append(toIndentedString(customerEntityID)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    quantityReserved: ").append(toIndentedString(quantityReserved)).append("\n");
    sb.append("    quantityUnreserved: ").append(toIndentedString(quantityUnreserved)).append("\n");
    sb.append("    quantityStandard: ").append(toIndentedString(quantityStandard)).append("\n");
    sb.append("    isReservable: ").append(toIndentedString(isReservable)).append("\n");
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

