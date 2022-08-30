// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ObjectStorageKeyBucketAccess {
    /**
     * @return The unique label of the bucket to which the key will grant limited access.
     * 
     */
    private String bucketName;
    /**
     * @return The Object Storage cluster where a bucket to which the key is granting access is hosted.
     * 
     */
    private String cluster;
    /**
     * @return This Limited Access Key’s permissions for the selected bucket. *Changing `permissions` forces the creation of a new Object Storage Key.* (`read_write`, `read_only`)
     * 
     */
    private String permissions;

    private ObjectStorageKeyBucketAccess() {}
    /**
     * @return The unique label of the bucket to which the key will grant limited access.
     * 
     */
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * @return The Object Storage cluster where a bucket to which the key is granting access is hosted.
     * 
     */
    public String cluster() {
        return this.cluster;
    }
    /**
     * @return This Limited Access Key’s permissions for the selected bucket. *Changing `permissions` forces the creation of a new Object Storage Key.* (`read_write`, `read_only`)
     * 
     */
    public String permissions() {
        return this.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectStorageKeyBucketAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucketName;
        private String cluster;
        private String permissions;
        public Builder() {}
        public Builder(ObjectStorageKeyBucketAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.cluster = defaults.cluster;
    	      this.permissions = defaults.permissions;
        }

        @CustomType.Setter
        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        @CustomType.Setter
        public Builder cluster(String cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }
        @CustomType.Setter
        public Builder permissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public ObjectStorageKeyBucketAccess build() {
            final var o = new ObjectStorageKeyBucketAccess();
            o.bucketName = bucketName;
            o.cluster = cluster;
            o.permissions = permissions;
            return o;
        }
    }
}
