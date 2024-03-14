// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class LkeNodePoolNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final LkeNodePoolNodeArgs Empty = new LkeNodePoolNodeArgs();

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    @Import(name="instanceId", required=true)
    private Output<Integer> instanceId;

    public Output<Integer> instanceId() {
        return this.instanceId;
    }

    @Import(name="status", required=true)
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    private LkeNodePoolNodeArgs() {}

    private LkeNodePoolNodeArgs(LkeNodePoolNodeArgs $) {
        this.id = $.id;
        this.instanceId = $.instanceId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LkeNodePoolNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LkeNodePoolNodeArgs $;

        public Builder() {
            $ = new LkeNodePoolNodeArgs();
        }

        public Builder(LkeNodePoolNodeArgs defaults) {
            $ = new LkeNodePoolNodeArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder instanceId(Output<Integer> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(Integer instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public LkeNodePoolNodeArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("LkeNodePoolNodeArgs", "id");
            }
            if ($.instanceId == null) {
                throw new MissingRequiredPropertyException("LkeNodePoolNodeArgs", "instanceId");
            }
            if ($.status == null) {
                throw new MissingRequiredPropertyException("LkeNodePoolNodeArgs", "status");
            }
            return $;
        }
    }

}
