// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
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
    	      this.size = defaults.size;
        }

        @CustomType.Setter
        public Builder cluster(String cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder objects(Integer objects) {
            this.objects = Objects.requireNonNull(objects);
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public GetLinodeObjectStorageBucketResult build() {
            final var o = new GetLinodeObjectStorageBucketResult();
            o.cluster = cluster;
            o.created = created;
            o.hostname = hostname;
            o.id = id;
            o.label = label;
            o.objects = objects;
            o.size = size;
            return o;
        }
    }
}
