package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class OrderResponseBO   {
  
  private OrderResponseHeader header = null;
  private String orderCreateDate = null;
  private String orderUpdateDate = null;
  private String actionType = null;
  private String orderID = null;
  private String eRPOrderID = null;
  private String catalogID = null;
  private String customerPOReference = null;
  private String orderStatus = null;
  private String orderStatusID = null;
  private String salesOrderType = null;
  private String orderShipType = null;
  private String isPreOrder = null;
  private String paymentTerms = null;
  private String paymentTransactionID = null;
  private String oneLinePerItem = null;
  private String eRPCreateDate = null;
  private AddressType customerAddress = null;
  private AddressType billingAddress = null;
  private List<OrderLineType> orderList = new ArrayList<OrderLineType>();
  private String customerLineReference = null;
  private String reserveNeeded = null;
  private String orderLineID = null;
  private String eRPLineMapperID = null;
  private String warehouseID = null;
  private String quantityMarketPlace = null;
  private String quantityERP = null;
  private String quantityRequested = null;
  private String quantityAllocated = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("header")
  public OrderResponseHeader getHeader() {
    return header;
  }
  public void setHeader(OrderResponseHeader header) {
    this.header = header;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderCreateDate")
  public String getOrderCreateDate() {
    return orderCreateDate;
  }
  public void setOrderCreateDate(String orderCreateDate) {
    this.orderCreateDate = orderCreateDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderUpdateDate")
  public String getOrderUpdateDate() {
    return orderUpdateDate;
  }
  public void setOrderUpdateDate(String orderUpdateDate) {
    this.orderUpdateDate = orderUpdateDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("actionType")
  public String getActionType() {
    return actionType;
  }
  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderID")
  public String getOrderID() {
    return orderID;
  }
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ERPOrderID")
  public String getERPOrderID() {
    return eRPOrderID;
  }
  public void setERPOrderID(String eRPOrderID) {
    this.eRPOrderID = eRPOrderID;
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
  @JsonProperty("orderStatus")
  public String getOrderStatus() {
    return orderStatus;
  }
  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderStatusID")
  public String getOrderStatusID() {
    return orderStatusID;
  }
  public void setOrderStatusID(String orderStatusID) {
    this.orderStatusID = orderStatusID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("salesOrderType")
  public String getSalesOrderType() {
    return salesOrderType;
  }
  public void setSalesOrderType(String salesOrderType) {
    this.salesOrderType = salesOrderType;
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
  @JsonProperty("isPreOrder")
  public String getIsPreOrder() {
    return isPreOrder;
  }
  public void setIsPreOrder(String isPreOrder) {
    this.isPreOrder = isPreOrder;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentTerms")
  public String getPaymentTerms() {
    return paymentTerms;
  }
  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentTransactionID")
  public String getPaymentTransactionID() {
    return paymentTransactionID;
  }
  public void setPaymentTransactionID(String paymentTransactionID) {
    this.paymentTransactionID = paymentTransactionID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oneLinePerItem")
  public String getOneLinePerItem() {
    return oneLinePerItem;
  }
  public void setOneLinePerItem(String oneLinePerItem) {
    this.oneLinePerItem = oneLinePerItem;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ERPCreateDate")
  public String getERPCreateDate() {
    return eRPCreateDate;
  }
  public void setERPCreateDate(String eRPCreateDate) {
    this.eRPCreateDate = eRPCreateDate;
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
  @JsonProperty("billingAddress")
  public AddressType getBillingAddress() {
    return billingAddress;
  }
  public void setBillingAddress(AddressType billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderList")
  public List<OrderLineType> getOrderList() {
    return orderList;
  }
  public void setOrderList(List<OrderLineType> orderList) {
    this.orderList = orderList;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customerLineReference")
  public String getCustomerLineReference() {
    return customerLineReference;
  }
  public void setCustomerLineReference(String customerLineReference) {
    this.customerLineReference = customerLineReference;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reserveNeeded")
  public String getReserveNeeded() {
    return reserveNeeded;
  }
  public void setReserveNeeded(String reserveNeeded) {
    this.reserveNeeded = reserveNeeded;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderLineID")
  public String getOrderLineID() {
    return orderLineID;
  }
  public void setOrderLineID(String orderLineID) {
    this.orderLineID = orderLineID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ERPLineMapperID")
  public String getERPLineMapperID() {
    return eRPLineMapperID;
  }
  public void setERPLineMapperID(String eRPLineMapperID) {
    this.eRPLineMapperID = eRPLineMapperID;
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
  @JsonProperty("quantityMarketPlace")
  public String getQuantityMarketPlace() {
    return quantityMarketPlace;
  }
  public void setQuantityMarketPlace(String quantityMarketPlace) {
    this.quantityMarketPlace = quantityMarketPlace;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("quantityERP")
  public String getQuantityERP() {
    return quantityERP;
  }
  public void setQuantityERP(String quantityERP) {
    this.quantityERP = quantityERP;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("quantityRequested")
  public String getQuantityRequested() {
    return quantityRequested;
  }
  public void setQuantityRequested(String quantityRequested) {
    this.quantityRequested = quantityRequested;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("quantityAllocated")
  public String getQuantityAllocated() {
    return quantityAllocated;
  }
  public void setQuantityAllocated(String quantityAllocated) {
    this.quantityAllocated = quantityAllocated;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderResponseBO orderResponseBO = (OrderResponseBO) o;
    return Objects.equals(header, orderResponseBO.header) &&
        Objects.equals(orderCreateDate, orderResponseBO.orderCreateDate) &&
        Objects.equals(orderUpdateDate, orderResponseBO.orderUpdateDate) &&
        Objects.equals(actionType, orderResponseBO.actionType) &&
        Objects.equals(orderID, orderResponseBO.orderID) &&
        Objects.equals(eRPOrderID, orderResponseBO.eRPOrderID) &&
        Objects.equals(catalogID, orderResponseBO.catalogID) &&
        Objects.equals(customerPOReference, orderResponseBO.customerPOReference) &&
        Objects.equals(orderStatus, orderResponseBO.orderStatus) &&
        Objects.equals(orderStatusID, orderResponseBO.orderStatusID) &&
        Objects.equals(salesOrderType, orderResponseBO.salesOrderType) &&
        Objects.equals(orderShipType, orderResponseBO.orderShipType) &&
        Objects.equals(isPreOrder, orderResponseBO.isPreOrder) &&
        Objects.equals(paymentTerms, orderResponseBO.paymentTerms) &&
        Objects.equals(paymentTransactionID, orderResponseBO.paymentTransactionID) &&
        Objects.equals(oneLinePerItem, orderResponseBO.oneLinePerItem) &&
        Objects.equals(eRPCreateDate, orderResponseBO.eRPCreateDate) &&
        Objects.equals(customerAddress, orderResponseBO.customerAddress) &&
        Objects.equals(billingAddress, orderResponseBO.billingAddress) &&
        Objects.equals(orderList, orderResponseBO.orderList) &&
        Objects.equals(customerLineReference, orderResponseBO.customerLineReference) &&
        Objects.equals(reserveNeeded, orderResponseBO.reserveNeeded) &&
        Objects.equals(orderLineID, orderResponseBO.orderLineID) &&
        Objects.equals(eRPLineMapperID, orderResponseBO.eRPLineMapperID) &&
        Objects.equals(warehouseID, orderResponseBO.warehouseID) &&
        Objects.equals(quantityMarketPlace, orderResponseBO.quantityMarketPlace) &&
        Objects.equals(quantityERP, orderResponseBO.quantityERP) &&
        Objects.equals(quantityRequested, orderResponseBO.quantityRequested) &&
        Objects.equals(quantityAllocated, orderResponseBO.quantityAllocated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, orderCreateDate, orderUpdateDate, actionType, orderID, eRPOrderID, catalogID, customerPOReference, orderStatus, orderStatusID, salesOrderType, orderShipType, isPreOrder, paymentTerms, paymentTransactionID, oneLinePerItem, eRPCreateDate, customerAddress, billingAddress, orderList, customerLineReference, reserveNeeded, orderLineID, eRPLineMapperID, warehouseID, quantityMarketPlace, quantityERP, quantityRequested, quantityAllocated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponseBO {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    orderCreateDate: ").append(toIndentedString(orderCreateDate)).append("\n");
    sb.append("    orderUpdateDate: ").append(toIndentedString(orderUpdateDate)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
    sb.append("    eRPOrderID: ").append(toIndentedString(eRPOrderID)).append("\n");
    sb.append("    catalogID: ").append(toIndentedString(catalogID)).append("\n");
    sb.append("    customerPOReference: ").append(toIndentedString(customerPOReference)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    orderStatusID: ").append(toIndentedString(orderStatusID)).append("\n");
    sb.append("    salesOrderType: ").append(toIndentedString(salesOrderType)).append("\n");
    sb.append("    orderShipType: ").append(toIndentedString(orderShipType)).append("\n");
    sb.append("    isPreOrder: ").append(toIndentedString(isPreOrder)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
    sb.append("    paymentTransactionID: ").append(toIndentedString(paymentTransactionID)).append("\n");
    sb.append("    oneLinePerItem: ").append(toIndentedString(oneLinePerItem)).append("\n");
    sb.append("    eRPCreateDate: ").append(toIndentedString(eRPCreateDate)).append("\n");
    sb.append("    customerAddress: ").append(toIndentedString(customerAddress)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    orderList: ").append(toIndentedString(orderList)).append("\n");
    sb.append("    customerLineReference: ").append(toIndentedString(customerLineReference)).append("\n");
    sb.append("    reserveNeeded: ").append(toIndentedString(reserveNeeded)).append("\n");
    sb.append("    orderLineID: ").append(toIndentedString(orderLineID)).append("\n");
    sb.append("    eRPLineMapperID: ").append(toIndentedString(eRPLineMapperID)).append("\n");
    sb.append("    warehouseID: ").append(toIndentedString(warehouseID)).append("\n");
    sb.append("    quantityMarketPlace: ").append(toIndentedString(quantityMarketPlace)).append("\n");
    sb.append("    quantityERP: ").append(toIndentedString(quantityERP)).append("\n");
    sb.append("    quantityRequested: ").append(toIndentedString(quantityRequested)).append("\n");
    sb.append("    quantityAllocated: ").append(toIndentedString(quantityAllocated)).append("\n");
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

