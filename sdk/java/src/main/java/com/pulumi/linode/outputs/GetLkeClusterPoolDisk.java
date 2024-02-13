// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLkeClusterPoolDisk {
    /**
     * @return The size of this custom disk partition in MB.
     * 
     */
    private Integer size;
    /**
     * @return This custom disk partition’s filesystem type.
     * 
     */
    private String type;

    private GetLkeClusterPoolDisk() {}
    /**
     * @return The size of this custom disk partition in MB.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return This custom disk partition’s filesystem type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLkeClusterPoolDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer size;
        private String type;
        public Builder() {}
        public Builder(GetLkeClusterPoolDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder size(Integer size) {
            if (size == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterPoolDisk", "size");
            }
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterPoolDisk", "type");
            }
            this.type = type;
            return this;
        }
        public GetLkeClusterPoolDisk build() {
            final var _resultValue = new GetLkeClusterPoolDisk();
            _resultValue.size = size;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
