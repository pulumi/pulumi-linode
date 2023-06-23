// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserGlobalGrant {
    private String accountAccess;
    private Boolean addDatabases;
    private Boolean addDomains;
    private Boolean addFirewalls;
    private Boolean addImages;
    private Boolean addLinodes;
    private Boolean addLongview;
    private Boolean addNodebalancers;
    private Boolean addStackscripts;
    private Boolean addVolumes;
    private Boolean cancelAccount;
    private Boolean longviewSubscription;

    private GetUserGlobalGrant() {}
    public String accountAccess() {
        return this.accountAccess;
    }
    public Boolean addDatabases() {
        return this.addDatabases;
    }
    public Boolean addDomains() {
        return this.addDomains;
    }
    public Boolean addFirewalls() {
        return this.addFirewalls;
    }
    public Boolean addImages() {
        return this.addImages;
    }
    public Boolean addLinodes() {
        return this.addLinodes;
    }
    public Boolean addLongview() {
        return this.addLongview;
    }
    public Boolean addNodebalancers() {
        return this.addNodebalancers;
    }
    public Boolean addStackscripts() {
        return this.addStackscripts;
    }
    public Boolean addVolumes() {
        return this.addVolumes;
    }
    public Boolean cancelAccount() {
        return this.cancelAccount;
    }
    public Boolean longviewSubscription() {
        return this.longviewSubscription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserGlobalGrant defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountAccess;
        private Boolean addDatabases;
        private Boolean addDomains;
        private Boolean addFirewalls;
        private Boolean addImages;
        private Boolean addLinodes;
        private Boolean addLongview;
        private Boolean addNodebalancers;
        private Boolean addStackscripts;
        private Boolean addVolumes;
        private Boolean cancelAccount;
        private Boolean longviewSubscription;
        public Builder() {}
        public Builder(GetUserGlobalGrant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountAccess = defaults.accountAccess;
    	      this.addDatabases = defaults.addDatabases;
    	      this.addDomains = defaults.addDomains;
    	      this.addFirewalls = defaults.addFirewalls;
    	      this.addImages = defaults.addImages;
    	      this.addLinodes = defaults.addLinodes;
    	      this.addLongview = defaults.addLongview;
    	      this.addNodebalancers = defaults.addNodebalancers;
    	      this.addStackscripts = defaults.addStackscripts;
    	      this.addVolumes = defaults.addVolumes;
    	      this.cancelAccount = defaults.cancelAccount;
    	      this.longviewSubscription = defaults.longviewSubscription;
        }

        @CustomType.Setter
        public Builder accountAccess(String accountAccess) {
            this.accountAccess = Objects.requireNonNull(accountAccess);
            return this;
        }
        @CustomType.Setter
        public Builder addDatabases(Boolean addDatabases) {
            this.addDatabases = Objects.requireNonNull(addDatabases);
            return this;
        }
        @CustomType.Setter
        public Builder addDomains(Boolean addDomains) {
            this.addDomains = Objects.requireNonNull(addDomains);
            return this;
        }
        @CustomType.Setter
        public Builder addFirewalls(Boolean addFirewalls) {
            this.addFirewalls = Objects.requireNonNull(addFirewalls);
            return this;
        }
        @CustomType.Setter
        public Builder addImages(Boolean addImages) {
            this.addImages = Objects.requireNonNull(addImages);
            return this;
        }
        @CustomType.Setter
        public Builder addLinodes(Boolean addLinodes) {
            this.addLinodes = Objects.requireNonNull(addLinodes);
            return this;
        }
        @CustomType.Setter
        public Builder addLongview(Boolean addLongview) {
            this.addLongview = Objects.requireNonNull(addLongview);
            return this;
        }
        @CustomType.Setter
        public Builder addNodebalancers(Boolean addNodebalancers) {
            this.addNodebalancers = Objects.requireNonNull(addNodebalancers);
            return this;
        }
        @CustomType.Setter
        public Builder addStackscripts(Boolean addStackscripts) {
            this.addStackscripts = Objects.requireNonNull(addStackscripts);
            return this;
        }
        @CustomType.Setter
        public Builder addVolumes(Boolean addVolumes) {
            this.addVolumes = Objects.requireNonNull(addVolumes);
            return this;
        }
        @CustomType.Setter
        public Builder cancelAccount(Boolean cancelAccount) {
            this.cancelAccount = Objects.requireNonNull(cancelAccount);
            return this;
        }
        @CustomType.Setter
        public Builder longviewSubscription(Boolean longviewSubscription) {
            this.longviewSubscription = Objects.requireNonNull(longviewSubscription);
            return this;
        }
        public GetUserGlobalGrant build() {
            final var o = new GetUserGlobalGrant();
            o.accountAccess = accountAccess;
            o.addDatabases = addDatabases;
            o.addDomains = addDomains;
            o.addFirewalls = addFirewalls;
            o.addImages = addImages;
            o.addLinodes = addLinodes;
            o.addLongview = addLongview;
            o.addNodebalancers = addNodebalancers;
            o.addStackscripts = addStackscripts;
            o.addVolumes = addVolumes;
            o.cancelAccount = cancelAccount;
            o.longviewSubscription = longviewSubscription;
            return o;
        }
    }
}
