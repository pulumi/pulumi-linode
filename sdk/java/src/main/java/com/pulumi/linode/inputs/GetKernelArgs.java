// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetKernelArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKernelArgs Empty = new GetKernelArgs();

    /**
     * The unique ID of this Kernel.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The unique ID of this Kernel.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetKernelArgs() {}

    private GetKernelArgs(GetKernelArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKernelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKernelArgs $;

        public Builder() {
            $ = new GetKernelArgs();
        }

        public Builder(GetKernelArgs defaults) {
            $ = new GetKernelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique ID of this Kernel.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique ID of this Kernel.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetKernelArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetKernelArgs", "id");
            }
            return $;
        }
    }

}
