// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetObjectStorageQuotasQuotaArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetObjectStorageQuotasQuotaArgs Empty = new GetObjectStorageQuotasQuotaArgs();

    /**
     * The description of the Object Storage quota.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The description of the Object Storage quota.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * The type of the S3 endpoint of the Object Storage.
     * 
     */
    @Import(name="endpointType", required=true)
    private Output<String> endpointType;

    /**
     * @return The type of the S3 endpoint of the Object Storage.
     * 
     */
    public Output<String> endpointType() {
        return this.endpointType;
    }

    /**
     * The ID of the Object Storage quota.
     * 
     */
    @Import(name="quotaId", required=true)
    private Output<String> quotaId;

    /**
     * @return The ID of the Object Storage quota.
     * 
     */
    public Output<String> quotaId() {
        return this.quotaId;
    }

    /**
     * The maximum quantity of the `resource_metric` allowed by the quota.
     * 
     */
    @Import(name="quotaLimit", required=true)
    private Output<Integer> quotaLimit;

    /**
     * @return The maximum quantity of the `resource_metric` allowed by the quota.
     * 
     */
    public Output<Integer> quotaLimit() {
        return this.quotaLimit;
    }

    /**
     * The name of the Object Storage quota.
     * 
     */
    @Import(name="quotaName", required=true)
    private Output<String> quotaName;

    /**
     * @return The name of the Object Storage quota.
     * 
     */
    public Output<String> quotaName() {
        return this.quotaName;
    }

    /**
     * The specific Object Storage resource for the quota.
     * 
     */
    @Import(name="resourceMetric", required=true)
    private Output<String> resourceMetric;

    /**
     * @return The specific Object Storage resource for the quota.
     * 
     */
    public Output<String> resourceMetric() {
        return this.resourceMetric;
    }

    /**
     * The S3 endpoint URL of the Object Storage, based on the `endpoint_type` and `region`.
     * 
     */
    @Import(name="s3Endpoint", required=true)
    private Output<String> s3Endpoint;

    /**
     * @return The S3 endpoint URL of the Object Storage, based on the `endpoint_type` and `region`.
     * 
     */
    public Output<String> s3Endpoint() {
        return this.s3Endpoint;
    }

    private GetObjectStorageQuotasQuotaArgs() {}

    private GetObjectStorageQuotasQuotaArgs(GetObjectStorageQuotasQuotaArgs $) {
        this.description = $.description;
        this.endpointType = $.endpointType;
        this.quotaId = $.quotaId;
        this.quotaLimit = $.quotaLimit;
        this.quotaName = $.quotaName;
        this.resourceMetric = $.resourceMetric;
        this.s3Endpoint = $.s3Endpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetObjectStorageQuotasQuotaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetObjectStorageQuotasQuotaArgs $;

        public Builder() {
            $ = new GetObjectStorageQuotasQuotaArgs();
        }

        public Builder(GetObjectStorageQuotasQuotaArgs defaults) {
            $ = new GetObjectStorageQuotasQuotaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the Object Storage quota.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Object Storage quota.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param endpointType The type of the S3 endpoint of the Object Storage.
         * 
         * @return builder
         * 
         */
        public Builder endpointType(Output<String> endpointType) {
            $.endpointType = endpointType;
            return this;
        }

        /**
         * @param endpointType The type of the S3 endpoint of the Object Storage.
         * 
         * @return builder
         * 
         */
        public Builder endpointType(String endpointType) {
            return endpointType(Output.of(endpointType));
        }

        /**
         * @param quotaId The ID of the Object Storage quota.
         * 
         * @return builder
         * 
         */
        public Builder quotaId(Output<String> quotaId) {
            $.quotaId = quotaId;
            return this;
        }

        /**
         * @param quotaId The ID of the Object Storage quota.
         * 
         * @return builder
         * 
         */
        public Builder quotaId(String quotaId) {
            return quotaId(Output.of(quotaId));
        }

        /**
         * @param quotaLimit The maximum quantity of the `resource_metric` allowed by the quota.
         * 
         * @return builder
         * 
         */
        public Builder quotaLimit(Output<Integer> quotaLimit) {
            $.quotaLimit = quotaLimit;
            return this;
        }

        /**
         * @param quotaLimit The maximum quantity of the `resource_metric` allowed by the quota.
         * 
         * @return builder
         * 
         */
        public Builder quotaLimit(Integer quotaLimit) {
            return quotaLimit(Output.of(quotaLimit));
        }

        /**
         * @param quotaName The name of the Object Storage quota.
         * 
         * @return builder
         * 
         */
        public Builder quotaName(Output<String> quotaName) {
            $.quotaName = quotaName;
            return this;
        }

        /**
         * @param quotaName The name of the Object Storage quota.
         * 
         * @return builder
         * 
         */
        public Builder quotaName(String quotaName) {
            return quotaName(Output.of(quotaName));
        }

        /**
         * @param resourceMetric The specific Object Storage resource for the quota.
         * 
         * @return builder
         * 
         */
        public Builder resourceMetric(Output<String> resourceMetric) {
            $.resourceMetric = resourceMetric;
            return this;
        }

        /**
         * @param resourceMetric The specific Object Storage resource for the quota.
         * 
         * @return builder
         * 
         */
        public Builder resourceMetric(String resourceMetric) {
            return resourceMetric(Output.of(resourceMetric));
        }

        /**
         * @param s3Endpoint The S3 endpoint URL of the Object Storage, based on the `endpoint_type` and `region`.
         * 
         * @return builder
         * 
         */
        public Builder s3Endpoint(Output<String> s3Endpoint) {
            $.s3Endpoint = s3Endpoint;
            return this;
        }

        /**
         * @param s3Endpoint The S3 endpoint URL of the Object Storage, based on the `endpoint_type` and `region`.
         * 
         * @return builder
         * 
         */
        public Builder s3Endpoint(String s3Endpoint) {
            return s3Endpoint(Output.of(s3Endpoint));
        }

        public GetObjectStorageQuotasQuotaArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("GetObjectStorageQuotasQuotaArgs", "description");
            }
            if ($.endpointType == null) {
                throw new MissingRequiredPropertyException("GetObjectStorageQuotasQuotaArgs", "endpointType");
            }
            if ($.quotaId == null) {
                throw new MissingRequiredPropertyException("GetObjectStorageQuotasQuotaArgs", "quotaId");
            }
            if ($.quotaLimit == null) {
                throw new MissingRequiredPropertyException("GetObjectStorageQuotasQuotaArgs", "quotaLimit");
            }
            if ($.quotaName == null) {
                throw new MissingRequiredPropertyException("GetObjectStorageQuotasQuotaArgs", "quotaName");
            }
            if ($.resourceMetric == null) {
                throw new MissingRequiredPropertyException("GetObjectStorageQuotasQuotaArgs", "resourceMetric");
            }
            if ($.s3Endpoint == null) {
                throw new MissingRequiredPropertyException("GetObjectStorageQuotasQuotaArgs", "s3Endpoint");
            }
            return $;
        }
    }

}
