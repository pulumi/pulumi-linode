// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceTypePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTypePlainArgs Empty = new GetInstanceTypePlainArgs();

    /**
     * Label used to identify instance type
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Label used to identify instance type
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The Linode Type&#39;s label is for display purposes only
     * 
     */
    @Import(name="label")
    private @Nullable String label;

    /**
     * @return The Linode Type&#39;s label is for display purposes only
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }

    private GetInstanceTypePlainArgs() {}

    private GetInstanceTypePlainArgs(GetInstanceTypePlainArgs $) {
        this.id = $.id;
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTypePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTypePlainArgs $;

        public Builder() {
            $ = new GetInstanceTypePlainArgs();
        }

        public Builder(GetInstanceTypePlainArgs defaults) {
            $ = new GetInstanceTypePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Label used to identify instance type
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param label The Linode Type&#39;s label is for display purposes only
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable String label) {
            $.label = label;
            return this;
        }

        public GetInstanceTypePlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
