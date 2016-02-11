package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class InsuranceEnrollRequestBO   {
  
  private HeaderType header = null;
  private CustomerType customer = null;
  private EquipmentType equipment = null;
  private ChannelType channel = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("header")
  public HeaderType getHeader() {
    return header;
  }
  public void setHeader(HeaderType header) {
    this.header = header;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customer")
  public CustomerType getCustomer() {
    return customer;
  }
  public void setCustomer(CustomerType customer) {
    this.customer = customer;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("equipment")
  public EquipmentType getEquipment() {
    return equipment;
  }
  public void setEquipment(EquipmentType equipment) {
    this.equipment = equipment;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("channel")
  public ChannelType getChannel() {
    return channel;
  }
  public void setChannel(ChannelType channel) {
    this.channel = channel;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceEnrollRequestBO insuranceEnrollRequestBO = (InsuranceEnrollRequestBO) o;
    return Objects.equals(header, insuranceEnrollRequestBO.header) &&
        Objects.equals(customer, insuranceEnrollRequestBO.customer) &&
        Objects.equals(equipment, insuranceEnrollRequestBO.equipment) &&
        Objects.equals(channel, insuranceEnrollRequestBO.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, customer, equipment, channel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceEnrollRequestBO {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    equipment: ").append(toIndentedString(equipment)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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

