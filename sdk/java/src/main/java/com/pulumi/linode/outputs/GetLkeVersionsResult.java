// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetLkeVersionsVersion;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLkeVersionsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetLkeVersionsVersion> versions;

    private GetLkeVersionsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetLkeVersionsVersion> versions() {
        return this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLkeVersionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetLkeVersionsVersion> versions;
        public Builder() {}
        public Builder(GetLkeVersionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.versions = defaults.versions;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder versions(List<GetLkeVersionsVersion> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }
        public Builder versions(GetLkeVersionsVersion... versions) {
            return versions(List.of(versions));
        }
        public GetLkeVersionsResult build() {
            final var o = new GetLkeVersionsResult();
            o.id = id;
            o.versions = versions;
            return o;
        }
    }
}
