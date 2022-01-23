package com.translator.deutsch.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Listado de significados que puede tener una palabra
 */
@ApiModel(description = "Listado de significados que puede tener una palabra")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-23T21:25:46.344001600+01:00[Europe/Madrid]")

public class WordDataDTO   {
  @JsonProperty("incidentId")
  private String incidentId;

  @JsonProperty("translationList")
  @Valid
  private List<TranslateDataDTO> translationList = null;

  public WordDataDTO incidentId(String incidentId) {
    this.incidentId = incidentId;
    return this;
  }

  /**
   * Id referencia del hecho
   * @return incidentId
  */
  @ApiModelProperty(example = "12345", value = "Id referencia del hecho")


  public String getIncidentId() {
    return incidentId;
  }

  public void setIncidentId(String incidentId) {
    this.incidentId = incidentId;
  }

  public WordDataDTO translationList(List<TranslateDataDTO> translationList) {
    this.translationList = translationList;
    return this;
  }

  public WordDataDTO addTranslationListItem(TranslateDataDTO translationListItem) {
    if (this.translationList == null) {
      this.translationList = new ArrayList<>();
    }
    this.translationList.add(translationListItem);
    return this;
  }

  /**
   * Lista de significados que puede tener una palabra
   * @return translationList
  */
  @ApiModelProperty(value = "Lista de significados que puede tener una palabra")

  @Valid
@Size(min=1) 
  public List<TranslateDataDTO> getTranslationList() {
    return translationList;
  }

  public void setTranslationList(List<TranslateDataDTO> translationList) {
    this.translationList = translationList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WordDataDTO wordDataDTO = (WordDataDTO) o;
    return Objects.equals(this.incidentId, wordDataDTO.incidentId) &&
        Objects.equals(this.translationList, wordDataDTO.translationList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incidentId, translationList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordDataDTO {\n");
    
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    translationList: ").append(toIndentedString(translationList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

