// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetVlansVlan extends com.pulumi.resources.InvokeArgs {

    public static final GetVlansVlan Empty = new GetVlansVlan();

    /**
     * When the VLAN was created.
     * 
     */
    @Import(name="created", required=true)
    private String created;

    /**
     * @return When the VLAN was created.
     * 
     */
    public String created() {
        return this.created;
    }

    /**
     * The unique label of the VLAN.
     * 
     */
    @Import(name="label", required=true)
    private String label;

    /**
     * @return The unique label of the VLAN.
     * 
     */
    public String label() {
        return this.label;
    }

    /**
     * The running Linodes currently attached to the VLAN.
     * 
     */
    @Import(name="linodes", required=true)
    private List<Integer> linodes;

    /**
     * @return The running Linodes currently attached to the VLAN.
     * 
     */
    public List<Integer> linodes() {
        return this.linodes;
    }

    /**
     * The region the VLAN is located in. See all regions [here](https://api.linode.com/v4/regions).
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return The region the VLAN is located in. See all regions [here](https://api.linode.com/v4/regions).
     * 
     */
    public String region() {
        return this.region;
    }

    private GetVlansVlan() {}

    private GetVlansVlan(GetVlansVlan $) {
        this.created = $.created;
        this.label = $.label;
        this.linodes = $.linodes;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVlansVlan defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVlansVlan $;

        public Builder() {
            $ = new GetVlansVlan();
        }

        public Builder(GetVlansVlan defaults) {
            $ = new GetVlansVlan(Objects.requireNonNull(defaults));
        }

        /**
         * @param created When the VLAN was created.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            $.created = created;
            return this;
        }

        /**
         * @param label The unique label of the VLAN.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            $.label = label;
            return this;
        }

        /**
         * @param linodes The running Linodes currently attached to the VLAN.
         * 
         * @return builder
         * 
         */
        public Builder linodes(List<Integer> linodes) {
            $.linodes = linodes;
            return this;
        }

        /**
         * @param linodes The running Linodes currently attached to the VLAN.
         * 
         * @return builder
         * 
         */
        public Builder linodes(Integer... linodes) {
            return linodes(List.of(linodes));
        }

        /**
         * @param region The region the VLAN is located in. See all regions [here](https://api.linode.com/v4/regions).
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetVlansVlan build() {
            if ($.created == null) {
                throw new MissingRequiredPropertyException("GetVlansVlan", "created");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetVlansVlan", "label");
            }
            if ($.linodes == null) {
                throw new MissingRequiredPropertyException("GetVlansVlan", "linodes");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("GetVlansVlan", "region");
            }
            return $;
        }
    }

}
