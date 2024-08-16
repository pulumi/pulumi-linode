// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetImagesImageReplication {
    /**
     * @return The region of an image replica.
     * 
     */
    private String region;
    /**
     * @return The status of an image replica.
     * 
     */
    private String status;

    private GetImagesImageReplication() {}
    /**
     * @return The region of an image replica.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The status of an image replica.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagesImageReplication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String region;
        private String status;
        public Builder() {}
        public Builder(GetImagesImageReplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetImagesImageReplication", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetImagesImageReplication", "status");
            }
            this.status = status;
            return this;
        }
        public GetImagesImageReplication build() {
            final var _resultValue = new GetImagesImageReplication();
            _resultValue.region = region;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
