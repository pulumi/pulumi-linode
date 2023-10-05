// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetInstanceTypesTypeAddon;
import com.pulumi.linode.outputs.GetInstanceTypesTypePrice;
import com.pulumi.linode.outputs.GetInstanceTypesTypeRegionPrice;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceTypesType {
    private List<GetInstanceTypesTypeAddon> addons;
    /**
     * @return The class of the Linode Type. See all classes [here](https://www.linode.com/docs/api/linode-types/#type-view__responses).
     * 
     */
    private String class_;
    /**
     * @return The Disk size, in MB, of the Linode Type.
     * 
     */
    private Integer disk;
    /**
     * @return The ID representing the Linode Type.
     * 
     */
    private String id;
    /**
     * @return The Linode Type&#39;s label is for display purposes only.
     * 
     */
    private String label;
    /**
     * @return The amount of RAM included in this Linode Type.
     * 
     */
    private Integer memory;
    /**
     * @return The Mbits outbound bandwidth allocation.
     * 
     */
    private Integer networkOut;
    private List<GetInstanceTypesTypePrice> prices;
    private List<GetInstanceTypesTypeRegionPrice> regionPrices;
    /**
     * @return The monthly outbound transfer amount, in MB.
     * 
     */
    private Integer transfer;
    /**
     * @return The number of VCPU cores this Linode Type offers.
     * 
     */
    private Integer vcpus;

    private GetInstanceTypesType() {}
    public List<GetInstanceTypesTypeAddon> addons() {
        return this.addons;
    }
    /**
     * @return The class of the Linode Type. See all classes [here](https://www.linode.com/docs/api/linode-types/#type-view__responses).
     * 
     */
    public String class_() {
        return this.class_;
    }
    /**
     * @return The Disk size, in MB, of the Linode Type.
     * 
     */
    public Integer disk() {
        return this.disk;
    }
    /**
     * @return The ID representing the Linode Type.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Linode Type&#39;s label is for display purposes only.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return The amount of RAM included in this Linode Type.
     * 
     */
    public Integer memory() {
        return this.memory;
    }
    /**
     * @return The Mbits outbound bandwidth allocation.
     * 
     */
    public Integer networkOut() {
        return this.networkOut;
    }
    public List<GetInstanceTypesTypePrice> prices() {
        return this.prices;
    }
    public List<GetInstanceTypesTypeRegionPrice> regionPrices() {
        return this.regionPrices;
    }
    /**
     * @return The monthly outbound transfer amount, in MB.
     * 
     */
    public Integer transfer() {
        return this.transfer;
    }
    /**
     * @return The number of VCPU cores this Linode Type offers.
     * 
     */
    public Integer vcpus() {
        return this.vcpus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypesType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetInstanceTypesTypeAddon> addons;
        private String class_;
        private Integer disk;
        private String id;
        private String label;
        private Integer memory;
        private Integer networkOut;
        private List<GetInstanceTypesTypePrice> prices;
        private List<GetInstanceTypesTypeRegionPrice> regionPrices;
        private Integer transfer;
        private Integer vcpus;
        public Builder() {}
        public Builder(GetInstanceTypesType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addons = defaults.addons;
    	      this.class_ = defaults.class_;
    	      this.disk = defaults.disk;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.memory = defaults.memory;
    	      this.networkOut = defaults.networkOut;
    	      this.prices = defaults.prices;
    	      this.regionPrices = defaults.regionPrices;
    	      this.transfer = defaults.transfer;
    	      this.vcpus = defaults.vcpus;
        }

        @CustomType.Setter
        public Builder addons(List<GetInstanceTypesTypeAddon> addons) {
            this.addons = Objects.requireNonNull(addons);
            return this;
        }
        public Builder addons(GetInstanceTypesTypeAddon... addons) {
            return addons(List.of(addons));
        }
        @CustomType.Setter("class")
        public Builder class_(String class_) {
            this.class_ = Objects.requireNonNull(class_);
            return this;
        }
        @CustomType.Setter
        public Builder disk(Integer disk) {
            this.disk = Objects.requireNonNull(disk);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder memory(Integer memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }
        @CustomType.Setter
        public Builder networkOut(Integer networkOut) {
            this.networkOut = Objects.requireNonNull(networkOut);
            return this;
        }
        @CustomType.Setter
        public Builder prices(List<GetInstanceTypesTypePrice> prices) {
            this.prices = Objects.requireNonNull(prices);
            return this;
        }
        public Builder prices(GetInstanceTypesTypePrice... prices) {
            return prices(List.of(prices));
        }
        @CustomType.Setter
        public Builder regionPrices(List<GetInstanceTypesTypeRegionPrice> regionPrices) {
            this.regionPrices = Objects.requireNonNull(regionPrices);
            return this;
        }
        public Builder regionPrices(GetInstanceTypesTypeRegionPrice... regionPrices) {
            return regionPrices(List.of(regionPrices));
        }
        @CustomType.Setter
        public Builder transfer(Integer transfer) {
            this.transfer = Objects.requireNonNull(transfer);
            return this;
        }
        @CustomType.Setter
        public Builder vcpus(Integer vcpus) {
            this.vcpus = Objects.requireNonNull(vcpus);
            return this;
        }
        public GetInstanceTypesType build() {
            final var o = new GetInstanceTypesType();
            o.addons = addons;
            o.class_ = class_;
            o.disk = disk;
            o.id = id;
            o.label = label;
            o.memory = memory;
            o.networkOut = networkOut;
            o.prices = prices;
            o.regionPrices = regionPrices;
            o.transfer = transfer;
            o.vcpus = vcpus;
            return o;
        }
    }
}
