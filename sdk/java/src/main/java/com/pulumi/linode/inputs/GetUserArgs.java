// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetUserDatabaseGrantArgs;
import com.pulumi.linode.inputs.GetUserDomainGrantArgs;
import com.pulumi.linode.inputs.GetUserFirewallGrantArgs;
import com.pulumi.linode.inputs.GetUserImageGrantArgs;
import com.pulumi.linode.inputs.GetUserLinodeGrantArgs;
import com.pulumi.linode.inputs.GetUserLongviewGrantArgs;
import com.pulumi.linode.inputs.GetUserNodebalancerGrantArgs;
import com.pulumi.linode.inputs.GetUserPlacementGroupGrantArgs;
import com.pulumi.linode.inputs.GetUserStackscriptGrantArgs;
import com.pulumi.linode.inputs.GetUserVolumeGrantArgs;
import com.pulumi.linode.inputs.GetUserVpcGrantArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserArgs Empty = new GetUserArgs();

    @Import(name="databaseGrants")
    private @Nullable Output<List<GetUserDatabaseGrantArgs>> databaseGrants;

    public Optional<Output<List<GetUserDatabaseGrantArgs>>> databaseGrants() {
        return Optional.ofNullable(this.databaseGrants);
    }

    @Import(name="domainGrants")
    private @Nullable Output<List<GetUserDomainGrantArgs>> domainGrants;

    public Optional<Output<List<GetUserDomainGrantArgs>>> domainGrants() {
        return Optional.ofNullable(this.domainGrants);
    }

    @Import(name="firewallGrants")
    private @Nullable Output<List<GetUserFirewallGrantArgs>> firewallGrants;

    public Optional<Output<List<GetUserFirewallGrantArgs>>> firewallGrants() {
        return Optional.ofNullable(this.firewallGrants);
    }

    @Import(name="imageGrants")
    private @Nullable Output<List<GetUserImageGrantArgs>> imageGrants;

    public Optional<Output<List<GetUserImageGrantArgs>>> imageGrants() {
        return Optional.ofNullable(this.imageGrants);
    }

    @Import(name="linodeGrants")
    private @Nullable Output<List<GetUserLinodeGrantArgs>> linodeGrants;

    public Optional<Output<List<GetUserLinodeGrantArgs>>> linodeGrants() {
        return Optional.ofNullable(this.linodeGrants);
    }

    @Import(name="longviewGrants")
    private @Nullable Output<List<GetUserLongviewGrantArgs>> longviewGrants;

    public Optional<Output<List<GetUserLongviewGrantArgs>>> longviewGrants() {
        return Optional.ofNullable(this.longviewGrants);
    }

    @Import(name="nodebalancerGrants")
    private @Nullable Output<List<GetUserNodebalancerGrantArgs>> nodebalancerGrants;

    public Optional<Output<List<GetUserNodebalancerGrantArgs>>> nodebalancerGrants() {
        return Optional.ofNullable(this.nodebalancerGrants);
    }

    @Import(name="placementGroupGrants")
    private @Nullable Output<List<GetUserPlacementGroupGrantArgs>> placementGroupGrants;

    public Optional<Output<List<GetUserPlacementGroupGrantArgs>>> placementGroupGrants() {
        return Optional.ofNullable(this.placementGroupGrants);
    }

    @Import(name="stackscriptGrants")
    private @Nullable Output<List<GetUserStackscriptGrantArgs>> stackscriptGrants;

    public Optional<Output<List<GetUserStackscriptGrantArgs>>> stackscriptGrants() {
        return Optional.ofNullable(this.stackscriptGrants);
    }

    /**
     * The unique username of this User.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The unique username of this User.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    @Import(name="volumeGrants")
    private @Nullable Output<List<GetUserVolumeGrantArgs>> volumeGrants;

    public Optional<Output<List<GetUserVolumeGrantArgs>>> volumeGrants() {
        return Optional.ofNullable(this.volumeGrants);
    }

    @Import(name="vpcGrants")
    private @Nullable Output<List<GetUserVpcGrantArgs>> vpcGrants;

    public Optional<Output<List<GetUserVpcGrantArgs>>> vpcGrants() {
        return Optional.ofNullable(this.vpcGrants);
    }

    private GetUserArgs() {}

    private GetUserArgs(GetUserArgs $) {
        this.databaseGrants = $.databaseGrants;
        this.domainGrants = $.domainGrants;
        this.firewallGrants = $.firewallGrants;
        this.imageGrants = $.imageGrants;
        this.linodeGrants = $.linodeGrants;
        this.longviewGrants = $.longviewGrants;
        this.nodebalancerGrants = $.nodebalancerGrants;
        this.placementGroupGrants = $.placementGroupGrants;
        this.stackscriptGrants = $.stackscriptGrants;
        this.username = $.username;
        this.volumeGrants = $.volumeGrants;
        this.vpcGrants = $.vpcGrants;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserArgs $;

        public Builder() {
            $ = new GetUserArgs();
        }

        public Builder(GetUserArgs defaults) {
            $ = new GetUserArgs(Objects.requireNonNull(defaults));
        }

        public Builder databaseGrants(@Nullable Output<List<GetUserDatabaseGrantArgs>> databaseGrants) {
            $.databaseGrants = databaseGrants;
            return this;
        }

        public Builder databaseGrants(List<GetUserDatabaseGrantArgs> databaseGrants) {
            return databaseGrants(Output.of(databaseGrants));
        }

        public Builder databaseGrants(GetUserDatabaseGrantArgs... databaseGrants) {
            return databaseGrants(List.of(databaseGrants));
        }

        public Builder domainGrants(@Nullable Output<List<GetUserDomainGrantArgs>> domainGrants) {
            $.domainGrants = domainGrants;
            return this;
        }

        public Builder domainGrants(List<GetUserDomainGrantArgs> domainGrants) {
            return domainGrants(Output.of(domainGrants));
        }

        public Builder domainGrants(GetUserDomainGrantArgs... domainGrants) {
            return domainGrants(List.of(domainGrants));
        }

        public Builder firewallGrants(@Nullable Output<List<GetUserFirewallGrantArgs>> firewallGrants) {
            $.firewallGrants = firewallGrants;
            return this;
        }

        public Builder firewallGrants(List<GetUserFirewallGrantArgs> firewallGrants) {
            return firewallGrants(Output.of(firewallGrants));
        }

        public Builder firewallGrants(GetUserFirewallGrantArgs... firewallGrants) {
            return firewallGrants(List.of(firewallGrants));
        }

        public Builder imageGrants(@Nullable Output<List<GetUserImageGrantArgs>> imageGrants) {
            $.imageGrants = imageGrants;
            return this;
        }

        public Builder imageGrants(List<GetUserImageGrantArgs> imageGrants) {
            return imageGrants(Output.of(imageGrants));
        }

        public Builder imageGrants(GetUserImageGrantArgs... imageGrants) {
            return imageGrants(List.of(imageGrants));
        }

        public Builder linodeGrants(@Nullable Output<List<GetUserLinodeGrantArgs>> linodeGrants) {
            $.linodeGrants = linodeGrants;
            return this;
        }

        public Builder linodeGrants(List<GetUserLinodeGrantArgs> linodeGrants) {
            return linodeGrants(Output.of(linodeGrants));
        }

        public Builder linodeGrants(GetUserLinodeGrantArgs... linodeGrants) {
            return linodeGrants(List.of(linodeGrants));
        }

        public Builder longviewGrants(@Nullable Output<List<GetUserLongviewGrantArgs>> longviewGrants) {
            $.longviewGrants = longviewGrants;
            return this;
        }

        public Builder longviewGrants(List<GetUserLongviewGrantArgs> longviewGrants) {
            return longviewGrants(Output.of(longviewGrants));
        }

        public Builder longviewGrants(GetUserLongviewGrantArgs... longviewGrants) {
            return longviewGrants(List.of(longviewGrants));
        }

        public Builder nodebalancerGrants(@Nullable Output<List<GetUserNodebalancerGrantArgs>> nodebalancerGrants) {
            $.nodebalancerGrants = nodebalancerGrants;
            return this;
        }

        public Builder nodebalancerGrants(List<GetUserNodebalancerGrantArgs> nodebalancerGrants) {
            return nodebalancerGrants(Output.of(nodebalancerGrants));
        }

        public Builder nodebalancerGrants(GetUserNodebalancerGrantArgs... nodebalancerGrants) {
            return nodebalancerGrants(List.of(nodebalancerGrants));
        }

        public Builder placementGroupGrants(@Nullable Output<List<GetUserPlacementGroupGrantArgs>> placementGroupGrants) {
            $.placementGroupGrants = placementGroupGrants;
            return this;
        }

        public Builder placementGroupGrants(List<GetUserPlacementGroupGrantArgs> placementGroupGrants) {
            return placementGroupGrants(Output.of(placementGroupGrants));
        }

        public Builder placementGroupGrants(GetUserPlacementGroupGrantArgs... placementGroupGrants) {
            return placementGroupGrants(List.of(placementGroupGrants));
        }

        public Builder stackscriptGrants(@Nullable Output<List<GetUserStackscriptGrantArgs>> stackscriptGrants) {
            $.stackscriptGrants = stackscriptGrants;
            return this;
        }

        public Builder stackscriptGrants(List<GetUserStackscriptGrantArgs> stackscriptGrants) {
            return stackscriptGrants(Output.of(stackscriptGrants));
        }

        public Builder stackscriptGrants(GetUserStackscriptGrantArgs... stackscriptGrants) {
            return stackscriptGrants(List.of(stackscriptGrants));
        }

        /**
         * @param username The unique username of this User.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The unique username of this User.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public Builder volumeGrants(@Nullable Output<List<GetUserVolumeGrantArgs>> volumeGrants) {
            $.volumeGrants = volumeGrants;
            return this;
        }

        public Builder volumeGrants(List<GetUserVolumeGrantArgs> volumeGrants) {
            return volumeGrants(Output.of(volumeGrants));
        }

        public Builder volumeGrants(GetUserVolumeGrantArgs... volumeGrants) {
            return volumeGrants(List.of(volumeGrants));
        }

        public Builder vpcGrants(@Nullable Output<List<GetUserVpcGrantArgs>> vpcGrants) {
            $.vpcGrants = vpcGrants;
            return this;
        }

        public Builder vpcGrants(List<GetUserVpcGrantArgs> vpcGrants) {
            return vpcGrants(Output.of(vpcGrants));
        }

        public Builder vpcGrants(GetUserVpcGrantArgs... vpcGrants) {
            return vpcGrants(List.of(vpcGrants));
        }

        public GetUserArgs build() {
            if ($.username == null) {
                throw new MissingRequiredPropertyException("GetUserArgs", "username");
            }
            return $;
        }
    }

}
