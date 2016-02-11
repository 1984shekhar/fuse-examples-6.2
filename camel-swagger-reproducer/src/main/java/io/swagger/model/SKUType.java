package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class SKUType   {
  
  private String equipmentCondition = null;
  private String SKU = null;

  
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
    SKUType sKUType = (SKUType) o;
    return Objects.equals(equipmentCondition, sKUType.equipmentCondition) &&
        Objects.equals(SKU, sKUType.SKU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equipmentCondition, SKU);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SKUType {\n");
    
    sb.append("    equipmentCondition: ").append(toIndentedString(equipmentCondition)).append("\n");
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

