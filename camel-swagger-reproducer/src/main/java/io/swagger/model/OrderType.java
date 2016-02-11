package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class OrderType   {
  
  private String partNumber = null;
  private String reserveNeeded = null;
  private String quanity = null;
  private String action = null;

  
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
  @JsonProperty("quanity")
  public String getQuanity() {
    return quanity;
  }
  public void setQuanity(String quanity) {
    this.quanity = quanity;
  }

  
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderType orderType = (OrderType) o;
    return Objects.equals(partNumber, orderType.partNumber) &&
        Objects.equals(reserveNeeded, orderType.reserveNeeded) &&
        Objects.equals(quanity, orderType.quanity) &&
        Objects.equals(action, orderType.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partNumber, reserveNeeded, quanity, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderType {\n");
    
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    reserveNeeded: ").append(toIndentedString(reserveNeeded)).append("\n");
    sb.append("    quanity: ").append(toIndentedString(quanity)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

