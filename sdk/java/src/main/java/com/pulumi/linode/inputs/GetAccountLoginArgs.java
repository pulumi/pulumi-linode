// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GetAccountLoginArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountLoginArgs Empty = new GetAccountLoginArgs();

    /**
     * The unique ID of this login object.
     * 
     */
    @Import(name="id", required=true)
    private Output<Integer> id;

    /**
     * @return The unique ID of this login object.
     * 
     */
    public Output<Integer> id() {
        return this.id;
    }

    private GetAccountLoginArgs() {}

    private GetAccountLoginArgs(GetAccountLoginArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountLoginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountLoginArgs $;

        public Builder() {
            $ = new GetAccountLoginArgs();
        }

        public Builder(GetAccountLoginArgs defaults) {
            $ = new GetAccountLoginArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique ID of this login object.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique ID of this login object.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        public GetAccountLoginArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
