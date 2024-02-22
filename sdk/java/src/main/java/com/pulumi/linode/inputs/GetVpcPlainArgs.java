// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetVpcPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcPlainArgs Empty = new GetVpcPlainArgs();

    /**
     * The unique id of this VPC.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The unique id of this VPC.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetVpcPlainArgs() {}

    private GetVpcPlainArgs(GetVpcPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcPlainArgs $;

        public Builder() {
            $ = new GetVpcPlainArgs();
        }

        public Builder(GetVpcPlainArgs defaults) {
            $ = new GetVpcPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique id of this VPC.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetVpcPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetVpcPlainArgs", "id");
            }
            return $;
        }
    }

}
