// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetInstanceTypesTypeAddon;
import com.pulumi.linode.inputs.GetInstanceTypesTypePrice;
import com.pulumi.linode.inputs.GetInstanceTypesTypeRegionPrice;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInstanceTypesType extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTypesType Empty = new GetInstanceTypesType();

    /**
     * The number of VPUs this Linode Type offers.
     * 
     */
    @Import(name="acceleratedDevices", required=true)
    private Integer acceleratedDevices;

    /**
     * @return The number of VPUs this Linode Type offers.
     * 
     */
    public Integer acceleratedDevices() {
        return this.acceleratedDevices;
    }

    /**
     * Information about the optional Backup service offered for Linodes.
     * 
     */
    @Import(name="addons", required=true)
    private List<GetInstanceTypesTypeAddon> addons;

    /**
     * @return Information about the optional Backup service offered for Linodes.
     * 
     */
    public List<GetInstanceTypesTypeAddon> addons() {
        return this.addons;
    }

    /**
     * The class of the Linode Type. See all classes [here](https://techdocs.akamai.com/linode-api/reference/get-linode-types).
     * 
     */
    @Import(name="class", required=true)
    private String class_;

    /**
     * @return The class of the Linode Type. See all classes [here](https://techdocs.akamai.com/linode-api/reference/get-linode-types).
     * 
     */
    public String class_() {
        return this.class_;
    }

    /**
     * The Disk size, in MB, of the Linode Type.
     * 
     */
    @Import(name="disk", required=true)
    private Integer disk;

    /**
     * @return The Disk size, in MB, of the Linode Type.
     * 
     */
    public Integer disk() {
        return this.disk;
    }

    /**
     * The ID representing the Linode Type.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID representing the Linode Type.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The Linode Type&#39;s label is for display purposes only.
     * 
     */
    @Import(name="label", required=true)
    private String label;

    /**
     * @return The Linode Type&#39;s label is for display purposes only.
     * 
     */
    public String label() {
        return this.label;
    }

    /**
     * The amount of RAM included in this Linode Type.
     * 
     */
    @Import(name="memory", required=true)
    private Integer memory;

    /**
     * @return The amount of RAM included in this Linode Type.
     * 
     */
    public Integer memory() {
        return this.memory;
    }

    /**
     * The Mbits outbound bandwidth allocation.
     * 
     */
    @Import(name="networkOut", required=true)
    private Integer networkOut;

    /**
     * @return The Mbits outbound bandwidth allocation.
     * 
     */
    public Integer networkOut() {
        return this.networkOut;
    }

    /**
     * Cost in US dollars, broken down into hourly and monthly charges.
     * 
     */
    @Import(name="prices", required=true)
    private List<GetInstanceTypesTypePrice> prices;

    /**
     * @return Cost in US dollars, broken down into hourly and monthly charges.
     * 
     */
    public List<GetInstanceTypesTypePrice> prices() {
        return this.prices;
    }

    /**
     * A list of region-specific prices for this plan.
     * 
     */
    @Import(name="regionPrices", required=true)
    private List<GetInstanceTypesTypeRegionPrice> regionPrices;

    /**
     * @return A list of region-specific prices for this plan.
     * 
     */
    public List<GetInstanceTypesTypeRegionPrice> regionPrices() {
        return this.regionPrices;
    }

    /**
     * The monthly outbound transfer amount, in MB.
     * 
     */
    @Import(name="transfer", required=true)
    private Integer transfer;

    /**
     * @return The monthly outbound transfer amount, in MB.
     * 
     */
    public Integer transfer() {
        return this.transfer;
    }

    /**
     * The number of VCPU cores this Linode Type offers.
     * 
     */
    @Import(name="vcpus", required=true)
    private Integer vcpus;

    /**
     * @return The number of VCPU cores this Linode Type offers.
     * 
     */
    public Integer vcpus() {
        return this.vcpus;
    }

    private GetInstanceTypesType() {}

    private GetInstanceTypesType(GetInstanceTypesType $) {
        this.acceleratedDevices = $.acceleratedDevices;
        this.addons = $.addons;
        this.class_ = $.class_;
        this.disk = $.disk;
        this.id = $.id;
        this.label = $.label;
        this.memory = $.memory;
        this.networkOut = $.networkOut;
        this.prices = $.prices;
        this.regionPrices = $.regionPrices;
        this.transfer = $.transfer;
        this.vcpus = $.vcpus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTypesType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTypesType $;

        public Builder() {
            $ = new GetInstanceTypesType();
        }

        public Builder(GetInstanceTypesType defaults) {
            $ = new GetInstanceTypesType(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratedDevices The number of VPUs this Linode Type offers.
         * 
         * @return builder
         * 
         */
        public Builder acceleratedDevices(Integer acceleratedDevices) {
            $.acceleratedDevices = acceleratedDevices;
            return this;
        }

        /**
         * @param addons Information about the optional Backup service offered for Linodes.
         * 
         * @return builder
         * 
         */
        public Builder addons(List<GetInstanceTypesTypeAddon> addons) {
            $.addons = addons;
            return this;
        }

        /**
         * @param addons Information about the optional Backup service offered for Linodes.
         * 
         * @return builder
         * 
         */
        public Builder addons(GetInstanceTypesTypeAddon... addons) {
            return addons(List.of(addons));
        }

        /**
         * @param class_ The class of the Linode Type. See all classes [here](https://techdocs.akamai.com/linode-api/reference/get-linode-types).
         * 
         * @return builder
         * 
         */
        public Builder class_(String class_) {
            $.class_ = class_;
            return this;
        }

        /**
         * @param disk The Disk size, in MB, of the Linode Type.
         * 
         * @return builder
         * 
         */
        public Builder disk(Integer disk) {
            $.disk = disk;
            return this;
        }

        /**
         * @param id The ID representing the Linode Type.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param label The Linode Type&#39;s label is for display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            $.label = label;
            return this;
        }

        /**
         * @param memory The amount of RAM included in this Linode Type.
         * 
         * @return builder
         * 
         */
        public Builder memory(Integer memory) {
            $.memory = memory;
            return this;
        }

        /**
         * @param networkOut The Mbits outbound bandwidth allocation.
         * 
         * @return builder
         * 
         */
        public Builder networkOut(Integer networkOut) {
            $.networkOut = networkOut;
            return this;
        }

        /**
         * @param prices Cost in US dollars, broken down into hourly and monthly charges.
         * 
         * @return builder
         * 
         */
        public Builder prices(List<GetInstanceTypesTypePrice> prices) {
            $.prices = prices;
            return this;
        }

        /**
         * @param prices Cost in US dollars, broken down into hourly and monthly charges.
         * 
         * @return builder
         * 
         */
        public Builder prices(GetInstanceTypesTypePrice... prices) {
            return prices(List.of(prices));
        }

        /**
         * @param regionPrices A list of region-specific prices for this plan.
         * 
         * @return builder
         * 
         */
        public Builder regionPrices(List<GetInstanceTypesTypeRegionPrice> regionPrices) {
            $.regionPrices = regionPrices;
            return this;
        }

        /**
         * @param regionPrices A list of region-specific prices for this plan.
         * 
         * @return builder
         * 
         */
        public Builder regionPrices(GetInstanceTypesTypeRegionPrice... regionPrices) {
            return regionPrices(List.of(regionPrices));
        }

        /**
         * @param transfer The monthly outbound transfer amount, in MB.
         * 
         * @return builder
         * 
         */
        public Builder transfer(Integer transfer) {
            $.transfer = transfer;
            return this;
        }

        /**
         * @param vcpus The number of VCPU cores this Linode Type offers.
         * 
         * @return builder
         * 
         */
        public Builder vcpus(Integer vcpus) {
            $.vcpus = vcpus;
            return this;
        }

        public GetInstanceTypesType build() {
            if ($.acceleratedDevices == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesType", "acceleratedDevices");
            }
            if ($.addons == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesType", "addons");
            }
            if ($.class_ == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesType", "class_");
            }
            if ($.disk == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesType", "disk");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesType", "id");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesType", "label");
            }
            if ($.memory == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesType", "memory");
            }
            if ($.networkOut == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesType", "networkOut");
            }
            if ($.prices == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesType", "prices");
            }
            if ($.regionPrices == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesType", "regionPrices");
            }
            if ($.transfer == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesType", "transfer");
            }
            if ($.vcpus == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesType", "vcpus");
            }
            return $;
        }
    }

}
