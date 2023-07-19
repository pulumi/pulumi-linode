// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetUserDatabaseGrant;
import com.pulumi.linode.inputs.GetUserDomainGrant;
import com.pulumi.linode.inputs.GetUserFirewallGrant;
import com.pulumi.linode.inputs.GetUserImageGrant;
import com.pulumi.linode.inputs.GetUserLinodeGrant;
import com.pulumi.linode.inputs.GetUserLongviewGrant;
import com.pulumi.linode.inputs.GetUserNodebalancerGrant;
import com.pulumi.linode.inputs.GetUserStackscriptGrant;
import com.pulumi.linode.inputs.GetUserVolumeGrant;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserPlainArgs Empty = new GetUserPlainArgs();

    @Import(name="databaseGrants")
    private @Nullable List<GetUserDatabaseGrant> databaseGrants;

    public Optional<List<GetUserDatabaseGrant>> databaseGrants() {
        return Optional.ofNullable(this.databaseGrants);
    }

    @Import(name="domainGrants")
    private @Nullable List<GetUserDomainGrant> domainGrants;

    public Optional<List<GetUserDomainGrant>> domainGrants() {
        return Optional.ofNullable(this.domainGrants);
    }

    @Import(name="firewallGrants")
    private @Nullable List<GetUserFirewallGrant> firewallGrants;

    public Optional<List<GetUserFirewallGrant>> firewallGrants() {
        return Optional.ofNullable(this.firewallGrants);
    }

    @Import(name="imageGrants")
    private @Nullable List<GetUserImageGrant> imageGrants;

    public Optional<List<GetUserImageGrant>> imageGrants() {
        return Optional.ofNullable(this.imageGrants);
    }

    @Import(name="linodeGrants")
    private @Nullable List<GetUserLinodeGrant> linodeGrants;

    public Optional<List<GetUserLinodeGrant>> linodeGrants() {
        return Optional.ofNullable(this.linodeGrants);
    }

    @Import(name="longviewGrants")
    private @Nullable List<GetUserLongviewGrant> longviewGrants;

    public Optional<List<GetUserLongviewGrant>> longviewGrants() {
        return Optional.ofNullable(this.longviewGrants);
    }

    @Import(name="nodebalancerGrants")
    private @Nullable List<GetUserNodebalancerGrant> nodebalancerGrants;

    public Optional<List<GetUserNodebalancerGrant>> nodebalancerGrants() {
        return Optional.ofNullable(this.nodebalancerGrants);
    }

    @Import(name="stackscriptGrants")
    private @Nullable List<GetUserStackscriptGrant> stackscriptGrants;

    public Optional<List<GetUserStackscriptGrant>> stackscriptGrants() {
        return Optional.ofNullable(this.stackscriptGrants);
    }

    /**
     * The unique username of this User.
     * 
     */
    @Import(name="username", required=true)
    private String username;

    /**
     * @return The unique username of this User.
     * 
     */
    public String username() {
        return this.username;
    }

    @Import(name="volumeGrants")
    private @Nullable List<GetUserVolumeGrant> volumeGrants;

    public Optional<List<GetUserVolumeGrant>> volumeGrants() {
        return Optional.ofNullable(this.volumeGrants);
    }

    private GetUserPlainArgs() {}

    private GetUserPlainArgs(GetUserPlainArgs $) {
        this.databaseGrants = $.databaseGrants;
        this.domainGrants = $.domainGrants;
        this.firewallGrants = $.firewallGrants;
        this.imageGrants = $.imageGrants;
        this.linodeGrants = $.linodeGrants;
        this.longviewGrants = $.longviewGrants;
        this.nodebalancerGrants = $.nodebalancerGrants;
        this.stackscriptGrants = $.stackscriptGrants;
        this.username = $.username;
        this.volumeGrants = $.volumeGrants;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserPlainArgs $;

        public Builder() {
            $ = new GetUserPlainArgs();
        }

        public Builder(GetUserPlainArgs defaults) {
            $ = new GetUserPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder databaseGrants(@Nullable List<GetUserDatabaseGrant> databaseGrants) {
            $.databaseGrants = databaseGrants;
            return this;
        }

        public Builder databaseGrants(GetUserDatabaseGrant... databaseGrants) {
            return databaseGrants(List.of(databaseGrants));
        }

        public Builder domainGrants(@Nullable List<GetUserDomainGrant> domainGrants) {
            $.domainGrants = domainGrants;
            return this;
        }

        public Builder domainGrants(GetUserDomainGrant... domainGrants) {
            return domainGrants(List.of(domainGrants));
        }

        public Builder firewallGrants(@Nullable List<GetUserFirewallGrant> firewallGrants) {
            $.firewallGrants = firewallGrants;
            return this;
        }

        public Builder firewallGrants(GetUserFirewallGrant... firewallGrants) {
            return firewallGrants(List.of(firewallGrants));
        }

        public Builder imageGrants(@Nullable List<GetUserImageGrant> imageGrants) {
            $.imageGrants = imageGrants;
            return this;
        }

        public Builder imageGrants(GetUserImageGrant... imageGrants) {
            return imageGrants(List.of(imageGrants));
        }

        public Builder linodeGrants(@Nullable List<GetUserLinodeGrant> linodeGrants) {
            $.linodeGrants = linodeGrants;
            return this;
        }

        public Builder linodeGrants(GetUserLinodeGrant... linodeGrants) {
            return linodeGrants(List.of(linodeGrants));
        }

        public Builder longviewGrants(@Nullable List<GetUserLongviewGrant> longviewGrants) {
            $.longviewGrants = longviewGrants;
            return this;
        }

        public Builder longviewGrants(GetUserLongviewGrant... longviewGrants) {
            return longviewGrants(List.of(longviewGrants));
        }

        public Builder nodebalancerGrants(@Nullable List<GetUserNodebalancerGrant> nodebalancerGrants) {
            $.nodebalancerGrants = nodebalancerGrants;
            return this;
        }

        public Builder nodebalancerGrants(GetUserNodebalancerGrant... nodebalancerGrants) {
            return nodebalancerGrants(List.of(nodebalancerGrants));
        }

        public Builder stackscriptGrants(@Nullable List<GetUserStackscriptGrant> stackscriptGrants) {
            $.stackscriptGrants = stackscriptGrants;
            return this;
        }

        public Builder stackscriptGrants(GetUserStackscriptGrant... stackscriptGrants) {
            return stackscriptGrants(List.of(stackscriptGrants));
        }

        /**
         * @param username The unique username of this User.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            $.username = username;
            return this;
        }

        public Builder volumeGrants(@Nullable List<GetUserVolumeGrant> volumeGrants) {
            $.volumeGrants = volumeGrants;
            return this;
        }

        public Builder volumeGrants(GetUserVolumeGrant... volumeGrants) {
            return volumeGrants(List.of(volumeGrants));
        }

        public GetUserPlainArgs build() {
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
