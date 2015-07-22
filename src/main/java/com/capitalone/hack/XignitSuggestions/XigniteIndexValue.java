
package com.capitalone.hack.XignitSuggestions;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "Outcome",
        "Message",
        "Identity",
        "Delay",
        "Index",
        "Value"
})
public class XigniteIndexValue {

    @JsonProperty("Outcome")
    private String Outcome;
    @JsonProperty("Message")
    private Object Message;
    @JsonProperty("Identity")
    private String Identity;
    @JsonProperty("Delay")
    private Double Delay;
    @JsonProperty("Index")
    private com.capitalone.hack.XignitSuggestions.Index Index;
    @JsonProperty("Value")
    private com.capitalone.hack.XignitSuggestions.Value Value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The Outcome
     */
    @JsonProperty("Outcome")
    public String getOutcome() {
        return Outcome;
    }

    /**
     *
     * @param Outcome
     * The Outcome
     */
    @JsonProperty("Outcome")
    public void setOutcome(String Outcome) {
        this.Outcome = Outcome;
    }

    /**
     *
     * @return
     * The Message
     */
    @JsonProperty("Message")
    public Object getMessage() {
        return Message;
    }

    /**
     *
     * @param Message
     * The Message
     */
    @JsonProperty("Message")
    public void setMessage(Object Message) {
        this.Message = Message;
    }

    /**
     *
     * @return
     * The Identity
     */
    @JsonProperty("Identity")
    public String getIdentity() {
        return Identity;
    }

    /**
     *
     * @param Identity
     * The Identity
     */
    @JsonProperty("Identity")
    public void setIdentity(String Identity) {
        this.Identity = Identity;
    }

    /**
     *
     * @return
     * The Delay
     */
    @JsonProperty("Delay")
    public Double getDelay() {
        return Delay;
    }

    /**
     *
     * @param Delay
     * The Delay
     */
    @JsonProperty("Delay")
    public void setDelay(Double Delay) {
        this.Delay = Delay;
    }

    /**
     *
     * @return
     * The Index
     */
    @JsonProperty("Index")
    public com.capitalone.hack.XignitSuggestions.Index getIndex() {
        return Index;
    }

    /**
     *
     * @param Index
     * The Index
     */
    @JsonProperty("Index")
    public void setIndex(com.capitalone.hack.XignitSuggestions.Index Index) {
        this.Index = Index;
    }

    /**
     *
     * @return
     * The Value
     */
    @JsonProperty("Value")
    public com.capitalone.hack.XignitSuggestions.Value getValue() {
        return Value;
    }

    /**
     *
     * @param Value
     * The Value
     */
    @JsonProperty("Value")
    public void setValue(com.capitalone.hack.XignitSuggestions.Value Value) {
        this.Value = Value;
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

}