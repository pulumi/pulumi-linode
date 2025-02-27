// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetUsersUserDatabaseGrantArgs;
import com.pulumi.linode.inputs.GetUsersUserDomainGrantArgs;
import com.pulumi.linode.inputs.GetUsersUserFirewallGrantArgs;
import com.pulumi.linode.inputs.GetUsersUserGlobalGrantArgs;
import com.pulumi.linode.inputs.GetUsersUserImageGrantArgs;
import com.pulumi.linode.inputs.GetUsersUserLinodeGrantArgs;
import com.pulumi.linode.inputs.GetUsersUserLongviewGrantArgs;
import com.pulumi.linode.inputs.GetUsersUserNodebalancerGrantArgs;
import com.pulumi.linode.inputs.GetUsersUserPlacementGroupGrantArgs;
import com.pulumi.linode.inputs.GetUsersUserStackscriptGrantArgs;
import com.pulumi.linode.inputs.GetUsersUserVolumeGrantArgs;
import com.pulumi.linode.inputs.GetUsersUserVpcGrantArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetUsersUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetUsersUserArgs Empty = new GetUsersUserArgs();

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="databaseGrants", required=true)
    private Output<List<GetUsersUserDatabaseGrantArgs>> databaseGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public Output<List<GetUsersUserDatabaseGrantArgs>> databaseGrants() {
        return this.databaseGrants;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="domainGrants", required=true)
    private Output<List<GetUsersUserDomainGrantArgs>> domainGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public Output<List<GetUsersUserDomainGrantArgs>> domainGrants() {
        return this.domainGrants;
    }

    /**
     * The email address for this User, for account management communications, and may be used for other communications as configured.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return The email address for this User, for account management communications, and may be used for other communications as configured.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="firewallGrants", required=true)
    private Output<List<GetUsersUserFirewallGrantArgs>> firewallGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public Output<List<GetUsersUserFirewallGrantArgs>> firewallGrants() {
        return this.firewallGrants;
    }

    /**
     * A structure containing the Account-level grants a User has.
     * 
     */
    @Import(name="globalGrants", required=true)
    private Output<List<GetUsersUserGlobalGrantArgs>> globalGrants;

    /**
     * @return A structure containing the Account-level grants a User has.
     * 
     */
    public Output<List<GetUsersUserGlobalGrantArgs>> globalGrants() {
        return this.globalGrants;
    }

    /**
     * The ID of entity this grant applies to.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of entity this grant applies to.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="imageGrants", required=true)
    private Output<List<GetUsersUserImageGrantArgs>> imageGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public Output<List<GetUsersUserImageGrantArgs>> imageGrants() {
        return this.imageGrants;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="linodeGrants", required=true)
    private Output<List<GetUsersUserLinodeGrantArgs>> linodeGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public Output<List<GetUsersUserLinodeGrantArgs>> linodeGrants() {
        return this.linodeGrants;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="longviewGrants", required=true)
    private Output<List<GetUsersUserLongviewGrantArgs>> longviewGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public Output<List<GetUsersUserLongviewGrantArgs>> longviewGrants() {
        return this.longviewGrants;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="nodebalancerGrants", required=true)
    private Output<List<GetUsersUserNodebalancerGrantArgs>> nodebalancerGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public Output<List<GetUsersUserNodebalancerGrantArgs>> nodebalancerGrants() {
        return this.nodebalancerGrants;
    }

    /**
     * The date and time when this User’s current password was created. User passwords are first created during the Account sign-up process, and updated using the Reset Password webpage. null if this User has not created a password yet.
     * 
     */
    @Import(name="passwordCreated", required=true)
    private Output<String> passwordCreated;

    /**
     * @return The date and time when this User’s current password was created. User passwords are first created during the Account sign-up process, and updated using the Reset Password webpage. null if this User has not created a password yet.
     * 
     */
    public Output<String> passwordCreated() {
        return this.passwordCreated;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="placementGroupGrants", required=true)
    private Output<List<GetUsersUserPlacementGroupGrantArgs>> placementGroupGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public Output<List<GetUsersUserPlacementGroupGrantArgs>> placementGroupGrants() {
        return this.placementGroupGrants;
    }

    /**
     * If true, this User must be granted access to perform actions or access entities on this Account.
     * 
     */
    @Import(name="restricted", required=true)
    private Output<Boolean> restricted;

    /**
     * @return If true, this User must be granted access to perform actions or access entities on this Account.
     * 
     */
    public Output<Boolean> restricted() {
        return this.restricted;
    }

    /**
     * A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorized_users field of a create Linode, rebuild Linode, or create Disk request.
     * 
     */
    @Import(name="sshKeys", required=true)
    private Output<List<String>> sshKeys;

    /**
     * @return A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorized_users field of a create Linode, rebuild Linode, or create Disk request.
     * 
     */
    public Output<List<String>> sshKeys() {
        return this.sshKeys;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="stackscriptGrants", required=true)
    private Output<List<GetUsersUserStackscriptGrantArgs>> stackscriptGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public Output<List<GetUsersUserStackscriptGrantArgs>> stackscriptGrants() {
        return this.stackscriptGrants;
    }

    /**
     * A boolean value indicating if the User has Two Factor Authentication (TFA) enabled.
     * 
     */
    @Import(name="tfaEnabled", required=true)
    private Output<Boolean> tfaEnabled;

    /**
     * @return A boolean value indicating if the User has Two Factor Authentication (TFA) enabled.
     * 
     */
    public Output<Boolean> tfaEnabled() {
        return this.tfaEnabled;
    }

    /**
     * The type of this user.
     * 
     */
    @Import(name="userType", required=true)
    private Output<String> userType;

    /**
     * @return The type of this user.
     * 
     */
    public Output<String> userType() {
        return this.userType;
    }

    /**
     * This User&#39;s username. This is used for logging in, and may also be displayed alongside actions the User performs (for example, in Events or public StackScripts).
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return This User&#39;s username. This is used for logging in, and may also be displayed alongside actions the User performs (for example, in Events or public StackScripts).
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     * The phone number verified for this User Profile with the Phone Number Verify command. null if this User Profile has no verified phone number.
     * 
     */
    @Import(name="verifiedPhoneNumber", required=true)
    private Output<String> verifiedPhoneNumber;

    /**
     * @return The phone number verified for this User Profile with the Phone Number Verify command. null if this User Profile has no verified phone number.
     * 
     */
    public Output<String> verifiedPhoneNumber() {
        return this.verifiedPhoneNumber;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="volumeGrants", required=true)
    private Output<List<GetUsersUserVolumeGrantArgs>> volumeGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public Output<List<GetUsersUserVolumeGrantArgs>> volumeGrants() {
        return this.volumeGrants;
    }

    /**
     * A set containing all of the user&#39;s active grants.
     * 
     */
    @Import(name="vpcGrants", required=true)
    private Output<List<GetUsersUserVpcGrantArgs>> vpcGrants;

    /**
     * @return A set containing all of the user&#39;s active grants.
     * 
     */
    public Output<List<GetUsersUserVpcGrantArgs>> vpcGrants() {
        return this.vpcGrants;
    }

    private GetUsersUserArgs() {}

    private GetUsersUserArgs(GetUsersUserArgs $) {
        this.databaseGrants = $.databaseGrants;
        this.domainGrants = $.domainGrants;
        this.email = $.email;
        this.firewallGrants = $.firewallGrants;
        this.globalGrants = $.globalGrants;
        this.id = $.id;
        this.imageGrants = $.imageGrants;
        this.linodeGrants = $.linodeGrants;
        this.longviewGrants = $.longviewGrants;
        this.nodebalancerGrants = $.nodebalancerGrants;
        this.passwordCreated = $.passwordCreated;
        this.placementGroupGrants = $.placementGroupGrants;
        this.restricted = $.restricted;
        this.sshKeys = $.sshKeys;
        this.stackscriptGrants = $.stackscriptGrants;
        this.tfaEnabled = $.tfaEnabled;
        this.userType = $.userType;
        this.username = $.username;
        this.verifiedPhoneNumber = $.verifiedPhoneNumber;
        this.volumeGrants = $.volumeGrants;
        this.vpcGrants = $.vpcGrants;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUsersUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUsersUserArgs $;

        public Builder() {
            $ = new GetUsersUserArgs();
        }

        public Builder(GetUsersUserArgs defaults) {
            $ = new GetUsersUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder databaseGrants(Output<List<GetUsersUserDatabaseGrantArgs>> databaseGrants) {
            $.databaseGrants = databaseGrants;
            return this;
        }

        /**
         * @param databaseGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder databaseGrants(List<GetUsersUserDatabaseGrantArgs> databaseGrants) {
            return databaseGrants(Output.of(databaseGrants));
        }

        /**
         * @param databaseGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder databaseGrants(GetUsersUserDatabaseGrantArgs... databaseGrants) {
            return databaseGrants(List.of(databaseGrants));
        }

        /**
         * @param domainGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder domainGrants(Output<List<GetUsersUserDomainGrantArgs>> domainGrants) {
            $.domainGrants = domainGrants;
            return this;
        }

        /**
         * @param domainGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder domainGrants(List<GetUsersUserDomainGrantArgs> domainGrants) {
            return domainGrants(Output.of(domainGrants));
        }

        /**
         * @param domainGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder domainGrants(GetUsersUserDomainGrantArgs... domainGrants) {
            return domainGrants(List.of(domainGrants));
        }

        /**
         * @param email The email address for this User, for account management communications, and may be used for other communications as configured.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email address for this User, for account management communications, and may be used for other communications as configured.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param firewallGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder firewallGrants(Output<List<GetUsersUserFirewallGrantArgs>> firewallGrants) {
            $.firewallGrants = firewallGrants;
            return this;
        }

        /**
         * @param firewallGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder firewallGrants(List<GetUsersUserFirewallGrantArgs> firewallGrants) {
            return firewallGrants(Output.of(firewallGrants));
        }

        /**
         * @param firewallGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder firewallGrants(GetUsersUserFirewallGrantArgs... firewallGrants) {
            return firewallGrants(List.of(firewallGrants));
        }

        /**
         * @param globalGrants A structure containing the Account-level grants a User has.
         * 
         * @return builder
         * 
         */
        public Builder globalGrants(Output<List<GetUsersUserGlobalGrantArgs>> globalGrants) {
            $.globalGrants = globalGrants;
            return this;
        }

        /**
         * @param globalGrants A structure containing the Account-level grants a User has.
         * 
         * @return builder
         * 
         */
        public Builder globalGrants(List<GetUsersUserGlobalGrantArgs> globalGrants) {
            return globalGrants(Output.of(globalGrants));
        }

        /**
         * @param globalGrants A structure containing the Account-level grants a User has.
         * 
         * @return builder
         * 
         */
        public Builder globalGrants(GetUsersUserGlobalGrantArgs... globalGrants) {
            return globalGrants(List.of(globalGrants));
        }

        /**
         * @param id The ID of entity this grant applies to.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of entity this grant applies to.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param imageGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder imageGrants(Output<List<GetUsersUserImageGrantArgs>> imageGrants) {
            $.imageGrants = imageGrants;
            return this;
        }

        /**
         * @param imageGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder imageGrants(List<GetUsersUserImageGrantArgs> imageGrants) {
            return imageGrants(Output.of(imageGrants));
        }

        /**
         * @param imageGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder imageGrants(GetUsersUserImageGrantArgs... imageGrants) {
            return imageGrants(List.of(imageGrants));
        }

        /**
         * @param linodeGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder linodeGrants(Output<List<GetUsersUserLinodeGrantArgs>> linodeGrants) {
            $.linodeGrants = linodeGrants;
            return this;
        }

        /**
         * @param linodeGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder linodeGrants(List<GetUsersUserLinodeGrantArgs> linodeGrants) {
            return linodeGrants(Output.of(linodeGrants));
        }

        /**
         * @param linodeGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder linodeGrants(GetUsersUserLinodeGrantArgs... linodeGrants) {
            return linodeGrants(List.of(linodeGrants));
        }

        /**
         * @param longviewGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder longviewGrants(Output<List<GetUsersUserLongviewGrantArgs>> longviewGrants) {
            $.longviewGrants = longviewGrants;
            return this;
        }

        /**
         * @param longviewGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder longviewGrants(List<GetUsersUserLongviewGrantArgs> longviewGrants) {
            return longviewGrants(Output.of(longviewGrants));
        }

        /**
         * @param longviewGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder longviewGrants(GetUsersUserLongviewGrantArgs... longviewGrants) {
            return longviewGrants(List.of(longviewGrants));
        }

        /**
         * @param nodebalancerGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder nodebalancerGrants(Output<List<GetUsersUserNodebalancerGrantArgs>> nodebalancerGrants) {
            $.nodebalancerGrants = nodebalancerGrants;
            return this;
        }

        /**
         * @param nodebalancerGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder nodebalancerGrants(List<GetUsersUserNodebalancerGrantArgs> nodebalancerGrants) {
            return nodebalancerGrants(Output.of(nodebalancerGrants));
        }

        /**
         * @param nodebalancerGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder nodebalancerGrants(GetUsersUserNodebalancerGrantArgs... nodebalancerGrants) {
            return nodebalancerGrants(List.of(nodebalancerGrants));
        }

        /**
         * @param passwordCreated The date and time when this User’s current password was created. User passwords are first created during the Account sign-up process, and updated using the Reset Password webpage. null if this User has not created a password yet.
         * 
         * @return builder
         * 
         */
        public Builder passwordCreated(Output<String> passwordCreated) {
            $.passwordCreated = passwordCreated;
            return this;
        }

        /**
         * @param passwordCreated The date and time when this User’s current password was created. User passwords are first created during the Account sign-up process, and updated using the Reset Password webpage. null if this User has not created a password yet.
         * 
         * @return builder
         * 
         */
        public Builder passwordCreated(String passwordCreated) {
            return passwordCreated(Output.of(passwordCreated));
        }

        /**
         * @param placementGroupGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder placementGroupGrants(Output<List<GetUsersUserPlacementGroupGrantArgs>> placementGroupGrants) {
            $.placementGroupGrants = placementGroupGrants;
            return this;
        }

        /**
         * @param placementGroupGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder placementGroupGrants(List<GetUsersUserPlacementGroupGrantArgs> placementGroupGrants) {
            return placementGroupGrants(Output.of(placementGroupGrants));
        }

        /**
         * @param placementGroupGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder placementGroupGrants(GetUsersUserPlacementGroupGrantArgs... placementGroupGrants) {
            return placementGroupGrants(List.of(placementGroupGrants));
        }

        /**
         * @param restricted If true, this User must be granted access to perform actions or access entities on this Account.
         * 
         * @return builder
         * 
         */
        public Builder restricted(Output<Boolean> restricted) {
            $.restricted = restricted;
            return this;
        }

        /**
         * @param restricted If true, this User must be granted access to perform actions or access entities on this Account.
         * 
         * @return builder
         * 
         */
        public Builder restricted(Boolean restricted) {
            return restricted(Output.of(restricted));
        }

        /**
         * @param sshKeys A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorized_users field of a create Linode, rebuild Linode, or create Disk request.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(Output<List<String>> sshKeys) {
            $.sshKeys = sshKeys;
            return this;
        }

        /**
         * @param sshKeys A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorized_users field of a create Linode, rebuild Linode, or create Disk request.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(List<String> sshKeys) {
            return sshKeys(Output.of(sshKeys));
        }

        /**
         * @param sshKeys A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorized_users field of a create Linode, rebuild Linode, or create Disk request.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(String... sshKeys) {
            return sshKeys(List.of(sshKeys));
        }

        /**
         * @param stackscriptGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder stackscriptGrants(Output<List<GetUsersUserStackscriptGrantArgs>> stackscriptGrants) {
            $.stackscriptGrants = stackscriptGrants;
            return this;
        }

        /**
         * @param stackscriptGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder stackscriptGrants(List<GetUsersUserStackscriptGrantArgs> stackscriptGrants) {
            return stackscriptGrants(Output.of(stackscriptGrants));
        }

        /**
         * @param stackscriptGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder stackscriptGrants(GetUsersUserStackscriptGrantArgs... stackscriptGrants) {
            return stackscriptGrants(List.of(stackscriptGrants));
        }

        /**
         * @param tfaEnabled A boolean value indicating if the User has Two Factor Authentication (TFA) enabled.
         * 
         * @return builder
         * 
         */
        public Builder tfaEnabled(Output<Boolean> tfaEnabled) {
            $.tfaEnabled = tfaEnabled;
            return this;
        }

        /**
         * @param tfaEnabled A boolean value indicating if the User has Two Factor Authentication (TFA) enabled.
         * 
         * @return builder
         * 
         */
        public Builder tfaEnabled(Boolean tfaEnabled) {
            return tfaEnabled(Output.of(tfaEnabled));
        }

        /**
         * @param userType The type of this user.
         * 
         * @return builder
         * 
         */
        public Builder userType(Output<String> userType) {
            $.userType = userType;
            return this;
        }

        /**
         * @param userType The type of this user.
         * 
         * @return builder
         * 
         */
        public Builder userType(String userType) {
            return userType(Output.of(userType));
        }

        /**
         * @param username This User&#39;s username. This is used for logging in, and may also be displayed alongside actions the User performs (for example, in Events or public StackScripts).
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username This User&#39;s username. This is used for logging in, and may also be displayed alongside actions the User performs (for example, in Events or public StackScripts).
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param verifiedPhoneNumber The phone number verified for this User Profile with the Phone Number Verify command. null if this User Profile has no verified phone number.
         * 
         * @return builder
         * 
         */
        public Builder verifiedPhoneNumber(Output<String> verifiedPhoneNumber) {
            $.verifiedPhoneNumber = verifiedPhoneNumber;
            return this;
        }

        /**
         * @param verifiedPhoneNumber The phone number verified for this User Profile with the Phone Number Verify command. null if this User Profile has no verified phone number.
         * 
         * @return builder
         * 
         */
        public Builder verifiedPhoneNumber(String verifiedPhoneNumber) {
            return verifiedPhoneNumber(Output.of(verifiedPhoneNumber));
        }

        /**
         * @param volumeGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder volumeGrants(Output<List<GetUsersUserVolumeGrantArgs>> volumeGrants) {
            $.volumeGrants = volumeGrants;
            return this;
        }

        /**
         * @param volumeGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder volumeGrants(List<GetUsersUserVolumeGrantArgs> volumeGrants) {
            return volumeGrants(Output.of(volumeGrants));
        }

        /**
         * @param volumeGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder volumeGrants(GetUsersUserVolumeGrantArgs... volumeGrants) {
            return volumeGrants(List.of(volumeGrants));
        }

        /**
         * @param vpcGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder vpcGrants(Output<List<GetUsersUserVpcGrantArgs>> vpcGrants) {
            $.vpcGrants = vpcGrants;
            return this;
        }

        /**
         * @param vpcGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder vpcGrants(List<GetUsersUserVpcGrantArgs> vpcGrants) {
            return vpcGrants(Output.of(vpcGrants));
        }

        /**
         * @param vpcGrants A set containing all of the user&#39;s active grants.
         * 
         * @return builder
         * 
         */
        public Builder vpcGrants(GetUsersUserVpcGrantArgs... vpcGrants) {
            return vpcGrants(List.of(vpcGrants));
        }

        public GetUsersUserArgs build() {
            if ($.databaseGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "databaseGrants");
            }
            if ($.domainGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "domainGrants");
            }
            if ($.email == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "email");
            }
            if ($.firewallGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "firewallGrants");
            }
            if ($.globalGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "globalGrants");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "id");
            }
            if ($.imageGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "imageGrants");
            }
            if ($.linodeGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "linodeGrants");
            }
            if ($.longviewGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "longviewGrants");
            }
            if ($.nodebalancerGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "nodebalancerGrants");
            }
            if ($.passwordCreated == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "passwordCreated");
            }
            if ($.placementGroupGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "placementGroupGrants");
            }
            if ($.restricted == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "restricted");
            }
            if ($.sshKeys == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "sshKeys");
            }
            if ($.stackscriptGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "stackscriptGrants");
            }
            if ($.tfaEnabled == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "tfaEnabled");
            }
            if ($.userType == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "userType");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "username");
            }
            if ($.verifiedPhoneNumber == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "verifiedPhoneNumber");
            }
            if ($.volumeGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "volumeGrants");
            }
            if ($.vpcGrants == null) {
                throw new MissingRequiredPropertyException("GetUsersUserArgs", "vpcGrants");
            }
            return $;
        }
    }

}
