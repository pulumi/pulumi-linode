// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetUserLinodeGrantArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetUserLinodeGrantArgs Empty = new GetUserLinodeGrantArgs();

    @Import(name="id", required=true)
    private Output<Integer> id;

    public Output<Integer> id() {
        return this.id;
    }

    @Import(name="permissions", required=true)
    private Output<String> permissions;

    public Output<String> permissions() {
        return this.permissions;
    }

    private GetUserLinodeGrantArgs() {}

    private GetUserLinodeGrantArgs(GetUserLinodeGrantArgs $) {
        this.id = $.id;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserLinodeGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserLinodeGrantArgs $;

        public Builder() {
            $ = new GetUserLinodeGrantArgs();
        }

        public Builder(GetUserLinodeGrantArgs defaults) {
            $ = new GetUserLinodeGrantArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        public Builder permissions(Output<String> permissions) {
            $.permissions = permissions;
            return this;
        }

        public Builder permissions(String permissions) {
            return permissions(Output.of(permissions));
        }

        public GetUserLinodeGrantArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.permissions = Objects.requireNonNull($.permissions, "expected parameter 'permissions' to be non-null");
            return $;
        }
    }

}
