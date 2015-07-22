package com.capitalone.hack.XignitSuggestions;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "Date",
        "Time",
        "UTCOffset",
        "Volume",
        "Open",
        "High",
        "Low",
        "Last",
        "Close",
        "ChangeFromOpen",
        "PercentChangeFromOpen",
        "PreviousClose",
        "PreviousCloseDate",
        "ChangeFromPreviousClose",
        "PercentChangeFromPreviousClose"
})
public class Value {

    @JsonProperty("Date")
    private String Date;
    @JsonProperty("Time")
    private String Time;
    @JsonProperty("UTCOffset")
    private Integer UTCOffset;
    @JsonProperty("Volume")
    private Integer Volume;
    @JsonProperty("Open")
    private Double Open;
    @JsonProperty("High")
    private Double High;
    @JsonProperty("Low")
    private Double Low;
    @JsonProperty("Last")
    private Double Last;
    @JsonProperty("Close")
    private Double Close;
    @JsonProperty("ChangeFromOpen")
    private Integer ChangeFromOpen;
    @JsonProperty("PercentChangeFromOpen")
    private Integer PercentChangeFromOpen;
    @JsonProperty("PreviousClose")
    private Double PreviousClose;
    @JsonProperty("PreviousCloseDate")
    private String PreviousCloseDate;
    @JsonProperty("ChangeFromPreviousClose")
    private Double ChangeFromPreviousClose;
    @JsonProperty("PercentChangeFromPreviousClose")
    private Double PercentChangeFromPreviousClose;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The Date
     */
    @JsonProperty("Date")
    public String getDate() {
        return Date;
    }

    /**
     *
     * @param Date
     * The Date
     */
    @JsonProperty("Date")
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     *
     * @return
     * The Time
     */
    @JsonProperty("Time")
    public String getTime() {
        return Time;
    }

    /**
     *
     * @param Time
     * The Time
     */
    @JsonProperty("Time")
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     *
     * @return
     * The UTCOffset
     */
    @JsonProperty("UTCOffset")
    public Integer getUTCOffset() {
        return UTCOffset;
    }

    /**
     *
     * @param UTCOffset
     * The UTCOffset
     */
    @JsonProperty("UTCOffset")
    public void setUTCOffset(Integer UTCOffset) {
        this.UTCOffset = UTCOffset;
    }

    /**
     *
     * @return
     * The Volume
     */
    @JsonProperty("Volume")
    public Integer getVolume() {
        return Volume;
    }

    /**
     *
     * @param Volume
     * The Volume
     */
    @JsonProperty("Volume")
    public void setVolume(Integer Volume) {
        this.Volume = Volume;
    }

    /**
     *
     * @return
     * The Open
     */
    @JsonProperty("Open")
    public Double getOpen() {
        return Open;
    }

    /**
     *
     * @param Open
     * The Open
     */
    @JsonProperty("Open")
    public void setOpen(Double Open) {
        this.Open = Open;
    }

    /**
     *
     * @return
     * The High
     */
    @JsonProperty("High")
    public Double getHigh() {
        return High;
    }

    /**
     *
     * @param High
     * The High
     */
    @JsonProperty("High")
    public void setHigh(Double High) {
        this.High = High;
    }

    /**
     *
     * @return
     * The Low
     */
    @JsonProperty("Low")
    public Double getLow() {
        return Low;
    }

    /**
     *
     * @param Low
     * The Low
     */
    @JsonProperty("Low")
    public void setLow(Double Low) {
        this.Low = Low;
    }

    /**
     *
     * @return
     * The Last
     */
    @JsonProperty("Last")
    public Double getLast() {
        return Last;
    }

    /**
     *
     * @param Last
     * The Last
     */
    @JsonProperty("Last")
    public void setLast(Double Last) {
        this.Last = Last;
    }

    /**
     *
     * @return
     * The Close
     */
    @JsonProperty("Close")
    public Double getClose() {
        return Close;
    }

    /**
     *
     * @param Close
     * The Close
     */
    @JsonProperty("Close")
    public void setClose(Double Close) {
        this.Close = Close;
    }

    /**
     *
     * @return
     * The ChangeFromOpen
     */
    @JsonProperty("ChangeFromOpen")
    public Integer getChangeFromOpen() {
        return ChangeFromOpen;
    }

    /**
     *
     * @param ChangeFromOpen
     * The ChangeFromOpen
     */
    @JsonProperty("ChangeFromOpen")
    public void setChangeFromOpen(Integer ChangeFromOpen) {
        this.ChangeFromOpen = ChangeFromOpen;
    }

    /**
     *
     * @return
     * The PercentChangeFromOpen
     */
    @JsonProperty("PercentChangeFromOpen")
    public Integer getPercentChangeFromOpen() {
        return PercentChangeFromOpen;
    }

    /**
     *
     * @param PercentChangeFromOpen
     * The PercentChangeFromOpen
     */
    @JsonProperty("PercentChangeFromOpen")
    public void setPercentChangeFromOpen(Integer PercentChangeFromOpen) {
        this.PercentChangeFromOpen = PercentChangeFromOpen;
    }

    /**
     *
     * @return
     * The PreviousClose
     */
    @JsonProperty("PreviousClose")
    public Double getPreviousClose() {
        return PreviousClose;
    }

    /**
     *
     * @param PreviousClose
     * The PreviousClose
     */
    @JsonProperty("PreviousClose")
    public void setPreviousClose(Double PreviousClose) {
        this.PreviousClose = PreviousClose;
    }

    /**
     *
     * @return
     * The PreviousCloseDate
     */
    @JsonProperty("PreviousCloseDate")
    public String getPreviousCloseDate() {
        return PreviousCloseDate;
    }

    /**
     *
     * @param PreviousCloseDate
     * The PreviousCloseDate
     */
    @JsonProperty("PreviousCloseDate")
    public void setPreviousCloseDate(String PreviousCloseDate) {
        this.PreviousCloseDate = PreviousCloseDate;
    }

    /**
     *
     * @return
     * The ChangeFromPreviousClose
     */
    @JsonProperty("ChangeFromPreviousClose")
    public Double getChangeFromPreviousClose() {
        return ChangeFromPreviousClose;
    }

    /**
     *
     * @param ChangeFromPreviousClose
     * The ChangeFromPreviousClose
     */
    @JsonProperty("ChangeFromPreviousClose")
    public void setChangeFromPreviousClose(Double ChangeFromPreviousClose) {
        this.ChangeFromPreviousClose = ChangeFromPreviousClose;
    }

    /**
     *
     * @return
     * The PercentChangeFromPreviousClose
     */
    @JsonProperty("PercentChangeFromPreviousClose")
    public Double getPercentChangeFromPreviousClose() {
        return PercentChangeFromPreviousClose;
    }

    /**
     *
     * @param PercentChangeFromPreviousClose
     * The PercentChangeFromPreviousClose
     */
    @JsonProperty("PercentChangeFromPreviousClose")
    public void setPercentChangeFromPreviousClose(Double PercentChangeFromPreviousClose) {
        this.PercentChangeFromPreviousClose = PercentChangeFromPreviousClose;
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
