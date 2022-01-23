package com.translator.deutsch.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Datos de una persona relacionada con el hecho
 */
@ApiModel(description = "Datos de una persona relacionada con el hecho")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-23T21:25:46.344001600+01:00[Europe/Madrid]")

public class TranslateDataDTO   {
  @JsonProperty("wordType")
  private String wordType;

  @JsonProperty("translation")
  private String translation;

  public TranslateDataDTO wordType(String wordType) {
    this.wordType = wordType;
    return this;
  }

  /**
   * Tipo de palabra
   * @return wordType
  */
  @ApiModelProperty(example = "Sustantivo", value = "Tipo de palabra")


  public String getWordType() {
    return wordType;
  }

  public void setWordType(String wordType) {
    this.wordType = wordType;
  }

  public TranslateDataDTO translation(String translation) {
    this.translation = translation;
    return this;
  }

  /**
   * traducción de la palabra
   * @return translation
  */
  @ApiModelProperty(example = "Hombre", value = "traducción de la palabra")


  public String getTranslation() {
    return translation;
  }

  public void setTranslation(String translation) {
    this.translation = translation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslateDataDTO translateDataDTO = (TranslateDataDTO) o;
    return Objects.equals(this.wordType, translateDataDTO.wordType) &&
        Objects.equals(this.translation, translateDataDTO.translation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wordType, translation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslateDataDTO {\n");
    
    sb.append("    wordType: ").append(toIndentedString(wordType)).append("\n");
    sb.append("    translation: ").append(toIndentedString(translation)).append("\n");
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

