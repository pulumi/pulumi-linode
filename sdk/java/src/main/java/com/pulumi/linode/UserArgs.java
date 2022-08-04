// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.UserDomainGrantArgs;
import com.pulumi.linode.inputs.UserFirewallGrantArgs;
import com.pulumi.linode.inputs.UserGlobalGrantsArgs;
import com.pulumi.linode.inputs.UserImageGrantArgs;
import com.pulumi.linode.inputs.UserLinodeGrantArgs;
import com.pulumi.linode.inputs.UserLongviewGrantArgs;
import com.pulumi.linode.inputs.UserNodebalancerGrantArgs;
import com.pulumi.linode.inputs.UserStackscriptGrantArgs;
import com.pulumi.linode.inputs.UserVolumeGrantArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * The domains the user has permissions access to.
     * 
     */
    @Import(name="domainGrants")
    private @Nullable Output<List<UserDomainGrantArgs>> domainGrants;

    /**
     * @return The domains the user has permissions access to.
     * 
     */
    public Optional<Output<List<UserDomainGrantArgs>>> domainGrants() {
        return Optional.ofNullable(this.domainGrants);
    }

    /**
     * The email address of the user.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return The email address of the user.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    /**
     * The firewalls the user has permissions access to.
     * 
     */
    @Import(name="firewallGrants")
    private @Nullable Output<List<UserFirewallGrantArgs>> firewallGrants;

    /**
     * @return The firewalls the user has permissions access to.
     * 
     */
    public Optional<Output<List<UserFirewallGrantArgs>>> firewallGrants() {
        return Optional.ofNullable(this.firewallGrants);
    }

    /**
     * A structure containing the Account-level grants a User has.
     * 
     */
    @Import(name="globalGrants")
    private @Nullable Output<UserGlobalGrantsArgs> globalGrants;

    /**
     * @return A structure containing the Account-level grants a User has.
     * 
     */
    public Optional<Output<UserGlobalGrantsArgs>> globalGrants() {
        return Optional.ofNullable(this.globalGrants);
    }

    /**
     * The images the user has permissions access to.
     * 
     */
    @Import(name="imageGrants")
    private @Nullable Output<List<UserImageGrantArgs>> imageGrants;

    /**
     * @return The images the user has permissions access to.
     * 
     */
    public Optional<Output<List<UserImageGrantArgs>>> imageGrants() {
        return Optional.ofNullable(this.imageGrants);
    }

    /**
     * The Linodes the user has permissions access to.
     * 
     */
    @Import(name="linodeGrants")
    private @Nullable Output<List<UserLinodeGrantArgs>> linodeGrants;

    /**
     * @return The Linodes the user has permissions access to.
     * 
     */
    public Optional<Output<List<UserLinodeGrantArgs>>> linodeGrants() {
        return Optional.ofNullable(this.linodeGrants);
    }

    /**
     * The longview the user has permissions access to.
     * 
     */
    @Import(name="longviewGrants")
    private @Nullable Output<List<UserLongviewGrantArgs>> longviewGrants;

    /**
     * @return The longview the user has permissions access to.
     * 
     */
    public Optional<Output<List<UserLongviewGrantArgs>>> longviewGrants() {
        return Optional.ofNullable(this.longviewGrants);
    }

    /**
     * The NodeBalancers the user has permissions access to.
     * 
     */
    @Import(name="nodebalancerGrants")
    private @Nullable Output<List<UserNodebalancerGrantArgs>> nodebalancerGrants;

    /**
     * @return The NodeBalancers the user has permissions access to.
     * 
     */
    public Optional<Output<List<UserNodebalancerGrantArgs>>> nodebalancerGrants() {
        return Optional.ofNullable(this.nodebalancerGrants);
    }

    /**
     * If true, this user will only have explicit permissions granted.
     * 
     */
    @Import(name="restricted")
    private @Nullable Output<Boolean> restricted;

    /**
     * @return If true, this user will only have explicit permissions granted.
     * 
     */
    public Optional<Output<Boolean>> restricted() {
        return Optional.ofNullable(this.restricted);
    }

    /**
     * The StackScripts the user has permissions access to.
     * 
     */
    @Import(name="stackscriptGrants")
    private @Nullable Output<List<UserStackscriptGrantArgs>> stackscriptGrants;

    /**
     * @return The StackScripts the user has permissions access to.
     * 
     */
    public Optional<Output<List<UserStackscriptGrantArgs>>> stackscriptGrants() {
        return Optional.ofNullable(this.stackscriptGrants);
    }

    /**
     * The username of the user.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The username of the user.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     * The volumes the user has permissions access to.
     * 
     */
    @Import(name="volumeGrants")
    private @Nullable Output<List<UserVolumeGrantArgs>> volumeGrants;

    /**
     * @return The volumes the user has permissions access to.
     * 
     */
    public Optional<Output<List<UserVolumeGrantArgs>>> volumeGrants() {
        return Optional.ofNullable(this.volumeGrants);
    }

    private UserArgs() {}

    private UserArgs(UserArgs $) {
        this.domainGrants = $.domainGrants;
        this.email = $.email;
        this.firewallGrants = $.firewallGrants;
        this.globalGrants = $.globalGrants;
        this.imageGrants = $.imageGrants;
        this.linodeGrants = $.linodeGrants;
        this.longviewGrants = $.longviewGrants;
        this.nodebalancerGrants = $.nodebalancerGrants;
        this.restricted = $.restricted;
        this.stackscriptGrants = $.stackscriptGrants;
        this.username = $.username;
        this.volumeGrants = $.volumeGrants;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserArgs $;

        public Builder() {
            $ = new UserArgs();
        }

        public Builder(UserArgs defaults) {
            $ = new UserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainGrants The domains the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder domainGrants(@Nullable Output<List<UserDomainGrantArgs>> domainGrants) {
            $.domainGrants = domainGrants;
            return this;
        }

        /**
         * @param domainGrants The domains the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder domainGrants(List<UserDomainGrantArgs> domainGrants) {
            return domainGrants(Output.of(domainGrants));
        }

        /**
         * @param domainGrants The domains the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder domainGrants(UserDomainGrantArgs... domainGrants) {
            return domainGrants(List.of(domainGrants));
        }

        /**
         * @param email The email address of the user.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email address of the user.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param firewallGrants The firewalls the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder firewallGrants(@Nullable Output<List<UserFirewallGrantArgs>> firewallGrants) {
            $.firewallGrants = firewallGrants;
            return this;
        }

        /**
         * @param firewallGrants The firewalls the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder firewallGrants(List<UserFirewallGrantArgs> firewallGrants) {
            return firewallGrants(Output.of(firewallGrants));
        }

        /**
         * @param firewallGrants The firewalls the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder firewallGrants(UserFirewallGrantArgs... firewallGrants) {
            return firewallGrants(List.of(firewallGrants));
        }

        /**
         * @param globalGrants A structure containing the Account-level grants a User has.
         * 
         * @return builder
         * 
         */
        public Builder globalGrants(@Nullable Output<UserGlobalGrantsArgs> globalGrants) {
            $.globalGrants = globalGrants;
            return this;
        }

        /**
         * @param globalGrants A structure containing the Account-level grants a User has.
         * 
         * @return builder
         * 
         */
        public Builder globalGrants(UserGlobalGrantsArgs globalGrants) {
            return globalGrants(Output.of(globalGrants));
        }

        /**
         * @param imageGrants The images the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder imageGrants(@Nullable Output<List<UserImageGrantArgs>> imageGrants) {
            $.imageGrants = imageGrants;
            return this;
        }

        /**
         * @param imageGrants The images the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder imageGrants(List<UserImageGrantArgs> imageGrants) {
            return imageGrants(Output.of(imageGrants));
        }

        /**
         * @param imageGrants The images the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder imageGrants(UserImageGrantArgs... imageGrants) {
            return imageGrants(List.of(imageGrants));
        }

        /**
         * @param linodeGrants The Linodes the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder linodeGrants(@Nullable Output<List<UserLinodeGrantArgs>> linodeGrants) {
            $.linodeGrants = linodeGrants;
            return this;
        }

        /**
         * @param linodeGrants The Linodes the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder linodeGrants(List<UserLinodeGrantArgs> linodeGrants) {
            return linodeGrants(Output.of(linodeGrants));
        }

        /**
         * @param linodeGrants The Linodes the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder linodeGrants(UserLinodeGrantArgs... linodeGrants) {
            return linodeGrants(List.of(linodeGrants));
        }

        /**
         * @param longviewGrants The longview the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder longviewGrants(@Nullable Output<List<UserLongviewGrantArgs>> longviewGrants) {
            $.longviewGrants = longviewGrants;
            return this;
        }

        /**
         * @param longviewGrants The longview the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder longviewGrants(List<UserLongviewGrantArgs> longviewGrants) {
            return longviewGrants(Output.of(longviewGrants));
        }

        /**
         * @param longviewGrants The longview the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder longviewGrants(UserLongviewGrantArgs... longviewGrants) {
            return longviewGrants(List.of(longviewGrants));
        }

        /**
         * @param nodebalancerGrants The NodeBalancers the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder nodebalancerGrants(@Nullable Output<List<UserNodebalancerGrantArgs>> nodebalancerGrants) {
            $.nodebalancerGrants = nodebalancerGrants;
            return this;
        }

        /**
         * @param nodebalancerGrants The NodeBalancers the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder nodebalancerGrants(List<UserNodebalancerGrantArgs> nodebalancerGrants) {
            return nodebalancerGrants(Output.of(nodebalancerGrants));
        }

        /**
         * @param nodebalancerGrants The NodeBalancers the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder nodebalancerGrants(UserNodebalancerGrantArgs... nodebalancerGrants) {
            return nodebalancerGrants(List.of(nodebalancerGrants));
        }

        /**
         * @param restricted If true, this user will only have explicit permissions granted.
         * 
         * @return builder
         * 
         */
        public Builder restricted(@Nullable Output<Boolean> restricted) {
            $.restricted = restricted;
            return this;
        }

        /**
         * @param restricted If true, this user will only have explicit permissions granted.
         * 
         * @return builder
         * 
         */
        public Builder restricted(Boolean restricted) {
            return restricted(Output.of(restricted));
        }

        /**
         * @param stackscriptGrants The StackScripts the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder stackscriptGrants(@Nullable Output<List<UserStackscriptGrantArgs>> stackscriptGrants) {
            $.stackscriptGrants = stackscriptGrants;
            return this;
        }

        /**
         * @param stackscriptGrants The StackScripts the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder stackscriptGrants(List<UserStackscriptGrantArgs> stackscriptGrants) {
            return stackscriptGrants(Output.of(stackscriptGrants));
        }

        /**
         * @param stackscriptGrants The StackScripts the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder stackscriptGrants(UserStackscriptGrantArgs... stackscriptGrants) {
            return stackscriptGrants(List.of(stackscriptGrants));
        }

        /**
         * @param username The username of the user.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username of the user.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param volumeGrants The volumes the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder volumeGrants(@Nullable Output<List<UserVolumeGrantArgs>> volumeGrants) {
            $.volumeGrants = volumeGrants;
            return this;
        }

        /**
         * @param volumeGrants The volumes the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder volumeGrants(List<UserVolumeGrantArgs> volumeGrants) {
            return volumeGrants(Output.of(volumeGrants));
        }

        /**
         * @param volumeGrants The volumes the user has permissions access to.
         * 
         * @return builder
         * 
         */
        public Builder volumeGrants(UserVolumeGrantArgs... volumeGrants) {
            return volumeGrants(List.of(volumeGrants));
        }

        public UserArgs build() {
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
