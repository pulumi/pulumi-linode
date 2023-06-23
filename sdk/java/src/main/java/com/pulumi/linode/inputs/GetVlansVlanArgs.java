// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetVlansVlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetVlansVlanArgs Empty = new GetVlansVlanArgs();

    /**
     * When the VLAN was created.
     * 
     */
    @Import(name="created", required=true)
    private Output<String> created;

    /**
     * @return When the VLAN was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }

    /**
     * The unique label of the VLAN.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The unique label of the VLAN.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * The running Linodes currently attached to the VLAN.
     * 
     */
    @Import(name="linodes", required=true)
    private Output<List<Integer>> linodes;

    /**
     * @return The running Linodes currently attached to the VLAN.
     * 
     */
    public Output<List<Integer>> linodes() {
        return this.linodes;
    }

    /**
     * The region the VLAN is located in. See all regions [here](https://api.linode.com/v4/regions).
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The region the VLAN is located in. See all regions [here](https://api.linode.com/v4/regions).
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private GetVlansVlanArgs() {}

    private GetVlansVlanArgs(GetVlansVlanArgs $) {
        this.created = $.created;
        this.label = $.label;
        this.linodes = $.linodes;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVlansVlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVlansVlanArgs $;

        public Builder() {
            $ = new GetVlansVlanArgs();
        }

        public Builder(GetVlansVlanArgs defaults) {
            $ = new GetVlansVlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param created When the VLAN was created.
         * 
         * @return builder
         * 
         */
        public Builder created(Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created When the VLAN was created.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param label The unique label of the VLAN.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The unique label of the VLAN.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param linodes The running Linodes currently attached to the VLAN.
         * 
         * @return builder
         * 
         */
        public Builder linodes(Output<List<Integer>> linodes) {
            $.linodes = linodes;
            return this;
        }

        /**
         * @param linodes The running Linodes currently attached to the VLAN.
         * 
         * @return builder
         * 
         */
        public Builder linodes(List<Integer> linodes) {
            return linodes(Output.of(linodes));
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
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region the VLAN is located in. See all regions [here](https://api.linode.com/v4/regions).
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetVlansVlanArgs build() {
            $.created = Objects.requireNonNull($.created, "expected parameter 'created' to be non-null");
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            $.linodes = Objects.requireNonNull($.linodes, "expected parameter 'linodes' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
