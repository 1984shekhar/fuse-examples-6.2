package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class EquipmentType   {
  
  private String action = null;
  private String equipmentActiviationDate = null;
  private String equipmentCondition = null;
  private String equipmentPurchaseDate = null;
  private String manufactureWarrantyEndDate = null;
  private String mobileIdentificationNumber = null;
  private String modality = null;
  private String phoneNumber = null;
  private String serialNumberDateChange = null;
  private String serviceActivationDate = null;
  private String servicePlanID = null;
  private String SKU = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("equipmentActiviationDate")
  public String getEquipmentActiviationDate() {
    return equipmentActiviationDate;
  }
  public void setEquipmentActiviationDate(String equipmentActiviationDate) {
    this.equipmentActiviationDate = equipmentActiviationDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("equipmentCondition")
  public String getEquipmentCondition() {
    return equipmentCondition;
  }
  public void setEquipmentCondition(String equipmentCondition) {
    this.equipmentCondition = equipmentCondition;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("equipmentPurchaseDate")
  public String getEquipmentPurchaseDate() {
    return equipmentPurchaseDate;
  }
  public void setEquipmentPurchaseDate(String equipmentPurchaseDate) {
    this.equipmentPurchaseDate = equipmentPurchaseDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("manufactureWarrantyEndDate")
  public String getManufactureWarrantyEndDate() {
    return manufactureWarrantyEndDate;
  }
  public void setManufactureWarrantyEndDate(String manufactureWarrantyEndDate) {
    this.manufactureWarrantyEndDate = manufactureWarrantyEndDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mobileIdentificationNumber")
  public String getMobileIdentificationNumber() {
    return mobileIdentificationNumber;
  }
  public void setMobileIdentificationNumber(String mobileIdentificationNumber) {
    this.mobileIdentificationNumber = mobileIdentificationNumber;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modality")
  public String getModality() {
    return modality;
  }
  public void setModality(String modality) {
    this.modality = modality;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serialNumberDateChange")
  public String getSerialNumberDateChange() {
    return serialNumberDateChange;
  }
  public void setSerialNumberDateChange(String serialNumberDateChange) {
    this.serialNumberDateChange = serialNumberDateChange;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceActivationDate")
  public String getServiceActivationDate() {
    return serviceActivationDate;
  }
  public void setServiceActivationDate(String serviceActivationDate) {
    this.serviceActivationDate = serviceActivationDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("servicePlanID")
  public String getServicePlanID() {
    return servicePlanID;
  }
  public void setServicePlanID(String servicePlanID) {
    this.servicePlanID = servicePlanID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("SKU")
  public String getSKU() {
    return SKU;
  }
  public void setSKU(String SKU) {
    this.SKU = SKU;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquipmentType equipmentType = (EquipmentType) o;
    return Objects.equals(action, equipmentType.action) &&
        Objects.equals(equipmentActiviationDate, equipmentType.equipmentActiviationDate) &&
        Objects.equals(equipmentCondition, equipmentType.equipmentCondition) &&
        Objects.equals(equipmentPurchaseDate, equipmentType.equipmentPurchaseDate) &&
        Objects.equals(manufactureWarrantyEndDate, equipmentType.manufactureWarrantyEndDate) &&
        Objects.equals(mobileIdentificationNumber, equipmentType.mobileIdentificationNumber) &&
        Objects.equals(modality, equipmentType.modality) &&
        Objects.equals(phoneNumber, equipmentType.phoneNumber) &&
        Objects.equals(serialNumberDateChange, equipmentType.serialNumberDateChange) &&
        Objects.equals(serviceActivationDate, equipmentType.serviceActivationDate) &&
        Objects.equals(servicePlanID, equipmentType.servicePlanID) &&
        Objects.equals(SKU, equipmentType.SKU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, equipmentActiviationDate, equipmentCondition, equipmentPurchaseDate, manufactureWarrantyEndDate, mobileIdentificationNumber, modality, phoneNumber, serialNumberDateChange, serviceActivationDate, servicePlanID, SKU);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquipmentType {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    equipmentActiviationDate: ").append(toIndentedString(equipmentActiviationDate)).append("\n");
    sb.append("    equipmentCondition: ").append(toIndentedString(equipmentCondition)).append("\n");
    sb.append("    equipmentPurchaseDate: ").append(toIndentedString(equipmentPurchaseDate)).append("\n");
    sb.append("    manufactureWarrantyEndDate: ").append(toIndentedString(manufactureWarrantyEndDate)).append("\n");
    sb.append("    mobileIdentificationNumber: ").append(toIndentedString(mobileIdentificationNumber)).append("\n");
    sb.append("    modality: ").append(toIndentedString(modality)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    serialNumberDateChange: ").append(toIndentedString(serialNumberDateChange)).append("\n");
    sb.append("    serviceActivationDate: ").append(toIndentedString(serviceActivationDate)).append("\n");
    sb.append("    servicePlanID: ").append(toIndentedString(servicePlanID)).append("\n");
    sb.append("    SKU: ").append(toIndentedString(SKU)).append("\n");
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

