// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ObjectStorageBucketLifecycleRuleNoncurrentVersionExpiration {
    /**
     * @return Specifies the number of days non-current object versions expire.
     * 
     */
    private Integer days;

    private ObjectStorageBucketLifecycleRuleNoncurrentVersionExpiration() {}
    /**
     * @return Specifies the number of days non-current object versions expire.
     * 
     */
    public Integer days() {
        return this.days;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectStorageBucketLifecycleRuleNoncurrentVersionExpiration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer days;
        public Builder() {}
        public Builder(ObjectStorageBucketLifecycleRuleNoncurrentVersionExpiration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
        }

        @CustomType.Setter
        public Builder days(Integer days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }
        public ObjectStorageBucketLifecycleRuleNoncurrentVersionExpiration build() {
            final var _resultValue = new ObjectStorageBucketLifecycleRuleNoncurrentVersionExpiration();
            _resultValue.days = days;
            return _resultValue;
        }
    }
}
