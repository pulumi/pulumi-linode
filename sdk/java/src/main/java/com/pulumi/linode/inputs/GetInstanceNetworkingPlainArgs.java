// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetInstanceNetworkingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceNetworkingPlainArgs Empty = new GetInstanceNetworkingPlainArgs();

    /**
     * The Linode instance&#39;s ID.
     * 
     */
    @Import(name="linodeId", required=true)
    private Integer linodeId;

    /**
     * @return The Linode instance&#39;s ID.
     * 
     */
    public Integer linodeId() {
        return this.linodeId;
    }

    private GetInstanceNetworkingPlainArgs() {}

    private GetInstanceNetworkingPlainArgs(GetInstanceNetworkingPlainArgs $) {
        this.linodeId = $.linodeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceNetworkingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceNetworkingPlainArgs $;

        public Builder() {
            $ = new GetInstanceNetworkingPlainArgs();
        }

        public Builder(GetInstanceNetworkingPlainArgs defaults) {
            $ = new GetInstanceNetworkingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linodeId The Linode instance&#39;s ID.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        public GetInstanceNetworkingPlainArgs build() {
            if ($.linodeId == null) {
                throw new MissingRequiredPropertyException("GetInstanceNetworkingPlainArgs", "linodeId");
            }
            return $;
        }
    }

}
