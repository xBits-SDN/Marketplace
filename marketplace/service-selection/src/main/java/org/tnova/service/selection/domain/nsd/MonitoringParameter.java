
package org.tnova.service.selection.domain.nsd;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "desc",
    "metric",
    "unit"
})
public class MonitoringParameter {

    @JsonProperty("desc")
    private String desc;
    @JsonProperty("metric")
    private String metric;
    @JsonProperty("unit")
    private String unit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MonitoringParameter() {
    }

    /**
     * 
     * @param unit
     * @param desc
     * @param metric
     */
    public MonitoringParameter(String desc, String metric, String unit) {
        this.desc = desc;
        this.metric = metric;
        this.unit = unit;
    }

    /**
     * 
     * @return
     *     The desc
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * 
     * @param desc
     *     The desc
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public MonitoringParameter withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 
     * @return
     *     The metric
     */
    @JsonProperty("metric")
    public String getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The metric
     */
    @JsonProperty("metric")
    public void setMetric(String metric) {
        this.metric = metric;
    }

    public MonitoringParameter withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * 
     * @return
     *     The unit
     */
    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    /**
     * 
     * @param unit
     *     The unit
     */
    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public MonitoringParameter withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public MonitoringParameter withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(desc).append(metric).append(unit).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MonitoringParameter) == false) {
            return false;
        }
        MonitoringParameter rhs = ((MonitoringParameter) other);
        return new EqualsBuilder().append(desc, rhs.desc).append(metric, rhs.metric).append(unit, rhs.unit).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
