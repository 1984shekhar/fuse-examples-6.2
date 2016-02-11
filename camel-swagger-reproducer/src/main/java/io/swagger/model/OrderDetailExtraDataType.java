package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class OrderDetailExtraDataType   {
  
  private String renderableDataType = null;
  private String extradataID = null;
  private String extraDataName = null;
  private String extraDataValue = null;
  private String extraDataTranslation = null;
  private String level = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("renderableDataType")
  public String getRenderableDataType() {
    return renderableDataType;
  }
  public void setRenderableDataType(String renderableDataType) {
    this.renderableDataType = renderableDataType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extradataID")
  public String getExtradataID() {
    return extradataID;
  }
  public void setExtradataID(String extradataID) {
    this.extradataID = extradataID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extraDataName")
  public String getExtraDataName() {
    return extraDataName;
  }
  public void setExtraDataName(String extraDataName) {
    this.extraDataName = extraDataName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extraDataValue")
  public String getExtraDataValue() {
    return extraDataValue;
  }
  public void setExtraDataValue(String extraDataValue) {
    this.extraDataValue = extraDataValue;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extraDataTranslation")
  public String getExtraDataTranslation() {
    return extraDataTranslation;
  }
  public void setExtraDataTranslation(String extraDataTranslation) {
    this.extraDataTranslation = extraDataTranslation;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("level")
  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailExtraDataType orderDetailExtraDataType = (OrderDetailExtraDataType) o;
    return Objects.equals(renderableDataType, orderDetailExtraDataType.renderableDataType) &&
        Objects.equals(extradataID, orderDetailExtraDataType.extradataID) &&
        Objects.equals(extraDataName, orderDetailExtraDataType.extraDataName) &&
        Objects.equals(extraDataValue, orderDetailExtraDataType.extraDataValue) &&
        Objects.equals(extraDataTranslation, orderDetailExtraDataType.extraDataTranslation) &&
        Objects.equals(level, orderDetailExtraDataType.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(renderableDataType, extradataID, extraDataName, extraDataValue, extraDataTranslation, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailExtraDataType {\n");
    
    sb.append("    renderableDataType: ").append(toIndentedString(renderableDataType)).append("\n");
    sb.append("    extradataID: ").append(toIndentedString(extradataID)).append("\n");
    sb.append("    extraDataName: ").append(toIndentedString(extraDataName)).append("\n");
    sb.append("    extraDataValue: ").append(toIndentedString(extraDataValue)).append("\n");
    sb.append("    extraDataTranslation: ").append(toIndentedString(extraDataTranslation)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

