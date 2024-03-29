// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetKernelPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKernelPlainArgs Empty = new GetKernelPlainArgs();

    /**
     * The unique ID of this Kernel.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The unique ID of this Kernel.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetKernelPlainArgs() {}

    private GetKernelPlainArgs(GetKernelPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKernelPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKernelPlainArgs $;

        public Builder() {
            $ = new GetKernelPlainArgs();
        }

        public Builder(GetKernelPlainArgs defaults) {
            $ = new GetKernelPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique ID of this Kernel.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetKernelPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetKernelPlainArgs", "id");
            }
            return $;
        }
    }

}
