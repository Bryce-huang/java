/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.V1LabelSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
 */
@ApiModel(description = "PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.")

public class V1beta1PodDisruptionBudgetSpec {
  @SerializedName("minAvailable")
  private String minAvailable = null;

  @SerializedName("selector")
  private V1LabelSelector selector = null;

  public V1beta1PodDisruptionBudgetSpec minAvailable(String minAvailable) {
    this.minAvailable = minAvailable;
    return this;
  }

   /**
   * An eviction is allowed if at least \"minAvailable\" pods selected by \"selector\" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying \"100%\".
   * @return minAvailable
  **/
  @ApiModelProperty(example = "null", value = "An eviction is allowed if at least \"minAvailable\" pods selected by \"selector\" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying \"100%\".")
  public String getMinAvailable() {
    return minAvailable;
  }

  public void setMinAvailable(String minAvailable) {
    this.minAvailable = minAvailable;
  }

  public V1beta1PodDisruptionBudgetSpec selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Label query over pods whose evictions are managed by the disruption budget.
   * @return selector
  **/
  @ApiModelProperty(example = "null", value = "Label query over pods whose evictions are managed by the disruption budget.")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1PodDisruptionBudgetSpec v1beta1PodDisruptionBudgetSpec = (V1beta1PodDisruptionBudgetSpec) o;
    return Objects.equals(this.minAvailable, v1beta1PodDisruptionBudgetSpec.minAvailable) &&
        Objects.equals(this.selector, v1beta1PodDisruptionBudgetSpec.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minAvailable, selector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1PodDisruptionBudgetSpec {\n");
    
    sb.append("    minAvailable: ").append(toIndentedString(minAvailable)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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
