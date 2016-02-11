package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class ExtraDataType   {
  
  private String extraDataID = null;
  private String extraDataName = null;
  private String extraDataTranslation = null;
  private String level = null;
  private String renderableDataType = null;
  private String extradatavalue = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extraDataID")
  public String getExtraDataID() {
    return extraDataID;
  }
  public void setExtraDataID(String extraDataID) {
    this.extraDataID = extraDataID;
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
  @JsonProperty("extradatavalue")
  public String getExtradatavalue() {
    return extradatavalue;
  }
  public void setExtradatavalue(String extradatavalue) {
    this.extradatavalue = extradatavalue;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraDataType extraDataType = (ExtraDataType) o;
    return Objects.equals(extraDataID, extraDataType.extraDataID) &&
        Objects.equals(extraDataName, extraDataType.extraDataName) &&
        Objects.equals(extraDataTranslation, extraDataType.extraDataTranslation) &&
        Objects.equals(level, extraDataType.level) &&
        Objects.equals(renderableDataType, extraDataType.renderableDataType) &&
        Objects.equals(extradatavalue, extraDataType.extradatavalue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraDataID, extraDataName, extraDataTranslation, level, renderableDataType, extradatavalue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraDataType {\n");
    
    sb.append("    extraDataID: ").append(toIndentedString(extraDataID)).append("\n");
    sb.append("    extraDataName: ").append(toIndentedString(extraDataName)).append("\n");
    sb.append("    extraDataTranslation: ").append(toIndentedString(extraDataTranslation)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    renderableDataType: ").append(toIndentedString(renderableDataType)).append("\n");
    sb.append("    extradatavalue: ").append(toIndentedString(extradatavalue)).append("\n");
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

