// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLinodeObjectStorageBucketResult {
    private String cluster;
    private String created;
    private String hostname;
    private String id;
    private String label;
    private Integer objects;
    private String region;
    private Integer size;

    private GetLinodeObjectStorageBucketResult() {}
    public String cluster() {
        return this.cluster;
    }
    public String created() {
        return this.created;
    }
    public String hostname() {
        return this.hostname;
    }
    public String id() {
        return this.id;
    }
    public String label() {
        return this.label;
    }
    public Integer objects() {
        return this.objects;
    }
    public String region() {
        return this.region;
    }
    public Integer size() {
        return this.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinodeObjectStorageBucketResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cluster;
        private String created;
        private String hostname;
        private String id;
        private String label;
        private Integer objects;
        private String region;
        private Integer size;
        public Builder() {}
        public Builder(GetLinodeObjectStorageBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.created = defaults.created;
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.objects = defaults.objects;
    	      this.region = defaults.region;
    	      this.size = defaults.size;
        }

        @CustomType.Setter
        public Builder cluster(String cluster) {
            if (cluster == null) {
              throw new MissingRequiredPropertyException("GetLinodeObjectStorageBucketResult", "cluster");
            }
            this.cluster = cluster;
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            if (created == null) {
              throw new MissingRequiredPropertyException("GetLinodeObjectStorageBucketResult", "created");
            }
            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            if (hostname == null) {
              throw new MissingRequiredPropertyException("GetLinodeObjectStorageBucketResult", "hostname");
            }
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLinodeObjectStorageBucketResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            if (label == null) {
              throw new MissingRequiredPropertyException("GetLinodeObjectStorageBucketResult", "label");
            }
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder objects(Integer objects) {
            if (objects == null) {
              throw new MissingRequiredPropertyException("GetLinodeObjectStorageBucketResult", "objects");
            }
            this.objects = objects;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetLinodeObjectStorageBucketResult", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            if (size == null) {
              throw new MissingRequiredPropertyException("GetLinodeObjectStorageBucketResult", "size");
            }
            this.size = size;
            return this;
        }
        public GetLinodeObjectStorageBucketResult build() {
            final var _resultValue = new GetLinodeObjectStorageBucketResult();
            _resultValue.cluster = cluster;
            _resultValue.created = created;
            _resultValue.hostname = hostname;
            _resultValue.id = id;
            _resultValue.label = label;
            _resultValue.objects = objects;
            _resultValue.region = region;
            _resultValue.size = size;
            return _resultValue;
        }
    }
}
