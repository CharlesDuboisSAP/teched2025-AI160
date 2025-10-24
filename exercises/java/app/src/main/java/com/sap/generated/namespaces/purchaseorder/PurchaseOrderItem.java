/*
 * Copyright (c) 2025 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.sap.generated.namespaces.purchaseorder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.datamodel.odata.client.exception.ODataException;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import com.sap.generated.namespaces.purchaseorder.field.PurchaseOrderItemField;
import com.sap.generated.namespaces.purchaseorder.link.PurchaseOrderItemLink;
import com.sap.generated.namespaces.purchaseorder.selectable.PurchaseOrderItemSelectable;
import com.sap.generated.services.PurchaseOrderService;
import io.vavr.control.Option;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


/**
 * Item<p></p><p>Original entity name from the Odata EDM: <b>A_PurchaseOrderItemType</b></p>
 * 
 */
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class PurchaseOrderItem
    extends VdmEntity<PurchaseOrderItem>
{

    /**
     * Selector for all available fields of PurchaseOrderItem.
     * 
     */
    public final static PurchaseOrderItemSelectable ALL_FIELDS = () -> "*";
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>PurchaseOrder</b></p>
     * 
     * @return
     *     Purchase Order Number
     */
    @Key
    @SerializedName("PurchaseOrder")
    @JsonProperty("PurchaseOrder")
    @Nullable
    @ODataField(odataName = "PurchaseOrder")
    private String purchaseOrder;
    /**
     * Use with available fluent helpers to apply the <b>PurchaseOrder</b> field to query operations.
     * 
     */
    public final static PurchaseOrderItemField<String> PURCHASE_ORDER = new PurchaseOrderItemField<String>("PurchaseOrder");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>PurchaseOrderItem</b></p>
     * 
     * @return
     *     Item Number of Purchase Order
     */
    @Key
    @SerializedName("PurchaseOrderItem")
    @JsonProperty("PurchaseOrderItem")
    @Nullable
    @ODataField(odataName = "PurchaseOrderItem")
    private String purchaseOrderItem;
    /**
     * Use with available fluent helpers to apply the <b>PurchaseOrderItem</b> field to query operations.
     * 
     */
    public final static PurchaseOrderItemField<String> PURCHASE_ORDER_ITEM = new PurchaseOrderItemField<String>("PurchaseOrderItem");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>PurchaseOrderItemText</b></p>
     * 
     * @return
     *     Short Text
     */
    @SerializedName("PurchaseOrderItemText")
    @JsonProperty("PurchaseOrderItemText")
    @Nullable
    @ODataField(odataName = "PurchaseOrderItemText")
    private String purchaseOrderItemText;
    /**
     * Use with available fluent helpers to apply the <b>PurchaseOrderItemText</b> field to query operations.
     * 
     */
    public final static PurchaseOrderItemField<String> PURCHASE_ORDER_ITEM_TEXT = new PurchaseOrderItemField<String>("PurchaseOrderItemText");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>Plant</b></p>
     * 
     * @return
     *     Plant
     */
    @SerializedName("Plant")
    @JsonProperty("Plant")
    @Nullable
    @ODataField(odataName = "Plant")
    private String plant;
    /**
     * Use with available fluent helpers to apply the <b>Plant</b> field to query operations.
     * 
     */
    public final static PurchaseOrderItemField<String> PLANT = new PurchaseOrderItemField<String>("Plant");
    /**
     * Constraints: Not nullable, Precision: 13, Scale: 3 <p>Original property name from the Odata EDM: <b>OrderQuantity</b></p>
     * 
     * @return
     *     Purchase Order Quantity
     */
    @SerializedName("OrderQuantity")
    @JsonProperty("OrderQuantity")
    @Nullable
    @ODataField(odataName = "OrderQuantity")
    private BigDecimal orderQuantity;
    /**
     * Use with available fluent helpers to apply the <b>OrderQuantity</b> field to query operations.
     * 
     */
    public final static PurchaseOrderItemField<BigDecimal> ORDER_QUANTITY = new PurchaseOrderItemField<BigDecimal>("OrderQuantity");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>DeliveryAddressCityName</b></p>
     * 
     * @return
     *     City
     */
    @SerializedName("DeliveryAddressCityName")
    @JsonProperty("DeliveryAddressCityName")
    @Nullable
    @ODataField(odataName = "DeliveryAddressCityName")
    private String deliveryAddressCityName;
    /**
     * Use with available fluent helpers to apply the <b>DeliveryAddressCityName</b> field to query operations.
     * 
     */
    public final static PurchaseOrderItemField<String> DELIVERY_ADDRESS_CITY_NAME = new PurchaseOrderItemField<String>("DeliveryAddressCityName");
    /**
     * Navigation property <b>to_PurchaseOrderItemNote</b> for <b>PurchaseOrderItem</b> to multiple <b>PurchaseOrderItemNote</b>.
     * 
     */
    @SerializedName("to_PurchaseOrderItemNote")
    @JsonProperty("to_PurchaseOrderItemNote")
    @ODataField(odataName = "to_PurchaseOrderItemNote")
    private List<PurchaseOrderItemNote> toPurchaseOrderItemNote;
    /**
     * Navigation property <b>to_ScheduleLine</b> for <b>PurchaseOrderItem</b> to multiple <b>PurchaseOrderScheduleLine</b>.
     * 
     */
    @SerializedName("to_ScheduleLine")
    @JsonProperty("to_ScheduleLine")
    @ODataField(odataName = "to_ScheduleLine")
    private List<PurchaseOrderScheduleLine> toScheduleLine;
    /**
     * Use with available fluent helpers to apply the <b>to_PurchaseOrderItemNote</b> navigation property to query operations.
     * 
     */
    public final static PurchaseOrderItemLink<PurchaseOrderItemNote> TO_PURCHASE_ORDER_ITEM_NOTE = new PurchaseOrderItemLink<PurchaseOrderItemNote>("to_PurchaseOrderItemNote");
    /**
     * Use with available fluent helpers to apply the <b>to_ScheduleLine</b> navigation property to query operations.
     * 
     */
    public final static PurchaseOrderItemLink<PurchaseOrderScheduleLine> TO_SCHEDULE_LINE = new PurchaseOrderItemLink<PurchaseOrderScheduleLine>("to_ScheduleLine");

    public PurchaseOrderItem(@Nullable String purchaseOrder, @Nullable String purchaseOrderItem, @Nullable String purchaseOrderItemText, @Nullable String plant, @Nullable BigDecimal orderQuantity, @Nullable String deliveryAddressCityName, List<PurchaseOrderItemNote> toPurchaseOrderItemNote, List<PurchaseOrderScheduleLine> toScheduleLine) {
        this.purchaseOrder = purchaseOrder;
        this.purchaseOrderItem = purchaseOrderItem;
        this.purchaseOrderItemText = purchaseOrderItemText;
        this.plant = plant;
        this.orderQuantity = orderQuantity;
        this.deliveryAddressCityName = deliveryAddressCityName;
        this.toPurchaseOrderItemNote = toPurchaseOrderItemNote;
        this.toScheduleLine = toScheduleLine;
    }

    public PurchaseOrderItem() {
    }

    public static PurchaseOrderItemBuilder builder() {
        return new PurchaseOrderItemBuilder();
    }

    @Nonnull
    @Override
    public Class<PurchaseOrderItem> getType() {
        return PurchaseOrderItem.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>PurchaseOrder</b></p>
     * 
     * @param purchaseOrder
     *     Purchase Order Number
     */
    public void setPurchaseOrder(
        @Nullable
        final String purchaseOrder) {
        rememberChangedField("PurchaseOrder", this.purchaseOrder);
        this.purchaseOrder = purchaseOrder;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>PurchaseOrderItem</b></p>
     * 
     * @param purchaseOrderItem
     *     Item Number of Purchase Order
     */
    public void setPurchaseOrderItem(
        @Nullable
        final String purchaseOrderItem) {
        rememberChangedField("PurchaseOrderItem", this.purchaseOrderItem);
        this.purchaseOrderItem = purchaseOrderItem;
    }


    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>PurchaseOrderItemText</b></p>
     * 
     * @param purchaseOrderItemText
     *     Short Text
     */
    public void setPurchaseOrderItemText(
        @Nullable
        final String purchaseOrderItemText) {
        rememberChangedField("PurchaseOrderItemText", this.purchaseOrderItemText);
        this.purchaseOrderItemText = purchaseOrderItemText;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>Plant</b></p>
     * 
     * @param plant
     *     Plant
     */
    public void setPlant(
        @Nullable
        final String plant) {
        rememberChangedField("Plant", this.plant);
        this.plant = plant;
    }

    /**
     * Constraints: Not nullable, Precision: 13, Scale: 3 <p>Original property name from the Odata EDM: <b>OrderQuantity</b></p>
     * 
     * @param orderQuantity
     *     Purchase Order Quantity
     */
    public void setOrderQuantity(
        @Nullable
        final BigDecimal orderQuantity) {
        rememberChangedField("OrderQuantity", this.orderQuantity);
        this.orderQuantity = orderQuantity;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>DeliveryAddressCityName</b></p>
     * 
     * @param deliveryAddressCityName
     *     City
     */
    public void setDeliveryAddressCityName(
        @Nullable
        final String deliveryAddressCityName) {
        rememberChangedField("DeliveryAddressCityName", this.deliveryAddressCityName);
        this.deliveryAddressCityName = deliveryAddressCityName;
    }


    @Override
    protected String getEntityCollection() {
        return "A_PurchaseOrderItem";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newLinkedHashMap();
        result.put("PurchaseOrder", getPurchaseOrder());
        result.put("PurchaseOrderItem", getPurchaseOrderItem());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> cloudSdkValues = super.toMapOfFields();
        cloudSdkValues.put("PurchaseOrder", getPurchaseOrder());
        cloudSdkValues.put("PurchaseOrderItem", getPurchaseOrderItem());
        cloudSdkValues.put("PurchaseOrderItemText", getPurchaseOrderItemText());
        cloudSdkValues.put("Plant", getPlant());
        cloudSdkValues.put("OrderQuantity", getOrderQuantity());
        cloudSdkValues.put("DeliveryAddressCityName", getDeliveryAddressCityName());
        return cloudSdkValues;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> cloudSdkValues = Maps.newLinkedHashMap(inputValues);
        // simple properties
        {
            if (cloudSdkValues.containsKey("PurchaseOrder")) {
                final Object value = cloudSdkValues.remove("PurchaseOrder");
                if ((value == null)||(!value.equals(getPurchaseOrder()))) {
                    setPurchaseOrder(((String) value));
                }
            }
            if (cloudSdkValues.containsKey("PurchaseOrderItem")) {
                final Object value = cloudSdkValues.remove("PurchaseOrderItem");
                if ((value == null)||(!value.equals(getPurchaseOrderItem()))) {
                    setPurchaseOrderItem(((String) value));
                }
            }
            if (cloudSdkValues.containsKey("PurchaseOrderItemText")) {
                final Object value = cloudSdkValues.remove("PurchaseOrderItemText");
                if ((value == null)||(!value.equals(getPurchaseOrderItemText()))) {
                    setPurchaseOrderItemText(((String) value));
                }
            }
            if (cloudSdkValues.containsKey("Plant")) {
                final Object value = cloudSdkValues.remove("Plant");
                if ((value == null)||(!value.equals(getPlant()))) {
                    setPlant(((String) value));
                }
            }
            if (cloudSdkValues.containsKey("OrderQuantity")) {
                final Object value = cloudSdkValues.remove("OrderQuantity");
                if ((value == null)||(!value.equals(getOrderQuantity()))) {
                    setOrderQuantity(((BigDecimal) value));
                }
            }
            if (cloudSdkValues.containsKey("DeliveryAddressCityName")) {
                final Object value = cloudSdkValues.remove("DeliveryAddressCityName");
                if ((value == null)||(!value.equals(getDeliveryAddressCityName()))) {
                    setDeliveryAddressCityName(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((cloudSdkValues).containsKey("to_PurchaseOrderItemNote")) {
                final Object cloudSdkValue = (cloudSdkValues).remove("to_PurchaseOrderItemNote");
                if (cloudSdkValue instanceof Iterable) {
                    if (toPurchaseOrderItemNote == null) {
                        toPurchaseOrderItemNote = Lists.newArrayList();
                    } else {
                        toPurchaseOrderItemNote = Lists.newArrayList(toPurchaseOrderItemNote);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) cloudSdkValue)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        PurchaseOrderItemNote entity;
                        if (toPurchaseOrderItemNote.size()>i) {
                            entity = toPurchaseOrderItemNote.get(i);
                        } else {
                            entity = new PurchaseOrderItemNote();
                            toPurchaseOrderItemNote.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((cloudSdkValues).containsKey("to_ScheduleLine")) {
                final Object cloudSdkValue = (cloudSdkValues).remove("to_ScheduleLine");
                if (cloudSdkValue instanceof Iterable) {
                    if (toScheduleLine == null) {
                        toScheduleLine = Lists.newArrayList();
                    } else {
                        toScheduleLine = Lists.newArrayList(toScheduleLine);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) cloudSdkValue)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        PurchaseOrderScheduleLine entity;
                        if (toScheduleLine.size()>i) {
                            entity = toScheduleLine.get(i);
                        } else {
                            entity = new PurchaseOrderScheduleLine();
                            toScheduleLine.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
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
    public static<T > PurchaseOrderItemField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new PurchaseOrderItemField<T>(fieldName);
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
    public static<T,DomainT > PurchaseOrderItemField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new PurchaseOrderItemField<T>(fieldName, typeConverter);
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
        if (toPurchaseOrderItemNote!= null) {
            (cloudSdkValues).put("to_PurchaseOrderItemNote", toPurchaseOrderItemNote);
        }
        if (toScheduleLine!= null) {
            (cloudSdkValues).put("to_ScheduleLine", toScheduleLine);
        }
        return cloudSdkValues;
    }

    /**
     * Fetches the <b>PurchaseOrderItemNote</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_PurchaseOrderItemNote</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>PurchaseOrderItemNote</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<PurchaseOrderItemNote> fetchPurchaseOrderItemNote() {
        return fetchFieldAsList("to_PurchaseOrderItemNote", PurchaseOrderItemNote.class);
    }

    /**
     * Retrieval of associated <b>PurchaseOrderItemNote</b> entities (one to many). This corresponds to the OData navigation property <b>to_PurchaseOrderItemNote</b>.
     * <p>
     * If the navigation property <b>to_PurchaseOrderItemNote</b> of a queried <b>PurchaseOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>PurchaseOrderItemNote</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<PurchaseOrderItemNote> getPurchaseOrderItemNoteOrFetch() {
        if (toPurchaseOrderItemNote == null) {
            toPurchaseOrderItemNote = fetchPurchaseOrderItemNote();
        }
        return toPurchaseOrderItemNote;
    }

    /**
     * Retrieval of associated <b>PurchaseOrderItemNote</b> entities (one to many). This corresponds to the OData navigation property <b>to_PurchaseOrderItemNote</b>.
     * <p>
     * If the navigation property for an entity <b>PurchaseOrderItem</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Option</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_PurchaseOrderItemNote</b> is already loaded, the result will contain the <b>PurchaseOrderItemNote</b> entities. If not, an <code>Option</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Option<List<PurchaseOrderItemNote>> getPurchaseOrderItemNoteIfPresent() {
        return Option.of(toPurchaseOrderItemNote);
    }

    /**
     * Overwrites the list of associated <b>PurchaseOrderItemNote</b> entities for the loaded navigation property <b>to_PurchaseOrderItemNote</b>.
     * <p>
     * If the navigation property <b>to_PurchaseOrderItemNote</b> of a queried <b>PurchaseOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param cloudSdkValue
     *     List of <b>PurchaseOrderItemNote</b> entities.
     */
    public void setPurchaseOrderItemNote(
        @Nonnull
        final List<PurchaseOrderItemNote> cloudSdkValue) {
        if (toPurchaseOrderItemNote == null) {
            toPurchaseOrderItemNote = Lists.newArrayList();
        }
        toPurchaseOrderItemNote.clear();
        toPurchaseOrderItemNote.addAll(cloudSdkValue);
    }

    /**
     * Adds elements to the list of associated <b>PurchaseOrderItemNote</b> entities. This corresponds to the OData navigation property <b>to_PurchaseOrderItemNote</b>.
     * <p>
     * If the navigation property <b>to_PurchaseOrderItemNote</b> of a queried <b>PurchaseOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>PurchaseOrderItemNote</b> entities.
     */
    public void addPurchaseOrderItemNote(PurchaseOrderItemNote... entity) {
        if (toPurchaseOrderItemNote == null) {
            toPurchaseOrderItemNote = Lists.newArrayList();
        }
        toPurchaseOrderItemNote.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>PurchaseOrderScheduleLine</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_ScheduleLine</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>PurchaseOrderScheduleLine</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<PurchaseOrderScheduleLine> fetchScheduleLine() {
        return fetchFieldAsList("to_ScheduleLine", PurchaseOrderScheduleLine.class);
    }

    /**
     * Retrieval of associated <b>PurchaseOrderScheduleLine</b> entities (one to many). This corresponds to the OData navigation property <b>to_ScheduleLine</b>.
     * <p>
     * If the navigation property <b>to_ScheduleLine</b> of a queried <b>PurchaseOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>PurchaseOrderScheduleLine</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<PurchaseOrderScheduleLine> getScheduleLineOrFetch() {
        if (toScheduleLine == null) {
            toScheduleLine = fetchScheduleLine();
        }
        return toScheduleLine;
    }

    /**
     * Retrieval of associated <b>PurchaseOrderScheduleLine</b> entities (one to many). This corresponds to the OData navigation property <b>to_ScheduleLine</b>.
     * <p>
     * If the navigation property for an entity <b>PurchaseOrderItem</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Option</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_ScheduleLine</b> is already loaded, the result will contain the <b>PurchaseOrderScheduleLine</b> entities. If not, an <code>Option</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Option<List<PurchaseOrderScheduleLine>> getScheduleLineIfPresent() {
        return Option.of(toScheduleLine);
    }

    /**
     * Overwrites the list of associated <b>PurchaseOrderScheduleLine</b> entities for the loaded navigation property <b>to_ScheduleLine</b>.
     * <p>
     * If the navigation property <b>to_ScheduleLine</b> of a queried <b>PurchaseOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param cloudSdkValue
     *     List of <b>PurchaseOrderScheduleLine</b> entities.
     */
    public void setScheduleLine(
        @Nonnull
        final List<PurchaseOrderScheduleLine> cloudSdkValue) {
        if (toScheduleLine == null) {
            toScheduleLine = Lists.newArrayList();
        }
        toScheduleLine.clear();
        toScheduleLine.addAll(cloudSdkValue);
    }

    /**
     * Adds elements to the list of associated <b>PurchaseOrderScheduleLine</b> entities. This corresponds to the OData navigation property <b>to_ScheduleLine</b>.
     * <p>
     * If the navigation property <b>to_ScheduleLine</b> of a queried <b>PurchaseOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>PurchaseOrderScheduleLine</b> entities.
     */
    public void addScheduleLine(PurchaseOrderScheduleLine... entity) {
        if (toScheduleLine == null) {
            toScheduleLine = Lists.newArrayList();
        }
        toScheduleLine.addAll(Lists.newArrayList(entity));
    }

    @Nullable
    public String getPurchaseOrder() {
        return this.purchaseOrder;
    }

    @Nullable
    public String getPurchaseOrderItem() {
        return this.purchaseOrderItem;
    }

    @Nullable
    public String getPurchaseOrderItemText() {
        return this.purchaseOrderItemText;
    }

    @Nullable
    public String getPlant() {
        return this.plant;
    }

    @Nullable
    public BigDecimal getOrderQuantity() {
        return this.orderQuantity;
    }

    @Nullable
    public String getDeliveryAddressCityName() {
        return this.deliveryAddressCityName;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PurchaseOrderItem)) return false;
        final PurchaseOrderItem other = (PurchaseOrderItem) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$purchaseOrder = this.purchaseOrder;
        final Object other$purchaseOrder = other.purchaseOrder;
        if (this$purchaseOrder == null ? other$purchaseOrder != null : !this$purchaseOrder.equals(other$purchaseOrder))
            return false;
        final Object this$purchaseOrderItem = this.purchaseOrderItem;
        final Object other$purchaseOrderItem = other.purchaseOrderItem;
        if (this$purchaseOrderItem == null ? other$purchaseOrderItem != null : !this$purchaseOrderItem.equals(other$purchaseOrderItem))
            return false;
        final Object this$purchaseOrderItemText = this.purchaseOrderItemText;
        final Object other$purchaseOrderItemText = other.purchaseOrderItemText;
        if (this$purchaseOrderItemText == null ? other$purchaseOrderItemText != null : !this$purchaseOrderItemText.equals(other$purchaseOrderItemText))
            return false;
        final Object this$plant = this.plant;
        final Object other$plant = other.plant;
        if (this$plant == null ? other$plant != null : !this$plant.equals(other$plant))
            return false;
        final Object this$orderQuantity = this.orderQuantity;
        final Object other$orderQuantity = other.orderQuantity;
        if (this$orderQuantity == null ? other$orderQuantity != null : !this$orderQuantity.equals(other$orderQuantity))
            return false;
        final Object this$deliveryAddressCityName = this.deliveryAddressCityName;
        final Object other$deliveryAddressCityName = other.deliveryAddressCityName;
        if (this$deliveryAddressCityName == null ? other$deliveryAddressCityName != null : !this$deliveryAddressCityName.equals(other$deliveryAddressCityName))
            return false;
        final Object this$toPurchaseOrderItemNote = this.toPurchaseOrderItemNote;
        final Object other$toPurchaseOrderItemNote = other.toPurchaseOrderItemNote;
        if (this$toPurchaseOrderItemNote == null ? other$toPurchaseOrderItemNote != null : !this$toPurchaseOrderItemNote.equals(other$toPurchaseOrderItemNote))
            return false;
        final Object this$toScheduleLine = this.toScheduleLine;
        final Object other$toScheduleLine = other.toScheduleLine;
        if (this$toScheduleLine == null ? other$toScheduleLine != null : !this$toScheduleLine.equals(other$toScheduleLine))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PurchaseOrderItem;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $purchaseOrder = this.purchaseOrder;
        result = result * PRIME + ($purchaseOrder == null ? 43 : $purchaseOrder.hashCode());
        final Object $purchaseOrderItem = this.purchaseOrderItem;
        result = result * PRIME + ($purchaseOrderItem == null ? 43 : $purchaseOrderItem.hashCode());
        final Object $purchaseOrderItemText = this.purchaseOrderItemText;
        result = result * PRIME + ($purchaseOrderItemText == null ? 43 : $purchaseOrderItemText.hashCode());
        final Object $plant = this.plant;
        result = result * PRIME + ($plant == null ? 43 : $plant.hashCode());
        final Object $orderQuantity = this.orderQuantity;
        result = result * PRIME + ($orderQuantity == null ? 43 : $orderQuantity.hashCode());
        final Object $deliveryAddressCityName = this.deliveryAddressCityName;
        result = result * PRIME + ($deliveryAddressCityName == null ? 43 : $deliveryAddressCityName.hashCode());
        final Object $toPurchaseOrderItemNote = this.toPurchaseOrderItemNote;
        result = result * PRIME + ($toPurchaseOrderItemNote == null ? 43 : $toPurchaseOrderItemNote.hashCode());
        final Object $toScheduleLine = this.toScheduleLine;
        result = result * PRIME + ($toScheduleLine == null ? 43 : $toScheduleLine.hashCode());
        return result;
    }

    public String toString() {
        return "PurchaseOrderItem(super=" + super.toString() + ", purchaseOrder=" + this.purchaseOrder + ", purchaseOrderItem=" + this.purchaseOrderItem + ", purchaseOrderItemText=" + this.purchaseOrderItemText + ", plant=" + this.plant + ", orderQuantity=" + this.orderQuantity + ", deliveryAddressCityName=" + this.deliveryAddressCityName + ", toPurchaseOrderItemNote=" + this.toPurchaseOrderItemNote + ", toScheduleLine=" + this.toScheduleLine + ")";
    }


    /**
     * Helper class to allow for fluent creation of PurchaseOrderItem instances.
     * 
     */
    public final static class PurchaseOrderItemBuilder {

        private List<PurchaseOrderItemNote> toPurchaseOrderItemNote = Lists.newArrayList();
        private List<PurchaseOrderScheduleLine> toScheduleLine = Lists.newArrayList();
        private String purchaseOrder;
        private String purchaseOrderItem;
        private String purchaseOrderItemText;
        private String plant;
        private BigDecimal orderQuantity;
        private String deliveryAddressCityName;

        PurchaseOrderItemBuilder() {
        }

        /**
         * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>PurchaseOrder</b></p>
         * 
         * @param cloudSdkValue
         *     The purchaseOrder to build this PurchaseOrderItem with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public PurchaseOrderItemBuilder purchaseOrder(final String cloudSdkValue) {
            purchaseOrder = cloudSdkValue;
            return this;
        }

        private PurchaseOrderItemBuilder toScheduleLine(final List<PurchaseOrderScheduleLine> cloudSdkValue) {
            toScheduleLine.addAll(cloudSdkValue);
            return this;
        }

        /**
         * Navigation property <b>to_ScheduleLine</b> for <b>PurchaseOrderItem</b> to multiple <b>PurchaseOrderScheduleLine</b>.
         * 
         * @param cloudSdkValue
         *     The PurchaseOrderScheduleLines to build this PurchaseOrderItem with.
         * @return
         *     This Builder to allow for a fluent interface.
         */
        @Nonnull
        public PurchaseOrderItemBuilder scheduleLine(PurchaseOrderScheduleLine... cloudSdkValue) {
            return toScheduleLine(Lists.newArrayList(cloudSdkValue));
        }

        @JsonProperty("PurchaseOrderItem")
        public PurchaseOrderItemBuilder purchaseOrderItem(String purchaseOrderItem) {
            this.purchaseOrderItem = purchaseOrderItem;
            return this;
        }

        @JsonProperty("PurchaseOrderItemText")
        public PurchaseOrderItemBuilder purchaseOrderItemText(String purchaseOrderItemText) {
            this.purchaseOrderItemText = purchaseOrderItemText;
            return this;
        }

        @JsonProperty("Plant")
        public PurchaseOrderItemBuilder plant(String plant) {
            this.plant = plant;
            return this;
        }

        @JsonProperty("OrderQuantity")
        public PurchaseOrderItemBuilder orderQuantity(BigDecimal orderQuantity) {
            this.orderQuantity = orderQuantity;
            return this;
        }

        @JsonProperty("DeliveryAddressCityName")
        public PurchaseOrderItemBuilder deliveryAddressCityName(String deliveryAddressCityName) {
            this.deliveryAddressCityName = deliveryAddressCityName;
            return this;
        }

        @JsonProperty("to_PurchaseOrderItemNote")
        public PurchaseOrderItemBuilder toPurchaseOrderItemNote(List<PurchaseOrderItemNote> toPurchaseOrderItemNote) {
            this.toPurchaseOrderItemNote = toPurchaseOrderItemNote;
            return this;
        }

        public PurchaseOrderItem build() {
            return new PurchaseOrderItem(this.purchaseOrder, this.purchaseOrderItem, this.purchaseOrderItemText, this.plant, this.orderQuantity, this.deliveryAddressCityName, this.toPurchaseOrderItemNote, this.toScheduleLine);
        }

        public String toString() {
            return "PurchaseOrderItem.PurchaseOrderItemBuilder(toPurchaseOrderItemNote=" + this.toPurchaseOrderItemNote + ", toScheduleLine=" + this.toScheduleLine + ", purchaseOrder=" + this.purchaseOrder + ", purchaseOrderItem=" + this.purchaseOrderItem + ", purchaseOrderItemText=" + this.purchaseOrderItemText + ", plant=" + this.plant + ", orderQuantity=" + this.orderQuantity + ", deliveryAddressCityName=" + this.deliveryAddressCityName + ")";
        }
    }

}
