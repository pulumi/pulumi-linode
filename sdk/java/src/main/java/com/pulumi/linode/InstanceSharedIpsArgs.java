// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InstanceSharedIpsArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceSharedIpsArgs Empty = new InstanceSharedIpsArgs();

    /**
     * The set of IPs to share with the Linode.
     * 
     */
    @Import(name="addresses", required=true)
    private Output<List<String>> addresses;

    /**
     * @return The set of IPs to share with the Linode.
     * 
     */
    public Output<List<String>> addresses() {
        return this.addresses;
    }

    /**
     * The ID of the Linode to share the IPs to.
     * 
     */
    @Import(name="linodeId", required=true)
    private Output<Integer> linodeId;

    /**
     * @return The ID of the Linode to share the IPs to.
     * 
     */
    public Output<Integer> linodeId() {
        return this.linodeId;
    }

    private InstanceSharedIpsArgs() {}

    private InstanceSharedIpsArgs(InstanceSharedIpsArgs $) {
        this.addresses = $.addresses;
        this.linodeId = $.linodeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceSharedIpsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceSharedIpsArgs $;

        public Builder() {
            $ = new InstanceSharedIpsArgs();
        }

        public Builder(InstanceSharedIpsArgs defaults) {
            $ = new InstanceSharedIpsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addresses The set of IPs to share with the Linode.
         * 
         * @return builder
         * 
         */
        public Builder addresses(Output<List<String>> addresses) {
            $.addresses = addresses;
            return this;
        }

        /**
         * @param addresses The set of IPs to share with the Linode.
         * 
         * @return builder
         * 
         */
        public Builder addresses(List<String> addresses) {
            return addresses(Output.of(addresses));
        }

        /**
         * @param addresses The set of IPs to share with the Linode.
         * 
         * @return builder
         * 
         */
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }

        /**
         * @param linodeId The ID of the Linode to share the IPs to.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Output<Integer> linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        /**
         * @param linodeId The ID of the Linode to share the IPs to.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            return linodeId(Output.of(linodeId));
        }

        public InstanceSharedIpsArgs build() {
            $.addresses = Objects.requireNonNull($.addresses, "expected parameter 'addresses' to be non-null");
            $.linodeId = Objects.requireNonNull($.linodeId, "expected parameter 'linodeId' to be non-null");
            return $;
        }
    }

}
