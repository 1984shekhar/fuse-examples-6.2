package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-03T06:50:37.550Z")
public class ChannelType   {
  
  private String localeID = null;
  private String typeID = null;
  private String clientID = null;
  private String locationCode = null;
  private String agent = null;
  private String channelType = null;
  private String note = null;
  private String noteLocaleID = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("localeID")
  public String getLocaleID() {
    return localeID;
  }
  public void setLocaleID(String localeID) {
    this.localeID = localeID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("typeID")
  public String getTypeID() {
    return typeID;
  }
  public void setTypeID(String typeID) {
    this.typeID = typeID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("clientID")
  public String getClientID() {
    return clientID;
  }
  public void setClientID(String clientID) {
    this.clientID = clientID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationCode")
  public String getLocationCode() {
    return locationCode;
  }
  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("agent")
  public String getAgent() {
    return agent;
  }
  public void setAgent(String agent) {
    this.agent = agent;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("channelType")
  public String getChannelType() {
    return channelType;
  }
  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("noteLocaleID")
  public String getNoteLocaleID() {
    return noteLocaleID;
  }
  public void setNoteLocaleID(String noteLocaleID) {
    this.noteLocaleID = noteLocaleID;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelType channelType = (ChannelType) o;
    return Objects.equals(localeID, channelType.localeID) &&
        Objects.equals(typeID, channelType.typeID) &&
        Objects.equals(clientID, channelType.clientID) &&
        Objects.equals(locationCode, channelType.locationCode) &&
        Objects.equals(agent, channelType.agent) &&
        Objects.equals(channelType, channelType.channelType) &&
        Objects.equals(note, channelType.note) &&
        Objects.equals(noteLocaleID, channelType.noteLocaleID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localeID, typeID, clientID, locationCode, agent, channelType, note, noteLocaleID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelType {\n");
    
    sb.append("    localeID: ").append(toIndentedString(localeID)).append("\n");
    sb.append("    typeID: ").append(toIndentedString(typeID)).append("\n");
    sb.append("    clientID: ").append(toIndentedString(clientID)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    noteLocaleID: ").append(toIndentedString(noteLocaleID)).append("\n");
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

