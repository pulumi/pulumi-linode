// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LkeNodePoolNode {
    /**
     * @return The ID of the node.
     * 
     */
    private String id;
    /**
     * @return The ID of the underlying Linode instance.
     * 
     */
    private Integer instanceId;
    /**
     * @return The status of the node. (`ready`, `not_ready`)
     * 
     */
    private String status;

    private LkeNodePoolNode() {}
    /**
     * @return The ID of the node.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the underlying Linode instance.
     * 
     */
    public Integer instanceId() {
        return this.instanceId;
    }
    /**
     * @return The status of the node. (`ready`, `not_ready`)
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LkeNodePoolNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Integer instanceId;
        private String status;
        public Builder() {}
        public Builder(LkeNodePoolNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("LkeNodePoolNode", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(Integer instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("LkeNodePoolNode", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("LkeNodePoolNode", "status");
            }
            this.status = status;
            return this;
        }
        public LkeNodePoolNode build() {
            final var _resultValue = new LkeNodePoolNode();
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
