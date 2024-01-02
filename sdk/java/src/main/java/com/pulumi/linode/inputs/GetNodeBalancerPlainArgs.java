// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetNodeBalancerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodeBalancerPlainArgs Empty = new GetNodeBalancerPlainArgs();

    /**
     * The NodeBalancer&#39;s ID.
     * 
     */
    @Import(name="id", required=true)
    private Integer id;

    /**
     * @return The NodeBalancer&#39;s ID.
     * 
     */
    public Integer id() {
        return this.id;
    }

    private GetNodeBalancerPlainArgs() {}

    private GetNodeBalancerPlainArgs(GetNodeBalancerPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodeBalancerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodeBalancerPlainArgs $;

        public Builder() {
            $ = new GetNodeBalancerPlainArgs();
        }

        public Builder(GetNodeBalancerPlainArgs defaults) {
            $ = new GetNodeBalancerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The NodeBalancer&#39;s ID.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            $.id = id;
            return this;
        }

        public GetNodeBalancerPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetNodeBalancerPlainArgs", "id");
            }
            return $;
        }
    }

}
