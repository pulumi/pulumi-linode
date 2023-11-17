// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.ObjectStorageKeyBucketAccessArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectStorageKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectStorageKeyArgs Empty = new ObjectStorageKeyArgs();

    /**
     * Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
     * 
     */
    @Import(name="bucketAccesses")
    private @Nullable Output<List<ObjectStorageKeyBucketAccessArgs>> bucketAccesses;

    /**
     * @return Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
     * 
     */
    public Optional<Output<List<ObjectStorageKeyBucketAccessArgs>>> bucketAccesses() {
        return Optional.ofNullable(this.bucketAccesses);
    }

    /**
     * The label given to this key. For display purposes only.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The label given to this key. For display purposes only.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    private ObjectStorageKeyArgs() {}

    private ObjectStorageKeyArgs(ObjectStorageKeyArgs $) {
        this.bucketAccesses = $.bucketAccesses;
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectStorageKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectStorageKeyArgs $;

        public Builder() {
            $ = new ObjectStorageKeyArgs();
        }

        public Builder(ObjectStorageKeyArgs defaults) {
            $ = new ObjectStorageKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketAccesses Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
         * 
         * @return builder
         * 
         */
        public Builder bucketAccesses(@Nullable Output<List<ObjectStorageKeyBucketAccessArgs>> bucketAccesses) {
            $.bucketAccesses = bucketAccesses;
            return this;
        }

        /**
         * @param bucketAccesses Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
         * 
         * @return builder
         * 
         */
        public Builder bucketAccesses(List<ObjectStorageKeyBucketAccessArgs> bucketAccesses) {
            return bucketAccesses(Output.of(bucketAccesses));
        }

        /**
         * @param bucketAccesses Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
         * 
         * @return builder
         * 
         */
        public Builder bucketAccesses(ObjectStorageKeyBucketAccessArgs... bucketAccesses) {
            return bucketAccesses(List.of(bucketAccesses));
        }

        /**
         * @param label The label given to this key. For display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label given to this key. For display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        public ObjectStorageKeyArgs build() {
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            return $;
        }
    }

}
