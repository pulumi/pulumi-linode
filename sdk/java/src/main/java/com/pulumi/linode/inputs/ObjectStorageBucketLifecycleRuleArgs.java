// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.ObjectStorageBucketLifecycleRuleExpirationArgs;
import com.pulumi.linode.inputs.ObjectStorageBucketLifecycleRuleNoncurrentVersionExpirationArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectStorageBucketLifecycleRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectStorageBucketLifecycleRuleArgs Empty = new ObjectStorageBucketLifecycleRuleArgs();

    /**
     * Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
     * 
     * * `expiration` - (Optional) Specifies a period in the object&#39;s expire.
     * 
     * * `noncurrent_version_expiration` - (Optional) Specifies when non-current object versions expire.
     * 
     */
    @Import(name="abortIncompleteMultipartUploadDays")
    private @Nullable Output<Integer> abortIncompleteMultipartUploadDays;

    /**
     * @return Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
     * 
     * * `expiration` - (Optional) Specifies a period in the object&#39;s expire.
     * 
     * * `noncurrent_version_expiration` - (Optional) Specifies when non-current object versions expire.
     * 
     */
    public Optional<Output<Integer>> abortIncompleteMultipartUploadDays() {
        return Optional.ofNullable(this.abortIncompleteMultipartUploadDays);
    }

    /**
     * Specifies whether the lifecycle rule is active.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Specifies whether the lifecycle rule is active.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    @Import(name="expiration")
    private @Nullable Output<ObjectStorageBucketLifecycleRuleExpirationArgs> expiration;

    public Optional<Output<ObjectStorageBucketLifecycleRuleExpirationArgs>> expiration() {
        return Optional.ofNullable(this.expiration);
    }

    /**
     * The unique identifier for the rule.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The unique identifier for the rule.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="noncurrentVersionExpiration")
    private @Nullable Output<ObjectStorageBucketLifecycleRuleNoncurrentVersionExpirationArgs> noncurrentVersionExpiration;

    public Optional<Output<ObjectStorageBucketLifecycleRuleNoncurrentVersionExpirationArgs>> noncurrentVersionExpiration() {
        return Optional.ofNullable(this.noncurrentVersionExpiration);
    }

    /**
     * The object key prefix identifying one or more objects to which the rule applies.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return The object key prefix identifying one or more objects to which the rule applies.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private ObjectStorageBucketLifecycleRuleArgs() {}

    private ObjectStorageBucketLifecycleRuleArgs(ObjectStorageBucketLifecycleRuleArgs $) {
        this.abortIncompleteMultipartUploadDays = $.abortIncompleteMultipartUploadDays;
        this.enabled = $.enabled;
        this.expiration = $.expiration;
        this.id = $.id;
        this.noncurrentVersionExpiration = $.noncurrentVersionExpiration;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectStorageBucketLifecycleRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectStorageBucketLifecycleRuleArgs $;

        public Builder() {
            $ = new ObjectStorageBucketLifecycleRuleArgs();
        }

        public Builder(ObjectStorageBucketLifecycleRuleArgs defaults) {
            $ = new ObjectStorageBucketLifecycleRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param abortIncompleteMultipartUploadDays Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
         * 
         * * `expiration` - (Optional) Specifies a period in the object&#39;s expire.
         * 
         * * `noncurrent_version_expiration` - (Optional) Specifies when non-current object versions expire.
         * 
         * @return builder
         * 
         */
        public Builder abortIncompleteMultipartUploadDays(@Nullable Output<Integer> abortIncompleteMultipartUploadDays) {
            $.abortIncompleteMultipartUploadDays = abortIncompleteMultipartUploadDays;
            return this;
        }

        /**
         * @param abortIncompleteMultipartUploadDays Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
         * 
         * * `expiration` - (Optional) Specifies a period in the object&#39;s expire.
         * 
         * * `noncurrent_version_expiration` - (Optional) Specifies when non-current object versions expire.
         * 
         * @return builder
         * 
         */
        public Builder abortIncompleteMultipartUploadDays(Integer abortIncompleteMultipartUploadDays) {
            return abortIncompleteMultipartUploadDays(Output.of(abortIncompleteMultipartUploadDays));
        }

        /**
         * @param enabled Specifies whether the lifecycle rule is active.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether the lifecycle rule is active.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder expiration(@Nullable Output<ObjectStorageBucketLifecycleRuleExpirationArgs> expiration) {
            $.expiration = expiration;
            return this;
        }

        public Builder expiration(ObjectStorageBucketLifecycleRuleExpirationArgs expiration) {
            return expiration(Output.of(expiration));
        }

        /**
         * @param id The unique identifier for the rule.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique identifier for the rule.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder noncurrentVersionExpiration(@Nullable Output<ObjectStorageBucketLifecycleRuleNoncurrentVersionExpirationArgs> noncurrentVersionExpiration) {
            $.noncurrentVersionExpiration = noncurrentVersionExpiration;
            return this;
        }

        public Builder noncurrentVersionExpiration(ObjectStorageBucketLifecycleRuleNoncurrentVersionExpirationArgs noncurrentVersionExpiration) {
            return noncurrentVersionExpiration(Output.of(noncurrentVersionExpiration));
        }

        /**
         * @param prefix The object key prefix identifying one or more objects to which the rule applies.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix The object key prefix identifying one or more objects to which the rule applies.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public ObjectStorageBucketLifecycleRuleArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
