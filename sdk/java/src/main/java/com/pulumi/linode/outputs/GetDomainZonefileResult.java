// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainZonefileResult {
    /**
     * @return The associated domain&#39;s unique ID.
     * 
     */
    private Integer domainId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Array of strings representing the Domain Zonefile.
     * 
     */
    private @Nullable List<String> zoneFiles;

    private GetDomainZonefileResult() {}
    /**
     * @return The associated domain&#39;s unique ID.
     * 
     */
    public Integer domainId() {
        return this.domainId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Array of strings representing the Domain Zonefile.
     * 
     */
    public List<String> zoneFiles() {
        return this.zoneFiles == null ? List.of() : this.zoneFiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainZonefileResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer domainId;
        private String id;
        private @Nullable List<String> zoneFiles;
        public Builder() {}
        public Builder(GetDomainZonefileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainId = defaults.domainId;
    	      this.id = defaults.id;
    	      this.zoneFiles = defaults.zoneFiles;
        }

        @CustomType.Setter
        public Builder domainId(Integer domainId) {
            this.domainId = Objects.requireNonNull(domainId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder zoneFiles(@Nullable List<String> zoneFiles) {
            this.zoneFiles = zoneFiles;
            return this;
        }
        public Builder zoneFiles(String... zoneFiles) {
            return zoneFiles(List.of(zoneFiles));
        }
        public GetDomainZonefileResult build() {
            final var o = new GetDomainZonefileResult();
            o.domainId = domainId;
            o.id = id;
            o.zoneFiles = zoneFiles;
            return o;
        }
    }
}
