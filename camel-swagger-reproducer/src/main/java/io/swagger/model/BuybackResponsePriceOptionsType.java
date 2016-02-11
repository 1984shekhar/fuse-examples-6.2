package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class BuybackResponsePriceOptionsType   {
  
  private String price = null;
  private ExtraDataType extraData = null;
  private String optionDescription = null;
  private String conditionID = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extraData")
  public ExtraDataType getExtraData() {
    return extraData;
  }
  public void setExtraData(ExtraDataType extraData) {
    this.extraData = extraData;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("optionDescription")
  public String getOptionDescription() {
    return optionDescription;
  }
  public void setOptionDescription(String optionDescription) {
    this.optionDescription = optionDescription;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuybackResponsePriceOptionsType buybackResponsePriceOptionsType = (BuybackResponsePriceOptionsType) o;
    return Objects.equals(price, buybackResponsePriceOptionsType.price) &&
        Objects.equals(extraData, buybackResponsePriceOptionsType.extraData) &&
        Objects.equals(optionDescription, buybackResponsePriceOptionsType.optionDescription) &&
        Objects.equals(conditionID, buybackResponsePriceOptionsType.conditionID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, extraData, optionDescription, conditionID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuybackResponsePriceOptionsType {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    optionDescription: ").append(toIndentedString(optionDescription)).append("\n");
    sb.append("    conditionID: ").append(toIndentedString(conditionID)).append("\n");
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

