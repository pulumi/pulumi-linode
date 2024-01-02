// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetInstanceTypesTypeAddonArgs;
import com.pulumi.linode.inputs.GetInstanceTypesTypePriceArgs;
import com.pulumi.linode.inputs.GetInstanceTypesTypeRegionPriceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInstanceTypesTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetInstanceTypesTypeArgs Empty = new GetInstanceTypesTypeArgs();

    @Import(name="addons", required=true)
    private Output<List<GetInstanceTypesTypeAddonArgs>> addons;

    public Output<List<GetInstanceTypesTypeAddonArgs>> addons() {
        return this.addons;
    }

    /**
     * The class of the Linode Type. See all classes [here](https://www.linode.com/docs/api/linode-types/#type-view__responses).
     * 
     */
    @Import(name="class", required=true)
    private Output<String> class_;

    /**
     * @return The class of the Linode Type. See all classes [here](https://www.linode.com/docs/api/linode-types/#type-view__responses).
     * 
     */
    public Output<String> class_() {
        return this.class_;
    }

    /**
     * The Disk size, in MB, of the Linode Type.
     * 
     */
    @Import(name="disk", required=true)
    private Output<Integer> disk;

    /**
     * @return The Disk size, in MB, of the Linode Type.
     * 
     */
    public Output<Integer> disk() {
        return this.disk;
    }

    /**
     * The ID representing the Linode Type.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID representing the Linode Type.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The Linode Type&#39;s label is for display purposes only.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The Linode Type&#39;s label is for display purposes only.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * The amount of RAM included in this Linode Type.
     * 
     */
    @Import(name="memory", required=true)
    private Output<Integer> memory;

    /**
     * @return The amount of RAM included in this Linode Type.
     * 
     */
    public Output<Integer> memory() {
        return this.memory;
    }

    /**
     * The Mbits outbound bandwidth allocation.
     * 
     */
    @Import(name="networkOut", required=true)
    private Output<Integer> networkOut;

    /**
     * @return The Mbits outbound bandwidth allocation.
     * 
     */
    public Output<Integer> networkOut() {
        return this.networkOut;
    }

    @Import(name="prices", required=true)
    private Output<List<GetInstanceTypesTypePriceArgs>> prices;

    public Output<List<GetInstanceTypesTypePriceArgs>> prices() {
        return this.prices;
    }

    @Import(name="regionPrices", required=true)
    private Output<List<GetInstanceTypesTypeRegionPriceArgs>> regionPrices;

    public Output<List<GetInstanceTypesTypeRegionPriceArgs>> regionPrices() {
        return this.regionPrices;
    }

    /**
     * The monthly outbound transfer amount, in MB.
     * 
     */
    @Import(name="transfer", required=true)
    private Output<Integer> transfer;

    /**
     * @return The monthly outbound transfer amount, in MB.
     * 
     */
    public Output<Integer> transfer() {
        return this.transfer;
    }

    /**
     * The number of VCPU cores this Linode Type offers.
     * 
     */
    @Import(name="vcpus", required=true)
    private Output<Integer> vcpus;

    /**
     * @return The number of VCPU cores this Linode Type offers.
     * 
     */
    public Output<Integer> vcpus() {
        return this.vcpus;
    }

    private GetInstanceTypesTypeArgs() {}

    private GetInstanceTypesTypeArgs(GetInstanceTypesTypeArgs $) {
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
    public static Builder builder(GetInstanceTypesTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTypesTypeArgs $;

        public Builder() {
            $ = new GetInstanceTypesTypeArgs();
        }

        public Builder(GetInstanceTypesTypeArgs defaults) {
            $ = new GetInstanceTypesTypeArgs(Objects.requireNonNull(defaults));
        }

        public Builder addons(Output<List<GetInstanceTypesTypeAddonArgs>> addons) {
            $.addons = addons;
            return this;
        }

        public Builder addons(List<GetInstanceTypesTypeAddonArgs> addons) {
            return addons(Output.of(addons));
        }

        public Builder addons(GetInstanceTypesTypeAddonArgs... addons) {
            return addons(List.of(addons));
        }

        /**
         * @param class_ The class of the Linode Type. See all classes [here](https://www.linode.com/docs/api/linode-types/#type-view__responses).
         * 
         * @return builder
         * 
         */
        public Builder class_(Output<String> class_) {
            $.class_ = class_;
            return this;
        }

        /**
         * @param class_ The class of the Linode Type. See all classes [here](https://www.linode.com/docs/api/linode-types/#type-view__responses).
         * 
         * @return builder
         * 
         */
        public Builder class_(String class_) {
            return class_(Output.of(class_));
        }

        /**
         * @param disk The Disk size, in MB, of the Linode Type.
         * 
         * @return builder
         * 
         */
        public Builder disk(Output<Integer> disk) {
            $.disk = disk;
            return this;
        }

        /**
         * @param disk The Disk size, in MB, of the Linode Type.
         * 
         * @return builder
         * 
         */
        public Builder disk(Integer disk) {
            return disk(Output.of(disk));
        }

        /**
         * @param id The ID representing the Linode Type.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID representing the Linode Type.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param label The Linode Type&#39;s label is for display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The Linode Type&#39;s label is for display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param memory The amount of RAM included in this Linode Type.
         * 
         * @return builder
         * 
         */
        public Builder memory(Output<Integer> memory) {
            $.memory = memory;
            return this;
        }

        /**
         * @param memory The amount of RAM included in this Linode Type.
         * 
         * @return builder
         * 
         */
        public Builder memory(Integer memory) {
            return memory(Output.of(memory));
        }

        /**
         * @param networkOut The Mbits outbound bandwidth allocation.
         * 
         * @return builder
         * 
         */
        public Builder networkOut(Output<Integer> networkOut) {
            $.networkOut = networkOut;
            return this;
        }

        /**
         * @param networkOut The Mbits outbound bandwidth allocation.
         * 
         * @return builder
         * 
         */
        public Builder networkOut(Integer networkOut) {
            return networkOut(Output.of(networkOut));
        }

        public Builder prices(Output<List<GetInstanceTypesTypePriceArgs>> prices) {
            $.prices = prices;
            return this;
        }

        public Builder prices(List<GetInstanceTypesTypePriceArgs> prices) {
            return prices(Output.of(prices));
        }

        public Builder prices(GetInstanceTypesTypePriceArgs... prices) {
            return prices(List.of(prices));
        }

        public Builder regionPrices(Output<List<GetInstanceTypesTypeRegionPriceArgs>> regionPrices) {
            $.regionPrices = regionPrices;
            return this;
        }

        public Builder regionPrices(List<GetInstanceTypesTypeRegionPriceArgs> regionPrices) {
            return regionPrices(Output.of(regionPrices));
        }

        public Builder regionPrices(GetInstanceTypesTypeRegionPriceArgs... regionPrices) {
            return regionPrices(List.of(regionPrices));
        }

        /**
         * @param transfer The monthly outbound transfer amount, in MB.
         * 
         * @return builder
         * 
         */
        public Builder transfer(Output<Integer> transfer) {
            $.transfer = transfer;
            return this;
        }

        /**
         * @param transfer The monthly outbound transfer amount, in MB.
         * 
         * @return builder
         * 
         */
        public Builder transfer(Integer transfer) {
            return transfer(Output.of(transfer));
        }

        /**
         * @param vcpus The number of VCPU cores this Linode Type offers.
         * 
         * @return builder
         * 
         */
        public Builder vcpus(Output<Integer> vcpus) {
            $.vcpus = vcpus;
            return this;
        }

        /**
         * @param vcpus The number of VCPU cores this Linode Type offers.
         * 
         * @return builder
         * 
         */
        public Builder vcpus(Integer vcpus) {
            return vcpus(Output.of(vcpus));
        }

        public GetInstanceTypesTypeArgs build() {
            if ($.addons == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeArgs", "addons");
            }
            if ($.class_ == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeArgs", "class_");
            }
            if ($.disk == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeArgs", "disk");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeArgs", "id");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeArgs", "label");
            }
            if ($.memory == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeArgs", "memory");
            }
            if ($.networkOut == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeArgs", "networkOut");
            }
            if ($.prices == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeArgs", "prices");
            }
            if ($.regionPrices == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeArgs", "regionPrices");
            }
            if ($.transfer == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeArgs", "transfer");
            }
            if ($.vcpus == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeArgs", "vcpus");
            }
            return $;
        }
    }

}
