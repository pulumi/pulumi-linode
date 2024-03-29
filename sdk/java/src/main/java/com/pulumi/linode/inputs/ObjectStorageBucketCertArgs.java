// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ObjectStorageBucketCertArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectStorageBucketCertArgs Empty = new ObjectStorageBucketCertArgs();

    /**
     * The Base64 encoded and PEM formatted SSL certificate.
     * 
     */
    @Import(name="certificate", required=true)
    private Output<String> certificate;

    /**
     * @return The Base64 encoded and PEM formatted SSL certificate.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }

    /**
     * The private key associated with the TLS/SSL certificate.
     * 
     */
    @Import(name="privateKey", required=true)
    private Output<String> privateKey;

    /**
     * @return The private key associated with the TLS/SSL certificate.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }

    private ObjectStorageBucketCertArgs() {}

    private ObjectStorageBucketCertArgs(ObjectStorageBucketCertArgs $) {
        this.certificate = $.certificate;
        this.privateKey = $.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectStorageBucketCertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectStorageBucketCertArgs $;

        public Builder() {
            $ = new ObjectStorageBucketCertArgs();
        }

        public Builder(ObjectStorageBucketCertArgs defaults) {
            $ = new ObjectStorageBucketCertArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate The Base64 encoded and PEM formatted SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate The Base64 encoded and PEM formatted SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param privateKey The private key associated with the TLS/SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey The private key associated with the TLS/SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public ObjectStorageBucketCertArgs build() {
            if ($.certificate == null) {
                throw new MissingRequiredPropertyException("ObjectStorageBucketCertArgs", "certificate");
            }
            if ($.privateKey == null) {
                throw new MissingRequiredPropertyException("ObjectStorageBucketCertArgs", "privateKey");
            }
            return $;
        }
    }

}
