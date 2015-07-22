package com.capitalone.hack.XignitSuggestions;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "IndexName",
        "Symbol",
        "IndexGroup",
        "Valoren",
        "Currency"
})
public class Index {

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
     *
     * @return
     * The IndexName
     */
    @JsonProperty("IndexName")
    public String getIndexName() {
        return IndexName;
    }

    /**
     *
     * @param IndexName
     * The IndexName
     */
    @JsonProperty("IndexName")
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     *
     * @return
     * The Symbol
     */
    @JsonProperty("Symbol")
    public String getSymbol() {
        return Symbol;
    }

    /**
     *
     * @param Symbol
     * The Symbol
     */
    @JsonProperty("Symbol")
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     *
     * @return
     * The IndexGroup
     */
    @JsonProperty("IndexGroup")
    public String getIndexGroup() {
        return IndexGroup;
    }

    /**
     *
     * @param IndexGroup
     * The IndexGroup
     */
    @JsonProperty("IndexGroup")
    public void setIndexGroup(String IndexGroup) {
        this.IndexGroup = IndexGroup;
    }

    /**
     *
     * @return
     * The Valoren
     */
    @JsonProperty("Valoren")
    public Integer getValoren() {
        return Valoren;
    }

    /**
     *
     * @param Valoren
     * The Valoren
     */
    @JsonProperty("Valoren")
    public void setValoren(Integer Valoren) {
        this.Valoren = Valoren;
    }

    /**
     *
     * @return
     * The Currency
     */
    @JsonProperty("Currency")
    public String getCurrency() {
        return Currency;
    }

    /**
     *
     * @param Currency
     * The Currency
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