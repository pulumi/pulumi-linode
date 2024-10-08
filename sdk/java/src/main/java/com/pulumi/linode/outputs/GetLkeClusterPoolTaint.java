// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLkeClusterPoolTaint {
    /**
     * @return The Kubernetes taint effect. The accepted values are `NoSchedule`, `PreferNoSchedule` and `NoExecute`. For the descriptions of these values, see [Kubernetes Taints and Tolerations](https://kubernetes.io/docs/concepts/scheduling-eviction/taint-and-toleration/).
     * 
     */
    private String effect;
    /**
     * @return The Kubernetes taint key.
     * 
     */
    private String key;
    /**
     * @return The Kubernetes taint value.
     * 
     */
    private String value;

    private GetLkeClusterPoolTaint() {}
    /**
     * @return The Kubernetes taint effect. The accepted values are `NoSchedule`, `PreferNoSchedule` and `NoExecute`. For the descriptions of these values, see [Kubernetes Taints and Tolerations](https://kubernetes.io/docs/concepts/scheduling-eviction/taint-and-toleration/).
     * 
     */
    public String effect() {
        return this.effect;
    }
    /**
     * @return The Kubernetes taint key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The Kubernetes taint value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLkeClusterPoolTaint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String effect;
        private String key;
        private String value;
        public Builder() {}
        public Builder(GetLkeClusterPoolTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder effect(String effect) {
            if (effect == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterPoolTaint", "effect");
            }
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterPoolTaint", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterPoolTaint", "value");
            }
            this.value = value;
            return this;
        }
        public GetLkeClusterPoolTaint build() {
            final var _resultValue = new GetLkeClusterPoolTaint();
            _resultValue.effect = effect;
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
