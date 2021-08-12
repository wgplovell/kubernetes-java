/*
Copyright 2021 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** FlowSchemaStatus represents the current state of a FlowSchema. */
@ApiModel(description = "FlowSchemaStatus represents the current state of a FlowSchema.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-01-04T09:55:14.976Z[Etc/UTC]")
public class V1alpha1FlowSchemaStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1alpha1FlowSchemaCondition> conditions = null;

  public V1alpha1FlowSchemaStatus conditions(List<V1alpha1FlowSchemaCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1alpha1FlowSchemaStatus addConditionsItem(V1alpha1FlowSchemaCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * &#x60;conditions&#x60; is a list of the current states of FlowSchema.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`conditions` is a list of the current states of FlowSchema.")
  public List<V1alpha1FlowSchemaCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1alpha1FlowSchemaCondition> conditions) {
    this.conditions = conditions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1FlowSchemaStatus v1alpha1FlowSchemaStatus = (V1alpha1FlowSchemaStatus) o;
    return Objects.equals(this.conditions, v1alpha1FlowSchemaStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1FlowSchemaStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
