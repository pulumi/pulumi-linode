// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.ObjectStorageBucketCertArgs;
import com.pulumi.linode.inputs.ObjectStorageBucketLifecycleRuleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectStorageBucketArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectStorageBucketArgs Empty = new ObjectStorageBucketArgs();

    /**
     * The access key to authenticate with.
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return The access key to authenticate with.
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    /**
     * The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
     * 
     */
    @Import(name="acl")
    private @Nullable Output<String> acl;

    /**
     * @return The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
     * 
     */
    public Optional<Output<String>> acl() {
        return Optional.ofNullable(this.acl);
    }

    /**
     * `cert` - (Optional) The bucket&#39;s TLS/SSL certificate.
     * 
     */
    @Import(name="cert")
    private @Nullable Output<ObjectStorageBucketCertArgs> cert;

    /**
     * @return `cert` - (Optional) The bucket&#39;s TLS/SSL certificate.
     * 
     */
    public Optional<Output<ObjectStorageBucketCertArgs>> cert() {
        return Optional.ofNullable(this.cert);
    }

    /**
     * The cluster of the Linode Object Storage Bucket.
     * 
     */
    @Import(name="cluster", required=true)
    private Output<String> cluster;

    /**
     * @return The cluster of the Linode Object Storage Bucket.
     * 
     */
    public Output<String> cluster() {
        return this.cluster;
    }

    /**
     * If true, the bucket will have CORS enabled for all origins.
     * 
     */
    @Import(name="corsEnabled")
    private @Nullable Output<Boolean> corsEnabled;

    /**
     * @return If true, the bucket will have CORS enabled for all origins.
     * 
     */
    public Optional<Output<Boolean>> corsEnabled() {
        return Optional.ofNullable(this.corsEnabled);
    }

    /**
     * The label of the Linode Object Storage Bucket.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The label of the Linode Object Storage Bucket.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * `lifecycle_rule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `access_key` and `secret_key`)
     * 
     */
    @Import(name="lifecycleRules")
    private @Nullable Output<List<ObjectStorageBucketLifecycleRuleArgs>> lifecycleRules;

    /**
     * @return `lifecycle_rule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `access_key` and `secret_key`)
     * 
     */
    public Optional<Output<List<ObjectStorageBucketLifecycleRuleArgs>>> lifecycleRules() {
        return Optional.ofNullable(this.lifecycleRules);
    }

    /**
     * The secret key to authenticate with.
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    /**
     * @return The secret key to authenticate with.
     * 
     */
    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    /**
     * Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `access_key` and `secret_key`)
     * 
     */
    @Import(name="versioning")
    private @Nullable Output<Boolean> versioning;

    /**
     * @return Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `access_key` and `secret_key`)
     * 
     */
    public Optional<Output<Boolean>> versioning() {
        return Optional.ofNullable(this.versioning);
    }

    private ObjectStorageBucketArgs() {}

    private ObjectStorageBucketArgs(ObjectStorageBucketArgs $) {
        this.accessKey = $.accessKey;
        this.acl = $.acl;
        this.cert = $.cert;
        this.cluster = $.cluster;
        this.corsEnabled = $.corsEnabled;
        this.label = $.label;
        this.lifecycleRules = $.lifecycleRules;
        this.secretKey = $.secretKey;
        this.versioning = $.versioning;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectStorageBucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectStorageBucketArgs $;

        public Builder() {
            $ = new ObjectStorageBucketArgs();
        }

        public Builder(ObjectStorageBucketArgs defaults) {
            $ = new ObjectStorageBucketArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey The access key to authenticate with.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey The access key to authenticate with.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param acl The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
         * 
         * @return builder
         * 
         */
        public Builder acl(@Nullable Output<String> acl) {
            $.acl = acl;
            return this;
        }

        /**
         * @param acl The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
         * 
         * @return builder
         * 
         */
        public Builder acl(String acl) {
            return acl(Output.of(acl));
        }

        /**
         * @param cert `cert` - (Optional) The bucket&#39;s TLS/SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder cert(@Nullable Output<ObjectStorageBucketCertArgs> cert) {
            $.cert = cert;
            return this;
        }

        /**
         * @param cert `cert` - (Optional) The bucket&#39;s TLS/SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder cert(ObjectStorageBucketCertArgs cert) {
            return cert(Output.of(cert));
        }

        /**
         * @param cluster The cluster of the Linode Object Storage Bucket.
         * 
         * @return builder
         * 
         */
        public Builder cluster(Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster The cluster of the Linode Object Storage Bucket.
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        /**
         * @param corsEnabled If true, the bucket will have CORS enabled for all origins.
         * 
         * @return builder
         * 
         */
        public Builder corsEnabled(@Nullable Output<Boolean> corsEnabled) {
            $.corsEnabled = corsEnabled;
            return this;
        }

        /**
         * @param corsEnabled If true, the bucket will have CORS enabled for all origins.
         * 
         * @return builder
         * 
         */
        public Builder corsEnabled(Boolean corsEnabled) {
            return corsEnabled(Output.of(corsEnabled));
        }

        /**
         * @param label The label of the Linode Object Storage Bucket.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label of the Linode Object Storage Bucket.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param lifecycleRules `lifecycle_rule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `access_key` and `secret_key`)
         * 
         * @return builder
         * 
         */
        public Builder lifecycleRules(@Nullable Output<List<ObjectStorageBucketLifecycleRuleArgs>> lifecycleRules) {
            $.lifecycleRules = lifecycleRules;
            return this;
        }

        /**
         * @param lifecycleRules `lifecycle_rule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `access_key` and `secret_key`)
         * 
         * @return builder
         * 
         */
        public Builder lifecycleRules(List<ObjectStorageBucketLifecycleRuleArgs> lifecycleRules) {
            return lifecycleRules(Output.of(lifecycleRules));
        }

        /**
         * @param lifecycleRules `lifecycle_rule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `access_key` and `secret_key`)
         * 
         * @return builder
         * 
         */
        public Builder lifecycleRules(ObjectStorageBucketLifecycleRuleArgs... lifecycleRules) {
            return lifecycleRules(List.of(lifecycleRules));
        }

        /**
         * @param secretKey The secret key to authenticate with.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey The secret key to authenticate with.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param versioning Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `access_key` and `secret_key`)
         * 
         * @return builder
         * 
         */
        public Builder versioning(@Nullable Output<Boolean> versioning) {
            $.versioning = versioning;
            return this;
        }

        /**
         * @param versioning Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `access_key` and `secret_key`)
         * 
         * @return builder
         * 
         */
        public Builder versioning(Boolean versioning) {
            return versioning(Output.of(versioning));
        }

        public ObjectStorageBucketArgs build() {
            $.cluster = Objects.requireNonNull($.cluster, "expected parameter 'cluster' to be non-null");
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            return $;
        }
    }

}
