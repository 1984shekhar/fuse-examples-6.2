package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class BuybackOrderResponseBO   {
  
  private String result = null;
  private String message = null;
  private String resultID = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("result")
  public String getResult() {
    return result;
  }
  public void setResult(String result) {
    this.result = result;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("resultID")
  public String getResultID() {
    return resultID;
  }
  public void setResultID(String resultID) {
    this.resultID = resultID;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuybackOrderResponseBO buybackOrderResponseBO = (BuybackOrderResponseBO) o;
    return Objects.equals(result, buybackOrderResponseBO.result) &&
        Objects.equals(message, buybackOrderResponseBO.message) &&
        Objects.equals(resultID, buybackOrderResponseBO.resultID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, message, resultID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuybackOrderResponseBO {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    resultID: ").append(toIndentedString(resultID)).append("\n");
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

