package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class BuybackPriceResponseBO   {
  
  private String baseprice = null;
  private List<BuybackResponsePriceOptionsType> priceOptions = new ArrayList<BuybackResponsePriceOptionsType>();

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("baseprice")
  public String getBaseprice() {
    return baseprice;
  }
  public void setBaseprice(String baseprice) {
    this.baseprice = baseprice;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("priceOptions")
  public List<BuybackResponsePriceOptionsType> getPriceOptions() {
    return priceOptions;
  }
  public void setPriceOptions(List<BuybackResponsePriceOptionsType> priceOptions) {
    this.priceOptions = priceOptions;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuybackPriceResponseBO buybackPriceResponseBO = (BuybackPriceResponseBO) o;
    return Objects.equals(baseprice, buybackPriceResponseBO.baseprice) &&
        Objects.equals(priceOptions, buybackPriceResponseBO.priceOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseprice, priceOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuybackPriceResponseBO {\n");
    
    sb.append("    baseprice: ").append(toIndentedString(baseprice)).append("\n");
    sb.append("    priceOptions: ").append(toIndentedString(priceOptions)).append("\n");
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

