// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.ObjectStorageKeyBucketAccessArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectStorageKeyState extends com.pulumi.resources.ResourceArgs {

    public static final ObjectStorageKeyState Empty = new ObjectStorageKeyState();

    /**
     * This keypair&#39;s access key. This is not secret.
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return This keypair&#39;s access key. This is not secret.
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

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
     * ***
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The label given to this key. For display purposes only.
     * 
     * ***
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * Whether or not this key is a limited access key.
     * 
     */
    @Import(name="limited")
    private @Nullable Output<Boolean> limited;

    /**
     * @return Whether or not this key is a limited access key.
     * 
     */
    public Optional<Output<Boolean>> limited() {
        return Optional.ofNullable(this.limited);
    }

    /**
     * This keypair&#39;s secret key.
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    /**
     * @return This keypair&#39;s secret key.
     * 
     */
    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    private ObjectStorageKeyState() {}

    private ObjectStorageKeyState(ObjectStorageKeyState $) {
        this.accessKey = $.accessKey;
        this.bucketAccesses = $.bucketAccesses;
        this.label = $.label;
        this.limited = $.limited;
        this.secretKey = $.secretKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectStorageKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectStorageKeyState $;

        public Builder() {
            $ = new ObjectStorageKeyState();
        }

        public Builder(ObjectStorageKeyState defaults) {
            $ = new ObjectStorageKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey This keypair&#39;s access key. This is not secret.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey This keypair&#39;s access key. This is not secret.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
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
         * ***
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label given to this key. For display purposes only.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param limited Whether or not this key is a limited access key.
         * 
         * @return builder
         * 
         */
        public Builder limited(@Nullable Output<Boolean> limited) {
            $.limited = limited;
            return this;
        }

        /**
         * @param limited Whether or not this key is a limited access key.
         * 
         * @return builder
         * 
         */
        public Builder limited(Boolean limited) {
            return limited(Output.of(limited));
        }

        /**
         * @param secretKey This keypair&#39;s secret key.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey This keypair&#39;s secret key.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        public ObjectStorageKeyState build() {
            return $;
        }
    }

}
