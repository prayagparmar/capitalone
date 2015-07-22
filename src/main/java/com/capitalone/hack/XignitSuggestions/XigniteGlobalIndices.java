


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
        "IndexName",
        "Symbol",
        "IndexGroup",
        "Valoren",
        "Currency"
})
public class XigniteGlobalIndices {

    @JsonProperty("Outcome")
    private String Outcome;
    @JsonProperty("Message")
    private Object Message;
    @JsonProperty("Identity")
    private String Identity;
    @JsonProperty("Delay")
    private Double Delay;
    @JsonProperty("IndexName")
    private String IndexName;
    @JsonProperty("Symbol")
    private String Symbol;
    @JsonProperty("IndexGroup")
    private String IndexGroup;
    @JsonProperty("Valoren")
    private Integer Valoren;
    @JsonProperty("Currency")
    private String Currency;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The Outcome
     */
    @JsonProperty("Outcome")
    public String getOutcome() {
        return Outcome;
    }

    /**
     * @param Outcome The Outcome
     */
    @JsonProperty("Outcome")
    public void setOutcome(String Outcome) {
        this.Outcome = Outcome;
    }

    /**
     * @return The Message
     */
    @JsonProperty("Message")
    public Object getMessage() {
        return Message;
    }

    /**
     * @param Message The Message
     */
    @JsonProperty("Message")
    public void setMessage(Object Message) {
        this.Message = Message;
    }

    /**
     * @return The Identity
     */
    @JsonProperty("Identity")
    public String getIdentity() {
        return Identity;
    }

    /**
     * @param Identity The Identity
     */
    @JsonProperty("Identity")
    public void setIdentity(String Identity) {
        this.Identity = Identity;
    }

    /**
     * @return The Delay
     */
    @JsonProperty("Delay")
    public Double getDelay() {
        return Delay;
    }

    /**
     * @param Delay The Delay
     */
    @JsonProperty("Delay")
    public void setDelay(Double Delay) {
        this.Delay = Delay;
    }

    /**
     * @return The IndexName
     */
    @JsonProperty("IndexName")
    public String getIndexName() {
        return IndexName;
    }

    /**
     * @param IndexName The IndexName
     */
    @JsonProperty("IndexName")
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * @return The Symbol
     */
    @JsonProperty("Symbol")
    public String getSymbol() {
        return Symbol;
    }

    /**
     * @param Symbol The Symbol
     */
    @JsonProperty("Symbol")
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * @return The IndexGroup
     */
    @JsonProperty("IndexGroup")
    public String getIndexGroup() {
        return IndexGroup;
    }

    /**
     * @param IndexGroup The IndexGroup
     */
    @JsonProperty("IndexGroup")
    public void setIndexGroup(String IndexGroup) {
        this.IndexGroup = IndexGroup;
    }

    /**
     * @return The Valoren
     */
    @JsonProperty("Valoren")
    public Integer getValoren() {
        return Valoren;
    }

    /**
     * @param Valoren The Valoren
     */
    @JsonProperty("Valoren")
    public void setValoren(Integer Valoren) {
        this.Valoren = Valoren;
    }

    /**
     * @return The Currency
     */
    @JsonProperty("Currency")
    public String getCurrency() {
        return Currency;
    }

    /**
     * @param Currency The Currency
     */
    @JsonProperty("Currency")
    public void setCurrency(String Currency) {
        this.Currency = Currency;
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

