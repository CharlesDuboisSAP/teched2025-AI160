/*
 * Copyright (c) 2025 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.generated.namespaces.purchaseorder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import com.sap.generated.namespaces.purchaseorder.field.PurchaseOrderScheduleLineField;
import com.sap.generated.namespaces.purchaseorder.selectable.PurchaseOrderScheduleLineSelectable;
import com.sap.generated.services.PurchaseOrderService;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.time.LocalDateTime;
import java.util.Map;


/**
 * Schedule Lines<p></p><p>Original entity name from the Odata EDM: <b>A_PurchaseOrderScheduleLineType</b></p>
 * 
 */
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class PurchaseOrderScheduleLine
    extends VdmEntity<PurchaseOrderScheduleLine>
{

    /**
     * Selector for all available fields of PurchaseOrderScheduleLine.
     * 
     */
    public final static PurchaseOrderScheduleLineSelectable ALL_FIELDS = () -> "*";
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ScheduleLineDeliveryDate</b></p>
     * 
     * @return
     *     Item Delivery Date
     */
    @SerializedName("ScheduleLineDeliveryDate")
    @JsonProperty("ScheduleLineDeliveryDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ScheduleLineDeliveryDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime scheduleLineDeliveryDate;
    /**
     * Use with available fluent helpers to apply the <b>ScheduleLineDeliveryDate</b> field to query operations.
     * 
     */
    public final static PurchaseOrderScheduleLineField<LocalDateTime> SCHEDULE_LINE_DELIVERY_DATE = new PurchaseOrderScheduleLineField<LocalDateTime>("ScheduleLineDeliveryDate");

    public PurchaseOrderScheduleLine(@Nullable LocalDateTime scheduleLineDeliveryDate) {
        this.scheduleLineDeliveryDate = scheduleLineDeliveryDate;
    }

    public PurchaseOrderScheduleLine() {
    }

    public static PurchaseOrderScheduleLineBuilder builder() {
        return new PurchaseOrderScheduleLineBuilder();
    }

    @Nonnull
    @Override
    public Class<PurchaseOrderScheduleLine> getType() {
        return PurchaseOrderScheduleLine.class;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ScheduleLineDeliveryDate</b></p>
     * 
     * @param scheduleLineDeliveryDate
     *     Item Delivery Date
     */
    public void setScheduleLineDeliveryDate(
        @Nullable
        final LocalDateTime scheduleLineDeliveryDate) {
        rememberChangedField("ScheduleLineDeliveryDate", this.scheduleLineDeliveryDate);
        this.scheduleLineDeliveryDate = scheduleLineDeliveryDate;
    }

    @Override
    protected String getEntityCollection() {
        return "A_PurchaseOrderScheduleLine";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newLinkedHashMap();
        result.put("PurchasingDocument", "");
        result.put("PurchasingDocumentItem", "");
        result.put("ScheduleLine", "0001");
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> cloudSdkValues = super.toMapOfFields();
        cloudSdkValues.put("PurchasingDocument", "");
        cloudSdkValues.put("PurchasingDocumentItem", "");
        cloudSdkValues.put("ScheduleLineDeliveryDate", getScheduleLineDeliveryDate());
        return cloudSdkValues;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> cloudSdkValues = Maps.newLinkedHashMap(inputValues);
        // simple properties
        {
            if (cloudSdkValues.containsKey("ScheduleLineDeliveryDate")) {
                final Object value = cloudSdkValues.remove("ScheduleLineDeliveryDate");
                if ((value == null)||(!value.equals(getScheduleLineDeliveryDate()))) {
                    setScheduleLineDeliveryDate(((LocalDateTime) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
        }
        super.fromMap(cloudSdkValues);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param fieldType
     *     The Java type to use for the extension field when performing value comparisons.
     * @return
     *     A representation of an extension field from this entity.
     */
    @Nonnull
    public static<T > PurchaseOrderScheduleLineField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new PurchaseOrderScheduleLineField<T>(fieldName);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param typeConverter
     *     A TypeConverter<T, DomainT> instance whose first generic type matches the Java type of the field
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param <DomainT>
     *     The type of the extension field as returned by the OData service.
     * @return
     *     A representation of an extension field from this entity, holding a reference to the given TypeConverter.
     */
    @Nonnull
    public static<T,DomainT > PurchaseOrderScheduleLineField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new PurchaseOrderScheduleLineField<T>(fieldName, typeConverter);
    }

    @Override
    @Nullable
    public Destination getDestinationForFetch() {
        return super.getDestinationForFetch();
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

    @Override
    public void attachToService(
        @Nullable
        final String servicePath,
        @Nonnull
        final Destination destination) {
        super.attachToService(servicePath, destination);
    }

    @Override
    protected String getDefaultServicePath() {
        return (PurchaseOrderService.DEFAULT_SERVICE_PATH);
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfNavigationProperties() {
        final Map<String, Object> cloudSdkValues = super.toMapOfNavigationProperties();
        return cloudSdkValues;
    }

    @Nullable
    public LocalDateTime getScheduleLineDeliveryDate() {
        return this.scheduleLineDeliveryDate;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PurchaseOrderScheduleLine)) return false;
        final PurchaseOrderScheduleLine other = (PurchaseOrderScheduleLine) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$scheduleLineDeliveryDate = this.scheduleLineDeliveryDate;
        final Object other$scheduleLineDeliveryDate = other.scheduleLineDeliveryDate;
        if (this$scheduleLineDeliveryDate == null ? other$scheduleLineDeliveryDate != null : !this$scheduleLineDeliveryDate.equals(other$scheduleLineDeliveryDate))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PurchaseOrderScheduleLine;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $scheduleLineDeliveryDate = this.scheduleLineDeliveryDate;
        result = result * PRIME + ($scheduleLineDeliveryDate == null ? 43 : $scheduleLineDeliveryDate.hashCode());
        return result;
    }

    public String toString() {
        return "PurchaseOrderScheduleLine(super=" + super.toString() + ", scheduleLineDeliveryDate=" + this.scheduleLineDeliveryDate + ")";
    }

    /**
     * Helper class to allow for fluent creation of PurchaseOrderScheduleLine instances.
     * 
     */
    public final static class PurchaseOrderScheduleLineBuilder {
        private LocalDateTime scheduleLineDeliveryDate;

        PurchaseOrderScheduleLineBuilder() {
        }

        @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
        @JsonProperty("ScheduleLineDeliveryDate")
        public PurchaseOrderScheduleLineBuilder scheduleLineDeliveryDate(LocalDateTime scheduleLineDeliveryDate) {
            this.scheduleLineDeliveryDate = scheduleLineDeliveryDate;
            return this;
        }

        public PurchaseOrderScheduleLine build() {
            return new PurchaseOrderScheduleLine(this.scheduleLineDeliveryDate);
        }

        public String toString() {
            return "PurchaseOrderScheduleLine.PurchaseOrderScheduleLineBuilder(scheduleLineDeliveryDate=" + this.scheduleLineDeliveryDate + ")";
        }
    }

}
